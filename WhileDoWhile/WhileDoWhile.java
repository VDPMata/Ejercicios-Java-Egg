package WhileDoWhile;
import java.util.Scanner;

public class WhileDoWhile {
    public static void main(String[] args) {
       
    }
    // Menú interactivo con while: Crea un menú interactivo que contenga 5 opciones
    // que pueda elegir el usuario, por ejemplo:

    // Comprar producto.
    // Realizar devolución.
    // Ver mis Pedidos.
    // Preguntas frecuentes.
    // Salir.

    // Luego solicite al usuario que elija una opción del conjunto de opciones
    // mostradas por pantalla. El menú debe seguir apareciendo hasta que el usuario
    // elija la opción para salir del programa. Para este ejercicio, no es necesario
    // que las opciones del menú realicen acciones reales. Solo necesitas mostrar un
    // mensaje que indique qué opción eligió el usuario.
    public static void menuInteractivo() {
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;
        while (bandera) {
            System.out.println("***************");
            System.out.println("     Menú     ");
            System.out.println("***************");
            System.out.println("1. Comprar producto");
            System.out.println("2. Realizar devolucion");
            System.out.println("3. Ver mis Pedidos");
            System.out.println("4. Preguntas frecuentes");
            System.out.println("5. Salir");
            System.out.println("Ingrese su opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("\nHa seleccionado: Comprar producto");
                    break;
                case 2:
                    System.out.println("\nHa seleccionado: Realizar devolución");
                    break;
                case 3:
                    System.out.println("\nHa seleccionado: Ver mis Pedidos");
                    break;
                case 4:
                    System.out.println("\nHa seleccionado: Preguntas frecuentes");
                    break;
                case 5:
                    System.out.println("\nSaliendo del programa...");
                    bandera = false;
                    scanner.close();
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            System.out.println();
        }
    }

    // Adivinar el número: Escribir un programa que genere un número aleatorio entre
    // 1 y 100, y muestre por consola un mensaje que le pida al usuario adivinar ese
    // número utilizando un bucle do-while. El programa debe mostrar un mensaje
    // indicando si el número ingresado es mayor o menor que el número aleatorio, y
    // continuar pidiendo al usuario que adivine hasta que lo haga correctamente.
    public static void adivinarNumero() {
        int numeroRandom = (int) (Math.random() * 100);
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;
        do {
            System.out.println("Adivine el numero");
            int numeroAdivinar = scanner.nextInt();
            if (numeroAdivinar == numeroRandom) {
                System.out.println("Felicidades adivinaste el numero, era el: " + numeroRandom);
                bandera = false;
                scanner.close();
            } else if (numeroAdivinar > numeroRandom) {
                System.out.println("El numero ingresado es mayor");
            } else {
                System.out.println("El numero ingresado es menor");
            }
        } while (bandera);
    }

    // Validación de contraseña: Escribir un programa que solicite al usuario
    // ingresar una contraseña y la valide usando un bucle while. La contraseña
    // correcta es "secreto". El programa debe seguir pidiendo al usuario que
    // ingrese la contraseña hasta que sea correcta.
    public static void contrasenaWhile() {
        Scanner scanner = new Scanner(System.in);
        String contrasena = "secreto";

        System.out.println("Ingrese su contraseña");
        String contrasenaIngresada = scanner.nextLine();
        while (!contrasenaIngresada.equals(contrasena)) {
            System.out.println("Contraseña incorrecta...");
            System.out.println("Intente nuevamente: ");
            contrasenaIngresada = scanner.nextLine();
        }
        System.out.println("Contraseña correcta");
        scanner.close();
    }

    // Número de dígitos: Escribe un programa que le pida al usuario un número
    // entero y utilice un bucle while para calcular el número de dígitos de ese
    // número. Por ejemplo, el número 4578 tiene 4 dígitos (pensar en la lógica para
    // el 0 que debe devolver que tiene una cifra y también para que se cuenten las
    // cifras de números negativos).
    public static void numeroDigitos(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = scanner.nextInt();
        int numeroAbsoluto = Math.abs(numero);
        scanner.close();
        int contador = 0;
        if(numeroAbsoluto == 0 ){
            contador++;
        }
        while(numeroAbsoluto > 0){
            numeroAbsoluto /= 10;
            contador++;
        }
        System.out.println("El numero tiene " + contador + " cantidad de digitos");
    }
}
