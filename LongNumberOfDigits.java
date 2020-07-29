package test;

import java.util.*;

public class LongNumberOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*  Write a JAVA program that takes long type input from user, and 
Calculate and display the number of digits. 
Calculate the sum of all the digits of the input. */
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a long value");
		int count =0,temp=0;
		long value = scan.nextLong();
		int length = String.valueOf(value).length();
		for(int i=0;i<length;i++)
		{
			temp=(int) (value %10);
			
			System.out.println("temp is :" + temp);
			
			count=(int) (count+temp);
		}
		
		System.out.println("The number of digits in the value entered by the user is :" + length );
		System.out.println("The sum of digits of the value entered is  :" + count);
	}

}
