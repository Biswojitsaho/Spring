package spring.configuration.java_based;
/*
Using java based configuration we create a configuration class and annotate the class with @Configuration
We create method which return type should be Object and annotate with @Bean. Then our application becomes java based configuration.
 */
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
public class Java_based_config {
    @Bean
    public Books books(){
        return new Books();
    }
    @Bean
    public Newspaper newspaper(){
        return new Newspaper();
    }
}
