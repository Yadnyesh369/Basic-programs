package Simple;

public class Language {
	String name;
	
	Language() {
		System.out.println("Constructor Method Called.");
	}
	Language(String t){
		name = t;
	}
	public static void main(String[] args) {
		Language cpp = new Language();
		Language java = new Language("Java");
	
	cpp.setName("c++");
	
	java.getName();	
	cpp.getName();
	}
	
	void setName(String t) {
		name = t;
	}
	void getName() {
		System.out.println("Language name: "+ name);
	}
}
