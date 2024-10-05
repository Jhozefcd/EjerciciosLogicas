import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Se hace un scanner para que el usuario pueda ingresar por teclado

        System.out.println("Ingrese un numero entero"); // Le pedimos al usuario que ingrese un numero entero
        int numero = sc.nextInt();

        if (numero > 0){ //Validamos el dato del usuario con una condicion para comprobar si el numero es positivo

            for (int i = 1; numero >= i; i++) { //Usamos el bucle for para recorrer todo los numeros con un contador
                System.out.print(i ); //imprimimos el contador para saber cuantos digitos tiene el numero
           
            }
        }

        else {
            System.out.println("Ingrese un numero entero positivo"); //En caso de que la condicion no se cumpla, imprimimos por pantalla al usuario que ingrese un numero positivo
        }
    }
}
