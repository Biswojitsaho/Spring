package spring.configuration.annotation_based;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientAnnotationBased {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AnnotationBasedConfig.class);
        Employee employee = new Tester();
        Development develpopment = context.getBean(Development.class);
        develpopment.work();
        Tester tester = context.getBean(Tester.class);
        tester.work();
        Manager manager= context.getBean(Manager.class);
        manager.assigned();
        System.out.println("Completed...");
    }
}
