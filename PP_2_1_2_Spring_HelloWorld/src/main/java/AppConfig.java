import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration //Настроечный класс
public class AppConfig {
 
    @Bean(name="helloworld")
    public HelloWorld getHelloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld; // результат = объект, управляемый спрингом
    }

    @Bean(name="cat")
    @Scope("prototype") // позволяет при каждом обращении получать новый экземпляр бина
    public Cat getCat() {
        Cat cat = new Cat();
        cat.setMessage("Cat");
        return cat;
    }
}