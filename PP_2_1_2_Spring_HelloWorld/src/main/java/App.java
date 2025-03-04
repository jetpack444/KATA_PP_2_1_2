import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class); //запускает спринг
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");

        HelloWorld bean1 =
                (HelloWorld) applicationContext.getBean("helloworld");

        Cat beancat =
                (Cat) applicationContext.getBean("cat");

        Cat bean1cat =
                (Cat) applicationContext.getBean("cat");

        System.out.println(bean.getMessage());
        System.out.println(bean1.getMessage());
        System.out.println(beancat.getMessage());
        System.out.println(bean1cat.getMessage());
        
        System.out.println("Сравнение: ");
        System.out.println(bean.equals(bean1));
        System.out.println(beancat.equals(bean1cat));
    }
}