package com.company;
/* An array of natural numbers is given. Find the minimum and maximum number */
import java.util.Scanner;

public class MaxAndMinArray {
    public static int max;
    public static int min;
    public static int numberOfElementsOfArray;
    static int [] array;

    public static int[] createArray(int numberOfElementsOfArray){
        Scanner scn = new Scanner(System.in);
        System.out.println("Input number elements of array: ");
        numberOfElementsOfArray = scn.nextInt();
        int [] array = new int[numberOfElementsOfArray];
        for(int i = 0; i < array.length; i++){
            array[i] = (int)((Math.random()*100)/((Math.random()*10)));
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        return array;
    }
    public static int searchMin(int[]array){
        min = array[0];
        for(int i = 0; i < array.length; i++){
           if(min > array[i]){
               min = array[i];
           }
        }
        System.out.println(" ");
        System.out.println("Min elemet of array is: " + min);
        return  min;
    }
    public static int searchMax(int[]array){
        max = array[0];
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        System.out.println(" ");
        System.out.println("Max elemet of array is: " + max);
        return  max;
    }

    public static void main(String[] args) {
       int [] array = createArray(numberOfElementsOfArray);
        searchMin(array);
        searchMax(array);
    }

}
