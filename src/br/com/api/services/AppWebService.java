package br.com.api.services;


import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/v1")
public class AppWebService extends Application {
		
	@Override
	public Set<Class<?>> getClasses() {		
		Set<Class<?>> classes = new HashSet<Class<?>>();				
		classes.add(BierService.class);			
		return classes;		
	}
	
}
