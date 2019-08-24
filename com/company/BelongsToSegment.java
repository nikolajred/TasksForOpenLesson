package com.company;

import java.util.Scanner;

public class BelongsToSegment {
    public static int bounderyC;
    public static int bounderyD;
    public static int numberOfElementsAn;
    public static int randomNumber(){
        int a1 = (int)((Math.random()*100)/((Math.random()*10)));
        return a1;
    }
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.println("Input number of elements: ");
        numberOfElementsAn = scn.nextInt();
        int [] array = new int [numberOfElementsAn];
        int j = randomNumber();
        for (int i = 0; i < array.length; i++){
           array[i] = i + j;
            System.out.print(array[i] + " ");
        }

            System.out.println(" ");
            System.out.println("Input boundery c: ");
            bounderyC = scn.nextInt();
            System.out.println("Boundery c = " + bounderyC);
            System.out.println(" ");
            System.out.println("Input boundery d: ");
            bounderyD = scn.nextInt();
            System.out.println("Boundery c =  " + bounderyD);
            for (int n = 0; n < array.length; n++){
                if(array[n]>=bounderyC & array[n]<=bounderyD){
                    System.out.println("number " + array[n] + " belong to segment c - d");
                }
            }


    }
}
