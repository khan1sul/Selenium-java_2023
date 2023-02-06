package OOPConcept;

public class StaticAndNonStaticConcept {
//global vars:the scope of global vars will be availablr across all the functions with the same conditions.
	
	String name ="Nena";//non static global var
	static int age = 25;//static global var
	
	public static void main(String[] args) {
		
		// how to call static methods and vars?
        //1.direct calling:
		
		sum();
		
		StaticAndNonStaticConcept StaticAndNonStaticConcep;
		//2.calling by classname:
		StaticAndNonStaticConcept.sum();
		System.out.println(age);
		System.out.println(StaticAndNonStaticConcept.age);
		
		//how to call nonstatic methods and vars:
		StaticAndNonStaticConcept  obj = new StaticAndNonStaticConcept ();
       obj.sendMail();
       System.out. println(obj.name);
       
       //can i access static methods by using object reference ?yes
       obj.sum();//waring will be give
		
	}
		
	public void sendMail(){//non static method
	System.out.println("send mail method");
	}
		public static void sum(){//static method
			System.out.println("sum methed");
		
		
		
		
		
		
	}

}
