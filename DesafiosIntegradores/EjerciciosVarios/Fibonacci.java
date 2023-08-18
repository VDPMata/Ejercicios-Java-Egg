package DesafiosIntegradores.EjerciciosVarios;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        fibo();
    }

    // Fibonacci
    // Escribir un programa que imprima los primeros 8 términos de la serie de
    // Fibonacci utilizando un bucle while. La serie de Fibonacci es una secuencia
    // donde cada número es la suma de los dos anteriores.
    // La serie de Fibonacci comienza de la siguiente manera:
    // Posición 0: 0
    // Posición 1: 1
    // Posición 2: 1 (suma de la posición 0 y la posición 1, 0 + 1 = 1)
    // Posición 3: 2 (suma de la posición 1 y la posición 2, 1 + 1 = 2)
    // Posición 4: 3 (suma de la posición 2 y la posición 3, 1 + 2 = 3)
    // Entonces, los primeros 5 términos (considerando el índice inicial 0) de la
    // serie de Fibonacci son: 0, 1, 1, 2, 3.

    // Ejercicio que podemos hacerlo sin un do-while... Iniciamos el array con las posiciones
    // Posicion 0: 0
    // Posicion 1: 1
    // Hacemos esto por la regla de fibonacci que inicia en 0 
    public static void fibo(){
        int[] arrayFibo = {0,1,0,0,0,0,0,0};
        int bandera = 0;

        do {
           for (int i = 2 ; i < arrayFibo.length; i++) {
            arrayFibo[i] = arrayFibo[i-2] + arrayFibo[i-1];
           }
        } while (bandera<=8);
        System.out.println(Arrays.toString(arrayFibo));
    }
}