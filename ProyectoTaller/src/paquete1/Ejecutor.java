/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import paquete2.*;
import paquete3.*;

public class Ejecutor {

    public static void main(String[] args) {

        PasajeNormal normal = new PasajeNormal("Adrian", "0706779865",
                "Arenillas", "Loja", 45, 3, 3.5, 2);
        normal.establecerPasaje();

        PasajeMenorEdad menor_edad = new PasajeMenorEdad("Carlos", "0704545778",
                "Cuenca", "Machala", 28, 2, 2, 3);
        menor_edad.establecerPasaje();

        PasajeTerceraEdad tercera_edad = new PasajeTerceraEdad("Jose",
                "0705241326", "Huaquillas", "Guayaquil", 40, 6, 6);
        tercera_edad.establecerPasaje();

        PasajeUniversitario universitario = new PasajeUniversitario("Marcos",
                "0706474123", "Loja", "Quito", 28, 2, 2,
                "Universidad Tecnica Machala");
        universitario.establecerPasaje();
        // nombre del archivo
        String nombreArchivo = "pasajes.data";
        ArrayList<PasajeInterCantonal> pasajes = new ArrayList<>();
        pasajes.add(normal);
        pasajes.add(menor_edad);
        pasajes.add(tercera_edad);
        pasajes.add(universitario);

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);

        for (int i = 0; i < pasajes.size(); i++) {

            // establecer el valor del atributo registro
            archivo.establecerRegistro(pasajes.get(i));
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaPasajes();
        System.out.println(lectura);
        lectura.cerrarArchivo();
    }
}
