package chap07.src.main.java.main;


import chap07.src.main.java.config.AppCtx;
import chap07.src.main.java.src.Calculator;
import chap07.src.main.java.src.RecCalculator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainAspect {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(new Class[]{AppCtx.class});
        Calculator cal = (Calculator)ctx.getBean("calculator", Calculator.class);
//        RecCalculator cal = ctx.getBean("calculator", RecCalculator.class);
        long fiveFact = cal.factorial(5L);

        System.out.println("cal.factorial(5) = " + fiveFact);
        System.out.println(cal.getClass().getName());
        ctx.close();
    }

}