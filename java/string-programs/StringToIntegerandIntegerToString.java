package com.string.starter.programs;

public class StringToIntegerandIntegerToString {
	public static void main(String args[]){  
		String s="200";  
		int i=300; 
		Integer a=Integer.valueOf(s); 
		String st=String.format("%d",i);    
		System.out.println(a);  
		System.out.println(st);
	}
}
