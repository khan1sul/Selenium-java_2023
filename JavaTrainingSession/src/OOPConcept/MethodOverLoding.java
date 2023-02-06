package OOPConcept;

public class MethodOverLoding {

	
	public static void main(String[] args) {
		// 
		MethodOverLoding obj = new MethodOverLoding();
		
		obj.sum();
		System.out.println("**************");
		obj.sum(70);
		System.out.println("**************");
		obj.sum(70, 50);
		System.out.println("**************");
		obj.sum(20   ,   "mimi");//only can write the number and string value
		
//can not create a method in side method
//duplicate method ----i,e same method name with same number of argument are not allowed
//Method overloading ------->when the method name is same with different arguments or input parameters within the same class		
//we can overload main method also				
		
	}

	
	public void sum(){//0 input param
		System.out.println("Sum method----zero param");
	}
	
	public void sum(int i){//i input param
		System.out.println("Sum method");
		System.out.println(i);
	}
	
	public void sum(int i,int k){//2 input param
	System.out.println(i+k);
	
	}	
	public void sum(int j,String s){
		System.out.println("2 parammotor with 2 data type");
		System.out.println(j);
		System.out.println(s);
		System.out.println(j + s);
		
		
	}
}
