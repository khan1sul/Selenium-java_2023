package JavaBasics;

public class Loops {

	public static void main(String[] args) {
//
//		// Loop:
//		for (int x = 1; x < 10; x++) {
//			System.out.println(x);
//		}
//		System.out.println("****************");
//
//		int arr[] = { 1, 2, 3, };
//
//		for (int x : arr) {
//
//			System.out.println(x);
//		}
//
//		System.out.println("****************");
//		// while loop:
////		int i = 1;
////		while (i < 10) {
////			System.out.println("Value of i is" + i);
////			i++;
////		}
//		System.out.println("****************");
////do -	While loop:
//
//		int j = 5;
//		{
//			System.out.println(j);
//			j--;
//		}
//		while (j > 1)
//			;
//
		System.out.println("****************");

		// continue

		for(int w = 1;w<=10;w++){
			  
			if (w == 3) {
				continue;
			}
			System.out.println(w);

		}

		
		System.out.println("***************");

		// break
		
		for(int w = 1;w<=10;w++){
			  
			if (w == 4) {
				break;
			}
			System.out.println(w);

			

		}
	}

}
