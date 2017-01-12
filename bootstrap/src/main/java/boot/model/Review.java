package boot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity (name="reviews")
public class Review  implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	@Column
	private int documentKey;
	
	
	@Column (length=45)
	private String crestionData;
	
	@Column
	private int userKey;
	
	@Column 
	private int rating;
	
	@Column (length=45)
	private String comments;
	
	@Column (length=45)
	private String data;

	


	public Review(int documentKey, String crestionData, int userKey, int rating, String comments, String data) {
		super();
		this.documentKey = documentKey;
		this.crestionData = crestionData;
		this.userKey = userKey;
		this.rating = rating;
		this.comments = comments;
		this.data = data;
	}


	public Review() {
		this(0,"",0,0,"","");
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	
	public String getCrestionData() {
		return crestionData;
	}


	public void setCrestionData(String crestionData) {
		this.crestionData = crestionData;
	}



	public int getRating() {
		return rating;
	}


	
	

	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getComments() {
		return comments;
	}


	public void setComments(String comments) {
		this.comments = comments;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public int getDocumentKey() {
		return documentKey;
	}


	public void setDocumentKey(int documentKey) {
		this.documentKey = documentKey;
	}


	public int getUserKey() {
		return userKey;
	}


	public void setUserKey(int userKey) {
		this.userKey = userKey;
	}


	@Override
	public String toString() {
		return "Review [id=" + id + ", documentKey=" + documentKey + ", crestionData=" + crestionData + ", userKey="
				+ userKey + ", rating=" + rating + ", comments=" + comments + ", data=" + data + "]";
	}


	
	

	


	


	

	
	
	
}
