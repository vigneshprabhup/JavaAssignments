package test;

import java.util.*;
public class RightAngleTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		List<Integer> l1= new ArrayList();
		int rows,temp=1;
		System.out.println("Please enter the number of rows");
		rows=scan.nextInt();
		for(int i=1;i<=rows;i++)
		{
			l1.add(i);
			System.out.println();
			for(int j : l1)
				System.out.print(j);
		}
	}

}
