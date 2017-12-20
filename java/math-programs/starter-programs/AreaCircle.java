package com.math.programes;

import java.util.Scanner;

public class AreaCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int radius;
	        double pi = 3.14, area;
	        Scanner s = new Scanner(System.in);
	        System.out.print("Enter radius of circle:");
	        radius = s.nextInt();
	        area = pi * radius * radius;
	        System.out.println("Area of circle:"+area);
	}

}
