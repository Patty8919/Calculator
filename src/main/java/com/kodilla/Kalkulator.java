package com.kodilla;

public class Kalkulator {
    public int addAToB(int a, int b)
    {
        return (a + b);

    }

    public double subtractDFromC(double c, double d)
    {
        return  c - d;
    }


    public static void main(String[] args) {
        Kalkulator calculator = new Kalkulator();

        double result = calculator.subtractDFromC(20.5, 3.2);
        System.out.println(result);

        int result2 = calculator.addAToB(25, 4);
        System.out.println(result2);
    }
}
