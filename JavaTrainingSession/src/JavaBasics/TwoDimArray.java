package JavaBasics;

public class TwoDimArray {

	public static void main(String[] args) {
		// 
		String x[][] = new String [3][5];
		System.out.println(x.length);
		System.out.println(x[0].length);
	

		x[0][0]="orang";
		x[0][1]="mango";		
		x[0][2]="banana";	
		x[0][3]="apple";
		x[0][4]="garep";
		
		x[1][0]="orang1";
		x[1][1]="mango1";
		x[1][2]="banana1";
		x[1][3]="apple1";
		x[1][4]="garep1";
		
		x[2][0]="orange2";
		x[2][1]="mango2";
		x[2][2]="banana2";
		x[2][3]="apple2";
		x[2][4]="garep2";
	System.out.println(x[1][2]);
	
	   System.out.println("**************");	
	   
	//print all the values of 2d array:use for loop
for(int row=0; row<x.length;row++) {
	for(int col=0;col<x[0].length;col++){
		System.out.println(x[row][col]);	
		}
}
	
   System.out.println("**************");
//Dimensional array or multi-dim array we use this one line of 


   int a[][]= {{1,3,4,5},{111,555,7777,6666,},{-1,-2,-3,-4,}};

for (int row = 0;row<a.length;row++){
	for (int col =0; col<a[0].length;col++){
		System.out.println(a[row][col]);
	}
}


String str [][]= {{"first-name","salina"},{"middle-name","n/a"},{"last-name","sultana"}};
for(int row = 0;row<str.length;row++){
	for (int col=0;col<str[0].length; col++){
		System.out.println(str[row][col]);
	}
}










	}
		
}
	


