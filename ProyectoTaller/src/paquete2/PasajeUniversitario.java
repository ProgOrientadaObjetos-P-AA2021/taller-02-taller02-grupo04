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
public class PasajeUniversitario extends PasajeInterCantonal {

    private String universidad;

    public PasajeUniversitario(String nomb, String ced, String orig, String dest,
            double kmtrs, double tarif, double p, String univ) {
        super(nomb, ced, orig, dest, kmtrs, tarif, p);
        universidad = univ;
    }

    public void establecerUniversidad(String univ) {
        universidad = univ;
    }

    public String obtenerUniversidad() {
        return universidad;
    }

    @Override
    public void establecerPasaje() {
        pasaje = tarifa / 2;
    }

    public String toString() {
        String cadena = String.format(""
                + "Nombre: %s\n"
                + "Cédula: %s\n"
                + "Nombre de la Universidad: %s\n"
                + "Origen: %s\n"
                + "Destino: %s\n"
                + "Número de Km de distancia: %.2f\n"
                + "Tarifa base: $ %.2f\n"
                + "Valor del pasaje: $ %.2f\n",
                obtenerNombre(),
                obtenerCedula(),
                obtenerUniversidad(),
                obtenerOrigen(),
                obtenerDestino(),
                obtenerKm(),
                obtenerTarifa(),
                obtenerPasaje());
        return cadena;
    }
}
