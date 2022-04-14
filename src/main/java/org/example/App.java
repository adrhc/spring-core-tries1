package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 */
@Configuration
@ComponentScan
public class App {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class)) {
            context.getBeansOfType(CommandLineRunner.class).forEach((name, instance) -> instance.run(args));
        }
    }
}
