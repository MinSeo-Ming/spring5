package chap05.java.main;

import chap05.java.config.AppCtxWithExclude;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class MainForExclude {
    private static ApplicationContext ctx= null;

    public static void main(String[] args) throws IOException {
        ctx = new AnnotationConfigApplicationContext(AppCtxWithExclude.class);
    }
}
