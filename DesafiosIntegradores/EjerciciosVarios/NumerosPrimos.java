package DesafiosIntegradores.EjerciciosVarios;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        primos();
    }
    // Números primos
    // Solicitar al usuario que introduzca un número y verificar si es primo
    // utilizando un bucle do-while.
    // 💡 Un número es primo si solo tiene dos divisores: 1 y él mismo.
    // Si el número no es primo, pedir al usuario que introduzca otro número hasta
    // que introduzca un número primo.

    public static void primos(){
        Scanner scanner = new Scanner(System.in);
        boolean bandera = false;
        int numero = scanner.nextInt();

        do {
            if(numero == 1 || numero == 3 || numero == 5){
                System.out.println("El " + numero + " es primo");
                bandera = true;

            }else if(numero % 2 == 0 || numero % 3 == 0 || numero % 5 == 0){
                System.out.println("El numero " + numero + " no es primo");
                System.out.println("Ingrese otro numero\n");
                numero = scanner.nextInt();

            }else{
                System.out.println("El " + numero + " es primo");
                bandera = true;
            }  
        } while (!bandera);
        scanner.close();
    }
}
