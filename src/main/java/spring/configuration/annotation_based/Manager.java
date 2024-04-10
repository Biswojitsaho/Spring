package spring.configuration.annotation_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Manager {
    Employee employee;
    @Autowired
    Manager(@Qualifier("Development") Employee employee){
        this.employee=employee;
    }
    public void assigned(){
        this.employee.work();
    }
}
