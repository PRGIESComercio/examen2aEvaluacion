/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author david
 */
public class Consumible extends Material{

    public Consumible(int identificador) {
        super(identificador);
    }

    public Consumible(int identificador, int cantidad) {
        super(identificador, -1, cantidad);
    }
    
    // No dispone de precio
    
    // Puedan realizarse comparaciones entre objetos de tipo Material Consumible
    public int compareTo(Object o) {
        Consumible aux = (Consumible)o;
        
        return this.getIdentificador() - aux.getIdentificador();        
    }

    
        
    
}
