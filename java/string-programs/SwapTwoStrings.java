package com.string.starter.programs;

public class SwapTwoStrings {
	 public static void main(String args[]) {  
	        String a = "pioneer";  
	        String b = "coders"; 
	        System.out.println("Before swap: " + a + " " + b);  
	        a = a + b;  
	        b = a.substring(0, a.length() - b.length());  
	        a = a.substring(b.length());  
	        System.out.println("After : " + a + " " + b);  
}
}
