/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class PasajeMenorEdad extends PasajeInterCantonal implements Serializable {

   private double porcdescuento; 

    public void establecerAdicional(double desct) {
        porcdescuento = desct;
    }
    
    public double obtenerDescuento() {
        return porcdescuento;
    }

    public PasajeMenorEdad(String nomb, String ced, String orig, String dest, 
            double kmtrs, double tarif, double p,double desct) 
    {
        super(nomb, ced, orig, dest, kmtrs, tarif, p);
        porcdescuento = desct;
    }
    
    @Override
    public void establecerPasaje()
    {
        pasaje=(km*0.1)+(tarifa-(tarifa*(porcdescuento/100)));
    }
    
    public String toString() {
        String cadena = String.format(""
                + "Nombre: %s\n"
                + "Cédula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Número de Km de distancia: %.2f\n"
                + "Tarifa base: $ %.2f\n"
                + "Porcentaje descuento: $ %.2f (%.2f%s)\n"
                + "Valor del pasaje: $ %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerOrigen(),
                obtenerDestino(),
                obtenerKm(),
                obtenerTarifa(),
                obtenerDescuento(),
                porcdescuento,"%",
                obtenerPasaje());
        return cadena;
    }
}
