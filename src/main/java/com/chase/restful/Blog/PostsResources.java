package com.chase.restful.Blog;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import sun.misc.BASE64Decoder;
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

	@DELETE
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public void remove(@PathParam("id") String id,
			@HeaderParam("authorization") String authString) {
		if (!isUserAuthenticated(authString)) {
			System.out.println("access denied");
		} else {
			HibernateUtils.deletePostById(Integer.parseInt(id));
		}
	}

	@POST
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public List<PostModel> create(PostModel pm,
			@HeaderParam("authorization") String authString) {
		if (!isUserAuthenticated(authString)) {
			System.out.println("access denied");
			return null;
		} else {
			HibernateUtils.creatRecord(pm);
			return getAllPosts();
		}

	}

	@PUT
	@Path("{id}")
	@Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	@Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
	public PostModel update(PostModel pm,
			@HeaderParam("authorization") String authString) {
		if (!isUserAuthenticated(authString)) {
			System.out.println("access denied");
			return null;
		} else {
			HibernateUtils.updatePost(pm);
			return pm;
		}

	}

	// validate identification
	private boolean isUserAuthenticated(String authString) {

		String decodedAuth = "";
		// Header is in the format "Basic 5tyc0uiDat4"
		// We need to extract data before decoding it back to original string
		String[] authParts = authString.split("\\s+");
		String authInfo = authParts[1];
		// Decode the data back to original string
		byte[] bytes = null;
		try {
			bytes = new BASE64Decoder().decodeBuffer(authInfo);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		decodedAuth = new String(bytes);
		System.out.println(decodedAuth);

		/**
		 * here you include your logic to validate user authentication. it can
		 * be using ldap, or token exchange mechanism or your custom
		 * authentication mechanism.
		 */

		int id = decodedAuth.indexOf(":");

		if (decodedAuth.substring(0, id).equals("Chase")
				&& decodedAuth.substring(id + 1, decodedAuth.length()).equals(
						"daiqi123")) {
			return true;
		} else {
			return false;
		}

	}
}
