import java.util.Arrays;

public class Homework12 {
//	Homework:
//		1. Create a class Homework12
//		2. Create a main method
//		3. Create a method copyAnArray()
//		4. Create an array with 2/3 values
//		5. Write a program inside the method to copy the existing array with values
//		to a new array
//		Note: Make sure to use for loop
		public void copyAnArray(){
			int a[] = new int [3];
			int b[]	= Arrays.copyOf(a, 2);
		
		 for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
			
		 }
		 for (int i = 0; i < b.length; i++) {
	            System.out.print(b[i] + " ");
		
		 }
			
			
			
			
//			int i[] = new int [3];
//			i[0]= 10;
//			 i[1]= 20;
//			 i[2]= 30;
////			 for (int k=i.length-1;k>=0;k--){
////					System.out.println(i[k]);
//			 }
	//		 for(int k=0;k<=i.length-1;k++) {
	//			 System.out.println(i[k]);
	//		 }
			}		
	public static void main(String[] args) {
		Homework12 obj = new Homework12 ();
		obj.copyAnArray();	
//		int arr []= {1,2,3,};
//		for (int i : arr) {
//			System.out.println(i);
//		}
		
		int a[]= {1,2,3};
	
		
		
		
		
		
		
		
		
		
		
		
		}


	

		
	}
	


