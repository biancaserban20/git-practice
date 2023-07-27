package com.qa;

public class TestCalc {
    public static void main(String[] args) {
        BadCalc bd = new BadCalc();
        System.out.println(bd.mult(2,5));
        try {
            System.out.println(bd.div(4, 0));
        }
        catch(ArithmeticException e){
            System.out.println("Caught exception");
        }
    }
}
