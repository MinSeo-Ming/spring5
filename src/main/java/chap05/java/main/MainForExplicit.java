package chap05.java.main;

import chap05.java.config.AppCtxWithExplicit;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.io.IOException;

public class MainForExplicit {
    private static AbstractApplicationContext ctx = null;

    public static void main(String[] args) throws IOException {
        ctx = new AnnotationConfigApplicationContext(
                AppCtxWithExplicit.class);

        ctx.close();
    }
}
