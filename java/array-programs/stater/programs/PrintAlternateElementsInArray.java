package com.array.stater.programs;

import java.util.Scanner;

public class PrintAlternateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int i, count;
		  Scanner scan = new Scanner(System.in);
		  System.out.print("Eneter the Length of Array");
		  count = scan.nextInt();
		  int a[] = new int[count];
		  for (i = 0; i < count; i++) {
		   System.out.print("Enter number " + (i + 1));
		   a[i] = scan.nextInt();
		  }
		  scan.close();
		  System.out.print("\nOriginal array is :\t");
		  for (i = 0; i < count; i++)
		   System.out.print(a[i] + "\t");

		  System.out.print("\n\nAlternate elements :\t");
		  for (i = 0; i < count; i = i + 2)
		   System.out.print(a[i] + "\t");
		 }
		}
	