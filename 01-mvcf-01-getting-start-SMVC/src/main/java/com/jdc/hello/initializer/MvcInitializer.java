package com.jdc.hello.initializer;

import java.util.Set;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.servlet.DispatcherServlet;

public class MvcInitializer implements ServletContainerInitializer {

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
		// TODO Auto-generated method stub
		
		var dis = new DispatcherServlet();
		dis.setContextConfigLocation("WEB-INF/mvcConfig.xml");
		var ser = ctx.addServlet("dis", dis);
		ser.setLoadOnStartup(1);
		
		ser.addMapping("/");
		
		ctx.setInitParameter("contextConfigLocation","WEB-INF/mvcConfig.xml");
		
		var list = new ContextLoaderListener();
		ctx.addListener(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

//	@Override
//	public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
//		
//		//register dispatcherServlet
//		
//		var dispatcher = new DispatcherServlet();
//		dispatcher.setContextConfigLocation("/WEB-INF/mvcConfig.xml");
//		var servlet = ctx.addServlet("dispatcher", dispatcher);
//		servlet.setLoadOnStartup(1);
//		
//		//map servlet
//		
//		servlet.addMapping("/");
//		
//		//set context parameter
//		ctx.setInitParameter("contextConfigLocation", "/WEB-INF/application.xml");
//		
//		//Application contextLoader
//		
//		var loader = new ContextLoaderListener();
//		ctx.addListener(loader);		
//	}

}
