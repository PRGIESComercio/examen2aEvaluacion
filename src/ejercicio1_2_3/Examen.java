/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1_2_3;

/**
 *
 * @author david
 */
public class Examen {

    public static void main(String[] args) {
        System.out.println("Solución Ejercicio 1: ");
        ejercicio1();
        System.out.println("Solución Ejercicio 1: ");
        ejercicio2();
        System.out.println("Solución Piramide ");
        ejercicio3(11);
    }

    private static void ejercicio1() {
        int j = 1;
        for (int i = -13; i <= -10; i++) {
            j++;
        }
        System.out.println(j);
    }

    private static void ejercicio2() {
        int i = 0;
        int j = 16;
        while (i < 0) {
            i++;
            j++;
        }
        System.out.println(j);
    }

    private static void ejercicio3(int i) {
        StringBuilder s = new StringBuilder();
        int numAsteriscos = i*2-1;
        
        for (int j = 0; j < i; j++) { //Numero de pisos
            // Numero de espacios 
            for (int k = 0; k < j; k++) {
                s.append(" ");
            }
            // Numero de asteriscos            
            for (int k = 0; k < numAsteriscos; k++) {
                s.append("*");                
            }
            numAsteriscos=numAsteriscos-2;
            // Numero de espacios
            for (int k = 0; k < j; k++) {
                s.append(" ");
            }
            s.append("\n");            
        }
        System.out.println(s.toString());
        
    }
}
