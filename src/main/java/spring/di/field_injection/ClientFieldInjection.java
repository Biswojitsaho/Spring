package spring.di.field_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.di.constructor_injection.ConstructorInjectionConfig;
import spring.di.setter_injection.UserSetterService;

public class ClientFieldInjection {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConstructorInjectionConfig.class);
        UserFieldService userFieldService=context.getBean(UserFieldService.class);
        userFieldService.sendMessage();
    }
}
