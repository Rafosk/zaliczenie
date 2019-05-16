package main;

import java.util.Scanner;

public class Utils {

	public static void welcome() {
		System.out.println(Colors.ANSI_YELLOW + "\nJęzyki i Paradygmany Programowania" + Colors.ANSI_RESET);
		System.out.println("Projekt na zaliczenie: wybrane abstrakcje dla jezyka JAVA");
		System.out.println("Rafał Krakiewicz");
		System.out.println("***********************************************************");
	}

	public static int getMenu() {

		System.out.println("\nMenu:");
		System.out.println("1 - zmienne");
		System.out.println("2 - typy danych");
		System.out.println("3 - struktury sterujące warunkowe");
		System.out.println("4 - struktury sterujące iteracyjne");
		System.out.println("5 - wyjście");

		Scanner scan = new Scanner(System.in);

		int choice = scan.nextInt();

		return choice;
	}
	
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}
}
