package DesafiosIntegradores.EjerciciosVarios;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversionUnidades {
    public static void main(String[] args) {
        conversorTemperatura();
    }
    // Conversión de unidades de temperatura
    // Escribir un programa que solicite al usuario una temperatura y una unidad de
    // medida: Celsius (C) o Fahrenheit (F).
    // Luego, el programa debe convertir la temperatura a la otra unidad de medida y
    // mostrar el resultado en pantalla.
    // El programa debe manejar las siguientes situaciones:
    // Si el usuario ingresa una unidad de medida inválida, mostrar un mensaje de
    // error.
    // Si el usuario ingresa una temperatura no válida, mostrar un mensaje de error.
    public static void conversorTemperatura() {
        Scanner scanner = new Scanner(System.in);
        double temperatura = 0.0;
        String unidad = "";

        try {
            System.out.println("Ingrese la temperatura: ");
            temperatura = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Error: La temperatura ingresada no es valida.");
            scanner.close();
            return;
        }

        try {
            System.out.println("Ingrese la unidad de medida (C para Celsius, F para Fahrenheit)");
            unidad = scanner.next();
        } catch (InputMismatchException e) {
            System.out.println("Error: La unidad de medida ingresada no es valida");
            scanner.close();
            return;
        }

        if (unidad.equalsIgnoreCase("c")) {
            System.out.println("La temperatura en Fahrenheit es: " + ((temperatura * 9 / 5) + 32));
        } else if (unidad.equalsIgnoreCase("f")) {
            System.out.println("La temperatura en Celcius es: " + ((temperatura - 32) * 5 / 9));
        } else {
            System.out.println("Error: Unidad de medida invalida");
        }

        scanner.close();
    }
}
