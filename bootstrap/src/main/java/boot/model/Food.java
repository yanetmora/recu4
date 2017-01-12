package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="foods")
public class Food implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String name;
	@Column (length=45)
	private String flavor;
	@Column(length=45)
	private String origin;
	
	public Food( String name, String flavor, String origin) {
		super();
		
		this.name = name;
		this.flavor = flavor;
		this.origin = origin;
	}
	
	public Food(){
		this("","","");
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

	public String getFlavor() {
		return flavor;
	}

	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	@Override
	public String toString() {
		return "Food [id=" + id + ", name=" + name + ", flavor=" + flavor + ", origin=" + origin + "]";
	}
	
	
}
