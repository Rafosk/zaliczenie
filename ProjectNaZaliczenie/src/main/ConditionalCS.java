package main;

public class ConditionalCS {
	
	public static void getMessage() {
		System.out.println("***************************************************************************************");
		System.out.println(Colors.ANSI_YELLOW + "STRUKTURY STERUJĄCE WARUNKOWE" + Colors.ANSI_RESET);
		System.out.println("***************************************************************************************\n");
		System.out.println("Struktury sterujące warunkowe to bloki kodu które mogą zmienić sciężkę którą podąża główny proces, inaczej mówiąc są to instrukcje wyboru. \n"
				+ "W Javie mamy trzy ich rodzaje:\n\n"
				+ "If/Else/Else if -  Instrukcja ta sprawdza warunek i jeśli jest on spełniony to wykonywane są instrukcje w jej ciele, jeśli nie to są pomijane.\nSłowo else pozwala"
				+ "na wykonanie innych instrukcji, gdy warunek jest fałszywy\n\n"
				+ Colors.ANSI_GREEN + "\tif (count > 2) {\n" + 
				"\t\tSystem.out.println(\"Count is higher than 2\");\n" + 
				"\t} else {\n" + 
				"\t\tSystem.out.println(\"Count is lower or equal than 2\");\n" + 
				"\t}\n\n" + Colors.ANSI_RESET
				+ "Trójargumentowy operator warunkowy - skrócony zapis instrukcji if/else:\n\n"
				+ Colors.ANSI_GREEN + "\tSystem.out.println(count > 2 ? \"Count is higher than 2\" : \"Count is lower or equal than 2\");\n\n" + Colors.ANSI_RESET
				+ "Switch - instrukcja sprawdza czy któryś z warunków jest spełniony jeśli tak, wykonuje odpowiedni kod. Przydatna w przypadku wielu wyborów. \n"
				+ "Ważne jest użycia słowa break, inaczej niezależnie od spełnienia warunku, wszystkie bloki wykonają się.\n\n"
				+ Colors.ANSI_GREEN + "\tint count = 3;\r\n" + 
				"\tswitch (count) {\r\n" + 
				"\tcase 0:\r\n" + 
				"\t\tSystem.out.println(\"Count is equal to 0\");\r\n" + 
				"\t\tbreak;\r\n" + 
				"\tcase 1:\r\n" + 
				"\t\tSystem.out.println(\"Count is equal to 1\");\r\n" + 
				"\t\tbreak;\r\n" + 
				"\tdefault:\r\n" + 
				"\t\tSystem.out.println(\"Count is either negative, or higher than 1\");\r\n" + 
				"\t\tbreak;\r\n" + 
				"\t}" + Colors.ANSI_RESET);
		System.out.println("***************************************************************************************");
	}
}
