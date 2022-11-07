package com.jdc.hello.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.jdc.hello.controller.interceptor.HelloInterceptor;

@Configuration
@EnableWebMvc
@ImportResource(locations = "/WEB-INF/jx.xml")// mix java and xml
@ComponentScan("com.jdc.hello.controller")
public class ServletConfigWeb implements WebMvcConfigurer {

	@Autowired
	private HelloInterceptor interceptor;
	
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		//registry.addRedirectViewController("/", "/hello");
		registry.addViewController("/").setViewName("index");
	}

//	@Override
//	public void configureViewResolvers(ViewResolverRegistry registry) {
//		registry.jsp().prefix("/views/").suffix(".jsp");
//	}
	@Bean
	public ViewResolver jspView() {
		return new InternalResourceViewResolver("/views/", ".jsp");
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptor);
	}
	
//	@Bean("/leg")
//	public LegacyController legcy() {
//		return new LegacyController();
//	}
}
