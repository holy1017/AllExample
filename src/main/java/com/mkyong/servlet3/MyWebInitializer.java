package com.mkyong.servlet3;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.mkyong.config.SpringWebConfig;

public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] { SpringWebConfig.class };// SpringWebConfig.java
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/spring4-mvc-ajax-example/*" };
	}

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return null;
	}

}