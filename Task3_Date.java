package test;

import java.time.LocalDate;
import java.util.*;

public class Task3_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);

		LocalDate l1;
//		Date d1;
		System.out.println("Please enter the  year ");
		int year = scan.nextInt();
		System.out.println("Please enter the  Month ");
		
		int month=scan.nextInt();
		while(month<0 || month > 13)
		{
			System.out.println("Invalid input, please enter a value between 1 and 12 ");
			month=scan.nextInt();
			
		}
		int dayOfMonth = 1;
		
		
		
		
		l1=LocalDate.of(year, month, dayOfMonth);
		
        System.out.println("The number of days in the given month and year is : " +l1.lengthOfMonth());
		 
		
	}

}
