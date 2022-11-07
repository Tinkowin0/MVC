package com.jdc.hello.initializer;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.jdc.hello.config.RootConfig;
import com.jdc.hello.config.ServletConfigWeb;

public class MvcAbAnnoConfigDisServletInit  extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {RootConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {ServletConfigWeb.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
