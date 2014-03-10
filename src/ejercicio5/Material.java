/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.ejercicio5;

/**
 *
 * @author david
 */
public class Material {
    private int identificador;
    private float precio;
    private int cantidad;

    public Material(int identificador) {
        this.identificador = identificador;        
    }

    public Material(int identificador, float precio, int cantidad) {
        this.identificador = identificador;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    // Permite añadir esa cantidad a la disponible    
    public void introducirCantidadDeMaterial(int add) {
        cantidad += add;   
    }
    // Permite decrementar esa cantidad a la disponible
    public boolean consumirCantidadDeMaterial(int add) {
        int aux = this.getCantidad() - add;
        if (aux>=0 ) { // Es posible consumir la cantidad indicada
            cantidad -= add;
            return true;
        } else
            return false;
    }
    
    // Equivalente al setter de precio
    protected void ponerPrecioAlMaterial (float precio) {
        this.precio = precio;
    }

    // Permita visualizar el contenido del material
    @Override
    public String toString() {
        return "Identificador: " + identificador + " Precio: " + this.precio + " Cantidad: " + this.cantidad; 
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getIdentificador() {
        return identificador;
    }

    public float getPrecio() {
        return precio;
    }
    
    
    
    
    
}
