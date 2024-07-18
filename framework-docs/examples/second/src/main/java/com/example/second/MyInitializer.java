package com.example.second;

import jakarta.servlet.ServletRegistration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

// Log sensitive data
public class MyInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }


    @Override
    protected void customizeRegistration(ServletRegistration.Dynamic registration) {
        registration.setInitParameter("enableLoggingRequestDetails", "true");
    }

    @Override
    protected String[] getServletMappings() {
        return new String[0];
    }
}
