package spring.di.setter_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.di.constructor_injection.Service;
@Component
public class UserSetterService {
    Service service;
    @Autowired
    @Qualifier("emailService")
    public void setUserSetterService(Service service){
        this.service=service;
    }
    public void sendMessage(){
        service.message();
    }
}
