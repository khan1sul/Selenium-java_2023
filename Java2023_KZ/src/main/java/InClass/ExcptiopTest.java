package InClass;

public class ExcptiopTest {

	public static void main(String[] args) {
		
		
		try {
			int division = 10/0;
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}
