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
public abstract class PasajeInterCantonal implements Serializable {

    protected String nombre;
    protected String cedula;
    protected String origen;
    protected String destino;
    protected double km;
    protected double tarifa;
    protected double pasaje;

    public PasajeInterCantonal(String nomb, String ced, String orig, 
            String dest, double kmtrs, double tarif, double p) {
        nombre = nomb;
        cedula = ced;
        origen = orig;
        destino = dest;
        km = kmtrs;
        tarifa = tarif;
        pasaje = p;
    }

    public void establecerNombre(String nomb) {
        nombre = nomb;
    }

    public void establecerCedula(String ced) {
        cedula = ced;
    }

    public void establecerOrigen(String orig) {
        origen = orig;
    }

    public void establecerDestino(String dest) {
        destino = dest;
    }

    public void establecerKm(double kmtrs) {
        km = kmtrs;
    }

    public void establecerTarifa(double tarif) {
        tarifa = tarif;
    }

    public abstract void establecerPasaje();

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerOrigen() {
        return origen;
    }

    public String obtenerDestino() {
        return destino;
    }

    public double obtenerKm() {
        return km;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    public double obtenerPasaje() {
        return pasaje;
    }

    @Override
    public String toString() {
        return String.format("Pasaje.");
    }

}
