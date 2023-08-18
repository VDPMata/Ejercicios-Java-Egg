package PrimerosPasos;
import java.util.Scanner;

public class PrimerosPasos {
    public static void main(String[] args){
        
    }

    // Crear un programa que imprima "Hola Mundo" en la consola.
    public static void holaMundo(){
        System.out.println("Hola Mundo");
    }

    // Crear un programa que imprima "Mi nombre es [tu nombre]" en la consola.
    public static void miNombre(){
        String nombre = "Mata";
        System.out.println("Hola " + nombre);
    }

    // Crear un programa que imprima "Mi edad es [edad]" en la consola.
    public static void miEdad(){
        int edad = 27;
        System.out.println("Mi edad es: " + edad);
    }

    // Crear una variable por cada uno de los siguientes tipos de dato:
    // boolean, char, String, Int, long, float
    // Imprimir en consola el contenido de al menos una de las variables que
    // creamos en el paso anterior.
    public static void tipoCaracteres(){
        boolean trueOrFalse = true;
        char character = '@';
        String palabra = "Hola";
        int numero = 1234;
        long numeroLargo = 123456789012345L;
        float numeroDecimal = 12.20f;
        System.out.println(trueOrFalse);
        System.out.println(character);
        System.out.println(palabra);
        System.out.println(numero);
        System.out.println(numeroLargo);
        System.out.println(numeroDecimal);
    }

    // Declarar una variable para edad y otra para nombre e imprimir en pantalla
    // un texto que diga “Mi nombre es [nombre], y tengo [edad] años”.
    public static void saludoNombreEdad(){
        String nombre = "Mata";
        int edad = 27;
        System.out.println("Mi nombre es "+ nombre + ", y tengo " + edad + " años");
    }

    // Solicitar al usuario que ingrese su nombre, guardarlo en una variable e
    // imprimir el dato.
    public static void nombreSaludo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Hola " + nombre);
        scanner.close();
    }

    // Solicitar al usuario que ingrese un número, guardarlo en una variable e
    // imprimir el dato.
    public static void edad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("Su edad es: " + edad);
        scanner.close();
    }

    // Solicitar al usuario su nombre, luego solicita su edad e imprime en pantalla
    // un mensaje que diga “Su nombres es [nombre del usuario] y su edad es [edad
    // del usuario]”
    public static void nombreEdad(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre\n");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        System.out.println("Su nombres es: " + nombre + "\ny su edad es: " + edad);
        scanner.close();
    }

    // Dados dos números, realizar las 5 operaciones posibles en Java y mostrar el
    // resultado en consola.
    public static void operaciones(){
        int num1 = 8;
        int num2 = 4;

        System.out.println("La suma es: " + (num1 + num2));
        System.out.println("La resta es: " + (num1 - num2));
        System.out.println("La division es: " + (num1 / num2));
        System.out.println("La multiplicacion es: " + (num1 * num2));
        System.out.println("El modulo es: " + (num1 % num2));
    }

    // Pedir al usuario que ingrese dos números, guardarlos en una variable,
    // realizar la suma de los números y mostrar el resultado en la consola.
    public static void ingresarNumeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();
        System.out.println("La suma de ambos numeros es: " + (num1 + num2));
        scanner.close();
    }

    // Pedir al usuario que introduzca dos números, y:
    // Comparar si número 1 es mayor a número 2.
    // Entender si número 1 es distinto a número 2.
    // Entender si número 1 es divisible por 2.
    public static void compararNumeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();
        scanner.close();
        if (num1 > num2) {
            System.out.println("El numero " + num1 + " es mayor al numero" + num2);
        }
        if (!(num1 == num2)) {
            System.out.println("El numero " + num1 + " es distinto al numero" + num2);
        }
        if (num1 % num2 == 0) {
            System.out.println("El numero " + num1 + " es divisible por el numero" + num2);
        }
    }

    // Pedir al usuario que ingrese 4 números y comparar:
    // Si el número 1 es mayor al número 2 y si el número 3 es mayor al número 4.
    // Si el número 1 es mayor al número 2 o si el número 3 es mayor al número 4.
    public static void pedirCuatroNumeros(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese el tercer numero");
        int num3 = scanner.nextInt();
        System.out.println("Ingrese el cuarto numero");
        int num4 = scanner.nextInt();
        if (num1 > num2 && num3 > num4) {
            System.out.println("El numero " + num1 + " es mayor al numero " + num2 + " y el numero " + num3
                    + " es mayor al numero " + num4);
        }
        if (num1 > num2 || num3 > num4) {
            System.out.println("El numero " + num1 + " es mayor al numero " + num2 + " o el numero " + num3
                    + " es mayor al numero " + num4);
        } else {
            System.out.println("Ninguna condicion se cumple");
        }
        scanner.close();
    }
}