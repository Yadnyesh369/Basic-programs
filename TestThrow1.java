package Simple;

public class TestThrow1 {
	
	static void validate(int age){
		
		if(age<18)
			
			throw new ArithmeticException("notValid");
		else
			System.out.println("Welcome To vote on BOOTH");
	}
	public static void main(String args[]) {
		validate(13);
		System.out.print("rest of the code...");
	}

}
