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
public class PasajeTerceraEdad extends PasajeInterCantonal {

    public PasajeTerceraEdad(String nomb, String ced, String orig, String dest, 
            double kmtrs, double tarif, double p) {
        super(nomb, ced, orig, dest, kmtrs, tarif, p);
    }

    @Override
    public void establecerPasaje() {
        pasaje = (km * 0.05) + (tarifa / 2);
    }

    public String toString() {
        String cadena = String.format(""
                + "Nombre: %s\n"
                + "Cédula: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Número de Km de distancia: %.2f\n"
                + "Tarifa base: $ %.2f\n"
                + "Valor del pasaje: $ %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerOrigen(),
                obtenerDestino(),
                obtenerKm(),
                obtenerTarifa(),
                obtenerPasaje());
        return cadena;
    }
}
