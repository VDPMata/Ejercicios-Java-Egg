package BuclesArrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysNoFor {
    public static void main(String[] args) {
        
    }

    // Suma de elementos: Escribir un programa en el cual se cree una variable de
    // tipo array que contenga 3 elementos de tipo entero e imprimir por consola la
    // suma de todos sus elementos, sin usar el bucle for.
    public static void sumaArray() {
        int[] numeros = { 5, 18, 20 };
        int suma = (numeros[0] + numeros[1] + numeros[2]);
        System.out.println("La suma de los elementos es: " + suma);
    }

    // Promedio de elementos: Escribir un programa en el cual se cree una variable
    // de tipo array que contenga 3 elementos de tipo entero e imprima por consola
    // el promedio de todos sus elementos, sin usar el bucle for.
    public static void promedioArray() {
        double[] numeros = { 6, 18, 20 };
        double suma = numeros[0] + numeros[1] + numeros[2];
        System.out.println("El promedio del array es: " + (suma / numeros.length));
    }

    // Encontrar el máximo: Escribir un programa en el cual se cree una variable de
    // tipo array que contenga 3 elementos de tipo entero y devuelva el valor máximo
    // presente en el array, sin usar el bucle for.
    public static void maximoArray() {
        int[] numeros = { 1, 25, 2 };
                //indice   0    1   2
        if(numeros[0] > numeros[1] && numeros[0] > numeros [2]){
            System.out.println(numeros[0]);
        }else if(numeros[1] > numeros[0] && numeros[1] > numeros[2]){
            System.out.println(numeros[1]);
        }else{
            System.out.println(numeros[2]);
        }
    }

    // Buscar un elemento: Escribir un programa en el cual se 
    // cree una variable de tipo array que contenga 3 elementos de tipo entero 
    // solicite un número al usuario, 
    // e imprima por consola si está presente en el array o no, sin usar el
    // bucle for.
    public static void buscarElemento(){
    int[] pepitos = {3, 123, 27};
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ingrese un numero ");
    int numeroIngresado = scanner.nextInt();
    scanner.close();
    if(numeroIngresado == pepitos[0] || numeroIngresado == pepitos[1] || numeroIngresado == pepitos[2]){
        System.out.println("El numero ingresado se encuentra dentro del array:  " + numeroIngresado);
    }else {
        System.out.println("El numero ingresado no se encuentra");
    }
    }

    // Copiar elementos: Escribir un programa que cree un array de 3 enteros y cree
    // una copia del mismo pero con un tamaño extra de 2 elementos, imprimiendo el
    // contenido del nuevo array por consola, sin usar el bucle for.
    public static void copiarArray(){      
        int[] numeros = { 12 , 52 , 27 };
        int[] numeros2 = Arrays.copyOf(numeros, numeros.length + 2);
        System.out.println("Este es el primer array " + numeros.length + " y este es el segundo " + numeros2.length);
        System.out.println(numeros2[0]);
        System.out.println(numeros2[1]);
        System.out.println(numeros2[2]);
        System.out.println(numeros2[3]);
        System.out.println(numeros2[4]);
    }
    
    
    // Ordenar elementos: Escribir un programa que solicite al usuario 4 nombres, lo
    // cuales debes ordenar alfabeticamente y luego imprimirlos en consola, sin usar
    // el bucle for.
    public static void nombresArray(){
        Scanner miScanner = new Scanner(System.in);
        String[] nombres = new String[4];
        System.out.println("Ingrese 4 nombres (Presione Enter entre cada nombre): ");
        nombres[0] = miScanner.nextLine();
        nombres[1] = miScanner.nextLine();
        nombres[2] = miScanner.nextLine();
        nombres[3] = miScanner.nextLine();
        miScanner.close();

        Arrays.sort(nombres);//ordena el array
        
        System.out.println();
        System.out.println(nombres[0]);
        System.out.println(nombres[1]);
        System.out.println(nombres[2]);
        System.out.println(nombres[3]);   
    }

    
}