package test;

import java.util.Scanner;
import java.util.function.Consumer;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a JAVA program that takes one integer input n from the user, and display all the so, print sum of n natural numbers. 

		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number for which you need to calculate sum of natural numbers");
		int value = scan.nextInt();
		int temp=0;
		
		for(int i=1;i<=value;i++)
		{
			temp=temp+i;
		}
		System.out.println("The sum of natural numbers till " + value + "  is  " + temp);
	}

}
