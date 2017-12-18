package com.chase.restful.Blog;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import utils.HibernateUtils;
import model.PostModel;

@Path("posts")
public class PostsResources {

	@GET
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<PostModel> getAllPosts() {
		System.out.println("get all posts");
		return HibernateUtils.retrieveAllPosts();
	}
	
	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public PostModel findById(@PathParam("id") String id) {
		System.out.println("findById" + id);
		return HibernateUtils.retrieveSingleByID(Integer.parseInt(id));
	}
}
