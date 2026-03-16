package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * Refleja la interfaz de usuario que está especializada en la gestión de menús.
 */
public class VistaMenu extends VistaGeneral{
	/**
	 * El texto que se muestra como título del menú
	 */
	private String titulo;
	/**
	 * Lista de etiquetas que representan las opciones del menú
	 */
	private List<String> opciones;
	
	/**
	 * Crea un menú nuevo con su título y un conjunto de opciones
	 * @param titulo del menú
	 * @param opciones las posibles acciones que tiene el menú
	 */
	public VistaMenu (String titulo, List<String> opciones) {
		this.titulo = titulo;
		this.opciones = new ArrayList<String>(opciones);
	}
	
	/**
	 * Muestra el título del menú formateado que 
	 * ha sido definido en la clase superior {@link VistaGeneral}
	 */
	public void mostrarTítulo() {
		super.mostrarTítulo(titulo);
	}
	
	/**
	 * Imprime por consola la lista de las opciones del menú.
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
			
			if(eleccion >= 0 && eleccion <= opciones.size()) {
				esValido = true;
			}else {
				mostrarAviso("La opción seleccionada no existe. Inténtelo de nuevo");
			}
		}while(!esValido);
		
		return eleccion;
	}
	
	/**
	 * Muestra el texto.
	 */
	public void mostrarTexto(String texto) {
		System.out.println(texto);
	}
}
