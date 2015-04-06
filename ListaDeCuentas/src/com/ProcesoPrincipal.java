/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import javax.swing.JOptionPane;
import modelo.Cuenta;
/**
 *
 * @author jeanpaul01
 */
public class ProcesoPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cta[]=new Cuenta[5];
        for(int i=0;i<cta.length;i++){
		cta[i] = new Cuenta();
		String codigo, importe;

		codigo = JOptionPane.showInputDialog("Ingrese codigo");
		importe = JOptionPane.showInputDialog("Ingrese importe inicial");
		
		cta[i].setCuenta(Integer.parseInt(codigo));
		cta[i].setImporte(Integer.parseInt(importe));
        }
    }
}
