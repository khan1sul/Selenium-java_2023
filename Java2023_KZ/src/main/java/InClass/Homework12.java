package InClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework12 {

	public static void main(String[] args) {
//	Create an array with 2/3 values
//		 Write a program inside the method to copy the existing array with values
//		to a new array
//		Note: Make sure to use for loop
		
		int a[] = {1,5,3};
		int b[] = new int [a.length];
		
		for(int i=0;i<a.length; i++) {
			b[i] = a[i];//b[0] = 1
		}
		System.out.println(Arrays.toString(b));
		
		
		
		
		
		
		
	}

}
