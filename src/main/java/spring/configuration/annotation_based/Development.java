package spring.configuration.annotation_based;

import org.springframework.stereotype.Component;

@Component("Development")
public class Development implements Employee{
    @Override
    public void work() {
        System.out.println("Developer got JIRA tickets...");
    }
}
