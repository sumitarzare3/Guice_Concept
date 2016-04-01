package com.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.service.MyServiceInterface;

@Path("/restservice")
@Singleton
public class MyResource {
	

	MyServiceInterface myserviceinterface;

	@Inject
	public MyResource(MyServiceInterface a){
		myserviceinterface = a;
		
		
	}
	@GET
	@Path("{name}")
	public String hello(@PathParam("name") final String name) {
		return myserviceinterface.say(name);
	}

}
