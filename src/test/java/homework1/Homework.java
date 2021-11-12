package homework1;

import org.junit.jupiter.api.Test;

public class Homework {
    public double caruse (double fuelhundred, double km){
        double use =(fuelhundred / 100)*km;
        return use;
    }
    @Test
    public void test1(){
        double a = caruse(99,4);
        double b = caruse(10,100);
        double c = caruse(5,20);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
