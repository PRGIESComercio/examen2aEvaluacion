/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.ejercicio4;

/**
 *
 * @author david
 */
public class Run {
    public static void main(String[] args) {
        Encuesta t = new Encuesta(100);
        
        t.cargaEncuesta();
        System.out.println("Porcentaje de hombres: " + t.porcentajeHombres());
        System.out.println("Porcentaje de mujeres: " + t.porcentajeMujeres());
        System.out.println("Porcentaje de hombres que trabajan: " + t.porcentajeHombresTrabajadores());
        System.out.println("Porcentaje de mujeres que trabajan: " + t.porcentajeMujeresTrabjadoras());
        System.out.println("Sueldo promedio de los hombres: " + t.sueldoPromedioHombres());
        System.out.println("Sueldo promedio de los mujeres: " + t.sueldoPromedioMujeres());        
    }
    
}
