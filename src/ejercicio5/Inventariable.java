/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5;

/**
 *
 * @author david
 */
public class Inventariable extends Material {

    private int tipoDeIva;
    private float dto;

    public Inventariable(int tipoDeIva, float dto, int identificador, float precio, int cantidad) {
        super(identificador, precio, cantidad);
        this.tipoDeIva = tipoDeIva;
        this.dto = dto;
    }

    public float getDto() {
        return dto;
    }

    public int getTipoDeIva() {
        return tipoDeIva;
    }

    public void setTipoDeIva(int tipoDeIva) {
        this.tipoDeIva = tipoDeIva;
    }
    
    
    // Se le aplicará el dto y sin iva
    @Override
    public void ponerPrecioAlMaterial(float add) {
        float cantidadADescontar;

        // Le añadimos dto
        cantidadADescontar = add * this.getDto() / 100;
        super.ponerPrecioAlMaterial(super.getPrecio() - cantidadADescontar);
    }

    // Calcula el precio con iva y descuento
    public void ponerPrecioAlMaterialConIva(float add) {
        float cantidadAAumentar;

        this.ponerPrecioAlMaterial(add); // Le aplicamos al bruto el dto
        cantidadAAumentar =  this.getPrecio() * this.getTipoDeIva() / 100; // Calcular cantidad de iva
        super.ponerPrecioAlMaterial(super.getPrecio() + cantidadAAumentar); // Aumentamos el precio
        
    }

    // Visualiza su contenido
    @Override
    public String toString() {
        return super.toString() + " Dto: " + this.getDto() + " Iva: " + this.tipoDeIva;
    }
    
    
}
