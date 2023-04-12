package Simple;

public class Computer {
	Computer(){
		System.out.println("CONSTRUCTOR OF COMPUTER CLASS");
	}
	void computer_method() {
		System.out.println("POWER GONE! SHUT DOWN YOUR PC SOON...");
	}
	public static void main(String[] args) {
		Computer my = new Computer();
		Laptop your = new Laptop();
		my.computer_method();
		your.laptop_method();
	}
}
class Laptop{
	Laptop(){
		System.out.println("Constructor of laptop class");
	}
	void laptop_method() {
		System.out.println("99% Battery Available");
	}
}