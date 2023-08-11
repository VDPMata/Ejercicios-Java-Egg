package ClaseStringMath;
import java.util.Scanner;

public class ClaseString {
    public static void main(String[] args) {
        
    }

    // Ejercicio de longitud de cadena: Escribir un programa que solicite al usuario
    // una cadena de texto y muestre en pantalla la longitud de la cadena utilizando
    // el método length() de la clase String.
    public static void longitudCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto");
        String cadena = scanner.nextLine();
        scanner.close();
        System.out.println(cadena.length());
    }

    // Ejercicio de concatenación de cadenas: Escribir un programa que solicite al
    // usuario su nombre y apellido por separado, y luego muestre en pantalla el
    // nombre completo utilizando el método concat() de la clase String.
    public static void concatenarCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido");
        String apellido = scanner.nextLine();
        scanner.close();
        String nombreCompleto = nombre.concat(" ").concat(apellido);

        System.out.println("Nombre completo " + nombreCompleto);
    }

    // Ejercicio de extracción de subcadena: Escribir un programa que solicite al
    // usuario una frase y dos números enteros, representando un índice inicial y un
    // índice final. Utilizar el método substring() de la clase String para extraer
    // la subcadena que se encuentra entre los índices ingresados por el usuario, y
    // mostrar la subcadena resultante en pantalla.
    public static void extSubcadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una frase");
        String frase = scanner.nextLine();
        System.out.println("Ingrese un indice");
        int index1 = scanner.nextInt();
        System.out.println("Ingrese el otro indice");
        int index2 = scanner.nextInt();
        scanner.close();
        String subCadena = frase.substring(index1, index2);
        System.out.println(subCadena);
    }

    // Ejercicio de búsqueda de caracteres: Escribir un programa que solicite al
    // usuario una palabra y un carácter, y determine si el carácter ingresado se
    // encuentra en la palabra utilizando el método indexOf() de la clase String.
    // Mostrar un mensaje adecuado en pantalla indicando si el carácter se encuentra
    // o no en la palabra.
    public static void busquedaCaracteres(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra = scanner.nextLine();
        System.out.println("Ingrese un caracter");
        char caracter = scanner.next().charAt(0); // debo revisar esto
        scanner.close();
        int indice = palabra.indexOf(caracter);

        if(indice>=1){
            System.out.println("El caracter se encuentra dentro de la palabra en el indice: " + indice);
        }else{
            System.out.println("El caracter no se encuentra");
        }
    }

    // Ejercicio de conversión de mayúsculas y minúsculas: Escribir un programa que
    // solicite al usuario una cadena de texto y muestre en pantalla la misma
    // cadena, pero con todos los caracteres en mayúsculas o minúsculas. Utilizar
    // los métodos toUpperCase() y toLowerCase() de la clase String para realizar la
    // conversión.
    public static void mayusMinus(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto");
        String cadena = scanner.nextLine();
        scanner.close();
        System.out.println(cadena.toUpperCase());
        System.out.println(cadena.toLowerCase());
    }
}