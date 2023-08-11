package EstructurasDeControl;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
    
    }

    // Ejercicio de calificación: Escribir un programa que solicite al usuario que
    // ingrese un número entre 0 y 100. Luego validar el numero ingresado en la
    // siguiente escala:
    // Si la puntuación está entre 90 y 100, muestra "A".
    // Si la puntuación está entre 80 y 89, muestra "B".
    // Si la puntuación está entre 70 y 79, muestra "C".
    // Si la puntuación está entre 60 y 69, muestra "D".
    // Si la puntuación es menor a 60, muestra "F".
    // Mostrar en consola el valor de la calificación obtenida.
    public static void calificacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero del 0 al 100");
        int numero = scanner.nextInt();
        if (numero >= 90 && numero <= 100) {
            System.out.println("A");
        } else if (numero >= 80 && numero <= 89) {
            System.out.println("B");
        } else if (numero >= 70 && numero <= 79) {
            System.out.println("C");
        } else if (numero >= 60 && numero <= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        scanner.close();
    }

    // Ejercicio de números positivos y negativos: Escribir un programa que solicite
    // al usuario un número y determine si es positivo, negativo o cero.
    // Mostrar el resultado en pantalla.
    public static void positivosNegativos() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        scanner.close();
        if (numero == 0) {
            System.out.println("El numero es cero");
        } else if (numero > 0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es negativo");
        }
    }

    // Ejercicio de divisibilidad: Escribir un programa que solicite al usuario un
    // número y determine si es divisible por 5 y por 3, por ninguno de los dos o
    // por ambos. Mostrar el resultado en pantalla.
    public static void divisibilidad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        scanner.close();

        if (numero % 5 == 0 && numero % 3 == 0) {
            System.out.println("El numero es divisible por ambos");
        } else if (numero % 5 == 0) {
            System.out.println("El numero es divisible por 5");
        } else if (numero % 3 == 0) {
            System.out.println("El numero es divisible por 3");
        } else {
            System.out.println("El numero no es divisible por ambos");
        }
    }

    // Ejercicio de verificación de contraseña: Escribir un programa que solicite al
    // usuario una contraseña y verifique si coincide con una contraseña
    // predefinida. Si la contraseña ingresada es correcta, mostrar un mensaje de
    // "Acceso concedido". De lo contrario, mostrar un mensaje de "Acceso denegado".
    public static void verificarContrasena() {
        String contraPredef = "asdf1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su contraseña");
        String contraIngresar = scanner.nextLine();
        scanner.close();
        if (contraIngresar.equals(contraPredef)) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
    }

    // Ejercicio de cálculo de descuento: Escribir un programa que solicite al
    // usuario el precio de un producto y determine si tiene derecho a un descuento.
    // Si el precio es mayor o igual a $100, aplicar un descuento del 10% y mostrar
    // el nuevo precio. De lo contrario, mostrar el precio original sin descuento.
    public static void descuento(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el precio");
        double precio = scanner.nextDouble();
        scanner.close();

        if(precio >= 100){
            System.out.println("El precio a pagar es: " + (precio*0.90) );
        }else{
            System.out.println("No le corresponde ningun descuento: "+ precio);
        }
    }
}
