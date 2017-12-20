package com.math.programes;

import java.util.Scanner;

public class SmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2, small;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter Two Number : ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
		
        if(num1<num2)
        {
            small = num1;
        }
        else
        {
            small = num2;
        }
		
        System.out.print("smallest of Two Number is " +small);
}
}