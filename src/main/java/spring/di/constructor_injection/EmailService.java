package spring.di.constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements Service{
    @Override
    public void message() {
        System.out.println("Message is sent from "+getClass().getSimpleName());
    }
}
