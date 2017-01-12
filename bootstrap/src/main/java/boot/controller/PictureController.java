package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Peer;
import boot.model.Picture;
import boot.service.PeerService;
import boot.service.PictureService;

@Controller
public class PictureController {
	@Autowired
	private PictureService pictureService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-pictures")
	public String allPictures(HttpServletRequest request){
		request.setAttribute("pictures",pictureService.findAll());
		request.setAttribute("mode","MODE_PICTURES");
		return "picture";
	}
	
	@GetMapping("/new-picture")
	public String newPicture(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "picture";
	}
	@PostMapping("/save-picture")
	public String savePicture(@ModelAttribute Picture picture,BindingResult bindingResult, HttpServletRequest request){
		pictureService.save(picture);
		request.setAttribute("pictures",pictureService.findAll());
		request.setAttribute("mode","MODE_PICTURES");
		return "picture";
	}
	
	
	@GetMapping("/update-pictures")
	public String updatePicture(@RequestParam int pictureId,HttpServletRequest request){
		request.setAttribute("picture",pictureService.findPicture(pictureId));
		request.setAttribute("mode","MODE_UPDATE");
		return "picture";
	}
	@GetMapping("/delete-picture")
	public String deletePicture(@RequestParam int pictureId,HttpServletRequest request){
		pictureService.delete(pictureId);
		request.setAttribute("pictures",pictureService.findAll());
		request.setAttribute("mode","MODE_PICTURES");
		return "picture";
	}
}
