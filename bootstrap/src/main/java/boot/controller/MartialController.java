package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Martial;
import boot.service.MartialService;



@Controller
public class MartialController {
	@Autowired
	private MartialService martialService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-martials")
	public String allMartials(HttpServletRequest request){
		request.setAttribute("martials",martialService.findAll());
		request.setAttribute("mode","MODE_MARTIALS");
		return "martial";
	}
	
	@GetMapping("/new-martial")
	public String newFMartial(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "martial";
	}
	@PostMapping("/save-martial")
	public String saveMartial(@ModelAttribute Martial martial,BindingResult bindingResult, HttpServletRequest request){
		martialService.save(martial);
		request.setAttribute("martials",martialService.findAll());
		request.setAttribute("mode","MODE_MARTIALS");
		return "martial";
	}
	
	
	@GetMapping("/update-martial")
	public String updateMartial(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("martial",martialService.findMartial(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "martial";
	}
	@GetMapping("/delete-martial")
	public String deleteMartial(@RequestParam int id,HttpServletRequest request){
		martialService.delete(id);
		request.setAttribute("martials",martialService.findAll());
		request.setAttribute("mode","MODE_MARTIALS");
		return "martial";
	}
}
