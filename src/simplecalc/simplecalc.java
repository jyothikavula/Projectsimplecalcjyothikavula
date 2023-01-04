package simplecalc;
//Use scanner class in java util package for obtaining the input from user//
import java.util.Scanner;
public class simplecalc {
//This is a program for simple caliculator with 4 basic arthmetic operations//
	
	public static void main(String[] args) {
	//This is the main method which is very impotant for executionof a Java program//
			Scanner sc = new Scanner(System.in);
			//Numerical data input from the user by using scannner class//
		
			double a,b;
			int option;
		        //Declared variables a,b as double for exicuting the program with out any interuption in devision case//
		        //Declared option as int as we have only 5 choices//
		
			option=1;
			while(option!=5) {
			//Used While loop to run the programme continuously until user wants to exit with option 5//
				System.out.println("Welcome to the caliculator programme");
				System.out.println("\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Exit\n ");
				// \n is used for making each option in the next line//
				
				System.out.println("Enter your option");
				option = sc.nextInt();
	
				switch(option) {
	
					//Addition Case	
					case 1:System.out.println("Enter first number");   
						a = sc.nextDouble();
						System.out.println("Enter second number");
						b = sc.nextDouble();
						System.out.println("Addition result: " +(a+b));
						break;
					
					//Subtraction Case
					case 2:System.out.println("Enter first number");   
						a = sc.nextDouble();
						System.out.println("Enter second number");
						b = sc.nextDouble();
						System.out.println("Subtraction result: " +(a-b));
						break;
					
					//Multiplication Case
					case 3:System.out.println("Enter first number");   
						a = sc.nextDouble();
						System.out.println("Enter second number");
						b = sc.nextDouble();
						System.out.println("Multiplication result: " +(a*b));
						break;
					
					//Division Case
					case 4:System.out.println("Enter first number");   
					       a = sc.nextDouble();
					       System.out.println("Enter second number");
					       b = sc.nextDouble();
						System.out.println("Division result: " +(a/b));
					break;
					
					//Exit Case
					case 5:System.out.println("Thank you, you are exited from Calculator.");
					//.exit(0) indicates Successfull termination of the programme
					System.exit(0);
					break;
					
					//Invalid input or Default Case 
					default :System.out.println("Invalid input, Please Enter correct Option");
	
	}
	
	
	
	
	
}

	}

}
