package OOPConcept;

public class LocalVsGlobasVariobles {

	//Global vars-----class variobles
	String name ="salina";
	int age = 25;
	
	public static void main(String[] args) {
		
    int i =10;//local var 
    System.out.println(i);
    LocalVsGlobasVariobles obj = new LocalVsGlobasVariobles();
    System.out.println(obj.name);
    System.out.println(obj.age);
	}
		
	public void sum (){
		int i = 10;//local var for sum method
		int j = 15;
		int age = 25;
	}
		
		
		
		
		
		
		
		
		
	}


