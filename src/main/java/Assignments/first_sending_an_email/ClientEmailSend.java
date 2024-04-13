package Assignments.first_sending_an_email;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientEmailSend {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SendEmailConfig.class);
        EmailService emailService1=context.getBean(EmailService.class);
        emailService1.sendEmail();
        System.out.println("----------------");
        DataSource mySQLDataSource=context.getBean(MySQLDataSource.class);
    }
}
