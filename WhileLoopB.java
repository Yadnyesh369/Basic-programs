package Simple;

import java.util.Scanner;

public class WhileLoopB {
	public static void main(String[] args) {
		int n;
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			System.out.println("Input an Integer");
			n = input.nextInt();
			
			if(n==0) {
				break;
			}
			System.out.println("You entered "+n);
		}
	}

}
