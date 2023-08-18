package DesafiosIntegradores.EjerciciosVarios;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GeneradorContrasena {

    public static void main(String[] args) {
        generadorContrasena();
    }

    // Generador de contraseñas
    // Desarrollar un programa en Java que genere una contraseña aleatoria. Esta
    // contraseña estará compuesta por una mezcla de letras mayúsculas, letras
    // minúsculas y dígitos. La contraseña deberá ser almacenada en un arreglo de
    // caracteres.

    // Para la generación de la contraseña, utilice un bucle for que repita la
    // operación tantas veces como la longitud de la contraseña que haya
    // especificado el usuario.

    // Para comprobar que la contraseña generada contiene al menos una letra
    // mayúscula, una letra minúscula y un dígito, utilice bucles do-while y while
    // con los métodos isUpperCase, isLowerCase y isDigit de la clase Character.

    // Finalmente, convierta el arreglo de caracteres en un String con un for y
    // luego imprima la contraseña generada en la consola.
    public static void generadorContrasena() {
        Scanner scanner = new Scanner(System.in);

        boolean tieneDigitos = false;
        boolean tieneMayus = false;
        boolean tieneMinus = false;
        boolean bandera = false;
        System.out.println("Ingrese el tamaño de su contraseña");
        int numero = scanner.nextInt();
        char[] caracteres = new char[numero]; 
        do{
        for (int i = 0; i < caracteres.length; i++) {
            caracteres[i] = generadorCaracter();
        }

            for (int i = 0; i < caracteres.length; i++) {
                if(Character.isUpperCase(caracteres[i])){
                    tieneMayus = true;
                }else if(Character.isLowerCase(caracteres[i])){
                    tieneMinus = true;
                }else if(Character.isDigit(caracteres[i])){
                    tieneDigitos = true;
                }
            }
            if(tieneDigitos == true && tieneMayus == true && tieneMinus == true){
                bandera = true;
            }else{
                System.out.println("La contraseña no es segura, genere una nueva");
                System.out.println(Arrays.toString(caracteres));
                numero = scanner.nextInt();
            }
        }while(!bandera);
        scanner.close();
        System.out.println(Arrays.toString(caracteres));
        }

    // Generador de caracteres, es un metodo que nos retorna de manera aleatoria
    // un caracter, letra minuscula, mayuscula o digito;
    public static char generadorCaracter() {
        Random numeroRandom = new Random();
        int letraMayuscula = 'Z' - 'A' + 1;
        int letraMinuscula = 'z' - 'a' + 1;
        int digito = '9' - '0' + 1;
        int caracter = numeroRandom.nextInt(3);
        if (caracter == 0) {
            return (char) (numeroRandom.nextInt(letraMayuscula) + 'A');
        } else if (caracter == 1) {
            return (char) (numeroRandom.nextInt(letraMinuscula) + 'a');
        } else {
            return (char) (numeroRandom.nextInt(digito) + '0');
        }
    }
}
