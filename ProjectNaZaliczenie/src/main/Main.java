package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		welcome();
		int choice = 0;

		boolean exit = false;

		while (!exit) {

			choice = getMenu();

			switch (choice) {
			case 1:
				Variables variables = new Variables();
				break;
			case 2:
				DataType dataType = new DataType();
				break;
			case 3:
				ConditionalCS CCS = new ConditionalCS();
				break;
			case 5:
				exit = true;
				break;
			}

		}

	}

	private static void welcome() {
		System.out.println("Języki i Paradygmany Programowania");
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

		String choice = scan.nextLine();

		return Integer.parseInt(choice);
	}
}
