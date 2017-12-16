package com.chase.restful.Blog;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.userTest;

@Path("Users")
public class userResources {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello Jersey";
	}

	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public userTest findById(@PathParam("id") String id) {
		System.out.println("findById" + id);
//		return HibernateUtils.retrieveSingleByID(Integer.parseInt(id));
		return null;
	}
}
