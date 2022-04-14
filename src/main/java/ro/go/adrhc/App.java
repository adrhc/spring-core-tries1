package ro.go.adrhc;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePatternResolver;

import ro.go.adrhc.boot.CommandLineRunner;
import ro.go.adrhc.boot.YamlPropertyLoaderFactory;
import ro.go.adrhc.model.SomeConfig;

/**
 * Hello world!
 */
@Configuration
@ComponentScan
@PropertySource(value = "classpath:application.yml", factory = YamlPropertyLoaderFactory.class)
public class App {

    private static final ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());

    @Bean
    public SomeConfig someConfig(ResourcePatternResolver resourcePatternResolver) throws IOException {
        Resource resource = resourcePatternResolver.getResource("some-config.yml");
        return yamlMapper.readValue(resource.getInputStream(), SomeConfig.class);
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(App.class)) {
            context.getBeansOfType(CommandLineRunner.class).forEach((name, instance) -> instance.run(args));
        }
    }
}
