package com.twg.backend.config;

import com.twg.backend.repository.DepartmentHoursRepository;
import com.twg.backend.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {


    @Autowired
    private DepartmentRepository departmentRepository;
    @Autowired
    private DepartmentHoursRepository departmentHoursRepository;


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**");
    }

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        new SeedDepartment(departmentRepository, departmentHoursRepository);
    }
}
