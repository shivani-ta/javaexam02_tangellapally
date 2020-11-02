/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q06_triangle;

import java.util.Scanner;

/**
 *
 * @author Shivani tangellapally
 */
public class Geometric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Triangle t = new Triangle();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base: ");
        t.a = input.nextInt();
        System.out.println("Enter Perpendicular: ");
        t.b = input.nextInt();
        System.out.println("Enter hypotenuse: ");
        t.c = input.nextInt();
        System.out.println("Enter Colour: ");
        t.color = input.next();
        System.out.println("Triangle filled or not true/false: ");
        t.status = input.nextBoolean();
        t.Display();
    }

    /**
     *
     */
    public static class Triangle extends GeometricObject {

        int a, b, c;
        String color;
        boolean status;

        /**
         *
         * @param a
         * @param b
         * @param c
         * @param color
         * @param status
         */
        public Triangle(int a, int b, int c, String color, boolean status) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.color = color;
            this.status = status;
        }

        /**
         *
         */
        public Triangle() {
        }

        /**
         *
         */
        @Override
        public void Display() {
            System.out.println("Area: " + (a * b) / 2);
            System.out.println("Perimeter: " + a + b + c);
            System.out.println("Colour: " + color);
            System.out.println(status);
        }
    }

    /**
     *
     */
    public static abstract class GeometricObject {

        /**
         *
         */
        public GeometricObject() {

        }

        /**
         *
         */
        public void Display() {
        }
    ;

}

}
