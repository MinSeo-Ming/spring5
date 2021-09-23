package chap07.src.main.java.main;

import chap07.src.main.java.src.ExeTimeCalculator;
import chap07.src.main.java.src.ImpeCalculator;
import chap07.src.main.java.src.RecCalculator;

;

public class MainProxy {
    public static void main(String[] args) {
        ExeTimeCalculator ttCal1 = new ExeTimeCalculator(new ImpeCalculator());
        System.out.println(ttCal1.factorial(20));

        ExeTimeCalculator ttCal2 = new ExeTimeCalculator(new RecCalculator());
        System.out.println(ttCal2.factorial(20));


    }
}
