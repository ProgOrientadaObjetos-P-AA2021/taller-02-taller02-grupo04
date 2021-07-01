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
public class PasajeNormal extends PasajeInterCantonal
        implements Serializable {

    private double adicional;

    public void establecerAdicional(double adici) {
        adicional = adici;
    }

    public double obtenerAdicional() {
        return adicional;
    }

    public PasajeNormal(String nomb, String ced, String orig, String dest,
            double kmtrs, double tarif, double p, double adici) {
        super(nomb, ced, orig, dest, kmtrs, tarif, p);
        adicional = adici;
    }

    @Override
    public void establecerPasaje() {
        pasaje = (km * 0.15) + (tarifa + (tarifa * (adicional / 100)));
    }

    public String toString() {
        String cadena = String.format(""
                + "Nombre: %s\n"
                + "Cédula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Número de Km de distancia: %.2f\n"
                + "Tarifa base : $ %.2f\n"
                + "Porcentaje adicional: $ %.2f (%.2f%s)\n"
                + "Valor del pasaje: $ %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerOrigen(),
                obtenerDestino(),
                obtenerKm(),
                obtenerTarifa(),
                obtenerAdicional(),
                adicional, "%",
                obtenerPasaje());
        return cadena;
    }
}
