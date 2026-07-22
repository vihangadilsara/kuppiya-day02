import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.print("Input marks: ");
		double avg = input.nextDouble();
		
		
		System.out.println("Grade A"); // 75 - 100
		System.out.println("Grade B"); // 65 - 75
		System.out.println("Grade C"); // 50 - 65
		System.out.println("Grade F"); // <50
	}
}
