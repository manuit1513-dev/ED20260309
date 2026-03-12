package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class VistaMenu extends VistaGeneral{
	/**
	 * 
	 */
	private String titulo;
	/**
	 * 
	 */
	private List<String> opciones;
	
	/**
	 * @param titulo
	 * @param opciones
	 */
	public VistaMenu (String titulo, List<String> opciones) {
		this.titulo = titulo;
		this.opciones = new ArrayList<String>(opciones);
	}
	
	/**
	 * 
	 */
	public void mostrarTítulo() {
		super.mostrarTítulo(titulo);
	}
	
	/**
	 * 
	 */
	public void mostrarOpciones() {
		for (int i = 0; i < opciones.size(); i++) {
			System.out.printf("%d. %s%n", i + 1, opciones.get(i));
		}
		
		System.out.println("0. Salir");
		System.out.println("-----------------------");
	}
	
	
	/**
	 * @return La opcion seleccionada por el usuario
	 */
	public int pedirOpcion() {
		int eleccion;
		boolean esValido = false;
		
		do {
			eleccion = pedirNumero("Seleccione una opción: ");
			
			if(eleccion >= 0 && eleccion < opciones.size()) {
				esValido = true;
			}else {
				mostrarAviso("La opción seleccionada no existe. Inténtelo de nuevo");
			}
		}while(!esValido);
		
		return eleccion;
	}
	
	@SuppressWarnings("javadoc")
	public void mostrarTexto(String texto) {
		System.out.println(texto);
	}
}
