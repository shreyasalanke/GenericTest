package com.bridgelabz;
import java.lang.Math;
import java.util.Scanner;
public class PrintMaxNumber {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input 3 integers: ");
        int x = Integer.parseInt(sc.nextLine());
        int y = Integer.parseInt(sc.nextLine());
        int z = Integer.parseInt(sc.nextLine());
        int max = Math.max(x,y);
        if(max>y)
        {
            max = Math.max(x,z);    
        }
        else{ 
            max = Math.max(y,z);    
        }
        System.out.println("The max of three is: " + max);
    }
} 
