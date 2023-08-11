package BuclesArrays;
import java.util.Arrays;

public class ArrayFor {
    public static void main(String[] args) {
       
    }

    // Imprimir elementos: Escribir un programa que recorra un array de enteros e
    // imprima cada elemento en una línea separada.
    public static void elementosArray() {
        int[] numeros = { 2, 15, 16, 32, 98, 45, 36, 25, 14, 39, 79, 75, 1 };
        for (int i = 0; i <= numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

    // Calcular suma acumulada: Escribir un programa que recorra un array de enteros
    // y calcule la suma acumulada de los elementos, reemplazando cada elemento por
    // la suma acumulada hasta ese punto.
    public static void sumaAcumulada() {
        int[] numeros = { 2, 15, 16, 32, 98, 45, 36, 25, 14, 39, 79, 75, 1 };
        int[] sumaAcumulada = new int[numeros.length];
        int suma = 0;
        System.out.println("El array original" + Arrays.toString(numeros));
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
            sumaAcumulada[i] = suma;
        }
        System.out.println("El array acumulado " + Arrays.toString(sumaAcumulada));
    }

    // Encontrar el valor mínimo: Escribir un programa que recorra un array de
    // enteros y encuentre el valor mínimo presente en el array.
    public static void minimoArray() {
        int[] numeros = { 2, 15, 16, 32, 98, 45, 36, 25, 14, 39, 79, 75, 1 };
        int minimo = 100;
        
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }
        System.out.println("El elemento menor es: " + minimo);
    }

    // Imprimir elementos en orden inverso: Escribir un programa que recorra un
    // array de enteros y los imprima en orden inverso, comenzando desde el último
    // elemento.
    public static void imprimirArrayInvertido() {
        int[] numeros = { 2, 15, 16, 32, 98, 45, 36, 25, 14, 39, 79, 75, 1 };
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("El elemento en numeros[" + i + "] es: " + numeros[i]);
        }
    }

    // Invertir un array: Escribir un programa que recorra un array de enteros y lo
    // invierta (es decir, el primer elemento pasa a ser el último y viceversa) y lo
    // imprima por consola.
    public static void invertirArray(){
        int[] numeros = { 2, 15, 16, 32, 98, 45, 36, 25, 14, 39, 79, 75, 1 };
        int[] numerosFinales = new int[numeros.length];
        int auxiliar = 0;
        int j = 0;
        for (int i = numeros.length - 1; i >= 0; i--) {
            auxiliar = numeros[i];
            numerosFinales[j] = auxiliar;
            j++;
        }
        System.out.println(Arrays.toString(numerosFinales));  
    }
}
