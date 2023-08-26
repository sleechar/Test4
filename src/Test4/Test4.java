package Test4;
import java.util.Scanner;
public class Test4 {

	public static void main(String[] args) {
		
		System.out.println("*       Calculator       *");
		System.out.println("**************************");
		System.out.println("* 1) Add(+)               *");
		System.out.println("* 2) Minus(-)             *");
		System.out.println("* 3) Multiply(*)          *");
		System.out.println("* 4) Divide(/)            *");
		System.out.println("**************************");
		
		System.out.print("Please select your choice : ");
		Scanner input = new Scanner(System.in);
		String choiceString = input.next();
		char choice = choiceString.charAt(0);
		
		if(choice == '1') {		
			System.out.println("* 1) Add(+)               *");
			
			System.out.print("Please input first number : ");
			Scanner inputFirstnumber1 = new Scanner(System.in);
			int firstNumber1 = inputFirstnumber1.nextInt();
			
			System.out.print("Please input second number : ");
			Scanner inputSecondnumber1 = new Scanner(System.in);
			int secondNumber1 = inputSecondnumber1.nextInt();
			int result = 0;		
			
			result = firstNumber1 + secondNumber1;
			System.out.println("Result is firstNumber + secondNumber = "+firstNumber1+" + " +secondNumber1+ " = "+result);	
		}
		else if(choice == '2') {
			System.out.println("* 2) Minus(-)             *");
			
			System.out.print("Please input first number : ");
			Scanner inputFirstnumber2 = new Scanner(System.in);
			int firstNumber2 = inputFirstnumber2.nextInt();
			
			System.out.print("Please input second number : ");
			Scanner inputSecondnumber2 = new Scanner(System.in);
			int secondNumber2 = inputSecondnumber2.nextInt();
			int result = 0;	
			
			result = firstNumber2 - secondNumber2;
			System.out.println("Result is firstNumber - secondNumber = "+firstNumber2+" - " +secondNumber2+ " = "+result);
		}			
		else if(choice == '3') {
			System.out.println("* 3) Multiply(*)          *");	
			
			System.out.print("Please input first number : ");
			Scanner inputFirstnumber3 = new Scanner(System.in);
			int firstNumber3 = inputFirstnumber3.nextInt();
			
			System.out.print("Please input second number : ");
			Scanner inputSecondnumber3 = new Scanner(System.in);
			int secondNumber3 = inputSecondnumber3.nextInt();
			int result = 0;				
			
			result = firstNumber3 * secondNumber3;
			System.out.println("Result is firstNumber * secondNumber = "+firstNumber3+" * " +secondNumber3+ " = "+result);		
		}			
		else if(choice == '4') {
			System.out.println("* 4) Divide(/)            *");	
			
			System.out.print("Please input first number : ");
			Scanner inputFirstnumber4 = new Scanner(System.in);
			double firstNumber4 = inputFirstnumber4.nextDouble();
			
			System.out.print("Please input second number : ");
			Scanner inputSecondnumber4 = new Scanner(System.in);
			double secondNumber4 = inputSecondnumber4.nextDouble();
			double result = 0;				
			if(secondNumber4 ==0)
				System.out.print("Second number could't be 0");
			else {result = firstNumber4 / secondNumber4;
			System.out.println("Result is firstNumber / secondNumber = "+firstNumber4+" / " +secondNumber4+ " = "+result);			
			}			
			}		
		else {
			System.out.println("Wrong selection!!! Program terminate");
		}
				

	}

}
