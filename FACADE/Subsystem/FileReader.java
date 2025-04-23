package Subsystem;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileReader {
        public String leer(String ruta) throws Exception {
        return new String(Files.readAllBytes(Paths.get(ruta)));
    }
}
