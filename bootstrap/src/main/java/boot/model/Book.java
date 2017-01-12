package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="books")
public class Book implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column (length=45)
	private String name;
	
	@Column (length=45)
	private String author;
	
	@Column
	private int pages;
	
	@Column (length=45)
	private String editorial;
	public Book(String name, String author, int pages, String editorial) {
		super();
		this.name = name;
		this.author = author;
		this.pages = pages;
		this.editorial = editorial;
	}
	public Book(){
		this("","",0,"");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", pages=" + pages + ", editorial="
				+ editorial + "]";
	}
	
	
}
