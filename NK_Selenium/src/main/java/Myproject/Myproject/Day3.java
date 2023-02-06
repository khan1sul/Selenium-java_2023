package Myproject.Myproject;
//Exercises:
//Note: Create separate classes for all examples
//1. Write a program which initialize an instance variable and prints whichever
//name is provided while creating the object.
//Ex: Hello
//2. Write a program which initialize two instance variable and prints
//whichever greetings and name is provided while creating the object.
//Ex: Good morning, John


//Homework:
//1. Create a class Day3
//2. Create a main method
//3. Create a constructor that takes one parameter
//4. Create a instance variable and assign a value in the constructor
//5. Print the instance variable in the console
	
public class Day3{
//1		
	public void name(String n) {
		System.out.println(n);
	}
//2	
	public void twoInstance(String greeting, String name) {
		System.out.println(greeting+ name);
		
	}
public static void main(String[]args) {
			
			Day3 obj = new Day3();
			obj.name("Java");
			obj.name("Salina");
	
 System.out.println("***********************");
 			obj.twoInstance("Good night,", " Friend");






//System.out.println("***********************");

//3. Write a program which will print out default values of primitive data types.

//Ex: 0 //for int











	}

}
