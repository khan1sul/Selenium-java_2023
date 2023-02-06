package ExcercisesAfterClass;

import java.util.ArrayList;

public class CollectionTest {
	
	public void listBreaker(ArrayList<String> fruits ){
		for(int i=0; i<fruits.size();i++) {
			System.out.println(fruits.get(i));
		}
	}
	public static void main(String[] args) {
		 /**
		 * Homework:
		 * 1. Create a class CollectionTest 
		 * 2. Create a main method
		 * 3. Create a method listBreaker()
		 * 4. Create an ArrayList in the method with 2/3 values
		 * 5. Write a regular for loop to go through the arraylist
		 * 6. Print every value from the arraylist
		*/				
		ArrayList<String> values = new ArrayList<String>();
				values.add("mango");
				values.add("Banana");
				values.add("Orange");
		CollectionTest obj = new CollectionTest();
		obj.listBreaker(values);
		
		
		
	}
	
/**	Different types of for-Loop
	for loop : for(int i=0; i<=10....) {
	}
	Enhance for Loop: for(Integer e : ...) {
	}
*/	
	}


