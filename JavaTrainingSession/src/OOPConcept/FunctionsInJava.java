package OOPConcept;

public class FunctionsInJava {
	
//main method--->staring point of execution
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		//one obj will be created obj is reference variable,referring to this object
		//after creating the object,the copy of all nonstatic method will be given to this object
		
		obj.test();
		int l =obj.pqr();
		System.out.println(l);
		
		String s1 =obj.qa();
		System.out.println(s1);
		
		int div = obj.divsion(30,10);
		System.out.println(div);
		
			
		// non static methods
		//void-----------never main method return a value
	}	
	public void test(){
		System.out.println("test method");
		
	}
	//Return type ---> int
	public int pqr(){
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
		
	}
	//Return type ---> String
	public String qa(){//no input,same output
		System.out.println("PQR method");
		String s= "Selenium";
		
		return s;
	}	
		
		
		//return type --------->int
	   //x,y-----> input parameters/arguments
	public int divsion(int x,int y) {
		System.out.println("divsion method");
		int d = x/y;
		return d;
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
