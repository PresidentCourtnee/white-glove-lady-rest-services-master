package com.whiteglovelady;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.h2.server.web.WebServlet;

@Configuration
public class WebServletConfig
{
 @Bean
    ServletRegistrationBean h2ServletRegistration()
 {
     ServletRegistrationBean registrationBean = new ServletRegistrationBean(new WebServlet());
     registrationBean.addUrlMappings("/console/*");
     return registrationBean;
 }
}