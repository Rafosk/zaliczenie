package main;

public class DataType {
	
	public DataType() {
		System.out.println("***************************************************************************************");
		System.out.println(Colors.ANSI_YELLOW + "TYPY DANYCH" + Colors.ANSI_RESET);
		System.out.println("***************************************************************************************\n");
		System.out.println("W javie wszystkie zmienne podczas tworzenia muszą mieć zadeklarowany typ, tak aby wiadomo było jakie wartości mogą przechowywać.\n"
				+ "Typy danych możeli podzielić na:\n"
				+ "liczbowe:\n"
				+ "\tcałkowitoliczbowe: \n" + 
				"    \t\t"+ Colors.ANSI_GREEN +"byte"+ Colors.ANSI_RESET +" - 1 bajt - zakres od -128 do 127\n" + 
				"    \t\t"+ Colors.ANSI_GREEN +"short"+ Colors.ANSI_RESET +" - 2 bajty - zakres od -32 768 do 32 767\n" + 
				"    \t\t"+ Colors.ANSI_GREEN +"int"+ Colors.ANSI_RESET +" - 4 bajty - zakres od -2 147 483 648 do 2 147 483 647\n" + 
				"    \t\t"+ Colors.ANSI_GREEN +"long"+ Colors.ANSI_RESET +" - 8 bajtów - zakres od -2^63 do (2^63)-1 (posiadają przyrostek L, lub l)\n" 				
				+ "\tzmiennoprzecinkowe: \n" +				
				"    \t\t"+ Colors.ANSI_GREEN +"float+"+ Colors.ANSI_RESET +" - 4 bajty - max ok 6-7 liczb po przecinku (posiadają przyrostek F, lub f)\r\n" + 
				"    \t\t"+ Colors.ANSI_GREEN +"double"+ Colors.ANSI_RESET +" - 8 bajtów - max ok 15 cyfr po przecinku (posiadają przyrostek D, lub d)\r\n"  				
				+ "\ttekstowe:\n"
				+ "\t\tznak:"+ Colors.ANSI_GREEN +" char"+ Colors.ANSI_RESET +" - służy do przechowywania pojedyńczych znaków.\n"
				+ "\t\tciąg znaków: "+ Colors.ANSI_GREEN +"String+"+ Colors.ANSI_RESET +" - służy do przechowywania ciągów znaków, podstawowa zmienna przy pracy nad tekstami\n"
				+ "\tlogiczne: \n\t\t"+ Colors.ANSI_GREEN +"boolean"+ Colors.ANSI_RESET +" - zmienna posiadająca dwa stay: true lub false. Służy głównie do sterowania procesami\n"
				+ "\twyliczeniowe: \n\t\t"+ Colors.ANSI_GREEN +"Enum"+ Colors.ANSI_RESET +" - pozwala na definiowanie ograniczonego, wybranego zbioru możliwych wartości.\n"
				+ Colors.ANSI_GREEN + "\t\tpublic enum Color{\n"
				+ "\t\t\tCZERWONY,ZIELONY,NIEBIESKI;\n"
				+ "\t\t}\n" + Colors.ANSI_RESET);
		System.out.println("***************************************************************************************");
		
	}
	
}
