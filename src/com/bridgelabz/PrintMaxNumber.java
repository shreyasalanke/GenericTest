package com.bridgelabz;

public class PrintMaxNumber 
	    {
	   public static void main(String args[])
	    {
		   Integer num1=3,num2=3,num3=5;
		   Float Num1=6.6f,Num2=7.2f,Num3=9.8f;
           String firstString="apple",secondString="peach",thirdString="banana";
		       
		   System.out.printf("Maximum of %d, %d and %d is %d\n\n", 3, 4, 5, maximum(3, 4, 5));
	       System.out.printf("Maximum of %.1f, %.1f and %.1f is %.1f\n\n", 6.6, 7.2, 9.8, maximum(6.6,
		                7.2, 9.8));
		   System.out.printf("Maximum of %s, %s and %s is %s\n",  "apple", "peach","banana", maximum(
		                 "apple", "peach","banana"));
		 }
	   
		 public static <T extends Comparable<T>> T maximum(T x, T y, T z) 
		    {
		        T max = x;

		        if (y.compareTo(max) > 0)
		          max = y; 

		        if (z.compareTo(max) > 0)
		          max = z; 

		        return max;
		    }
}

