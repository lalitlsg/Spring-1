package com.springcore.constructorInj;

public class Add {
    private int a;
    private int b;

    public Add(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Constructor: int, int");
    }

    public Add(double a, double b) {
        this.a = (int) a;
        this.b = (int) b;
        System.out.println("Constructor: double, double");
    }

    public void sum() {
        System.out.println("sum is : " + (this.a + this.b));
    }
}
