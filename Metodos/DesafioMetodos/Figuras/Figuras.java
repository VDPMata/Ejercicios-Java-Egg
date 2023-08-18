package Metodos.DesafioMetodos.Figuras;

import java.util.Scanner;

public class Figuras {
    public  static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
    }

    public static void menu(){
        boolean bandera = true;
        while(bandera){
        System.out.println();
        System.out.println("******************************");
        System.out.println("          MENU FIGURAS        ");
        System.out.println("******************************");
        System.out.println("1. Circulo");
        System.out.println("2. Triangulo");
        System.out.println("3. Paralelogramo");
        System.out.println("4. Salir");
        System.out.println("******************************");
        System.out.println();
        System.out.println("Ingrese la opcion");
        int opcion = scanner.nextInt();
        switch(opcion){
            case 1:
            menuCirculo();
            break;

            case 2:
            menuTriangulo();
            break;

            case 3:
            menuParalelogramo();
            break;

            case 4:
            System.out.println("salir");
            bandera = false;
            break;
            default:
            System.out.println("Opcion no valida");
        }
        }
    }

    public static void menuCirculo(){
        boolean bandera = true;
        while(bandera){
        System.out.println();
        System.out.println("******************************");
        System.out.println("          MENU CIRCULO       ");
        System.out.println("******************************");
        System.out.println("1. Perimetro");
        System.out.println("2. Area");
        System.out.println("3. Salir");
        System.out.println("******************************");
        System.out.println();
        System.out.println("Ingrese la opcion");
        int opcion = scanner.nextInt();
        switch(opcion){
            case 1:
            circuloPerimetro();
            break;
            case 2:
            circuloArea();
            break;
            case 3:
            System.out.println("Salir");
            bandera = false;
            break;
            default:
            System.out.println("Opcion no valida");
        }
        }
    }
    
    public static void circuloPerimetro(){
        System.out.println("Ingrese el radio del circulo");
        double radio = scanner.nextDouble();
        System.out.println("El perimetro del circulo es: " + (2*3.14*radio));
    }

    public static void circuloArea(){
        System.out.println("Ingrese el radio del circulo");
        double radio = scanner.nextDouble();
        System.out.println("El area del circulo es: " + (3.14*(radio*radio)));
    }

    public static void menuTriangulo(){
        boolean bandera = true;
        while(bandera){
        System.out.println();
        System.out.println("******************************");
        System.out.println("          MENU TRIANGULO       ");
        System.out.println("******************************");
        System.out.println("1. Perimetro");
        System.out.println("2. Area");
        System.out.println("3. Salir");
        System.out.println("******************************");
        System.out.println();
        System.out.println("Ingrese la opcion");
        int opcion = scanner.nextInt();
        switch(opcion){
            case 1:
            trianguloPerimetro();
            break;

            case 2:
            trianguloArea();
            break;

            case 3:
            System.out.println("Salir");
            bandera = false;
            break;

            default:
            System.out.println("Opcion no valida");
        }
        }
    }
   
   
    public static void trianguloPerimetro(){
        System.out.println("Ingrese el lado A");
        double ladoA = scanner.nextDouble();
        System.out.println("Ingrese el lado B");
        double ladoB = scanner.nextDouble();
        System.out.println("Ingrese el lado C");
        double ladoC = scanner.nextDouble();
        System.out.println("El perimetro del triangulo es: " + (ladoA + ladoB + ladoC));
    }

    public static void trianguloArea(){
        System.out.println("Ingrese la base");
        double base = scanner.nextDouble();
        System.out.println("Ingrese la altura");
        double altura = scanner.nextDouble();

        System.out.println("El area del triangulo es: " + ((base*altura)/2));

    }

    public static void menuParalelogramo(){
        boolean bandera = true;
        while(bandera){
        System.out.println();
        System.out.println("******************************");
        System.out.println("       MENU PARALELOGRAMO     ");
        System.out.println("******************************");
        System.out.println("1. Perimetro");
        System.out.println("2. Area");
        System.out.println("3. Salir");
        System.out.println("******************************");
        System.out.println();
        System.out.println("Ingrese la opcion");
        int opcion = scanner.nextInt();
        switch(opcion){
            case 1:
            paraPerimetro();
            break;

            case 2:
            paraArea();
            break;

            case 3:
            System.out.println("Salir");
            bandera = false;
            break;

            default:
            System.out.println("Opcion no valida");
        }
        }
    }

    public static void paraPerimetro(){
        System.out.println("Ingrese el lado A");
        int ladoA = scanner.nextInt();
        System.out.println("Ingrese el lado B");
        int ladoB = scanner.nextInt();
        System.out.println("El perimetro del paralelogramo es: " + (2*(ladoA+ladoB)));
    }

    public static void paraArea(){
        System.out.println("Ingrese la base");
        int base = scanner.nextInt();
        System.out.println("Ingrese la altura");
        int altura = scanner.nextInt();
        System.out.println("El area del paralelogramo es:" + (base*altura));
    }
}
