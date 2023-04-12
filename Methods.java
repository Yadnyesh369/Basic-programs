package Simple;
class Methods{
//Constructor method
 Methods() {
	System.out.println("CONSTRUCTOR METHOD IS CALLED WHEN AN OBJECT OF IT'S CLASS IS CREATED");
	}
//Main Method where program execution begins
	public static void main(String[] args) {
		staticMethod();
		Methods object = new Methods();
		object.nonStaticMethod();
	}
	//Static method
	static void staticMethod() {
		System.out.println("STATIC METHOD CAN BE CALLED WITHOUT CREATING AN OBJECT");
	}
	//Non-Static Method
	void nonStaticMethod() {
		System.out.println("NON STATIC METHOD MUST BE CALLED BY CREATING AN OBJECT");
	}
}
