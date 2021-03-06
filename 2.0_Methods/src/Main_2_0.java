
// |=============|
// |   METHODS   |
// |=============|

public class Main_2_0 {
	
	// A method is a block of code which only runs when it is called.
	
	// You can pass data through a method. These are called parameters.
	
	// Methods are also known as functions.
	
	// Methods are used to reuse code. Write once, and reuse multiple times.

	// For now, ignore static and void.
	
	static void saySomething() {
		System.out.println("Hello, World!.. from a Method!"); // Output [1]: Hello, World!.. from a Method!
	}
	
	static void anotherStatement() {
		System.out.println("This is a test"); // Output [2] & [3]: This is a test
	}
	
	public void oneMoreStatement() {
		System.out.println("A non-static method can also be called!");
	}
	
	public static void main(String[] args) {
		
		// You can call a method like this. Don't forget the parentheses ()
		
		saySomething(); // Output: Hello, World!.. from a Method!
		
		// You can also call a method multiple times
		
		anotherStatement(); // Output: This is a test
		anotherStatement(); // Output: This is a test
		
		// In Java, it's best to place methods ABOVE the main method. However, you can also place them below it.
		// Keep in mind that the method MUST be static in order for it to work below the main method.
		// Calling it works the exact same:
		
		finalExample(); // Output: You can reach code here too
		
		
		
		/////////////////
		//   OBJECTS   //
		/////////////////

		// We can also call a non-static method within a Java File. You will learn more about objects in Chapter 3.
		
		Main_2_0 mainObject = new Main_2_0();
		mainObject.oneMoreStatement(); // Output [5]: A non-static method can also be called!
	}
	
	static void finalExample() {
		System.out.println("You can reach code here too"); // Output [4]: You can reach code here too
	}
	
	/* ** NOTES **
	 
		These notes will go over all different types of method and class names and keywords that you may see within a Java file.
		Many of these are talked about in their own tutorials. Refer to them for more information.
		
			>> class		- class Test { }					- An alternative to creating another Java file. You can use this to keep all of your
			 													  code in a single file. Remember, just because the code is written in the same Java
			 													  File DOES NOT mean that it is accessible by other classes or code. Treat this the
			 													  same way you would if the code was placed in a different Java File. Used ONLY in
			 													  class names.
			
			>> extends		- class Car extends Vehicle { } 	- A way to "inherit" attributes and methods from a class. Used ONLY in class names.
	*/
}
