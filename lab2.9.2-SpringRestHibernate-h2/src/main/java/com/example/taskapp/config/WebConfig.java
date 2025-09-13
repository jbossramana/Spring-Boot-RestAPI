package com.example.taskapp.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
	    return null;  // No root config, or you can define backend config here separately
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	    return new Class[] { AppConfig.class }; // Web config with controllers
	}

	@Override
	protected String[] getServletMappings() {
	    return new String[] { "/" };
	}
}
