package main;

public class Main {

	public static void main(String[] args) {

		Utils.welcome();
		
		int choice = 0;

		boolean exit = false;

		while (!exit) {

			choice = Utils.getMenu();

			switch (choice) {
			case 1:
				Utils.clearScreen();
				Variables.getMessage();
				break;
			case 2:
				Utils.clearScreen();
				DataType.getMessage();
				break;
			case 3:
				Utils.clearScreen();
				ConditionalCS.getMessage();
				break;
			case 4:
				Utils.clearScreen();
				LoopCS.getMessage();
				break;
			case 5:
				exit = true;
				Utils.clearScreen();
				break;
			}
		}
	}
}
