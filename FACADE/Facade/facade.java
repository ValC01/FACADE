package Facade;

import Subsystem.FileReader;
import Subsystem.FileWriter;
import Subsystem.FileEncryptor;

public class facade {
    private static facade instancia;
    private FileReader lector;
    private FileWriter escritor;
    private FileEncryptor cifrador;

    private facade() {
        lector = new FileReader();
        escritor = new FileWriter();
        cifrador = new FileEncryptor();
    }

    public static facade obtenerInstancia() {
        if (instancia == null) {
            instancia = new facade();
        }
        return instancia;
    }

    public void escribirArchivoCifrado(String ruta, String contenido) throws Exception {
        String cifrado = cifrador.cifrar(contenido);
        escritor.escribir(ruta, cifrado);
    }

    public String leerArchivoDescifrado(String ruta) throws Exception {
        String cifrado = lector.leer(ruta);
        return cifrador.descifrar(cifrado);
    }
}
