package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Food;
import boot.service.FoodService;

@Controller
public class FoodController {
	@Autowired
	private FoodService foodService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-foods")
	public String allFoods(HttpServletRequest request){
		request.setAttribute("foods",foodService.findAll());
		request.setAttribute("mode","MODE_FOODS");
		return "food";
	}
	
	@GetMapping("/new-food")
	public String newFood(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "food";
	}
	@PostMapping("/save-food")
	public String saveFood(@ModelAttribute Food food,BindingResult bindingResult, HttpServletRequest request){
		foodService.save(food);
		request.setAttribute("foods",foodService.findAll());
		request.setAttribute("mode","MODE_FOODS");
		return "food";
	}
	
	
	@GetMapping("/update-food")
	public String updateFood(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("food",foodService.findFood(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "food";
	}
	@GetMapping("/delete-food")
	public String deleteFood(@RequestParam int id,HttpServletRequest request){
		foodService.delete(id);
		request.setAttribute("foods",foodService.findAll());
		request.setAttribute("mode","MODE_FOODS");
		return "food";
	}
}
