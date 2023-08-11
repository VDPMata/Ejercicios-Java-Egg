package DesafiosIntegradores;

import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {
        contrasenaSegura();
    }

    // Validación de contraseña
    // Escribir un programa que solicite al usuario que ingrese una contraseña y
    // verifique si cumple con los siguientes criterios para considerarse segura:
    
    // La contraseña debe tener al menos 8 caracteres.
    // La contraseña debe contener al menos una letra mayúscula y una letra
    // minúscula.
    // La contraseña debe contener al menos un número.
    // La contraseña debe contener al menos un carácter especial (por ejemplo, !, @,
    // #, $).
    // El programa debe mostrar un mensaje indicando si la contraseña es segura o
    // no, según los criterios establecidos. Puedes utilizar métodos de la clase
    // String para verificar cada uno de los criterios.
    public static void contrasenaSegura(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su contraseña");
        String contrasena = scanner.nextLine();
        scanner.close();

        boolean tieneMayuscula = !contrasena.equals(contrasena.toLowerCase());
        boolean tieneMinuscula = !contrasena.equals(contrasena.toUpperCase());
        boolean tieneNumero = contrasena.matches(".*\\d.*"); //Expresion regular que cubre todos los numeros
        boolean tieneCaracterEspecial = contrasena.matches(".*[!@#$%^&*()-+<>?].*"); //Expresion regular que cubre todos los caracteres
    
        if((contrasena.length() >= 8 && tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial)){
            System.out.println("Contraseña segura.");
        }else{
            System.out.println("Contraseña no cumple con los criterios de seguridad");
        }
    }  
}
