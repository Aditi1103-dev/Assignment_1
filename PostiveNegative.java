import java.util.Scanner;


public class PostiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Input of postive number: ");
		int input =in.nextInt();
		if(input >0)
		{
			System.out.println("Number is positive");
		}
		else if (input <0)
		{
			System.out.println("Number is Negative");
		}
		else
		{
			System.out.println("Number is zero");
		}

	}

}
