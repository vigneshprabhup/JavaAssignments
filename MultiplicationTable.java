package test;

import java.util.*;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Write a simple program to print multiplication table of a certain number taken from user, 
		For eg. 2 X 1 = 2 
				2 X 2 = 4 
				and so on. */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number for whic you need to generate multiplication table.");
		int value = scan.nextInt();
		
		List<Integer> l1= new ArrayList();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		l1.add(6);
		l1.add(7);
		l1.add(8);
		l1.add(9);
		l1.add(10);
		
		System.out.println("The multiplication table is ");
		
		for(int i:l1)
		{
			System.out.println(i + "x" + value + "=" + i*value );
		}
		
	}

}
