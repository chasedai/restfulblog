package model;

/**
 * Not implementing now.
 * @author Chase
 *
 */
public class CategoryModel {

	private int ID;
	private String cateName;
	private String link;
	
	public CategoryModel(){
		
	}
	
	public CategoryModel(String cateName, String link){
		super();
		this.cateName = cateName;
		this.link = link;
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	
}
