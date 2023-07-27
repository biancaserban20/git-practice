package com.qa;

public class BadCalc {
    public int mult(int x, int y){
        return x * y;
    }

    public int div(int x, int y) throws ArithmeticException{
        return x / y;
    }

}
