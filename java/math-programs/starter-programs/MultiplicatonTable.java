package com.math.programes;

import java.util.Scanner;

public class MultiplicatonTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
			System.out.print("Enter number:");        
			int num=s.nextInt();
		        for(int i=1; i <= 10; i++){
		            System.out.println(num+" * "+i+" = "+num*i);
		        }

	}

}
