package ClaseArray;

import java.util.Arrays;
import java.util.Scanner;

public class ClaseArray {
    public static void main(String[] args) {
        rellenarArray();
    }

    // Ordenar en forma descendente: Escribir un programa en el cual se declare una
    // variable array que contenga 10 elementos de tipo entero,inicializar el
    // arreglo con valores aleatorios entre 1 y 100, imprimir por consola el arreglo
    // inicial y luego ordenar el arreglo de enteros en forma descendente utilizando
    // el método Arrays.sort(). y luego imprimirlos ordenados en la consola.
    public static void ordenDescendente() {
        int[] numeros = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
        }
        System.out.println(Arrays.toString(numeros));
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length / 2; i++) {
            int auxiliar = numeros[i];
            numeros[i] = numeros[numeros.length - 1 - i];
            numeros[numeros.length - 1 - i] = auxiliar;
        }
        System.out.println(Arrays.toString(numeros));
    }

    // Búsqueda binaria: La búsqueda binaria es un algoritmo eficiente para
    // encontrar un elemento en una lista ordenada de elementos. La clase Arrays ya
    // tiene su implementación mediante el método binarySearch(). Escribir un
    // programa que realice una búsqueda binaria en un arreglo ordenado de enteros
    // utilizando el método Arrays.binarySearch(). El programa debe imprimir el
    // arreglo generado originalmente, solicitar al usuario el valor buscado, e
    // imprimir el índice del valor buscado si está presente en el arreglo.
    public static void binarySearch() {
        int[] numeros = { 2, 15, 16, 32, 98, 45, 36, 25, 14, 39, 79, 75, 1 };
        Arrays.sort(numeros);
        System.out.println(Arrays.toString(numeros));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un elemento a buscar");
        int elementoBuscado = scanner.nextInt();
        scanner.close();
        int indice = Arrays.binarySearch(numeros, elementoBuscado);
        if (indice >= 0) {
            System.out.println("El valor " + elementoBuscado + " Se encuentra en el indice: " + (indice + 1));
        } else {
            System.out.println("El valor no se encuentra dentro del Array");
        }
    }

    // Comparar arreglos: Escribir un programa que compare dos arreglos de enteros
    // utilizando el método Arrays.equals(). El programa debe imprimir si los
    // arreglos son iguales o no.
    public static void compararArrays() {
        int[] array1 = { 1, 25, 36, 98 };
        int[] array2 = { 1, 25, 36, 98 };
        int[] array3 = { 1, 63, 78, 98 };
        if (Arrays.equals(array1, array2)) {
            System.out.println("Los array1 y array2 son iguales");
        } else {
            System.out.println("Los array1 y array2 NO son iguales");
        }
        if (Arrays.equals(array1, array3)) {
            System.out.println("Los array1 y array3 son iguales");
        } else {
            System.out.println("Los array1 y array3 NO son iguales");
        }
    }

    // Copiar parte de un arreglo: Crear un programa en Java que declare y muestre
    // un arreglo de enteros junto con sus índices. Luego, el programa debe
    // solicitar al usuario dos índices: un índice inicial y un índice final. Con
    // estos dos índices, el programa debe copiar la parte del arreglo original
    // comprendida entre estos dos índices (inclusive) en un nuevo arreglo
    // utilizando el método Arrays.copyOfRange(). Asegúrese de incluir validaciones
    // para confirmar que el índice inicial es menor que el índice final y que ambos
    // índices estén dentro del rango válido del arreglo original. Finalmente, el
    // programa debe imprimir el nuevo arreglo por consola.
    public static void copiarArray() {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = { 2, 15, 16, 32, 98, 45, 36, 25, 14, 39, 79, 75, 1 };
        System.out.println("Ingrese el indice inicial entre 0 y " + (numeros.length - 1));
        int indiceInicial = scanner.nextInt();
        System.out.println("Ingrese el indice final entre " + indiceInicial + " y" + (numeros.length - 1));
        int indiceFinal = scanner.nextInt();
        scanner.close();
        int[] numeros2 = Arrays.copyOfRange(numeros, indiceInicial, (indiceFinal + 1));
        System.out.println(Arrays.toString(numeros2));
    }

    // Vamos a escribir un programa que solicite al usuario el
    // tamaño para un arreglo y un número entero con el que quiera rellenarlo. Luego
    // deberás crear el arreglo y usar Arrays.fill(). Finalmente, imprima el arreglo
    // resultante.
    public static void rellenarArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array");
        int tamano = scanner.nextInt();
        System.out.println("Ingrese un numero para rellenar");
        int numero = scanner.nextInt();
        scanner.close();
        int[] arrayNumeros = new int[tamano];
        Arrays.fill(arrayNumeros, numero);
        System.out.println(Arrays.toString(arrayNumeros));
    }
    // Rellenar un arreglo de manera personalizada: Escribir un programa en Java que
    // realice lo siguiente:
    // Solicite al usuario un tamaño para un arreglo.
    // Luego, debe pedirle que ingrese un número con el cual desea rellenar el array
    // Solicitar el índice hasta el cuál quiere rellenar el array con el número
    // anterior.
    // El array deberá ser rellenado con el número proporcionado hasta el índice
    // ingresado por el usuario.
    // Asegúrese de validar lo siguiente:
    // La primera vez que se pide al usuario un número para rellenar el arreglo, el
    // índice inicial debe ser 0.
    // Si el índice ingresado no es el índice del último elemento del arreglo, el
    // programa debe continuar pidiendo al usuario nuevos números e índices para
    // rellenar el arreglo.
    // El índice siempre debe ser menor que el tamaño total del arreglo.
    // Cada vez que se solicita un nuevo número para rellenar el arreglo, el índice
    // ingresado debe ser mayor que el último índice ingresado, a su vez se debe
    // rellenar el array con el nuevo número desde el indice anterior hasta el nuevo
    // índice.
    
}
