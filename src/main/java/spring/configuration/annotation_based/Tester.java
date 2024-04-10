package spring.configuration.annotation_based;

import org.springframework.stereotype.Component;

@Component
public class Tester implements Employee{
    @Override
    public void work() {
        System.out.println("Tester got JIRA tickets...");
    }
}
