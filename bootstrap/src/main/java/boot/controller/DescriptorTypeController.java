package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.DescriptorType;
import boot.service.DescriptorTypeService;



@Controller
public class DescriptorTypeController {
	@Autowired
	private DescriptorTypeService descriptorTypeService;
	
	//*Apartir de aq nueuivos metodos*/
	@GetMapping("/all-descriptor-types")
	public String allDescriptorTypes(HttpServletRequest request){
		request.setAttribute("descriptortypes",descriptorTypeService.findAll());
		request.setAttribute("mode","MODE_DESCRIPTOR_TYPES");
		return "descriptorType";
	}
	
	@GetMapping("/new-descriptor-type")
	public String newDescriptorType(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "descriptorType";
	}
	@PostMapping("/save-descriptor-type")
	public String saveDescriptorType(@ModelAttribute DescriptorType descriptorType,BindingResult bindingResult, HttpServletRequest request){
		descriptorTypeService.save(descriptorType);
		request.setAttribute("descriptortypes",descriptorTypeService.findAll());
		request.setAttribute("mode","MODE_DESCRIPTOR_TYPES");
		return "descriptorType";
	}
	
	
	@GetMapping("/update-descriptor-type")
	public String updateDescriptorType(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("descriptortype",descriptorTypeService.findDescriptorType(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "descriptorType";
	}
	@GetMapping("/delete-descriptor-type")
	public String deleteDescriptorType(@RequestParam int id,HttpServletRequest request){
		descriptorTypeService.delete(id);
		request.setAttribute("descriptortypes",descriptorTypeService.findAll());
		request.setAttribute("mode","MODE_DESCRIPTOR_TYPES");
		return "descriptorType";
	}
}
