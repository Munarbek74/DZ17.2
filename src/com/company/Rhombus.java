package com.company;

public class Rhombus extends Shape{
    private double a;
    private double b;
    private double c;
    private double d;

    public Rhombus(double a, double b, double c, double d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rhombus{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                "} Perimeter:= " + getPerimeter();
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }
}
