package chap07.src.main.java.main;

import chap07.src.main.java.config.AppCtxWithCache;
import chap07.src.main.java.src.Calculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspectWithCache {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtxWithCache.class);
        Calculator cal = ctx.getBean("calculator", Calculator.class);
        cal.factorial(7L);

        cal.factorial(7L);
        cal.factorial(5L);
        cal.factorial(5L);
        ctx.close();
    }
}
