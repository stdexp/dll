package com.tasksprojectabarkihatim.taskproject;




import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MVCConfig extends WebMvcConfigurerAdapter 
{

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("login").setViewName("login");
		registry.addViewController("login_v2").setViewName("login_v2");
		registry.addViewController("index").setViewName("index");
		registry.addViewController("logout").setViewName("login");
		registry.addViewController("add_task").setViewName("add_task");
	}

	
}




