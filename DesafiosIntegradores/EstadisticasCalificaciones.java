package DesafiosIntegradores;

import java.util.Arrays;

public class EstadisticasCalificaciones {
    public static void main(String[] args) {
        calificaciones();
    }

    // Estadísticas de calificaciones
    // Desarrollar un programa en Java que genere un arreglo de calificaciones de
    // manera aleatoria.
    // Estas calificaciones se deben almacenar en un arreglo de Strings.
    // Una vez generado el arreglo, el programa debe generar 3 arreglos nuevos,
    // separando las calificaciones entre desaprobado (< 4), aprobado (>= 4), y
    // excelente (>=10).
    // Necesitarás convertir los String a double para lograrlo.
    // Luego debes calcular el promedio del arreglo original y de cada uno de los
    // nuevos arreglos.
    // Por último, imprime los resultados en consola.
    public static void calificaciones() {
        String[] calificaciones = {"10.0","8.0","1.5","2.25", "9.0", "5.0", "6.66", "10", "7.5","4.33","7.85"}; 
        int contDesaprobado = 0;
        int contAprobado = 0;
        int contExcelente = 0;
        double suma = 0;
        double sumaAprobados = 0;
        double sumaDesaprobados = 0;
        double sumaExcelentes = 0;
        double tamano = Double.valueOf(calificaciones.length);
        for (String elemento : calificaciones) {
            double mano = Double.parseDouble(elemento);
            if(mano < 4.0){
                contDesaprobado++;
            }else if(mano >= 4.0  && mano < 10.0){
                contAprobado++;
            }else if(mano == 10.0){
                contExcelente++;
            }
            suma += mano; 
        }
        String[] desaprobados = new String[contDesaprobado];
        String[] aprobados = new String[contAprobado];
        String[] excelente = new String[contExcelente];

        double tamanoAprobados = Double.valueOf(aprobados.length);
        double tamanoDesaprobados = Double.valueOf(desaprobados.length);
        double tamanoExcelentes = Double.valueOf(excelente.length);

        for(int i = 0; i < calificaciones.length; i++ ) {
            double mano = Double.parseDouble(calificaciones[i]);
            if(mano < 4.0){
                desaprobados[contDesaprobado-1] = calificaciones[i];
                contDesaprobado--;
                sumaDesaprobados += mano;
            }else if(mano >= 4.0  && mano < 10.0){
                aprobados[contAprobado-1] = calificaciones[i];
                contAprobado--;
                sumaAprobados += mano;
            }else if(mano == 10.0){
                excelente[contExcelente-1] = calificaciones[i];
                contExcelente--;
                sumaExcelentes += mano;
            }  
        }
        System.out.println("Las calificaciones son: " + Arrays.toString(calificaciones) + " Y el promedio es: " + (suma/tamano));
        System.out.println("Los desaprobados: " + Arrays.toString(desaprobados)  + " Y el promedio es: " + (sumaDesaprobados/tamanoDesaprobados));
        System.out.println("Los aprobados: " + Arrays.toString(aprobados)  + " Y el promedio es: " + (sumaAprobados/tamanoAprobados));
        System.out.println("Los excelentes: " + Arrays.toString(excelente)  + " Y el promedio es: " + (sumaExcelentes/tamanoExcelentes));

    }
}
