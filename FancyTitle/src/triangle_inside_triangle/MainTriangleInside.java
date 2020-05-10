package triangle_inside_triangle;

import java.util.Scanner;


public class MainTriangleInside {	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter value :- ");
		int getLevel = scanner.nextInt();
		TriangleInside.printSequence(getLevel,(char) 187);
	}
}
