package Metodos.DesafioMetodos.ValidacionContrasena;

import java.util.Scanner;

public class ValidacionContrasena {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Ingrese la contraseña");
       String contrasena = scanner.nextLine();
       boolean bandera = esSegura(contrasena);
       if(bandera){
        System.out.println("La contraseña es segura");
       }else{
        System.out.println("la contraseña es insegura");
       }
       scanner.close();
    }
    

    public static boolean esSegura(String contrasena){
        boolean tieneLongitudCorrecta = tieneLongitudCorrecta(contrasena);
        boolean tieneMayuscula = tieneMayuscula(contrasena);
        boolean tieneMinuscula = tieneMinuscula(contrasena);
        boolean tieneDigitos = tieneNumero(contrasena);
        boolean tieneCaracterEspecial = tieneCaracterEspecial(contrasena);
        if(tieneLongitudCorrecta && tieneMayuscula && tieneMinuscula && tieneDigitos && tieneCaracterEspecial){
            return true;
        }else{
            return false;
        }
        
    }

    public static boolean tieneLongitudCorrecta(String contrasena){
        if(contrasena.length() >= 8){
            return true;
        }else{
            return false;
        }
    }

    public static boolean tieneMayuscula(String contrasena){
        char[] arrayContrasena = contrasena.toCharArray();
        for (int i = 0; i < arrayContrasena.length; i++){
           if(Character.isUpperCase(arrayContrasena[i])){
            return true;
            }
           }
           return false;
        }   
        
        public static boolean tieneMinuscula(String contrasena){
        char[] arrayContrasena = contrasena.toCharArray();
        for(int i = 0; i< arrayContrasena.length; i++){
            if(Character.isLowerCase(arrayContrasena[i])){
                return true;
            }
        }
        return false;
    }
    
    public static boolean tieneNumero(String contrasena){
        char[] arrayContrasena = contrasena.toCharArray();
        for (char elemento : arrayContrasena) {
            if(Character.isDigit(elemento)){
                return true;
            }
        }
        return false;
    }
    
    public static boolean tieneCaracterEspecial(String contrasena){
        char[] arrayContrasena = contrasena.toCharArray();
        for (char elemento : arrayContrasena) {
            if(!Character.isLetterOrDigit(elemento)){
                return true;
            }
        }
        return false;
    }
    

}
