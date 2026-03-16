package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

/**
 * Crea una única instancia para el {@link Scanner} de la aplicación.
 * Con el patrón singleton centraliza la entrada y así evita conflictos
 * en el flujo de la entrada de datos.
 * @author manueld.garpra
 * @version 1.0
 */
public class ScannerSingleton {
	private static Scanner ScEntrada;
	
	/**
	 * Constructor privado para evitar la instanciación externa de la clase.
	 */
	private ScannerSingleton() {
		
	}
	
	/**
	 * Devuelve la instancia única del {@link Scanner} y si no existe la crea.
	 * @return la instancia del Scanner
	 */
	public static Scanner getInstancia() {
		if (ScEntrada == null) {
			ScEntrada = new Scanner(System.in);
		}
		return ScEntrada;
	}
}
