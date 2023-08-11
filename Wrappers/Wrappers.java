package Wrappers;

import java.util.Scanner;

public class Wrappers {
    public static void main(String[] args) {
        cuentaDigitos();
    }

    // Suma de números: Pide al usuario que ingrese un string que represente un
    // entero, y luego un string que represente un doble. Convierte cada cadena al
    // tipo de dato correspondiente usando los métodos valueOf, suma sus valores e
    // imprímelos por consola.
    public static void sumaNumeros() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de tipo entero");
        String numeros = scanner.nextLine();
        System.out.println("Ingrese un numero de tipo double");
        String numeroDecimal = scanner.nextLine();
        scanner.close();
        int numeroConvertido = Integer.valueOf(numeros);
        double numeroDecimalConvertido = Double.parseDouble(numeroDecimal);
        System.out.println("El numero convertido es: " + numeroConvertido + " y " + numeroDecimalConvertido);
    }

    // Conversión de cadena a número: Escribir un programa que lea un dato tipo
    // cadena pero que represente un número entero como entrada utilizando la clase
    // Scanner, y luego convierta la cadena en un número entero utilizando la clase
    // de envoltura Integer.
    public static void convertirCadena() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        String numeroString = scanner.nextLine();
        scanner.close();
        int numeroInt = Integer.parseInt(numeroString);
        int suma = 5;
        System.out.println("El numero convertido y con suma es: " + (numeroInt + suma));
    }

    // Verificar si una cadena contiene solo letras: Pide al usuario que ingrese una
    // cadena. Crea un bucle que recorra cada carácter en la cadena y use
    // Character.isLetter() para verificar si todos los caracteres son letras.
    // Muestra un mensaje al usuario indicando si la cadena contiene solo letras o
    // no.
    public static void verificarLetras(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres");
        String cadena = scanner.nextLine();
        scanner.close();
        boolean bandera = true;
        for (int i = 0; i < cadena.length(); i++) {
            if(!Character.isLetter(cadena.charAt(i)) && !Character.isWhitespace(cadena.charAt(i))){
                bandera = false;
                break;
            }
            
        }
        if(bandera){
             System.out.println("Contiene solo letras");
         }else{
             System.out.println("no contiene solo letras");
         }  
    }

    // Cuenta espacios en blanco en una cadena: Pide al usuario que ingrese una
    // cadena. Crea un bucle que recorra cada carácter en la cadena y use
    // Character.isWhitespace() para contar el número de espacios en blanco en la
    // cadena. Muestra el recuento al usuario.
    public static void contadorEspacios(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de caracteres");
        String cadena = scanner.nextLine();
        int contador = 0;
        scanner.close();
        for (int i = 0; i < cadena.length(); i++) {
            if(Character.isWhitespace(cadena.charAt(i))){
                contador++;
            }
        }
        System.out.println("La cantidad de espacios en blanco es: " + contador);
    }

    // Verificar si una cadena representa un número válido: Pide al usuario que
    // ingrese una cadena. Intenta convertir la cadena a un doble usando
    // Double.valueOf(). Si la cadena no representa un número válido,
    // Double.valueOf() lanzará una excepción. Atrapa esta excepción y muestra un
    // mensaje al usuario indicando que la entrada no es un número válido.
    public static void numeroValido(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero de tipo double");
        String numeroDouble = scanner.nextLine();
        scanner.close();
        try {
            double numeroConvertido = Double.valueOf(numeroDouble);            
            System.out.println("El numero ingresado es: " + numeroConvertido);
        } catch (NumberFormatException e) {
            System.out.println("Error, no se puede convertir la cadena a un numero de tipo Double");
        }
    }

    // Cuenta dígitos en un número: Pide al usuario que ingrese un número. Convierte
    // el número a una cadena y luego utiliza un bucle y Character.isDigit() para
    // contar el número de dígitos en el número.
    public static void cuentaDigitos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        scanner.close();
        String cadena = String.valueOf(numero);
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(Character.isDigit(cadena.charAt(i))){
                contador++;
            }
        }
        System.out.println("La cantidad de digitos es: " + contador);
    }
}
