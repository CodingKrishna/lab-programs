package com.math.programes;

import java.util.Scanner;

public class Largest_Num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1, num2, big;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Two Number : ");
	        num1 = scan.nextInt();
	        num2 = scan.nextInt();
			
	        if(num1>num2)
	        {
	            big = num1;
	        }
	        else
	        {
	            big = num2;
	        }
			
	        System.out.print("Largest of Two Number is " +big);
	}

}
