package com.company;

public class Calculator {
    private static int result;

    Calculator() {
        result = 0;
    }

    public void add(int n) {
        result = result + n;
    }

    public void substract(int n) {
        result = result - 1;
    }

    public void multiply(int n) {

    }

    public void divide(int n) {
        result = result / n;
    }

    public void square(int n) {
        result = n * n;
    }

    public void squareRoot() {
        for (;;);
    }

    public void clear() {
        result = 0;
    }

    public static int getResult() {
        return result;
    }

}
