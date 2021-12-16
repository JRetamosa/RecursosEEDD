package EEDD;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		


	
	
	
	Scanner sc = new Scanner(System.in);
	    {
	        int num1;
	        int num2;
	        String operation;




	        System.out.println("please enter the first number");
	        num1 = Integer.parseInt(sc.nextLine());

	        System.out.println("please enter the second number");
	        num2 = Integer.parseInt(sc.nextLine());

	        

	        System.out.println("Please enter operation");
	        operation = sc.nextLine();

	        if (operation == "+");
	        {
	            System.out.println("your answer is" + (num1 + num2));
	        }
	        if  (operation == "-");
	        {
	            System.out.println("your answer is" + (num1 - num2));
	        }

	        if (operation == "/");
	        {
	            System.out.println("your answer is" + (num1 / num2));
	        }
	        if (operation == "*")
	        {
	            System.out.println("your answer is" + (num1 * num2));
	        }


	    }
	}
}

