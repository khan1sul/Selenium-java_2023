import java.util.Scanner;

public class Palindrome {

//	Homework:
//		Palindrome means if you reverse a work it still remains same.
//		civic, level, mom.
//		1. Create a class Palindrome
//		2. Create main method
//		3. Create a method named palindrome(arg)
//		4. Verify if the provided value is palindrome or not

	public void palindrome() {

		String str = "mom";
        String p = "";
        
		char[] rev = str.toCharArray();
		for (int i = rev.length - 1; i >= 0; i--) {

			p =	p + rev[i];
		}
		if (str.equals(p)) {
			System.out.println(str + " value is  correct");
		} else {
			System.out.println(str + "value is not correct");
		}
	}

	public static void main(String[] args) {

		Palindrome obj = new Palindrome();
		obj.palindrome();
	}

}
