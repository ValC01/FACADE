package Subsystem;


import java.nio.file.Files;
import java.nio.file.Paths;

public class FileWriter {
    public void escribir(String ruta, String contenido) throws Exception {
        Files.write(Paths.get(ruta), contenido.getBytes());
    }
}