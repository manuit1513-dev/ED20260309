package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

/**
 * Clase encargada de la gestión de la interfaz de usuario por consola.
 * Contiene la entrada de datos a través del Scanner y define los formatos
 * para los mensajes y avisos de la consola.
 * 
 * @author manueld.garpra
 * @version 1.0
 */
public class VistaGeneral {
	
	/**
	 * Mensaje para las pausas en la ejecución del programa.
	 */
	private String FORMATO_PRINTF_MOSTRARTEXTO = "Pulse <intro> para continuar...";
	
	/**
	 * Plantilla para mostrar avisos de errores.
	 */
	private String FORMATO_PRINTF_MOSTRARAVISO = "[AVISO]: %s%n";
	
	
	/**
	 * Obeto que se utiliza para leer datos de entrada.
	 * Permite capturar los datos que escribe el usuario por consola.
	 */
	Scanner miScanner = new Scanner(System.in);
	
	/**
	 * Imprime un texto en la consola con una linea en blanco antes
	 * @param texto El mensaje que se va a mostrar
	 */
	public void mostrarTexto(String texto) {
		System.out.println();
		System.out.println(texto);
	}
	
	/**
	 * Imprime un mensaje de error en la consola de errores
	 * @param texto El mensaje de advertencia o error
	 */
	public void mostrarAviso(String texto) {
		System.err.printf(FORMATO_PRINTF_MOSTRARAVISO, texto);
	}
	
	/**
	 * Muestra un título destacado con un doble borde completo.
	 * @param texto El título que se resalta.
	 */
	public void mostrarTítulo(String texto) {
		 String azul = "\u001B[34m";
		    String reset = "\u001B[0m";
		    int longitudTítulo = texto.length();

		    // Dibujamos la esquina y la línea superior
		    System.out.print(azul + "x");
		    for (int i = 0; i < longitudTítulo + 2; i++) {
		        System.out.print("=");
		    }
		    System.out.println("x");

		    // Cuerpo del título
		    System.out.println("‖ " + texto + " ‖");

		    // Dibujamos la esquina y la línea inferior
		    System.out.print("x");
		    for (int i = 0; i < longitudTítulo + 2; i++) {
		        System.out.print("=");
		    }
		    System.out.println("x" + reset);
	}
	
	/**
	 * Muestra un título destacado con un doble borde completo.
	 * @param texto El subtítulo que se va a resaltar.
	 */
	public void mostrarTítulo2(String texto) {
		String amarillo = "\u001B[33m";
		String reset = "\\u001B[0m";
		int longitudTítulo2 = texto.length();
		
		System.out.print("x");
		for(int i = 0; i < longitudTítulo2 + 2 ; i++) {
			System.out.println("-");
		}
		System.out.print("x");
		
		System.out.print(amarillo + texto);
		
		System.out.print("x");
		for(int i = 0; i < longitudTítulo2 + 2 ; i++) {
			System.out.println("-");
		}
		System.out.print("x");
		
		System.out.print(reset);
	}
	
	/**
	 * Pide un número entero por consola al usuario.
	 * Repite la lectura hasta que el valor introducido sea
	 * un entero.
	 * @param texto Mensaje que le sale al usuario para pedirle el dato.
	 * @return El número introducido por el usuario
	 */
	public int pedirNumero(String texto) {
	    System.out.print(texto);
	    
	    while (!miScanner.hasNextInt()) {
	        System.out.println("Error: No has introducido un número válido.");
	        miScanner.next();
	        System.out.print(texto);
	    }
	    
	    int numero = miScanner.nextInt();
	    miScanner.nextLine();
	    return numero;
	}
	
	/**
	 * Detiene el programa hasta que el usuario pulse la tecla <Intro>.
	 * <p>
	 * Este método va a permitir al usuario poder leer los mensajes que le
	 * muestra la consola antes de que este continue.
	 * </p>
	 * @param texto Mensaje que le mostrará al usuario. Ejemplo: "Pulse Intro para continuar".
	 */
	public void pausa (String texto) {
		System.out.print(FORMATO_PRINTF_MOSTRARTEXTO);
		miScanner.nextLine();
	}
	
	/**
	 * Pide al usuario que indique si esta seguro de realizar la operación.
	 * Rpeite la pregunta hasts que el usuario introduzca
	 * uno de los dos valores que se le indica.
	 * @param texto Pregunta al usuario y le dice con que valores puede responder
	 * @return La repuesta del usuario
	 */
	public boolean pedirConfirmacion(String texto) {
	    System.out.print(texto + " (S/N): ");
	    
	    while (!miScanner.hasNextBoolean()) {
	        System.out.println("Error: Debe introducir 'S' o 'N'.");
	        miScanner.next();  
	        System.out.print(texto + " (S/N): ");
	        
	    }
	    
	    boolean confirmacion = miScanner.nextBoolean();
	    miScanner.nextLine();
	    return confirmacion;
	}
	
	public mostrarlista(List<String> lista) {
		
	}
	
	public getmiScanner() {
		
	}
}
