package com.jdc.hello.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

public class MvcWebApp implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		
//		var dispatch = new DispatcherServlet();
//		dispatch.setContextConfigLocation("/WEB-INF/mvcConfig.xml");
//		var servlet = servletContext.addServlet("dispatch", dispatch);
//		servlet.setLoadOnStartup(1);
//		servlet.addMapping("/");
//		servletContext.setInitParameter("contextConfigLocation", "/WEB-INF/application.xml");
//		var loader = new ContextLoaderListener();
//		servletContext.addListener(loader);
	}

}
