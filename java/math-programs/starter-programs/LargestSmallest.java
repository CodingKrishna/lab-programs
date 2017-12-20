package com.math.programes;

import java.awt.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LargestSmallest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 //create buffer to capture input
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 
        //define list and integers
        ArrayList list = new ArrayList();
        int length, largest, smallest, number;
 
        System.out.println("Enter the limit (Better give below 10): ");
        length = Integer.parseInt(in.readLine());
 
        System.out.println("Now enter the list:");
 
        for (int i = 0; i < length; i++) {
            list.add(Integer.parseInt(in.readLine()));
        }
 
        largest = (int) list.get(0);
        smallest = (int) list.get(0);
 
        for (Object list1 : list) {
            number = (int) list1;
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }
        System.out.println("Largest Number is : " + largest);
        System.out.println("Smallest Number is : " + smallest);
    }
	}


