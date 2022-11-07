package com.jdc.hello.initializer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.context.AbstractContextLoaderInitializer;
import org.springframework.web.context.WebApplicationContext;

public class MvcAbstractContextLoaderInit extends AbstractContextLoaderInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		super.onStartup(servletContext);
//		
//		var dispatch = new DispatcherServlet();
//		dispatch.setContextConfigLocation("/WEB-INF/mvcConfig.xml");
//		var servlet = servletContext.addServlet("dispatch", dispatch);
//		servlet.setLoadOnStartup(1);
//		servlet.addMapping("/");
	}
	
	@Override
	protected WebApplicationContext createRootApplicationContext() {
		//var web = new XmlWebApplicationContext();
		//web.setConfigLocation("/WEB-INF/application.xml");
		//return web;
		return null;
	}

}
