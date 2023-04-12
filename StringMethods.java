package Simple;

public class StringMethods {

	public static void main(String[] args) {
		int n;
		String s = "Java Programming ", t ="",u="";
		System.out.println(s);
		
		//find the length of a String 
		n=s.length();
		System.out.println("Number of characters = " + n);
		
		//Replace characters in string
		t = s.replace("Java" ,"c++");
		System.out.println(s);
		System.out.println(t);
		
		//Concatenating String with another String
		u = s.concat("is fun");
		System.out.println(s);
		System.out.println(u);
	}

}
