package Assignments.first_sending_an_email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.xml.crypto.Data;
import java.util.Arrays;

@Component
public class EmailService {
    private DataSource dataSource;
    @Autowired
    public EmailService(@Qualifier("mySql")DataSource dataSource){ //If we  don't put @Qualifier then it will take postgressqlDataSourse because of @Primary
        this.dataSource=dataSource;
    }
    public void sendEmail(){
        for(String e: dataSource.getEmails()){
            System.out.println(e);
        }
    }
}
