package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Movie;
import boot.service.MovieService;



@Controller
public class MovieController {
	@Autowired
	private MovieService movieService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-movies")
	public String allMovies(HttpServletRequest request){
		request.setAttribute("movies",movieService.findAll());
		request.setAttribute("mode","MODE_MOVIES");
		return "movie";
	}
	
	@GetMapping("/new-movie")
	public String newMovie(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "movie";
	}
	@PostMapping("/save-movie")
	public String saveMovie(@ModelAttribute Movie movie,BindingResult bindingResult, HttpServletRequest request){
		movieService.save(movie);
		request.setAttribute("movies",movieService.findAll());
		request.setAttribute("mode","MODE_MOVIES");
		return "movie";
	}
	
	
	@GetMapping("/update-movie")
	public String updateMovie(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("movie",movieService.findMovie(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "movie";
	}
	@GetMapping("/delete-movie")
	public String deleteMovie(@RequestParam int id,HttpServletRequest request){
		movieService.delete(id);
		request.setAttribute("movies",movieService.findAll());
		request.setAttribute("mode","MODE_MOVIES");
		return "movie";
	}
	
}
