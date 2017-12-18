package com.array.stater.programs;

import java.util.Scanner;

public class Addition_User_DefindData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1;
		 int num2;
		 int sum;
	      System.out.println("Enter two integers to calculate their sum ");
	      Scanner in = new Scanner(System.in);
	      num1 = in.nextInt();
	      num2= in.nextInt();
	      sum = num1+num2;
	      System.out.println("Sum of entered integers = "+sum);
	   }

	}
