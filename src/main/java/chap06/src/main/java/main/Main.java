package chap06.src.main.java.main;

import chap06.src.main.java.config.AppCtx;
import chap06.src.main.java.spring.Client1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        AbstractApplicationContext ctx =
                new AnnotationConfigApplicationContext(AppCtx.class);
        Client1 client1 = ctx.getBean(Client1.class);
        client1.send();
        ctx.close();
    }
}
