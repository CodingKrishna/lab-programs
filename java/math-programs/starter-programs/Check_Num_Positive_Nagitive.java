package com.math.programes;

import java.util.Scanner;

public class Check_Num_Positive_Nagitive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	int num;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter the number to check:");
	        num = s.nextInt();
	        if(num > 0){
	            System.out.println("The given number "+num+" is Positive");
	        }
	        else if(num < 0)
	        {
	            System.out.println("The given number "+num+" is Negative");
	        }
	        else
	        {
	            System.out.println("The given number "+num+" is neither Positive nor Negative ");
	        }
		

	}

}
