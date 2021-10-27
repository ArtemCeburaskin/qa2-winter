package basics;

import org.junit.jupiter.api.Test;

public class MyFirstJavaClass {
    public int sumTwoDigits(int a, int b) {
//        int someDigit = 13;
        int c = a + b;
        return c;
    }

    public int minus(int a, int b) {
//        int c = a - b;
        return a - b;

    }
    @Test
    public void test() {
        int a = sumTwoDigits(7,13);
        int b = sumTwoDigits(10,1);
        int g = minus(100, 54);
        System.out.println(a);
        System.out.println(b);
        System.out.println(g);
    }
}
