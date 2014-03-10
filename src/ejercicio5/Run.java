/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author david
 */
public class Run {
    public static void main(String[] args) {
        Consumible c1 = new Consumible(1);
        c1.introducirCantidadDeMaterial(50);
        c1.consumirCantidadDeMaterial(25);
        
        Consumible c2 = new Consumible(2, 200);
        System.out.println("Comparando " + c1.toString() + " con " + c2.toString() + " = " +   c2.compareTo(c1));
        
        Inventariable i1 = new Inventariable(16, 5F, 3, 12.50F, 53);
        System.out.println("Inventariable: " +  i1.toString());
    }
}
