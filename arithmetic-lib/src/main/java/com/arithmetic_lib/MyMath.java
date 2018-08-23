package com.arithmetic_lib;

public class MyMath {

    private static int add, subtract, multiply;
    private static float division;

    public static int Plus(int a, int b) {
        add = a + b;
        return add;
    }

    public static int Minus(int a, int b) {
        subtract = a - b;
        return subtract;
    }

    public static int Times(int a, int b) {
        multiply = a * b;
        return multiply;
    }

    public static float Div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Div by Zero error......");
        } else {
            division = a / b;
            return division;
        }
    }

}
