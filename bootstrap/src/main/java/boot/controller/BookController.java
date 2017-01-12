package boot.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import boot.model.Book;
import boot.service.BookService;


@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	//*Apartir de aqui nuevos metodos*/
	@GetMapping("/all-books")
	public String allBooks(HttpServletRequest request){
		request.setAttribute("books",bookService.findAll());
		request.setAttribute("mode","MODE_BOOKS");
		return "book";
	}
	
	@GetMapping("/new-book")
	public String newBook(HttpServletRequest request){
		request.setAttribute("mode","MODE_NEW");
		return "book";
	}
	@PostMapping("/save-book")
	public String saveBook(@ModelAttribute Book book,BindingResult bindingResult, HttpServletRequest request){
		bookService.save(book);
		request.setAttribute("books",bookService.findAll());
		request.setAttribute("mode","MODE_BOOKS");
		return "book";
	}
	
	
	@GetMapping("/update-book")
	public String updateBook(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("book",bookService.findBook(id));
		request.setAttribute("mode","MODE_UPDATE");
		return "book";
	}
	@GetMapping("/delete-book")
	public String deleteBook(@RequestParam int id,HttpServletRequest request){
		bookService.delete(id);
		request.setAttribute("books",bookService.findAll());
		request.setAttribute("mode","MODE_BOOKS");
		return "book";
	}
}
