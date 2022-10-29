package HelloWorld;

import java.util.Scanner;

abstract class SimpleCalculator {

	
	abstract void calc(double num1, double num2, char operator); 
	
	//non abstract method
	public void run()
	{
		
		System.out.println("Simple Calculator has run!");
		
	}
	
}
	
class Operation extends SimpleCalculator {
	
	double result = 0;

    //Scanner input = new Scanner(System.in);
	
	public void calc(double num1, double num2, char operator)
	{
		
		
	    switch (operator) {

	      // performs addition between numbers
	      case '+':
	        this.result = num1 + num2;
	        System.out.println(num1 + " + " + num2 + " = " + result);
	        break;

	      // performs subtraction between numbers
	      case '-':
	        this.result = num1 - num2;
	        System.out.println(num1 + " - " + num2 + " = " + result);
	        break;

	      // performs multiplication between numbers
	      case '*':
	        this.result = num1 * num2;
	        System.out.println(num1 + " * " + num2 + " = " + result);
	        break;

	      // performs division between numbers
	      case '/':
	        this.result = num1 / num2;
	        System.out.println(num1 + " / " + num2 + " = " + result);
	        break;

	      default:
	        System.out.println("Invalid operator!");
	        break;
	    }
		
		
	}
	
	
}

public class SimpleCalculators {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
            
			char operator = ' ';
			double num1 = 0;
			double num2 = 0;
			
			Scanner s = new Scanner(System.in);
			Operation op1 = new Operation();
		    
			do
			{
			// User prompted to enter in mathematical operator
			System.out.println("Choose an operator: +, -, *, /, or x to exit");
			operator = s.next().charAt(0);
		    
			//exit program is user selects x
			if (operator == 'x'){
		    	break;
		    }
		    
		    //validate user inputs valid operator
		    if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
		    	
		    
			//User prompted to enter in first number
			System.out.println("Enter first number");
		    
			
			//handle exception if user enters a wayward value
			try{
				
				num1 = s.nextDouble();
				
			}
			catch (Exception e) {
				
				System.out.println("Something went wrong.");
				break;
			}
			
		    //User prompted to enter in second number
		    System.out.println("Enter second number");
		    
		  //handle exception if user enters a wayward value
		    try{
		    	
		    	num2 = s.nextDouble();
		    	
		    }
		    catch (Exception e) {
				
				System.out.println("Something went wrong.");
				break;
			}	    
		    
		    op1.calc(num1, num2, operator);
			
		    }
		    
		    else {
		    	
		    	System.out.println("Invalid Operator input. Try again!");
		    	
		    }
		    	
		    	
		    
			} while (operator != 'x');		    

			
			System.out.println("Calculator app has ended. Goodbye!");
			
		}

		
		
	}

}



	

