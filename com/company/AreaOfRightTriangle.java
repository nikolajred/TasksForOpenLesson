package com.company;

import java.util.Scanner;
/* The variables a and b contain the positive lengths of
the legs of the right triangle. Calculate and display the area of ​​the triangle and its perimeter
 */
public class AreaOfRightTriangle {
    public static int cathetA;
    public static int cathetB;
    public static double hypotenuse;
    public static double pyrimeter;
    public static int square;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input cathet a: ");
        cathetA = scn.nextInt();
        System.out.println("Input cathet b:");
        cathetB = scn.nextInt();
        hypotenuse = Math.hypot(cathetA, cathetB);
        System.out.println("hypotenuse is: " + Math.round(hypotenuse*100)/100.00d);
        pyrimeter = cathetA + cathetB + hypotenuse;
        System.out.println("pyrimeter is: " + Math.round(pyrimeter*100)/100.00d);
        square = cathetA * cathetB / 2;
        System.out.println("square is: " + square);
    }
}
