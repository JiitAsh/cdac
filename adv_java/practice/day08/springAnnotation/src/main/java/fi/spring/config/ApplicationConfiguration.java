package fi.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"fi.spring.beans"})
public class ApplicationConfiguration {

}
