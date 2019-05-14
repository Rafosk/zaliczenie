package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		System.out.println("Wiaj");
		System.out.println("Oto możliwe wybory");
		
		Scanner scan = new Scanner(System.in);		
		
		getMenu();
		
	}
	
	public static void getMenu() {
		
		String result = "1: zmienne\n";
		result += "2: typy\n";
		
		System.out.println(result);
	}
}
