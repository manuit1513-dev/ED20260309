package jcolonia.daw2025.tablasmvc;

import java.util.ArrayList;
import java.util.List;
/**
 * Clase encargada de generar la tabla de multiplicar.
 */
public class TablaMultiplicar {
	/**
	 * Número del que va a ser la tabla de multiplicar.
	 */
	private int numero;
	/**
	 * Lista donde se guardan los resultados de cada operación.
	 */
	private List<String> listaTextos;
	/**
	 * Construye la tabla de multiplicar
	 * @param numero el número al que pertenece la tabal de multiplicar
	 */
	public TablaMultiplicar(int numero) {
		this.numero = numero;
		this.listaTextos = new ArrayList<>();
	}
	
	/**
	 * Genera la tabla de multiplicar del número introducido (del 0 al 10).
	 * <p>
	 * Calcula cada operación y las formatea como cadenas de texto ejemplo ->("5 × 2 = 10") 
	 * y las almacena secuencialmente en la lista de textos creada.
	 * </p>
	 * 
	 * @see #listaTextos
	 */
	public void generarTabla() {
		for(int i = 0;i <= 10; i++) {
			int resultado;
			
			resultado = numero * i;
			
			String linea = String.format("%d × %d = %d", numero, i, resultado);
			listaTextos.add(linea);
		}
	}
	
	/**
	 * Proporciona una copia de los datos de la tabla.
	 * @return la lista sin formatear para exportar a archivo txt.
	 */
	public List<String> toListaExportacion(){
		return new ArrayList<>(listaTextos);
	}
	
	/**
	 * Da formato a la lista.
	 * @return La lista para que sea devuelta en pantalla
	 */
	public List<String> toListaPantalla(){
		
		return this.listaTextos;
	}
	
	/**
	 * Concatena todas las líneas de la tabla generada 
	 * y utiliza un salto de línea como separador.
	 */
	@Override
	public String toString() {
		return String.join("\n", toListaPantalla());
	}
	
	/**
	 * Devuelve el número activo de la tabla.
	 * @return el número de la tabla 
	 */
	public int getNumero() {
		return this.numero;
	}
}
