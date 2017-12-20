package com.math.programs;
import java.util.Scanner;

public class RectangleArea {
	 public static void main(String args[])
	    {
	        int len, bre, peri, area;
	        Scanner scan = new Scanner(System.in);
			
	        System.out.print("Enter Length and Breadth of Rectangle : ");
	        len = scan.nextInt();
	        bre = scan.nextInt();
			
	        area = len*bre;
	        peri = 2*(len+bre);
			
	        System.out.print("Area = " +area);
			
	        System.out.print("\nPerimeter = " +peri);
	        scan.close();
	    }
}
