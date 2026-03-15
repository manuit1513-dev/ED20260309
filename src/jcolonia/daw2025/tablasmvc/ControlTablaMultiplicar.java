package jcolonia.daw2025.tablasmvc;

import java.util.Arrays;
import java.util.List;

/**
* Núcleo de aplicación de consola de texto con menús. Aplicación
* de texto usando tablas de multiplicar infantiles clásicas. 
*/
public class ControlTablaMultiplicar {
	/**
	 * Formato tipo «printf» para las opciones del menú principal.
	*/
	private static final String[] OPCIONES_MENU_PRINCIPAL = {
			"Mostrar tabla", "Cambiar tabla", "Exportar tabla"};
	
	/**
	 * Formato tipo «printf» para el nombre del archivo de
	 * exportación.
	 */
	public static final String FORMATO_RUTA_ARCHIVO_EXPORTACIÓN=
		"tabla del %02d.txt";
	
	/** Tabla de multiplicar activa. */
	private TablaMultiplicar tabla;
	
	/**
	 * Varibale para crear nuevas vistas generales
	 */
	private VistaGeneral vista;

	/**
	 * 
	 */
	public ControlTablaMultiplicar(){
		vista  =  new VistaGeneral();
		init();
	}


	/**
	* Pide al usuario un número y prepara la primera
	* tabla activa.
	*/
	public void init(){
		cambiarTabla();
	}

	/**
	* Gestión del menú principal. Desde este menú
	* se ejecutan las opciones disponibles a elección del usuario.
	* A la salida del menú se finaliza el programa.
	*/
	public void buclePrincipal(){
		VistaMenu menú;
		int opción;
		
		menú=new VistaMenu("Tablas de multiplicar",Arrays.asList(OPCIONES_MENU_PRINCIPAL));
		
		do{
			menú.mostrarOpciones();
			opción=menú.pedirOpcion();
			
			switch(opción){
			case 1: // Mostrar tabla
				mostrarTabla();
				break;
			case 2: //Cambiar tabla
				cambiarTabla();
				break;
			case 3: // Exportar tabla
				exportarTabla();
				break;
			case 0: // Salir
				break;
			default: // Opciones no implementadas
				opciónNoDisponible();
				break;
			}
			
		} while (opción!=0);
		
		VistaGeneral vistaGeneral = new VistaGeneral();
		vistaGeneral.mostrarAviso("FIN");
		
	}
	
	/**
	* Muestra por pantalla -envía a la salida estándar-
	* los productos correspondientes a la tabla activa.
	*/
	private void mostrarTabla(){
		if (tabla == null) {
			vista.mostrarAviso("No hay ninguna tabla activa. Seleccione 'Cambiar tabla' primero.");
			return;
		}

		List<String> lineas = tabla.toListaPantalla();
		
		vista.mostrarLista(lineas);
		
		vista.pausa("Presione Intro para continuar...");
	}
	
	/**
	* Cambia la tabla activa por otra elegida por el usuario.
	*/
	private void cambiarTabla(){
		int n;
		
		n = vista.pedirNumero("Introduzca el número para la tabla: ");
		
		tabla=new TablaMultiplicar(n);
		tabla.generarTabla();
	}

	/**
	* Envía a un archivo
	* los productos correspondientes a la tabla activa.
	*/
	private void exportarTabla(){
		if (tabla == null) {
			vista.mostrarAviso("No hay datos para exportar.");
			return;
		}
		
		List<String> datosLimpios = tabla.toListaExportacion();
		
		String mensajeExportación = String.format("Exportando %d lineas...", datosLimpios.size());
		
		vista.mostrarTexto(mensajeExportación);
	}
	
	/**
	 * Muestra un mensaje de aviso indicando que 
	 * la opción elegida no está disponible.
	*/
	private void opciónNoDisponible(){
		vista.mostrarAviso("La opción introducida no es válida. Por favor, elige un número del menú.");
	    
	    vista.pausa("Presione Intro para reintentar...");
	}
}