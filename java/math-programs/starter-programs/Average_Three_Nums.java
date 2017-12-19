package com.math.programes;

import java.util.Scanner;

public class Average_Three_Nums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3, average;
		System.out.println("Enter Num1");
		num1 = sc.nextInt();
		System.out.println("Enter Num2");
		num2 = sc.nextInt();
		System.out.println("Enter Num3");
		num3 = sc.nextInt();
		average = ( num1 + num2 + num3 ) / 3;
		System.out.println(" Average : "+average);
		}
	}
