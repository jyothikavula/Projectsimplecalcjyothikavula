package simplecalc;
//Use scanner class in java util package for obtaining the input from user
import java.util.Scanner;
public class simplecalc {

	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			//Numerical data input
			double a,b;
			int option;
			option=1;
			//Used While loop to run the programme continuously until user wants to exit with option 5
			while(option!=5) {
				System.out.println("Welcome to the caliculator programme");
				System.out.println("\n 1.Addition\n 2.Subtraction\n 3.Multiplication\n 4.Division\n 5.Exit\n ");
				System.out.println("Enter your option");
				option = sc.nextInt();
	
				switch(option) {
	
					//Addition Case	
					case 1:
						System.out.println("Enter first number");   
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
