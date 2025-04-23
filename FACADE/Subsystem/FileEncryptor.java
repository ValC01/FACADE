package Subsystem;

public class FileEncryptor {
    
    public String cifrar(String texto) {
        return new StringBuilder(texto).reverse().toString();  // método simple: invertir el texto
    }

    public String descifrar(String texto) {
        return new StringBuilder(texto).reverse().toString();  // se descifra igual
    }
}
