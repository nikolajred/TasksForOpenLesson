package com.company;

import java.util.Scanner;
/* Three real numbers are written in three variables a, b and c. Create a program
that will find and display the real roots of the quadratic equation ax ^ 2 + bx + c = 0, or report that there are no roots
 */
public class RootsQuadraticEquation {
    public static int variableA;
    public static int variableB;
    public static int variableC;
    public static double discriminantD;
    public static double rootX1;
    public static double rootX2;

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input variable a: ");
        variableA = scn.nextInt();
        System.out.println("Input variable b: ");
        variableB = scn.nextInt();
        System.out.println("Input variable c: ");
        variableC = scn.nextInt();
        System.out.println("Your quadratic equation is " + variableA + "x^2+" + variableB + "x+" + variableC + "=0");
        discriminantD = Math.pow(variableB, 2)-4*variableA*variableC;
        System.out.println("Discriminant D is: " + discriminantD);
        if(discriminantD>0){
            rootX1 = (-variableB + Math.sqrt(discriminantD))/2 * variableA;
            rootX2 = (-variableB - Math.sqrt(discriminantD))/2 * variableA;
            System.out.println("The root X1 of the quadratic equation is: " + rootX1);
            System.out.println("The root X2 of the quadratic equation is: " + rootX2);
        }else if(discriminantD==0){
        rootX1 = rootX2 = - variableB / 2 * variableA;
            System.out.println("The root X1 and X2 of the quadratic equation is: " + rootX1);
        }else{
            System.out.println("there are no roots on the set of real numbers");
        }
    }

}
