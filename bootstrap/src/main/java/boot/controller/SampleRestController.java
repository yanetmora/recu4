package boot.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import boot.model.Task;
import boot.service.AssocService;
import boot.service.BookService;
import boot.service.DescriptorTypeService;
import boot.service.FoodService;
import boot.service.MartialService;
import boot.service.MovieService;
import boot.service.PeerService;
import boot.service.PictureService;
import boot.service.ReviewService;
import boot.service.SingService;
import boot.service.SitePersonnelRoleService;
import boot.service.TaskService;

@RestController
public class SampleRestController {
	
	@Autowired
	private TaskService taskService;

	@Autowired
	private FoodService foodService;
	
	@Autowired
	private MartialService martialService;
	
	@Autowired
	private MovieService movieService;
	
	@Autowired
	private SingService singService;
	
	@Autowired
	private BookService bookService;
	
	@Autowired
	private DescriptorTypeService descriptorTypeService;
	@Autowired
	private SitePersonnelRoleService sitePersonnelRoleService;
	@Autowired
	private PictureService pictureService;
	@Autowired
	private PeerService peerService;
	@Autowired
	private AssocService assocService;
	@Autowired
	private ReviewService reviewService;
	
	@GetMapping("/hello") 
	public String hello(){
		return "Hola Mundo";
	}
	
	/*
	@GetMapping("/all-tasks")
	public String  allTasks(){
		return taskService.findAll().toString(); 
	}
	
	@GetMapping("/save-task")
	public String saveTask(@RequestParam String name, @RequestParam String desc){
		Task task = new Task(name, desc, new Date(), false);
		taskService.save(task);
		return "Task saved!";
	}
	
	@GetMapping("/delete-task")
	public String deleteTask(@RequestParam int id){
		taskService.delete(id);
		return "Task deleted!";
	}*/
}
