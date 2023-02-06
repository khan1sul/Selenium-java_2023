
public class PrimeNumber {
//	Prime number means the number can be only be divided by 1 or by itself
//	with remainder 0.
//	1. Create a class PrimeNumber
//	2. Create main method
//	3. Create a method named isPrimeNumber(arg) and return boolean data
//	type
//	4. Verify if the provided value is prime number or not
	
	public  boolean isPrimeNumber(int value) {
		boolean isPrimeNumber = true;
		
		if(value <= 1) {
		System.out.println("Provid a number great then 1");	
		}
		for(int i = 2;i<value;i++) {
			if(value % i == 0){
			isPrimeNumber = false;
			break;
			}
		}
		return isPrimeNumber;
		}
		

	public static void main(String[] args) {
		
	PrimeNumber pn = new PrimeNumber();
	
	System.out.println(pn.isPrimeNumber(11));
	
	}

}
