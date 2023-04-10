package Simple;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int x;
		System.out.println("Enter an Integer to Check if it is odd or even" );
		Scanner in =new Scanner(System.in);
		x=in.nextInt();
		if(x%2==0)
			System.out.println("You entered a even Number");
		else
			System.out.println("You Entered a odd Number");
	}
}
