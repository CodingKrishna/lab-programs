package com.string.starter.programs;

public class PrintDuplicateLetterInString {
	public static void main(String[] args) { 

		String p="aaaa"; 
		int count=0; 
		char [] input = p.toCharArray(); 
		System.out.println("Duplicate Characters are:"); 
		for(int i=0;i<p.length();i++) 
		{ 
		for(int j=i+1;j<p.length();j++) 
		{ 
		if(input[i]==input[j]) 
		{ 
		System.out.println(input[j]); 
		count ++; 
		break; 
		} 
		} 
		} 
	}
}