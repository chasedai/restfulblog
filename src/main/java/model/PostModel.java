package model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlRootElement
public class PostModel {
	
	private int ID;
	private int category;
	private String title;
	private String time;
	private String content;
	
	public PostModel(){
		
	}
	
	public PostModel(int category, String title, Date time,
			String content) {
		super();
		this.category = category;
		this.title = title;
		this.time = time.toString();
		this.content = content;
	}


	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public int getCategory() {
		return category;
	}
	public void setCategory(int category) {
		this.category = category;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	
}
