package spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

class Address {
    public void print() {
        System.out.println("Address class print method called");
    }
    //InitMethod tells spring container to call init method when it starts managing the bean
    public void init(){
        System.out.println("Initialize logic...");
    }
    //destroyMethod tells spring container to call the destroy method of Student object whenever spring destroys the bean
    public void destroy(){
        System.out.println("Destroy logic...");
    }
}

class Student {
    Address address;

    Student(Address address) {
        this.address = address;
    }

    public void print() {
        System.out.println("Student class print method called");
    }
}

@Configuration
class AppConfig {
    //If we want to pass single name then we can declare it directly but for multiple beanName we should use {}
    @Bean(name = "AdressBean",initMethod = "init",destroyMethod = "destroy")
//    @Bean(name = {"AddressBean", "DuplicateBean"})
    public Address getAddress() {
        return new Address();
    }

    @Bean
    public Student student() {
        return new Student(getAddress());
    }
}

public class BeanAnnoationDemo {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AppConfig.class)){ //This is try with resource. var is a datatype(java 10 features)
            Address address = context.getBean(Address.class);
            address.print();
            Student student = context.getBean(Student.class);
            Student student2 = (Student) context.getBean("student");//Fetchinng beans using bean name
            student.print();
            String[] beanNames = context.getBeanDefinitionNames();
            System.out.println("Printing beans names...");
            Arrays.stream(beanNames).forEach(System.out::println);
            System.out.println();
            student2.print();
            //To run below code please uncomment Duplicate bean declaration(line 32)
//        Address address1 = (Address) context.getBean("DuplicateBean"); //Fetched using multiple bean names
//        address1.print();
        }

    }
}
