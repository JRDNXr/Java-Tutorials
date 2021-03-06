
// |========================|
// |   SPECIAL CHARACTERS   |
// |========================|

public class Main_1_3 {
	
	public static void main(String[] args) {
		
		// Java will not accept Strings that contain specific characters such as a single quote, double quote, or backslash
		// To use these special characters, you must append a backslash (\) followed by the character you wish to include
		
		String singleQuote = "Example: \'";
		String doubleQuote = "Example: \"";
		String backslash = "Example: \\";
		
		System.out.println(singleQuote); // Output: Example: '
		System.out.println(doubleQuote); // Output: Example: "
		System.out.println(backslash); // Output: Example: \
		
		
		
		//////////////////////
		// ESCAPE SEQUENCES //
		//////////////////////
		
		// Escape sequences are used to signal an alternative interpretation of a series of characters. The Java compiler sees an escape sequence
		// that has a special meaning
		
		// \n adds a newline
		String newLine = "Hello, \nWorld!"; // Output: Hello,
											// 		   World!
		
		// \r adds a carriage return
		String carriage = "Hello, \rWorld!"; // Output: Hello,
											 //			World!
		
		// \t adds a new tab
		String tab = "Hello, \tWorld!";
		
		// \b adds a backspace
		String backspace = "Hello, W\borld!";
		
		System.out.print("\n");
		
		// \f adds a form feed (NO INFO)
		System.out.println(newLine); // Output: Hello,
									 // 		World!
		System.out.print("\n");
		System.out.println(carriage); // Output: Hello,
									  // 		 World!
		
		System.out.print("\n");
		System.out.println(tab); // Output: Hello,  World!
		
		System.out.print("\n");
		System.out.println(backspace); // Output: Hello, World!
	}

}
