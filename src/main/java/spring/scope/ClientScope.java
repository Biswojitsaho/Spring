package spring.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientScope {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
        System.out.println(" --------------------------------  ");
        SingletonBean singletonBean1 = context.getBean(SingletonBean.class);
        System.out.println("singletonBean1 - "+singletonBean1.hashCode());
        SingletonBean singletonBean2 = context.getBean(SingletonBean.class);
        System.out.println("singletonBean2 - "+singletonBean2.hashCode());
        SingletonBean singletonBean3 = context.getBean(SingletonBean.class);
        System.out.println("singletonBean3 - "+singletonBean3.hashCode());
        SingletonBean singletonBean4 = context.getBean(SingletonBean.class);
        System.out.println("singletonBean4 - "+singletonBean4.hashCode());
        System.out.println(" --------------------------------  ");
        PrototypeBean prototypeBean1 = context.getBean(PrototypeBean.class);
        System.out.println("prototypeBean1 - "+prototypeBean1.hashCode());
        PrototypeBean prototypeBean2 = context.getBean(PrototypeBean.class);
        System.out.println("prototypeBean2 - "+prototypeBean2.hashCode());
        PrototypeBean prototypeBean3 = context.getBean(PrototypeBean.class);
        System.out.println("prototypeBean3 - "+prototypeBean3.hashCode());
        PrototypeBean prototypeBean4 = context.getBean(PrototypeBean.class);
        System.out.println("prototypeBean4 - "+prototypeBean4.hashCode());
    }
}
