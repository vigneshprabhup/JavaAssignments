package test;



import java.util.*;

public class Main {

	 
	 
	 public static void main(String[] args)
	 {
		 
		 
		// Task 1
		 
		// Swap two numbers using the third variable as a result name and do the same task without using any third variable.

		 
		//Using third Variable result
		 Scanner scan = new Scanner(System.in);
		 
		 
		 int a1=10 , b1=20, result;
		 result = a1;
		 a1=b1;
		 b1=result;
		 System.out.println("After swaping The value of a is :" + a1 + "The value of b is : " +b1);
		 
		 //With out using third variable
		 
		 System.out.println("Swap 2 numbers With out using third variable");
		 
		 
		 int x=10,y=20;
		 x=x+y;
		 y=x-y;
		 x=x-y;
		 
		 System.out.println("After swaping The value of x is :" + x + "The value of y is : " +y);
		 
		 //Write a program to print the value given by the user.
		 System.out.println("****************************************************************************************************************");
		 System.out.println("Write a program to print the value given by the user.");
		 
		 System.out.println("****************************************************************************************************************");

		 
		 System.out.println("Please enter a value");
		 String str = scan.nextLine();
		 System.out.println("The value entered by the user is :" + str);
		 
		 
		 
		 //Write a program to complete the task given below:
		 //Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z.
		 //Use z for adding 30 into it and print the final result by using variable results.

		 System.out.println("****************************************************************************************************************");
		 
		 System.out.println("Write a program to complete the task given below:\n" + 
		 		"		 //Ask the user to enter any 2 numbers in between 1-10 and add both of them to another variable call z.\n" + 
		 		"		 //Use z for adding 30 into it and print the final result by using variable results.");
		 
		 System.out.println("****************************************************************************************************************");
         System.out.println("Please enter 2 numbers between 1 to 10");
         int num1= scan.nextInt();
         int num2=scan.nextInt();
		 int z= num1+num2;
		 
		 int results = z+30;
		 
		 System.out.println("The Value of sum of values entered by user + 30 is :" + results);
		 
		 
		 
		 //Task 2 : TASK TWO: OPERATORS AND DECISION-MAKING STATEMENT
		// 1.	Write a program in JAVA to perform the following operation: If a number is divisible by 3 it should print “Consultadd” as a string
//		 If a number is divisible by 5 it should print “JAVA Training” as a string
//		 If a number is divisible by both 3 and 5 its should print “Consultadd JAVA Training” as a string.
		 
		 System.out.println("****************************************************************************************************************");
		 
		 
		 System.out.println("Task 2 : TASK TWO: OPERATORS AND DECISION-MAKING STATEMENT"
		 		+  "Write a program in JAVA to perform the following operation: If a number is divisible by 3 it should print “Consultadd” as a string"
		 		+ " If a number is divisible by both 3 and 5 its should print “Consultadd JAVA Training” as a string.");
		 
		 System.out.println("****************************************************************************************************************");
		 
		 
		 
		 System.out.println("Please enter a value ");
		 int num = scan.nextInt();
		 if(num % 3 ==0 && num %5 == 0)
			 System.out.println("Consultadd Java Training");
		 else if(num %3 ==0)
			 System.out.println("Consultadd");
		 else if(num%5 ==0)
			 System.out.println("Java Training");
		 else
			 System.out.println("number not divisiable by both 5 or 3");

		 
		 
		 System.out.println("****************************************************************************************************************");
		 
		 
		 System.out.println("****************************************************************************************************************");
		 
		 
	//Flow Chart Program	 
		
      int a=10,b=20,c=30;
      int avg = (a+b+c)/3;
    System.out.println("Output for Flow Chart Program");  	
	System.out.println("the average of a, b ,c is :" +c);
	
	if(avg > a && avg >b && avg >c)
	{
	System.out.println("The average is greater than a,b and c");
	}
	else if(avg>a && avg >b)
	{
		System.out.println("Average is greater than a and b");
	}
	else if(avg>a && avg>c)
	{
	System.out.println("Average is greater than A and C");	 
	 }
	else if(avg>b && avg>c)
	{
		System.out.println("Average is greater than B and C");
	}
	else if(avg > a)
	{
		System.out.println("Average is greater than A ");
	}
	else if(avg > b)
	{
		System.out.println("Average is greater than B ");
	}
	else if(avg > c)
	{
		System.out.println("Average is greater than C ");
	}

	 System.out.println("****************************************************************************************************************");
	 
	 System.out.println("Calculator Program :");
	 
	 System.out.println("****************************************************************************************************************");
	
	
	System.out.println("Please choose one of the following option :");
	System.out.println("enter 1 for Addition");
	System.out.println("enter 2 for Subraction");
	System.out.println("enter 3 for Division");
	System.out.println("enter 4 for Multiplication");
	System.out.println("enter 5 for Average");
	
	int choice = scan.nextInt();
	System.out.println("Please enter 2 values to perform the action :");
	int first =scan.nextInt();
	int second =scan.nextInt();
	
	switch(choice)
	{
	case 1:
	{
		System.out.println("The addition result is :" +  (first+second));
		if((first+second) <0)
			System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
		break;
	}
	case 2:
	{
		System.out.println("The Subraction result is :" +  (first-second));
		if((first-second) <0)
			System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
		break;
	}
	case 3:
	{
		System.out.println("The Division result is :" +  (first/second));
		if((first/second) <0)
			System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
		break;
	}
	case 4:
	{
		System.out.println("The Multiplication result is :" +  (first*second));
		if((first*second) <0)
			System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
		break;
	}
	case 5:
	{
		System.out.println("Please enter 2 more values to calculate the average");
		int first1 = scan.nextInt();
		int second2 = scan.nextInt();
		System.out.println("The Average result is :" +  ((first+second+first1+second2)/4));
		if(((first+second+first1+second2)/4) <0)
			System.out.println("Oops option X(1/2/3/4/5/) is returning the negative number");
		break;
	}
	default :
	{
		System.out.println("Invalid input");
		break;
	}
	}
	
	
	//5.	 Write a program that prints all the numbers from 0 to 6 except 3 and 6.
    //Expected output: 0 1 2 4 5
	 System.out.println("****************************************************************************************************************");
	System.out.println("5.	 Write a program that prints all the numbers from 0 to 6 except 3 and 6.\n" + 
			"       Expected output: 0 1 2 4 5\n" + 
			""); 
	 System.out.println("****************************************************************************************************************");
	int arr[]= {1,2,3,4,5,6,};
	
	for(int i=0;i<6;i++)
	{
		if(arr[i] % 3!=0)
			System.out.println(arr[i]);
	}
	
	
	//Given an integer, perform the following conditional actions:
	//If  is odd, print NEW
	//If  is even and in the inclusive range of 2 to 5, print OLD
//	If  is even and in the inclusive range of 6 to 30, print NEW
//	If  is even and greater than 30, print OLD

		 System.out.println("****************************************************************************************************************");
	System.out.println("Given an integer, perform the following conditional actions:");
	System.out.println("If  is odd, print NEW");
	System.out.println("If  is even and in the inclusive range of 2 to 5, print OLD");
	System.out.println("If  is even and in the inclusive range of 6 to 30, print NEW");
	System.out.println("If  is even and greater than 30, print OLD");
	 System.out.println("****************************************************************************************************************");
System.out.println("Please enter a value to check");

int number2 = scan.nextInt();

if(number2 %2 !=0)
	System.out.println("The entered number is odd");
else if(number2 >= 2 && number2<= 5)
     System.out.println("OLD");
else if(number2 >= 6 && number2<= 30)
    System.out.println("NEW");
else if(number2>30)
	System.out.println("OLD");



System.out.println("****************************************************************************************************************");

//Write a JAVA program which takes character input from the user,
//If the character is from r, a, n, d, o, m (consider both upper and lower cases), then print FOUND.
//Print NOT FOUND for all the other alphabets.

System.out.println("Print NOT FOUND for all the other alphabets.\n" + 
		"If the character is from r, a, n, d, o, m (consider both upper and lower cases), then print FOUND."
		+ "/Print NOT FOUND for all the other alphabets.");

System.out.println("****************************************************************************************************************");
	
char chr;

System.out.println("please enter a Character ");

chr = scan.next().charAt(0);
boolean isFound = false;

            char[] test = {'r','a','n','d','o','m'};
            char[] test2 = {'R','A','N','D','O','M'};
            
            for(int i=0; i<test.length;i++)
            {
            	if(chr == test[i] || chr == test2[i])
            	{
            		System.out.println("FOUND");
            		isFound = true;
            	}
            	          		
            }
            if(!isFound)
            	System.out.println("NOT FOUND");
            
            
            
            System.out.println("****************************************************************************************************************");
            
            System.out.println("TASK COMPLETED");
            
            System.out.println("****************************************************************************************************************");
            
			}
	 
	 
}
