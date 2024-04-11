package spring.di.field_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import spring.di.constructor_injection.Service;
@Component
public class UserFieldService {
    @Autowired
    @Qualifier("smsService")
    Service service;
    public void sendMessage(){
        service.message();
    }
}
