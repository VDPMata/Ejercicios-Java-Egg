package DesafiosIntegradores;

import java.util.Arrays;
import java.util.Scanner;

public class NumerosPrimosPlus {
    public static void main(String[] args) {
        numerosPlus();
    }

    // Números primos plus
    // Siguiendo el ejemplo del tercer ejercicio, el desafío ahora es desarrollar un
    // programa que solicite al usuario la cantidad deseada de números primos a
    // obtener.

    // El programa debe generar y mostrar la cantidad de números primos solicitada
    // por el usuario.
    public static void numerosPlus(){
        Scanner scanner = new Scanner(System.in);
        int contador = scanner.nextInt();

        int numeroPrimo = 2;
        int[] arrayPrimos = new int[contador];
        for(int i = 0 ; i < contador; i++){
            if(numeroPrimo == 2 || numeroPrimo == 3 || numeroPrimo == 5){
                arrayPrimos[i] = numeroPrimo; 
                numeroPrimo++; 
            }else if(numeroPrimo % 2 == 0 || numeroPrimo % 3 == 0 || numeroPrimo % 5 == 0){
                numeroPrimo++;
                i--;
            }else{
                arrayPrimos[i] = numeroPrimo;
                numeroPrimo++;
            }
        }
        System.out.println(Arrays.toString(arrayPrimos));
        scanner.close();
    }
}