package com.consumer;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.injector.MyModule;
import com.resource.MyResource;

public class MyInjector{
	
	public static void main(String[] args) {
		
		Injector injector = Guice.createInjector(new MyModule());
	//	injector.getAllBindings();
	//	injector.createChildInjector().getAllBindings();
		MyResource r =  injector.getInstance(MyResource.class);
		r.hello("sumit");
		return;
	}


}
