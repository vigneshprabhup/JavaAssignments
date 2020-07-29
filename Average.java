package test;

import java.util.*;
import java.util.function.Consumer;
public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Write a program in which: 
Take 10 values input from user using loop. 
Print sum of all the numbers provided 
Print the Average of those 10 values */
		
		Scanner scan = new Scanner(System.in);
		int total=0, itr=0;

		System.out.println("Please  enter 10 values to find the sum and average");
		
		List<Integer> l1=new ArrayList();
		
		for(int  i=0;i<10;i++)
		{
			l1.add(scan.nextInt());
		}
		
		
		System.out.println("The sum of 10 numbers entered is :");
		
		
		for(int i: l1)
		{
			total=total + i;
		}
		System.out.println(total);
		System.out.println("The average is :" + (total/10));
	}

}
