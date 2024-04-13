package Assignments.first_sending_an_email;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PostgresSQLDataSource implements DataSource{
    String email1="postgres1@gmil.com";
    String email2="postgres2@gmil.com";
    String email3="postgres3@gmil.com";
    String email4="postgres4@gmil.com";
    String[] stringsArray={email1,email2,email3,email4};
    @Override
    public String[] getEmails() {
        return stringsArray;
    }
}
