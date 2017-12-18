package com.array.medium.programes;

public class Duplicate_ElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArray = {"ramu", "hari", "phani", "phani", "Aparna", "hari", "krishna"};
		 
        for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
    }    
}


