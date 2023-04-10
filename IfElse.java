package Simple;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		int marksObtained,passingMarks;
		passingMarks=40;
		Scanner input =new Scanner(System.in);
		System.out.println("Input Marks Scored By you");
		marksObtained= input.nextInt();
		if (marksObtained>=passingMarks) {
			System.out.println("You Passed the Exam");
		}
		else { 
			System.out.println("Unfortunately you Failed the Exam");
		}
		}
		

	}
	

