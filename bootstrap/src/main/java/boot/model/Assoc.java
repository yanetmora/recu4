package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="assocs")
public class Assoc implements Serializable {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column 
	private int froom;
	@Column 
	private int too;
	@Column
	private int relationship;
	
	public Assoc(int froom, int too, int relationship) {
		super();
		this.froom = froom;
		this.too = too;
		this.relationship = relationship;
	}
	public Assoc (){
		this(0,0,0);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFroom() {
		return froom;
	}
	public void setFroom(int froom) {
		this.froom = froom;
	}
	public int getToo() {
		return too;
	}
	public void setToo(int too) {
		this.too = too;
	}
	public int getRelationship() {
		return relationship;
	}
	public void setRelationship(int relationship) {
		this.relationship = relationship;

}
	@Override
	public String toString() {
		return "Assoc [id=" + id + ", froom=" + froom + ", too=" + too + ", relationship=" + relationship + "]";
	}
}