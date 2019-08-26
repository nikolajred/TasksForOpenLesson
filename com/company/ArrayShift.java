package com.company;
import java.util.Scanner;
/* Array A is given. Cyclically shift the elements of the array by K elements to the right (left).*/
public class ArrayShift {
    public static int numberOfElements;
    public static int shiftAtLeft;
    public static int shiftAtRight;
    static int [] array;

    public static int randomNumber() {
        int a1 = (int) ((Math.random() * 100) / ((Math.random() * 10)));
        return a1;
    }
    public static int[] getInts() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Input number of elements: ");
        numberOfElements = scn.nextInt();
        int[] array = new int[numberOfElements];
        int j = randomNumber();
        for (int i = 0; i < array.length; i++) {
            array[i] = i + j;
            System.out.print(array[i] + " ");
        }
        return array;
    }

    public static int [] arrayShiftLeft(int[] array){
        System.out.println(" ");
        System.out.println("Input number of shift at left: ");
        Scanner scn = new Scanner(System.in);
        int shiftAtLeft = scn.nextInt();
        System.out.println("Number of shift at left is: " + shiftAtLeft);
        for(int i = 0; i < array.length; i++){
            array[i]-= shiftAtLeft;
            System.out.print(array[i] + " ");
        }
        return array;
    }
    public static int [] arrayShiftRight(int[] array){
        System.out.println(" ");
        System.out.println("Input number of shift at right: ");
        Scanner scn = new Scanner(System.in);
        int shiftAtRight = scn.nextInt();
        System.out.println("Number of shift at left is: " + shiftAtRight);
        for(int i = 0; i < array.length; i++){
            array[i]+= shiftAtRight;
            System.out.print(array[i] + " ");
        }
        return array;
    }


    public static void main(String[] args) {
        int[] array = getInts();
        arrayShiftLeft(array);
        arrayShiftRight(array);
    }


}
