package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Review;
import boot.model.Sing;
import boot.service.ReviewService;

@Controller
public class ReviewController {
	@Autowired
	private ReviewService reviewService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-reviews")
	public String allReviews(HttpServletRequest request){
		request.setAttribute("reviews",reviewService.findAll());
		request.setAttribute("mode","MODE_REVIEWS");
		return "review";
	}
	
	@GetMapping("/new-review")
	public String newReview(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "review";
	}
	@PostMapping("/save-review")
	public String saveReview(@ModelAttribute Review review,BindingResult bindingResult, HttpServletRequest request){
		reviewService.save(review);
		request.setAttribute("reviews",reviewService.findAll());
		request.setAttribute("mode","MODE_REVIEWS");
		return "review";
	}
	
	
	@GetMapping("/update-review")
	public String updateReview(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("review",reviewService.findReview(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "review";
	}
	@GetMapping("/delete-review")
	public String deleteReview(@RequestParam int id,HttpServletRequest request){
		reviewService.delete(id);
		request.setAttribute("reviews",reviewService.findAll());
		request.setAttribute("mode","MODE_REVIEWS");
		return "review";
	}
}
