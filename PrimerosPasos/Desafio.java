package PrimerosPasos;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

    }

    // Solicitar al usuario que ingrese un número y guardarlo en una variable.
    // Crear un programa que identifique si el número es par o impar.
    // Mostrar el resultado en la consola.
    public static void parOIpmar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = scanner.nextInt();
        if (num % 0 == 2) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
        scanner.close();
    }

    // Recibir dos números del usuario.
    // Declarar variables para almacenar los números y el resultado de la operación.
    // Permitir al usuario elegir qué operación quiere realizar.
    // Mostrar el resultado de la operación en la consola.
    public static void desafioOperaciones(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese otro numero");
        int numero2 = scanner.nextInt();

        System.out.println("********************");
        System.out.println("  Menu Calculadora  ");
        System.out.println("********************");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();

        scanner.close();

        switch (opcion) {
            case 1:
                System.out.println("La suma de ambos numeros es: " + (numero1 + numero2));
                break;
            case 2:
                System.out.println("La resta de ambos numeros es: " + (numero1 - numero2));
                break;
            case 3:
                System.out.println("la multiplicacion de ambos numeros es: " + (numero1*numero2));
                break;
            case 4:
                System.out.println("La division de ambos numeros es: " + (numero1/numero2));                
                break;                                            
            default:
                System.out.println("No ingresaste una opcion correcta");
                break;
        }
    }

    // otra forma de hacerlo...
    public static void operacionesArimeticas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int num2 = scanner.nextInt();

        System.out.println("******Menu******");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        System.out.println("3 Multiplicacion");
        System.out.println("4 Division");

        int opciones = scanner.nextInt();

        switch (opciones) {
            case 1 -> System.out.println(num1 + num2);

            case 2 -> System.out.println(num1 - num2);

            case 3 -> System.out.println(num1 * num2);

            case 4 -> System.out.println(num1 / num2);

            default -> System.out.println("no fue una opcion correcta");
        }
        scanner.close();
    }

}