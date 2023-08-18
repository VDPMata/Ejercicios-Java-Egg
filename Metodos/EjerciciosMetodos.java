package Metodos;

import java.util.Scanner;

public class EjerciciosMetodos {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Hola mi nombre es: " + obtenerNombre() + " y tengo " + obtenerEdad() + " años");
    }

    // Obtener datos: Crea dos métodos para obtener el nombre y la edad,
    // respectivamente. Ambos métodos deben recibir por parámetro un objeto de tipo
    // "Scanner".
    public static String obtenerNombre() {
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        return nombre;
    }

    public static int obtenerEdad() {
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        return edad;
    }

    // Adivinar el número: Basándose en el ejercicio que ya has realizado, crea
    // un método "numeroAleatorio()" que reciba por parámetro dos variables de tipo
    // "int": un número máximo y un número mínimo. El método debe generar y devolver
    // un número aleatorio dentro del rango especificado.
    
}
