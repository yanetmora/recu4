package boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="pictures")
public class Picture {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int pictureId;
	@Column (length=45)
	private String description;
	@Column 
	private float width;
	@Column
	private float heigth;
	@Column(length=45)
	private String artist;
	public Picture( String description, float width, float heigth, String artist) {
		super();
	
		this.description = description;
		this.width = width;
		this.heigth = heigth;
		this.artist = artist;
	}
	
	public Picture(){
		this("",0,0,"");
	}

	public int getPictureId() {
		return pictureId;
	}

	public void setPictureId(int pictureId) {
		this.pictureId = pictureId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getHeigth() {
		return heigth;
	}

	public void setHeigth(float heigth) {
		this.heigth = heigth;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Picture [pictureId=" + pictureId + ", description=" + description + ", width=" + width + ", heigth="
				+ heigth + ", artist=" + artist + "]";
	}
	
	
	
}
