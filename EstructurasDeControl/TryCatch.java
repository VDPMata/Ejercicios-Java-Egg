package EstructurasDeControl;

import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        
    }
    // Ejercicio de división segura: Escribe un programa que solicite al usuario dos
    // números enteros y realice la división del primer número entre el segundo
    // número. Utiliza un bloque "try-catch" para manejar la excepción en caso de
    // que se intente realizar una división por cero. En caso de que se produzca la
    // excepción, muestra un mensaje adecuado en pantalla.
    public static void divisionSegura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2 = scanner.nextInt();
        scanner.close();
        try {
            int resultado = numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("No se puede dividir por cero");
        }
    }

    // Ejercicio de conversión de cadena a entero: Escribe un programa que solicite
    // al usuario una cadena de caracteres que represente un número entero. Utiliza
    // el método Integer.parseInt() para convertir la cadena a un número entero.
    // Utiliza un bloque "try-catch" para manejar la excepción en caso de que la
    // cadena ingresada no pueda ser convertida a un número entero. En caso de que
    // se produzca la excepción, muestra un mensaje adecuado en pantalla.
    public static void convertirCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres");
        String palabra = scanner.nextLine();
        scanner.close();
        try {
            int palabraNumero = Integer.parseInt(palabra);
            System.out.println("La cadena convertida es: " + palabraNumero);
        } catch (NumberFormatException e) {
            System.out.println("La palabra ingresada no puede ser transformada a tipo INT");
        }
    }

}
