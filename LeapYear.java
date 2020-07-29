package test;

import java.time.LocalDate;
import java.util.*;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
        LocalDate l1;
        int year;
        System.out.println("Please enter the year to check if it is a leap year or not");
        year = scan.nextInt();
        
        l1= LocalDate.ofYearDay(year, 3);
        if(l1.isLeapYear())
        	System.out.println("The given year is a leap year");
        else 
        	System.out.println("The given year is NOT a leap year");
        	
        
	}

}
