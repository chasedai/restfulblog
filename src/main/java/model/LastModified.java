package model;

import java.sql.Date;


/**
 * Was going to have conditonal get request.
 * @author Chase
 *
 */
public class LastModified {

	private int ID;
	private Date lastModified;
	
	public LastModified(){
		
	}
	
	public LastModified(Date Lastmodified){
		this.lastModified = Lastmodified;
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Date getLastModified() {
		return lastModified;
	}
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}
	
	
}
