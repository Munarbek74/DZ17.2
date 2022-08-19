package com.company;

public class Square extends Shape{
    private double a;
    private double b;
    private double c;
    private double d;

    public Square(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Override
    public double getPerimeter() {
        return (4*a);
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                "} Perimeter:= " + getPerimeter() ;
    }
}
