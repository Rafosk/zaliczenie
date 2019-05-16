package main;

public class Variables {

	public Variables() {
		System.out.println("***************************************************************************************");
		System.out.println("\nZmienne są jak \"pudełka\", w których można zapisywać wszelkiego rodzaju informacje.");
		System.out.println("Kiedy tworzymy jakąś zmienną to musimy także napisać, do jakiego typu danych należy");
		System.out.println("Typ danych pozwala nam ustalić, jakiego rodzaju informacje przechowuje dana zmienna.");
		System.out.println("Deklarując zmienna najpierw podajemy jej typ, następnie nazwę a na końcu możemy określić jej wartość\n");
		System.out.println("Przykłady\ndeklaracja zmiennej liczbowej:\n" + Colors.ANSI_GREEN + "int x;"
				+ Colors.ANSI_RESET + "\ndeklaracja zmiennej liczbowej z określoną wartością:\n" + Colors.ANSI_GREEN
				+ "int x = 5;" + Colors.ANSI_RESET + "\ndeklaracja zmiennej znakowej z określoną wartością:\n"
				+ Colors.ANSI_GREEN + "char letter = 'a';" + Colors.ANSI_RESET);
		System.out.println(
				"Jest też możliwość zadeklarowania zmiennej jakos stałej, tzn takiej której raz zadeklarowanej warotści nie można zmienić:\n"
						+ Colors.ANSI_GREEN + "final String color = \"black\";" + Colors.ANSI_RESET);
		System.out.println(
				"\nZmienne posadają rónież modyfikatory dostępu które decydują o tym czy zmienna jest widoczna w danej klasie:\n"
						+ "- public - najmniej restrykcyjny modyfikator, zmienna jest widoczna dla wszystkich klas:\n"
						+ Colors.ANSI_GREEN + "public String city = \"Warszawa\";" + Colors.ANSI_RESET
						+ "\n- protected - zmienna jest widoczna dla danej klasy, jej podklas oraz innych klas w tym samym pakiecie:\n"
						+ Colors.ANSI_GREEN + "protected Integer price = 500;" + Colors.ANSI_RESET
						+ "\n- brak modyfikatora - inaczej zwany pakietowym, zmienna jest widoczna wyłącznie w danej klasie i jej podklas:\n"
						+ Colors.ANSI_GREEN + "Long lenght = 5L;" + Colors.ANSI_RESET
						+ "\n- private - najbardziej restrykcyjny modyfikator, zmienna jest widoczna wylącznie w danej klasie ");
		System.out.println(
				"\nZmienna również może być statyczna, dzięki temu może być wykorzystywana w innych klasach bez potrzeby delkarowania klasy tej zmiennej."
						+ "Przykładem moga być użyte zmienne do zmiany koloru czcionki w klasie Variables:\n" + Colors.ANSI_GREEN
						+ "Colors.ANSI_GREEN " + Colors.ANSI_RESET);
		System.out.println("***************************************************************************************");
	}

}
