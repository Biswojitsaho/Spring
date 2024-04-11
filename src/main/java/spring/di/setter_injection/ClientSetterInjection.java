package spring.di.setter_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.di.constructor_injection.ConstructorInjectionConfig;

public class ClientSetterInjection {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(ConstructorInjectionConfig.class);
        UserSetterService userSetterService=context.getBean(UserSetterService.class);
        userSetterService.sendMessage();
    }
}
