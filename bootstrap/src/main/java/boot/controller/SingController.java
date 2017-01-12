package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Sing;
import boot.service.SingService;

@Controller
public class SingController {
	@Autowired
	private SingService singService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-sings")
	public String allSings(HttpServletRequest request){
		request.setAttribute("sings",singService.findAll());
		request.setAttribute("mode","MODE_SINGS");
		return "sing";
	}
	
	@GetMapping("/new-sing")
	public String newSing(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "sing";
	}
	@PostMapping("/save-sing")
	public String saveSing(@ModelAttribute Sing sing,BindingResult bindingResult, HttpServletRequest request){
		singService.save(sing);
		request.setAttribute("sings",singService.findAll());
		request.setAttribute("mode","MODE_SINGS");
		return "sing";
	}
	
	
	@GetMapping("/update-sing")
	public String updateSing(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("sing",singService.findSing(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "sing";
	}
	@GetMapping("/delete-sing")
	public String deleteSing(@RequestParam int id,HttpServletRequest request){
		singService.delete(id);
		request.setAttribute("sings",singService.findAll());
		request.setAttribute("mode","MODE_SINGS");
		return "sing";
	}
}
