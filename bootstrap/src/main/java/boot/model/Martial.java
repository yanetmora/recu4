package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="martials")
public class Martial implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String name;
	@Column (length=45)
	private String type;
	@Column(length=45)
	private String origin;
	private boolean practiced;
	public Martial( String name, String type, String origin, boolean practiced) {
		super();
		
		this.name = name;
		this.type = type;
		this.origin = origin;
		this.practiced = practiced;
	}
	public Martial(){
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
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public boolean isPracticed() {
		return practiced;
	}
	public void setPracticed(boolean practiced) {
		this.practiced = practiced;
	}
	@Override
	public String toString() {
		return "Martial [id=" + id + ", name=" + name + ", type=" + type + ", origin=" + origin + ", practiced="
				+ practiced + "]";
	}
	
	
	
}
