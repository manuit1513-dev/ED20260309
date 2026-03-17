package jcolonia.daw2025.tablasmvc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

/**
 * Clase encargada de la persistencia de datos en el sistema de archivos.
 * Sigue el principio de responsabilidad única del modelo MVC.
 */
public class ExportacionArchivo {
    /**
     * Path de la referencia del archivo
     */
    private Path refArchivo;
    
    /**
     * Constructor que inicializa la ruta del archivo.
     * @param rutaArchivo Cadena de texto con la ruta (ej: "tablas.txt").
     */
    public ExportacionArchivo(String rutaArchivo) {
        this.refArchivo = Path.of(rutaArchivo);
    }
    
    /**
     * Guarda una lista de cadenas de texto en el archivo configurado.
     * Utiliza un bloque try-catch para gestionar posibles errores de E/S.
     * @param contenidos Lista de strings (las líneas de la tabla de multiplicar).
     */
    public void guardar(List<String> contenidos) {
    	 try {

    	        Files.write(this.refArchivo, contenidos);

    	        System.out.println("¡Datos guardados correctamente en: " + this.refArchivo);
    	        
    	    } catch (IOException e) {
    	        System.err.println("Error al intentar guardar el archivo: " + e.getMessage());
    	    }
    	
    }
}