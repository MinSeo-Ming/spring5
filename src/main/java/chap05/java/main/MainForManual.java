package chap05.java.main;

import chap05.java.config.AppCtxManual1;
import chap05.java.config.AppCtxManual2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import java.io.IOException;

public class MainForManual {
    private static AbstractApplicationContext ctx = null;

    public static void main(String[] args) throws IOException {
        ctx = new AnnotationConfigApplicationContext(AppCtxManual1.class, AppCtxManual2.class);
        ctx.close();
    }
}
