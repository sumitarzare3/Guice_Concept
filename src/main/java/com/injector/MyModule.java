package com.injector;

import com.google.inject.AbstractModule;
import com.resource.MyResource;
import com.service.MyService;
import com.service.MyServiceInterface;

public class MyModule extends AbstractModule{
	

	@Override
	protected void configure() {
	
		bind(MyResource.class);
		bind(MyServiceInterface.class).to(MyService.class);
	}

}
