package main;

public class LoopCS {				
	
	public static void getMessage() {
		
		System.out.println("***************************************************************************************");
		System.out.println(Colors.ANSI_YELLOW + "STRUKTURY STERUJĄCE ITERACYJNE" + Colors.ANSI_RESET);
		System.out.println("***************************************************************************************\n");
		System.out.println("Pętle to specialne bloki kodu które pozwalają wykonywać instrukcje wielokrotnie. W zależności od wyboru rodzaju pętli"
				+ "możemy iterować konkretną ilość razy, po zdefiniowanych elementach lub aż do zajścia warunku przerwana. \n"
				+ "W Javie wyróżniamy trzy rodzaje pętli:\n\n"
				+ "Pętla for - wykonuje instrukcje zawarte w ciele konkretną ilość razy, w poniższym przypadku 10:\n\n"
				+ Colors.ANSI_GREEN + "\tfor (int number = 0; number <= 10; number++) {\n" + 
				"\t\tSystem.out.println(number);\n" + 
				"\t}\n\n" + Colors.ANSI_RESET + 
				"Pętla while - wykonuje instrukcje zawarte w ciele konkretną dopóku spełniony jest warunek:\n\n"
				+ Colors.ANSI_GREEN + "\tint number = 0;\n" + 
				"\twhile (number < 10) {\n" + 
				"\t\tSystem.out.println(number);\n" + 
				"\t\tnumber++;\n" + 
				"\t}\n\n" + Colors.ANSI_RESET + 
				"Wariacją tej pętli jest pętla do while - w tym przypadku instrukcja w ciele wykona sie na pewno przynajmniej raz.\n\n"
				+ Colors.ANSI_GREEN + "\tint number = 0;\n" + 
				"\tdo {\n" + 
				"\t\tSystem.out.println(number);\n" + 
				"\t\tnumber++;\n" + 
				"\t} while (number < 10);\n\n" + Colors.ANSI_RESET
				+ "Pętla foreach - wykonuje instrukcje dla każdego elementu w danym zbiorze, np tablicy:\n\n"
				+ Colors.ANSI_GREEN + "\tint[] arr = {2, 0, 1, 3};\r\n" + 
				"\tfor (int el : arr) {\r\n" + 
				"\t\tSystem.out.println(el);\r\n" + 
				"\t}\r\n\n" + Colors.ANSI_RESET + 
				"W pętlach można korzystać ze słów kluczowych, sterujących ich przebiegiem:\n"
				+ "- break: przerwie iteracje całkowicie i wyjdzie z pętli\n"
				+ "- continue: przerwie konkretna iteracje i przejdzie do następnej\n\n"
				+ Colors.ANSI_GREEN + "\tfor (i = 0; i < 5; i++) {\r\n" + 
				"\t\tif (i >= 3) {\r\n" + 
				"\t\t\tbreak;\r\n" + 
				"\t\t}\r\n" + 
				"\t\tSystem.out.println(\"Yuhu\");\r\n" + 
				"\t\tif (i >= 1) {\r\n" + 
				"\t\t\tcontinue;\r\n" + 
				"\t\t}\r\n" + 
				"\t\tSystem.out.println(\"Tata\");\r\n" + 
				"\t}" + Colors.ANSI_RESET);
		System.out.println("***************************************************************************************");	
	}
}
