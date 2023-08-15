package DesafiosIntegradores;

import java.util.Arrays;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        facto();
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
