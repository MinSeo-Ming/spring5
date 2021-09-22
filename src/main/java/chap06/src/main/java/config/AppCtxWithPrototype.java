package chap06.src.main.java.config;

import chap06.src.main.java.spring.Client1;
import chap06.src.main.java.spring.Client2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppCtxWithPrototype {
    @Bean
    @Scope("prototype")
    public Client1 client1(){
        Client1 client1 =new Client1();
        client1.setHost("host");
        return client1;
    }
    @Bean(initMethod = "connect",destroyMethod = "close")

    @Scope("singleton")
    public Client2 client2(){
        Client2 client2 = new Client2();
        client2.setHost("host");
        return client2;
    }
}
