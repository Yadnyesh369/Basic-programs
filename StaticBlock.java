package Simple;

class StaticBlock {

	public static void main(String[] args) {
		System.out.println("MAIN METHOD IS EXECUTED.");}
static {
	System.out.println("STATIC BLOCK IS EXECUTED BEFORE MAIN METHOD" );
	}
}
//Static Block Application .... We need to open Program in speciif window
class StaticBlock1 {
public static void main(String[] args) {
System.out.println("You are using Windows_NT operating system.");
}
static {
String os = System.getenv("OS");
if (os.equals("Windows_NT") != true) {
System.exit(1);
}
}
}