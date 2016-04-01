package com.service;

import com.google.inject.Singleton;

@Singleton
public class MyService implements MyServiceInterface{
	
	public String say(String Name) {
        return "Hello" + Name;
    }

}
