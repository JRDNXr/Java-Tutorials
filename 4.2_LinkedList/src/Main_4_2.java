
// |=================|
// |   LINKEDLISTS   |
// |=================|

// Import LinkedList
import java.util.ArrayList;
import java.util.LinkedList;

public class Main_4_2 {

	public static void main(String[] args) {
		
		/*
			The LinkedList class is a collection which can contain many objects of the same type, just like the ArrayList.

			The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface.
			This means that you can add items, change items, remove items and clear the list in the same way.

			However, while the ArrayList class and the LinkedList class can be used in the same way, they are built very differently.


			How an ArrayList works:
			The ArrayList class has a regular array inside it. When an element is added, it is placed into the array. If the array is not big
			enough, a new, larger array is created to replace the old one and the old one is removed.


			How the LinkedList works:
			The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link to the next
			container in the list. To add an element to the list, the element is placed into a new container and that container is linked to
			one of the other containers in the list.
			
			
			** NOTE ** Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
		*/
		
		// The syntax for creating a LinkedList is the same as an ArrayList (with the obvious difference of ArrayList now being LinkedList).
		// This creates a LinkedList object called "cars":
		LinkedList<String> colours = new LinkedList<String>();
		
		colours.add("Red");
		colours.add("Orange");
		colours.add("Yellow");
		colours.add("Green");
		colours.add("Blue");
		colours.add("Purple");
		
		// Print all values in a LinkedList:
		// You can also use a for-loop and a for-each loop.
		System.out.println(colours); // Output: [Red, Orange, Yellow, Green, Blue, Purple]
		System.out.print("\n");
		
		
		// LinkedLists can access the same methods as an ArrayList:
		// get(), remove(), set(), and size() (among a trove of others).
		
		// LinkedLists have several unique methods that ArrayLists do not. This makes them more efficient with certain operations:
		
		
		// Add a value to the beginning of the list:
		colours.addFirst("White");
		
		System.out.println(colours.get(0)); // Output: White
		System.out.println(colours.get(1)); // Output: Red
		System.out.print("\n");
		
		
		// Add a value to the end of the list:
		colours.addLast("Black");
		
		System.out.println(colours.get(7)); // Output: Black
		System.out.print("\n");
		
		
		// Remove the first value (Element 0):
		colours.removeFirst();
		
		System.out.println(colours.get(0)); // Output: Red
		System.out.print("\n");
		
		
		// Remove the last value (Element x):
		colours.removeLast();
		
		
		// System.out.println(colours.get(7)); <-- Will give an error
		System.out.println(colours.get(5)); // Output: Purple
		System.out.print("\n");
		
		
		// Get the first value in a list:
		System.out.println(colours.getFirst()); // Output: Red
		
		
		// Get the last value in a list:
		System.out.println(colours.getLast()); // Output: Purple
		
		
		
		//////////////////////////
		//   OTHER DATA TYPES   //
		//////////////////////////
		
		// To create another data type, just specify the type within the carrot symbols (< >).
		// Below we created a LinkedList with an Integer data type:
		// ** NOTE ** Remember, we use Integer, NOT int for LinkedList. This is because Collection objects, such as LinkedList, cannot use
		// 			  primitive types.
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		
		// Below are all the other data types that you can have with a LinkedList:
		LinkedList<Byte> btye = new LinkedList<Byte>();
		
		LinkedList<Short> shrot = new LinkedList<Short>();
		
		LinkedList<Long> lnog = new LinkedList<Long>();
		
		LinkedList<Float> flaot = new LinkedList<Float>();
		
		LinkedList<Double> duoble = new LinkedList<Double>();
		
		LinkedList<Boolean> Boolaen = new LinkedList<Boolean>();
		
		LinkedList<Character> cahr = new LinkedList<Character>();
	}
}
