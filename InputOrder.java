package test;

import java.util.*;

public class InputOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Write a program that accepts three numbers from the user and prints "INCREASING" if the numbers are in increasing order, 
		//"DECREASING" if the numbers are in decreasing order, and "Neither increasing or decreasing order" otherwise. FOR eg. 
		
		Scanner scan = new Scanner(System.in);
		
		long value1,value2,value3;
		System.out.println("Please  enter 3 integer/long values :");
		value1=scan.nextLong();
		value2=scan.nextLong();
		value3=scan.nextLong();
		
		if(value1 < value2 && value2 < value3)
			System.out.println("INCREASING");
		else if(value1 < value2 && value2 < value3)
			System.out.println("DECREASING");
		else
			System.out.println("Neither increasing or decreasing order");
	}

}
