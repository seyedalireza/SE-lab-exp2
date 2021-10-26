package computer;
import java.lang.Math;

public class Computer {
    public double calculate(int a, String s) {
        if (s.equals("rvs")) {
            return 1.0 / ((double) a);
        } else if (s.equals("sqr")) {
            return Math.sqrt(a);
        } else {
            return a;
        }
    }
}
