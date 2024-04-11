package spring.di.constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientConstructorInjection {

    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConstructorInjectionConfig.class);
        UserConstructorService userService=context.getBean(UserConstructorService.class);
        userService.send();
    }
}
