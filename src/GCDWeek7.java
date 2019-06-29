import java.util.*;

public class GCDWeek7 {

	public static void main(String[] args) throws Exception {
		int int1 = 0, int2 = 0;

		Scanner scanman = new Scanner(System.in);

		System.out.println("Enter the first positive integer for GCD calculation:");
		int1 = scanman.nextInt();
		
		System.out.println("Enter the second positive integer for GCD calculation:");
		int2 = scanman.nextInt();
	
		scanman.close();
		

		while (int1 != int2) {
			if (int1 > int2) {
				int1 -= int2;
			}
			else
				int2 -= int1;
		}
		if (int2 == 1) {

			throw new Exception("GCD is = 1");
		}
		System.out.println("GCD of given numbers is: " + int2);
	}

}
