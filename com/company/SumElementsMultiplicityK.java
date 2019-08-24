package com.company;

import java.util.Scanner;
/* Given an array of natural numbers. Find the sum of elements that are multiples of a given K */
public class SumElementsMultiplicityK {
private static int elementsOfArray;

    public static int getElementsOfArray() {
        return elementsOfArray;
    }

    public static void setElementsOfArray(int elementsOfArray) {
            SumElementsMultiplicityK.elementsOfArray = elementsOfArray;
    }

    public static int sumElementsMultiplicityK;
    public static void main(String[] args) {
        Scanner scn = new  Scanner(System.in);
        System.out.println("Input number of elements of array:");
        elementsOfArray = scn.nextInt();
        int [] array = new int[elementsOfArray];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)((Math.random() * 100)/(Math.random() * 10));
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        System.out.println("enter the number K to which the multiplicity is checked: ");
        int K = scn.nextInt();
        for(int i = 0; i < array.length; i++){
            if (array[i]%K==0){
                System.out.print(array[i] + " ");
                sumElementsMultiplicityK += array[i];
            }
        }
        System.out.println(" ");
        System.out.println("sum of elements that are multiples of k: " + sumElementsMultiplicityK);
    }
}
