
import java.util.*;
class Demo {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] ar = new int[10];
		
		// ----------- Read Numbers -----------
		System.out.print("Enter number 1: ");
		ar[0] = input.nextInt();
		
		System.out.print("Enter number 2: ");
		ar[1] = input.nextInt();
		
		System.out.print("Enter number 3: ");
		ar[2] = input.nextInt();
		
		System.out.print("Enter number 4: ");
		ar[3] = input.nextInt();
		
		System.out.print("Enter number 5: ");
		ar[4] = input.nextInt();
		
		System.out.print("Enter number 6: ");
		ar[5] = input.nextInt();
		
		System.out.print("Enter number 7: ");
		ar[6] = input.nextInt();
		
		System.out.print("Enter number 8: ");
		ar[7] = input.nextInt();
		
		System.out.print("Enter number 9: ");
		ar[8] = input.nextInt();
		
		System.out.print("Enter number 10: ");
		ar[9] = input.nextInt();

		
		
		
		// ------- Find Total ---------
		
		int total = 0;
		
		total += ar[0];
		total += ar[1];
		total += ar[2];
		total += ar[3];
		total += ar[4];
		total += ar[5];
		total += ar[6];
		total += ar[7];
		total += ar[8];
		total += ar[9];
		
		System.out.println("Total: " + total);
    }
}

