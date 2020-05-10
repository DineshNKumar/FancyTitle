package fancytitle;

import java.util.Scanner;

public class MainClass {
	
	public static void main(String[] args) {
		Scanner message = new Scanner(System.in);
		System.out.println("Enter message :- ");
		String LINE = message.nextLine();
                System.out.println(FancyTitle.createFancyTitle(LINE, '*'));
                System.out.println(FancyTitle.createFancyTitle(LINE, '$'));
        }
}
