import java.util.Scanner;


public class GreatestNumber {

	public static void main(String[] args) 
	{
	Scanner in = new Scanner (System.in);
	System.out.println("Input of 1st no: ");
	int num1 = in.nextInt();
	System.out.println("Input of 2nd no: ");
	int num2 = in.nextInt();
	System.out.println("Input of 3rd no: ");
	int num3 = in.nextInt();
	
	if(num1>num2)
		if(num1>num3)
		System.out.println("The greatest: +num1");
	if(num2>num1)
		if(num2>num3)
		System.out.println("The greatest: +num1");
	if(num3>num1)
	if(num3>num2)
		System.out.println("The greatest: +num3");
	}


		
	
	
		// TODO Auto-generated method stub

	}


