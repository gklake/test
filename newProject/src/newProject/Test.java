package newProject;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter your name: ");
		
		String userName = userInput.nextLine();
		System.out.println("Hello, " + userName + "!");
		
		
	}

}
