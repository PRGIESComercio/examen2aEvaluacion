/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

import java.util.ArrayList;

/**
 *
 * @author david
 */
public class Encuesta {

    private ArrayList<Persona> lista;
    private int numeroDeEncuestados;
    private int numeroDeHombres, numeroDeMujeres;
    private int hombresTrabajadores, mujeresTrabajadoras;
    private double sueldoHombres, sueldoMujeres;

    public Encuesta(int numeroDeEncuestados) {
        lista = new ArrayList();
        this.numeroDeEncuestados = numeroDeEncuestados;
        numeroDeHombres = numeroDeMujeres = hombresTrabajadores = mujeresTrabajadoras = 0;
        sueldoHombres = sueldoMujeres = 0;
    }

    public void cargaEncuesta() {
        byte sexo, trabaja;
        double sueldo;


        for (int i = 0; i < numeroDeEncuestados; i++) {
            sexo = (byte) (((Math.random() * 10) % 2) + 1);
            trabaja = (byte) (((Math.random() * 10) % 2) + 1);
            sueldo = (Math.random() * 1400) + 600;
            Persona p = new Persona(sexo, trabaja, sueldo);
            lista.add(p);
        }
        generaEstadistica();
    }

    // Genera estadistica
    public void generaEstadistica() {

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getSexo() == 1) {// Numero de hombres
                numeroDeHombres++;
                if (lista.get(i).getTrabaja() == 1) { // hombre que trabaja
                    hombresTrabajadores++;
                    sueldoHombres = sueldoHombres + lista.get(i).getSueldo();
                }
            } else {
                numeroDeMujeres++; // Numero de mujeres
                if (lista.get(i).getTrabaja() == 1) { // mujeres que trabaja
                    mujeresTrabajadoras++;
                    sueldoMujeres = sueldoMujeres + lista.get(i).getSueldo();
                }
            }

        }
     
    }

    // Porcentaje de hombres (son trabajo o sin el)
    public double porcentajeHombres() {
       return (double) numeroDeHombres*100 / numeroDeEncuestados;
    }

    // Porcentaje de mujeres
    public double porcentajeMujeres() {
        return 100 - this.porcentajeHombres();
    }

    // Porcentaje de hombres trabajadores (sobre el total de encuestados)
    public double porcentajeHombresTrabajadores() {
        return (double)hombresTrabajadores*100 / numeroDeEncuestados; 
        
    }
    
    // Porcentaje de mujeres trabajadores  (Sobre el total de encuestados)
    public double porcentajeMujeresTrabjadoras() {
        return (double)mujeresTrabajadoras*100 / numeroDeEncuestados; 
        
    }
    
    // Sueldo promedio hombres
    public double sueldoPromedioHombres() {
        return sueldoHombres / hombresTrabajadores;
        
    }
    
    // Sueldo promedio mujeres 
    public double sueldoPromedioMujeres() {
        return sueldoMujeres / mujeresTrabajadoras;    
    }
}
