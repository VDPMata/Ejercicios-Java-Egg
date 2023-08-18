package Metodos;

import java.util.Arrays;
import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular su factorial");
        int num = sc.nextInt();
        System.out.println("El factorial de " + num + " es " + factorialRecursivo(num));
        sc.close();
    }

    // Factorial y recursividad: Crea un método llamado "factorial()" que tome un
    // parámetro de tipo "int" y devuelva un valor entero que corresponda al cálculo
    // del factorial del número proporcionado. Posteriormente, intenta modificar la
    // lógica para resolverlo de manera recursiva.
    public static int factorialRecursivo(int objetivo) {
        if ((objetivo == 0) || (objetivo == 1)) {
            return 1;
        }
        return objetivo * factorialRecursivo(objetivo - 1);
    }

    // Factorial
    // Escribir un programa que solicite al usuario un número y calcule su factorial
    // utilizando un bucle do-while.
    // 💡 El factorial de un número es el producto de todos los números desde 1
    // hasta ese número. Te compartimos algunos ejemplos:  
    // El factorial de 3 es 1 * 2 * 3 = 6.
    // El factorial de 5 es 1 * 2 * 3 * 4 * 5 = 120.
    // El factorial de 7 es 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5040.
    // ✨ Estos ejercicios son complementarios. Esto quiere decir que te ayudarán a
    // avanzar en profundidad en el tema visto, pero no son obligatorios.
    
    public static void facto(){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();
        int multiplicador = 1;
        int[] arrayNumeros = new int[numero];
        for (int i = 0; i < arrayNumeros.length ; i++) {
            arrayNumeros[i] = (i+1);
        }
        System.out.println(Arrays.toString(arrayNumeros));
        for (int elemento : arrayNumeros) {
            multiplicador *=elemento;
        } 
        System.out.println("El factorial de: " + numero + " es: " + multiplicador);
    }

}
    
