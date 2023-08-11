package EstructurasDeControl;

import java.util.Scanner;

public class ControlSwitch {
    public static void main(String[] args) {
        
    }

    // Ejercicio de días de la semana: Escribir un programa que solicite al usuario
    // un número del 1 al 7, representando un día de la semana, y muestre en
    // pantalla el nombre correspondiente a ese día. Utilizar la estructura "switch"
    // para implementar este programa.
    public static void diasSemana() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        int dia = scanner.nextInt();
        scanner.close();
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Opcion invalida");
        }
    }

    // Ejercicio de conversión de calificaciones: Escribir un programa que solicite
    // al usuario una calificación numérica del 1 al 5 y muestre en pantalla la
    // calificación correspondiente en letras, utilizando la siguiente escala:
    // 1: "Muy deficiente"
    // 2: "Deficiente"
    // 3: "Suficiente"
    // 4: "Notable"
    // 5: "Sobresaliente".
    public static void calificaciones() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su calificacion del 1 al 5");
        int calificacion = scanner.nextInt();
        scanner.close();
        switch (calificacion) {
            case 1 -> System.out.println("Muy deficiente");
            case 2 -> System.out.println("Deficiente");
            case 3 -> System.out.println("Suficiente");
            case 4 -> System.out.println("Notable");
            case 5 -> System.out.println("Sobresaliente");
            default -> System.out.println("Opcion no valida");
        }
    }

    // Ejercicio de selección de opción: Escribir un programa que muestre un menú
    // con las siguientes opciones:
    // Opción 1: "Guardar"
    // Opción 2: "Cargar"
    // Opción 3: "Salir"
    public static void menuDecor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************");
        System.out.println("     Menú     ");
        System.out.println("***************");
        System.out.println("1. Guardar");
        System.out.println("2. Cargar");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
        int opcion = scanner.nextInt();
        scanner.close();

        switch (opcion) {
            case 1 -> System.out.println("Opcion elegida: Guardar");
            case 2 -> System.out.println("Opcion elegida: Cargar");
            case 3 -> System.out.println("Opcion elegida: Salir");
            default -> System.out.println("Opcion no valida");
        }
    }

    // Ejercicio de selección de figura geométrica: Escribir un programa que
    // solicite al usuario un número del 1 al 3 para seleccionar una figura
    // geométrica (1: círculo, 2: cuadrado, 3: triángulo). Luego, mostrar en
    // pantalla el área correspondiente a la figura seleccionada. Utilizar la
    // estructura "switch" para implementar este programa.
    public static void figurasGeometricas(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("***************");
        System.out.println("     Menú     ");
        System.out.println("***************");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Triangulo");
        System.out.println("Seleccion opcion");
        int opcion = scanner.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Eligio circulo, ingrese su radio:");
                double radio = scanner.nextDouble();
                System.out.println("El area del circulo es: " + (3.14*(radio*radio)));
                break;
            case 2:
                System.out.println("Eligio cuadrado, ingrese su lado:");
                double lado = scanner.nextDouble();
                System.out.println("El area del cuadrado es: " + (lado*lado));
                break;
            case 3:
                System.out.println("Eligio triangulo, ingrese su base:");
                double base = scanner.nextDouble();
                System.out.println("Ingrese su altura");
                double altura = scanner.nextDouble();
                System.out.println("El area del circulo es: " + ((base*altura)/2));
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
        scanner.close();

    }

    // Ejercicio de verificación de día hábil: Escribir un programa que solicite al
    // usuario un número del 1 al 7, representando un día de la semana, y determine
    // si es un día hábil o un día no hábil. Mostrar el resultado en pantalla.
    public static void diasSemanaHabil() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 7");
        int dia = scanner.nextInt();
        scanner.close();
        switch (dia) {
            case 1, 2, 3 ,4 ,5 -> System.out.println("Dia habil");
            case 6, 7 -> System.out.println("Dia NO habil");
            default -> System.out.println("Opcion invalida");
        }
    }


}