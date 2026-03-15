package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

public class ScannerSingleton {
	private static Scanner ScEntrada;
	
	private ScannerSingleton() {
		
	}
	
	public static Scanner getInstancia() {
		if (ScEntrada == null) {
			ScEntrada = new Scanner(System.in);
		}
		return ScEntrada;
	}
}
