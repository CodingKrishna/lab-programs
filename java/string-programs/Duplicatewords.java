package com.string.starter.programs;

public class Duplicatewords {
	 

		public static void main(final String args[]) { 

		final String s = "java technologies like core JAVA"; 
		final String s1 = "java"; 

		findCount(s, s1); 

		} 

		private static void findCount(final String s, final String s1) { 

		int count = 0; 
		final String array[] = s.split(" "); 

		for (final String element : array) { 

		if (element.equalsIgnoreCase(s1)) { 

		count++; 
		} 

		} 

		System.out.println("the number of times" + s1 + "occurs is:" + count); 

		} 

		}
