package eubrazil.atmosphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;

/**
 * Start Spring Boot Analyzer Application
 * @author JorgeLuiz
 */
@EnableAutoConfiguration
@EnableSpringConfigured
@ComponentScan
@SpringBootApplication
@EntityScan( basePackages = {"eubr.atmosphere.tma.entity"} )
public class StartApplication {
    public static void main(String[] args) throws Exception {
    	SpringApplication.run(StartApplication.class, args);
    }
}

