package Simple;

import java.util.Scanner;

public class NestedIfElse {

	public static void main(String[] args) {
		int marksobtained,passingMarks;
		char grade;
		
		passingMarks =40;
		
		Scanner input =new Scanner(System.in);
		System.out.println("input marks scored by you");
		marksobtained = input.nextInt();
		
		if(marksobtained>=passingMarks) {
			if(marksobtained>90)
				grade='A';
			else if(marksobtained>75)
				grade='B';
			else if(marksobtained>60)
				grade='C';
			else
				grade='D';
			System.out.println("You passed the Exam with Grade "+grade);
		}
		else {
			grade='F';
			System.out.println("You failed and your grade is "+grade);
		}
	}

}
