package jcolonia.daw2025.tablasmvc;

import java.util.Scanner;

public class VistaGeneral {
	
	Scanner miScanner = new Scanner(System.in);
	
	
	public void mostrarTexto(String texto) {
		
	}
	
	public void mostrarAviso(String texto) {
		
	}
	
	public void mostrarTítulo(String texto) {
		
	}
	
	public void mostrarTítulo2(String texto) {
		
	}
	
	public int pedirnumero(String texto) {
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
	
	public void pausa (String texto) {
		
	}
	
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
	
	public getScEntrada() {
		
	}
}
