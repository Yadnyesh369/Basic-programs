package Simple;

import java.util.Scanner;

public class largestNum {
	
	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter three integers");
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		z=in.nextInt();
		if(x>y && x>z)
		System.out.println("First number is largest");
		else if(y>x && y>z)
		System.out.println("Second number is largest");
		else if(z>x && z>y)
			System.out.println("third number is largest");
		else
			System.out.println("Entered number is not distinct");
			
	}

}
