package boot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Task;
import boot.service.TaskService;

@Controller
public class MainController {
  
	@GetMapping("/")
	public String home(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "index";
	}
	
	@GetMapping("descriptorType")
	public String descriptorType(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "descriptorType";
	}
	
	@GetMapping("task")
	public String task(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "task";
		
		
	}
	@GetMapping("food")
	public String food(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "food";
	}
	
	@GetMapping("martial")
	public String martial(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "martial";
	}
	
	@GetMapping("movie")
	public String movie(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "movie";
	}
	
	@GetMapping("sing")
	public String sing(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "sing";
	}
	
	
	
	@GetMapping("review")
	public String review(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "review";
	}
	
	
	
	@GetMapping("book")
	public String book(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "book";
	}
	@GetMapping("sitePersonnelRole")
	public String sitePersonnelRole(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "sitePersonnelRole";
	}
	@GetMapping("peer")
	public String peer(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "peer";
	}
	@GetMapping("picture")
	public String picture(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "picture";
	}
	@GetMapping("assoc")
	public String assoc(HttpServletRequest request){
		request.setAttribute("mode", "MODE_HOME");
		return "assoc";
	}
	
	/*
	@GetMapping("/all-tasks")
	public String allTasks(HttpServletRequest request){
		request.setAttribute("tasks", taskService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@GetMapping("/new-task")
	public String newTask(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "index";
	}
	
	@PostMapping("/save-task")
	public String saveTask(@ModelAttribute Task task, BindingResult bindingResult, HttpServletRequest request){
		taskService.save(task);
		request.setAttribute("tasks", taskService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	
	@GetMapping("/update-task")
	public String updateTask(@RequestParam int id, HttpServletRequest request){
		request.setAttribute("task", taskService.findTask(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "index";
	}
	
	@GetMapping("/delete-task")
	public String deleteTask(@RequestParam int id, HttpServletRequest request){
		taskService.delete(id);
		request.setAttribute("tasks", taskService.findAll());
		request.setAttribute("mode", "MODE_TASKS");
		return "index";
	}
	*/
	
 }
