package JavaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// array:to store similar data type values in a array variable.
        //1. int array :
		
	int i [] = new int [5];
	 i[0]= 10;
	 i[1]= 20;
	 i[2]= 30;
	 i[3]= 40;
	 i[4]= 0;
	 System.out.println(i[3]);
	//System.out.println(i[6]);//java.lang.ArrayIndexOutOfBoundsException: 6
	System.out.println(i.length);
	
	System.out.println("**********************");
		
		//print all the values of array; use for loop
	for (int k = 0;k<i.length;k++){
		System.out.println(i[k]);
		
	}
	System.out.println("**********************");
//double array:
	double d[]=new double [3];
	d[0]= 12.33;
	d[1]=13.44;
	d[2]= 45.55;
	System.out.println(d[1]);
		
	System.out.println("**********************");	
		
	//char array:
	char c [] = new char [3];
	c [0]='q';
	c [1]= 2;
	c[2]= 15;
	System.out.println(c[0]);
	
	System.out.println("**********************");
	
	//boolean array:
	boolean b[]=new boolean[2];
	b[0] = true;
	b[1] = false;
	
	System.out.println("**********************");
	
	//String.array;
	String s [] = new String [3];
	s[0] = "Test";
	s[1] = "Hello";
	s[2]= "World";
	System.out.println(s.length);
	System.out.println(s[2]);
	
	System.out.println("**********************");
	
	String [] arrays= {"Test","Hello","World"};
	for(int i2=0;i2<arrays.length;i2++){
		System.out.println(arrays[i2]);
	}
	
	System.out.println("**********************");
	
	//Object Array: (object is class )....is used to store different data types valus.
	
	Object ob [] = new Object [6];
	ob[0]="tom";
	ob[1]=25;
	ob[2]=12.33;
	ob[3]= "11/1/1998";
	ob[4] = "M";
	ob[5] = "Boston";
	
	for(int j=0;j<ob.length;j++) {
		System.out.println(ob[j]);
	}
	
	
	
	
	
	
	
	
	}

}
