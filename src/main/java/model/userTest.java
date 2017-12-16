package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class userTest {

	private int id;
	private String name;
	private String age;
	
	public userTest(){
		
	}
	
	public userTest(String name, String age) {
		super();
		this.name = name;
		this.age = age;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
}
