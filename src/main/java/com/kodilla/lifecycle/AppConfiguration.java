package com.kodilla.lifecycle;

import com.kodilla.lifecycle.beans.LibraryManager;
import com.kodilla.lifecycle.beans.SampleBean;
import com.kodilla.lifecycle.monitors.BeanCreationMonitor;
import com.kodilla.lifecycle.monitors.BeanMonitor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {

    @Bean
    public LibraryManager libraryManager() {
        return new LibraryManager();
    }

    @Bean
    public SampleBean sampleBean() {
        return new SampleBean();
    }

    @Bean
    public BeanMonitor beanMonitor() {
        return new BeanMonitor();
    }

    @Bean
    public BeanCreationMonitor beanCreationMonitor() {
        return new BeanCreationMonitor();
    }
}
