package DesafiosIntegradores.MostrarMenu;

import java.util.Arrays;
import java.util.Scanner;


public class MostrarMenu {
    public static void main(String[] args) {

        String oracion = "";
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        boolean bandera = true;

        while (bandera) {
            System.out.println("******************************");
            System.out.println("          MENU ORACIÓN        ");
            System.out.println("******************************");
            System.out.println("1. Crear oración o Borrar oracion");
            System.out.println("2. Cantidad de caracteres");
            System.out.println("3. Cantidad de palabras");
            System.out.println("4. Mostrar palabras ordenadas alfabéticamente");
            System.out.println("5. Ingresar un número y devolver la palabra correspondiente");
            System.out.println("6. Buscar palabra dentro de la oración");
            System.out.println("7. Modificar palabra");
            System.out.println("8. Agregar contenido a la oración");
            System.out.println("9. Mostrar oracion");
            System.out.println("10. Salir");
            System.out.println("******************************");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    oracion = crearBorrar(oracion, scanner);
                    break;

                case 2:
                    System.out.println("Cantidad de caracteres");
                    contadorCaracteres(oracion);
                    break;

                case 3:
                    System.out.println("cantidad de palabras");
                    contPalabras(oracion);
                    break;

                case 4:
                    System.out.println("Mostrar palabras ordenadas");
                    palabrasOrdenadas(oracion);
                    break;

                case 5:
                    devolverPalabra(oracion, scanner);
                    break;

                case 6:
                    buscarPalabra(oracion, scanner);
                    break;

                case 7:
                    oracion = modificarPalabra(oracion, scanner);
                    break;

                case 8:
                    oracion = agregarContenido(oracion, scanner);
                    break;

                case 9:
                    System.out.println(oracion);
                    break;

                case 10:
                    System.out.println("Salir");
                    bandera = false;
                    scanner.close();
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        }

    }

    public static String crearBorrar(String oracion, Scanner scanner) {
        scanner.nextLine();
        if (oracion.isEmpty()) {
            System.out.println("Ingrese la oracion: ");
            oracion = scanner.nextLine();
            return oracion;
        } else {
            System.out.println("Oracion borrada");
            return oracion = "";
        }
    }

    public static void contadorCaracteres(String oracion) {
        int cantCaracteres = oracion.length();
        System.out.println(cantCaracteres);
    }

    public static void contPalabras(String oracion) {
        String[] palabras = oracion.split("\\s+");
        System.out.println(palabras.length);
    }

    public static void palabrasOrdenadas(String oracion) {
        String[] palabras = oracion.split("\\s+");
        Arrays.sort(palabras);
        System.out.println(Arrays.toString(palabras));
    }

    public static void devolverPalabra(String oracion, Scanner scanner) {
        String[] palabras = oracion.split("\\s+");
        System.out.println("Ingrese el indice de la palabra, entre 1 y " + palabras.length);
        int indice = scanner.nextInt();
        System.out.println(palabras[indice - 1]);
    }

    public static void buscarPalabra(String oracion, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Ingrese palabra a buscar");
        String palabraBuscar = scanner.nextLine();
        String[] frase = oracion.split("\\s+");
        for (int i = 0; i < frase.length; i++) {
            if (frase[i].equals(palabraBuscar)) {
                System.out.println("La palabra " + "'" + palabraBuscar + "'"
                        + " se encuentra dentro de la frase, en la posicion: " + (i + 1));
            }
        }
    }

    public static String modificarPalabra(String oracion, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Ingrese palabra a buscar");
        String palabraCambiar = scanner.nextLine();
        String[] frase = oracion.split("\\s+");
        String fraseFinal = "";
        for (int i = 0; i < frase.length; i++) {
            if (frase[i].equals(palabraCambiar)) {
                System.out.println("La palabra " + palabraCambiar + " se encuentra dentro de la frase");
                System.out.println("Ingrese palabra para reemplazar");
                palabraCambiar = scanner.nextLine();
                frase[i] = palabraCambiar;
                i = frase.length;
            }
        }
        for (String elemento : frase) {
            fraseFinal += elemento + " ";
        }
        return fraseFinal;
    }

    public static String agregarContenido(String oracion, Scanner scanner) {
        scanner.nextLine();
        System.out.println("Ingrese frase o palabra para agregar al final");
        return oracion += scanner.nextLine();
    }

}
