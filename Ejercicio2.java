
    import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creamos un scanner para que el usuario ingrese por teclado
        System.out.println("Introduce una cadena de texto:"); // Imprimimos por teclado que el usuario ingrese una cadena de texto
        String cadena = sc.nextLine(); 
        
        // Eliminamos los espacios al inicio y al final, y dividimos la cadena por uno o más espacios.
        String[] palabras = cadena.trim().split("\\s+");
        
        // Si la cadena está vacía después de eliminar los espacios, el número de palabras es 0.
        int contadorPalabras = (cadena.trim().isEmpty()) ? 0 : palabras.length;
        
        System.out.println("Número de palabras: " + contadorPalabras); // Imprimimos por pantalla el numero de palabras y el contador de palabras
    }
}


