package Simple;

import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		float temprature;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Temprature in Farenheit");
		temprature = in.nextInt();
		
		temprature = ((temprature-32)*5)/9;
		System.out.println("Temprature in Celsius"+temprature);
		
	}
}
