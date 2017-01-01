/**
 * 
 */
package com.lam.qltp.configs;

import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @author LamNguyen
 *
 */

@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/bower/**").addResourceLocations("../assets/vendor/");
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
		registry.addResourceHandler("/css/**").addResourceLocations("/resources/static/css/");
		registry.addResourceHandler("/js/**").addResourceLocations("/resources/static/js/");
		registry.addResourceHandler("/img/**").addResourceLocations("/resources/static/img/");
    }
	
}
