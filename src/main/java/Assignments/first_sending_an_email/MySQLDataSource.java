package Assignments.first_sending_an_email;

import org.springframework.stereotype.Component;

@Component("mySql")
public class MySQLDataSource implements DataSource{
    String email1="mysql1@gmil.com";
    String email2="mysql2@gmil.com";
    String email3="mysql3@gmil.com";
    String email4="mysql4@gmil.com";
    String[] stringsArray={email1,email2,email3,email4};
    @Override
    public String[] getEmails() {
        return stringsArray;
    }
}
