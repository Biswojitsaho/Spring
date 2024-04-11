package spring.di.constructor_injection;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements Service{
    @Override
    public void message() {
        System.out.println("Message is sent from "+getClass().getSimpleName());
    }
}
