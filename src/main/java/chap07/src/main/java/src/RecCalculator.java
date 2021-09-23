package chap07.src.main.java.src;

public class RecCalculator implements Calculator{
    public RecCalculator() {
    }
    @Override
    public long factorial(long num) {

        if (num ==0)
            return 1;
        else
            return num * factorial(num-1);
    }
}
