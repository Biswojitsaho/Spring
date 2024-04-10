package spring.configuration.java_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientJava_based {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(Java_based_config.class);
        Books books=context.getBean(Books.class);
        books.read();
    }
}
