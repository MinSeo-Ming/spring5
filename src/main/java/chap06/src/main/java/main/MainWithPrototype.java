package chap06.src.main.java.main;

import chap06.src.main.java.config.AppCtx;
import chap06.src.main.java.spring.Client1;
import chap06.src.main.java.spring.Client2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.io.IOException;

public class MainWithPrototype {
    public static void main(String[] args) throws IOException {
        AbstractApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppCtx.class);
        Client1 client1 = ctx.getBean(Client1.class);
        Client1 client2 = ctx.getBean(Client1.class);
        System.out.println("client2 == client1 = "+(client1==client2));
        ctx.close();
    }
}
