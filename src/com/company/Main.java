package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Shape shape = new Triangle(2,5,6);
        System.out.println(shape);
        Shape shape1 = new Square(5,5,5,5);
        System.out.println(shape1);
        Shape shape2 = new Rhombus(8,8,8,8);
        System.out.println(shape2);
        Shape shape3 = new Trapeze(8,5,7,8);
        System.out.println(shape3);
        Shape shape4 = new Rectangle(4,6,4,6);
        System.out.println(shape4);
    }
}
