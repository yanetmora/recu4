package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="sings")
public class Sing implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column (length=45)
	private String name;
	@Column (length=45)
	private String singer;
	@Column(length=45)
	private String album;
	@Column(length=45)
	private String generous;
	
	public Sing( String name, String singer, String album, String generous) {
		super();
		
		this.name = name;
		this.singer = singer;
		this.album = album;
		this.generous = generous;
	}
	
	public Sing(){
		this("","","","");
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

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getGenerous() {
		return generous;
	}

	public void setGenerous(String generous) {
		this.generous = generous;
	}

	@Override
	public String toString() {
		return "Sing [id=" + id + ", name=" + name + ", singer=" + singer + ", album=" + album + ", generous="
				+ generous + "]";
	}
	
}
