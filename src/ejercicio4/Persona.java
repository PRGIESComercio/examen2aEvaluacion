/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;

/**
 *
 * @author david
 */
public class Persona {
    private byte sexo;
    private byte trabaja;
    private double sueldo;

    public Persona(byte sexo, byte trabaja, double sueldo) {
        this.sexo = sexo;
        this.trabaja = trabaja;
        this.sueldo = sueldo;
    }

    public byte getSexo() {
        return sexo;
    }

    public void setSexo(byte sexo) {
        this.sexo = sexo;
    }

    public byte getTrabaja() {
        return trabaja;
    }

    public void setTrabaja(byte trabaja) {
        this.trabaja = trabaja;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    
    
    
    
}
