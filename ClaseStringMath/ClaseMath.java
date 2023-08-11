package ClaseStringMath;
import java.util.Scanner;

public class ClaseMath {
    public static void main(String[] args) {
        
    }

    // Ejercicio de cálculo del valor absoluto: Escribir un programa que solicite al
    // usuario un número entero y muestre en pantalla su valor absoluto utilizando
    // el método abs() de la clase Math.
    public static void absoluto() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int numero = scanner.nextInt();
        scanner.close();
        System.out.println(Math.abs(numero));
    }

    // Ejercicio de redondeo de números: Escribir un programa que solicite al
    // usuario un número decimal y muestre en pantalla su valor redondeado
    // utilizando el método round() de la clase Math.
    public static void redondeo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero don decimal");
        double decimal = scanner.nextDouble();
        scanner.close();
        System.out.println("el numero redondeado hacia abajo es: " + Math.floor(decimal));
        System.out.println("el numero redondeado al mas proximo es: " + Math.round(decimal));
        System.out.println("el numero redondeado hacia arriba es: " + Math.ceil(decimal));
    }

    // Ejercicio de generación de números aleatorios: Escribir un programa que
    // genere y muestre en pantalla un número aleatorio en el rango del 1 al 100
    // utilizando el método random() de la clase Math. Puedes utilizar el método
    // floor() para redondear el número aleatorio hacia abajo.
    public static void numeroRandom() {
        double random = Math.random() * 100;
        System.out.println("el random es: " + Math.floor(random));
    }

    // Ejercicio de cálculo de potencia: Escribir un programa que solicite al
    // usuario dos números enteros, representando la base y el exponente, y calcular
    // el resultado de elevar la base al exponente utilizando el método pow() de la
    // clase Math. Mostrar el resultado en pantalla.
    public static void calculoPotencia(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int base = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int exp = scanner.nextInt();
        scanner.close();
        System.out.println("El resultado es: " + Math.pow(base, exp));
    }

    // Ejercicio de cálculo de raíz cuadrada: Escribir un programa que solicite al
    // usuario un número positivo y calcule su raíz cuadrada utilizando el método
    // sqrt() de la clase Math. Si el número ingresado es negativo, mostrar un
    // mensaje adecuado en pantalla.
    public static void calculoRaiz(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo");
        int numero = scanner.nextInt();
        scanner.close();
        System.out.println("El resultado es: "+ Math.sqrt(numero));
    }
}
