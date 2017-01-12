package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="movies")
public class Movie implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String name;
	@Column (length=15)
	private String type;
	@Column(length=45)
	private String description;
	private boolean enabled;
	public Movie( String name, String type, String description, boolean enabled) {
		super();
		
		this.name = name;
		this.type = type;
		this.description = description;
		this.enabled = enabled;
	}
	 public Movie(){
		 this("","","",false);
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", type=" + type + ", description=" + description + ", enabled="
				+ enabled + "]";
	}
	 
	
	
	
	
}
