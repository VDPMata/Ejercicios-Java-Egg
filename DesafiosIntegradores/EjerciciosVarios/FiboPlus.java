package DesafiosIntegradores.EjerciciosVarios;

import java.util.Arrays;
import java.util.Scanner;

public class FiboPlus {
    public static void main(String[] args) {
        fiboComplicado();
    }
    // Fibonacci plus
    // Basándote en el primer ejercicio, ahora crear un programa que solicite al
    // usuario ingresar la posición de un número en la serie de Fibonacci y mostrar
    // el valor correspondiente a esa posición.

    // 💡Recuerda que la serie de Fibonacci comienza con los siguientes valores:
    // Posición 0: 0
    // Posición 1: 1
    // Posición 2: 1
    // Posición 3: 2
    // Posición 4: 3
    public static void fiboComplicado(){
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        scanner.close();
        System.out.println("Ingrese la posicion del array que desea ver");
        int[] arrayFibo = new int[numero];
        arrayFibo[0] = 0;
        arrayFibo[1] = 1;
        for(int i = 2; i < arrayFibo.length; i++){
            arrayFibo[i] = arrayFibo[i-2] + arrayFibo[i-1];
        }
        System.out.println(Arrays.toString(arrayFibo));
        System.out.println("Posicion " + numero + ": " + arrayFibo[numero-1]);
    }

}
