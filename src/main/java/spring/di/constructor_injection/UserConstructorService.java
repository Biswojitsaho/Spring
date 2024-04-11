package spring.di.constructor_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserConstructorService {
    Service service;
    @Autowired
    UserConstructorService(@Qualifier("emailService") Service service){ //This is constructor injection
        this.service=service;
    }
    public void send(){
        service.message();
    }
}
