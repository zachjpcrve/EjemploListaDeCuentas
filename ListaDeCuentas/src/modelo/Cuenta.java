/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jeanpaul01
 */
public class Cuenta {
    private double cuenta;
    private double importe;

    public Cuenta(double cuenta, double importe) {
        this.cuenta = cuenta;
        this.importe = importe;
    }
    public Cuenta(){
        this.cuenta=0;
        this.importe=0;
    }

    public double getCuenta() {
        return cuenta;
    }

    public void setCuenta(double cuenta) {
        this.cuenta = cuenta;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    public double Retiro(double retiro){
        importe=importe-retiro;
        return importe;
    }
    
    public double Mostrar(){
        return importe;
    }
    
    public double Deposito(double deposito){
        importe=importe+deposito;
        return importe;
    }
}
