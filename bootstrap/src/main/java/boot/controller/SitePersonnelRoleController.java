package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.SitePersonnelRole;
import boot.service.SitePersonnelRoleService;



@Controller
public class SitePersonnelRoleController {
	@Autowired
	private SitePersonnelRoleService sitePersonnelRoleService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-site-personnel-roles")
	public String allSitePersonnelRoles(HttpServletRequest request){
		request.setAttribute("sitePersonnelRoles",sitePersonnelRoleService.findAll());
		request.setAttribute("mode","MODE_SITE_PERSONNEL_ROLES");
		return "sitePersonnelRole";
	}
	
	@GetMapping("/new-site-personnel-roles")
	public String newSitePersonnelRole(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "sitePersonnelRole";
	}
	@PostMapping("/save-site-personnel-roles")
	public String saveSitePersonnelRole(@ModelAttribute SitePersonnelRole sitePersonnelRole,BindingResult bindingResult, HttpServletRequest request){
		sitePersonnelRoleService.save(sitePersonnelRole);
		request.setAttribute("sitePersonnelRoles",sitePersonnelRoleService.findAll());
		request.setAttribute("mode","MODE_SITE_PERSONNEL_ROLES");
		return "sitePersonnelRole";
	}
	
	
	@GetMapping("/update-site-personnel-roles")
	public String updateSitePersonnelRole(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("sitePersonnelRole",sitePersonnelRoleService.findSitePersonnelRole(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "sitePersonnelRole";
	}
	@GetMapping("/delete-site-personnel-roles")
	public String deleteSitePersonnelRole(@RequestParam int id,HttpServletRequest request){
		sitePersonnelRoleService.delete(id);
		request.setAttribute("sitePersonnelRoles",sitePersonnelRoleService.findAll());
		request.setAttribute("mode","MODE_SITE_PERSONNEL_ROLES");
		return "sitePersonnelRole";
	}
}
