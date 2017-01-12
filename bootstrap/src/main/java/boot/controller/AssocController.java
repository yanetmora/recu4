package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Assoc;
import boot.service.AssocService;



@Controller
public class AssocController {
	@Autowired
	private AssocService assocService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-assocs")
	public String allAssocs(HttpServletRequest request){
		request.setAttribute("assocs",assocService.findAll());
		request.setAttribute("mode","MODE_ASSOCS");
		return "assoc";
	}
	
	@GetMapping("/new-assoc")
	public String newAssoc(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "assoc";
	}
	@PostMapping("/save-assoc")
	public String saveAssoc(@ModelAttribute Assoc assoc,BindingResult bindingResult, HttpServletRequest request){
		assocService.save(assoc);
		request.setAttribute("assocs",assocService.findAll());
		request.setAttribute("mode","MODE_ASSOCS");
		return "assoc";
	}
	
	
	@GetMapping("/update-assoc")
	public String updateAssoc(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("assoc",assocService.findAssoc(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "assoc";
	}
	@GetMapping("/delete-assoc")
	public String deleteAssoc(@RequestParam int id,HttpServletRequest request){
		assocService.delete(id);
		request.setAttribute("assocs",assocService.findAll());
		request.setAttribute("mode","MODE_ASSOCS");
		return "assoc";
	}
}
