package services;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ipaddress/api/vce/")
public class WebService {
	@GET
	@Produces(MediaType.TEXT_XML)
	@Path("{username}")
	public String sayHello(@PathParam("username") String username) {
		String response = "<?xml version='1.0'?>"+
		"<hello>Username is :  "+username+"</hello>";
		return response;
	}

}
