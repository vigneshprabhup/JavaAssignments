package test;

import java.util.*;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		List<Integer> l1= new ArrayList();
		
		System.out.println("Please enter the number of rows for which you want to create a a Pascal Triangle:");
		
	    int value = scan.nextInt();
	    int temp = 1;
	    System.out.println(temp);
	    for(int i=0;i<value;i++)
	    {
	    	temp=temp*11;
	    	System.out.println(temp);
	    }
		
	}

}
