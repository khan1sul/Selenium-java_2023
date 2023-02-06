package OOPConcept;

public class Car {

	//Class var:
	int mod;
	int wheel;
	
	public static void main(String[] args) {
		//new Car():--this is the obect of the Car class
		//new keyword is used to create the object
		//a,b,c---- Object reference variables
		
	Car a = new Car();
	
    Car b = new Car();	
		
	Car c = new Car();	
		
	a.mod = 2022;
	a.wheel = 4;
	
	b.mod = 2019;
	b.wheel = 4;
	
	c.mod = 2016;
	c.wheel = 4;
	
	System.out.println("before assigning the references");
	
	System.out.println(c.mod);
	
	System.out.println(c.wheel);
	
	
	System.out.println("after shifting the references");
	
	a=b;
	b=c;
	c=a;
	a.mod =10;
	System.out.println(a.mod);//10
	c.mod=20;
	System.out.println(a.mod);//20
	System.out.println(c.mod);
			
	
	
	
	
	
	
	
	
	
		
	}

}
