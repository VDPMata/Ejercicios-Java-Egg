package BuclesArrays;
import java.util.Arrays;

public class ArrayForEach {
    public static void main(String[] args) {
        concatenada();
    }

    // Contar elementos pares: Escribir un programa que cree una variable de tipo
    // array que contenga 10 elementos de tipo entero, inicializandolos con números
    // aleatorios menores a 100 y luego imprimir por consola sus elementos.
    public static void contarPares() {
        int[] numeros = new int[10];
        int contadorPares = 0;
        int contadorImpares = 0;
        int contadorCeros = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 100);
            if (numeros[i] == 0) {
                contadorCeros++;
            } else if (numeros[i] % 2 == 0) {
                contadorPares++;
            } else {
                contadorImpares++;
            }
        }
        for (int element : numeros) {
            System.out.println(element + " ");
        }
        System.out.println("Los elementos a contar: " + Arrays.toString(numeros));
        System.out.println("La cantidad de pares es: " + contadorPares);
        System.out.println("La cantidad de impares es: " + contadorImpares);
        if (contadorCeros > 0) {
            System.out.println("La cantidad de ceros: " + contadorCeros);
        }
    }

    // Calcular promedio: Crear un array de 20 elementos de tipo float, inicializar
    // con los números que prefiera y sumar todos los elementos del array de números
    // reales y calcular su promedio e imprimir en consola el resultado de la suma y
    // el resultado del promedio de los elementos.
    public static void calcularPromedio() {
        float[] numeros = { 10.5f, 20.2f, 15.7f, 8.9f, 12.0f, 6.3f, 18.6f, 25.0f, 30.8f, 22.1f,
                9.4f, 16.7f, 11.2f, 7.5f, 14.3f, 21.9f, 27.6f, 24.4f, 33.2f, 19.8f };
        float suma = 0;
        for (float elemento : numeros) {
            suma += elemento;
        }

        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + (suma / numeros.length));
    }

    // Concatenar elementos: Crear un array del tamaño que prefiera que contenga
    // elementos de tipo cadena y concatenar los elementos en una sola cadena
    // separada por espacios e imprimirlo en consola.
    public static void concatenada() {
        String[] arrCon = { "Crear", "un", "array", "del", "tamaño", "que", "prefiera", "que", "contenga", "elementos",
                "de", "tipo", "cadena", "y", "concatenar", "los", "elementos", "en", "una", "sola", "cadenaseparada",
                "por", "espacios", "e", "imprimirlo", "en", "consola" };
        String concatenada = "";
        for (String elemento : arrCon) {
            concatenada += elemento + " ";
        }
        System.out.println(concatenada);
    }
    // Contar ocurrencias: Escribir un programa que cree una variable de tipo array
    // que contenga 50 elementos de tipo caracter, inicializar el array con alguna
    // frase elegida y solicitar al usuario un carácter objetivo, y contar cuántas
    // veces aparece el carácter objetivo en el array e imprimirlo por consola. Por
    // ejemplo, si el array que tenemos contiene la siguiente frase:

    // Si alguien lo entendio me lo hace saber...
}
