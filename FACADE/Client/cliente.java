package Client;

import Facade.facade;

public class cliente {
    public static void main(String[] args) {
        String rutaArchivo = "test.txt";
        String mensajeOriginal = "¡Hola, patrón Facade en Java!";

        facade fachada = facade.obtenerInstancia();

        try {
            fachada.escribirArchivoCifrado(rutaArchivo, mensajeOriginal);
            String mensajeDescifrado = fachada.leerArchivoDescifrado(rutaArchivo);
            System.out.println("Contenido original recuperado: " + mensajeDescifrado);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}