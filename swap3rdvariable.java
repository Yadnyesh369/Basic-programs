package Simple;

import java.util.Scanner;

public class swap3rdvariable {
	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter x and y");
		Scanner in = new Scanner(System.in);
		x=in.nextInt();
		y=in.nextInt();
		System.out.println("Before Swapping\nx = "+x+"\ny="+y);
		
		z=x;
		x=y;
		y=z;
		
		System.out.println("After Swapping\nx = "+x+"\ny="+y);	
	}

}
