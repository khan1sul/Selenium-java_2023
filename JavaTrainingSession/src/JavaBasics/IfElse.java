package JavaBasics;

public class IfElse {

	public static void main(String[] args) {
		// write a program which will use if condi 
    int a = 40;
     int b = 20;
      if(b>a) {
    	  System.out.println("b is greater than a");
      }
     else {
   	  System.out.println("a is greater than b");
      }
      System.out.println("*******************");
		
		//comparison operators:
      // < > <= >= == ! =
      
//      int c = 50;
//      int d = 60;
//      
//      if(c==d) {
//    	  System.out.println("c and d are equal");
//      }else {
//    	  System.out.println("c and d are not equal");
//      }
		
		//write a logic to find out the highest number
      
//      int a1 = 400;
//      int b1 = 500;
//      int c1 = 300;
      
      //nested if- else
      
//      if(a1>b1 & a1>c1){//false & false = false, true & true = true, false & true = false
    	  System.out.println("a1 is the greatest");
//      }
//      else if (b1>c1) {
//    	  System.out.println("b1 is the greatest");
//      }
//      else {
//		System.out.println("c1 is the greatest");
//      }
    	  System.out.println("**********");	
	int age = 19;
	//String country = "USA";
	
	if(age >=18) {//age > 18 || age == 18 ======false or true
		System.out.println("Your,er eligible to sing up");
		System.out.println("***********");
//		
		//if(country == "USA"){
		//	System.out.println("You,re eligible for 1 month free trial");
			
		}
	
//	else if (age >= 16){
	
//	System.out.println("You're partially eligible to sing up");
   
//	}
//	else {
//		System.out.println("You're ineligible to open an account");
//	}
	
//	String country ="USA";
	
//	switch(country) {
	//case "USA":	
//	System.out.println("English");
//		break;
		
//	case"Chian":
//		System.out.println("Chian");
//		break;
		
//		default:
//			System.out.println("No language found!");
//	break;
//	}
	
	//System.out.println("Outside the switch case");
	System.out.println("******************");
	int k =100;
      if(k>50){
		System.out.println("this coding is correct");
	}
	
	else {
		System.out.println("this is wrong correct ");
	}
	
      System.out.println("************");
      
	String country = "USA";
	
	String state ="NY";//if change state name than coming
	
	if(country.equals("USA")) {
		if (state.equals("NY")) {
			System.out.println("You're a survivor");//Sys ctrl spise
		}else if (state.equals("NJ")){
			System.out.println("You're a peach lover");
		}

	}else {
		System.out.println("No language");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}