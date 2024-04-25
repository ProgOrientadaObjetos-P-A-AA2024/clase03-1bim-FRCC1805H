/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete1.InstitucionEducativa;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {
        /*Un objeto de tipo InstitucionEducativa*/

        InstitucionEducativa i1 = new InstitucionEducativa();

        String nombres = "Beatriz Cueva de Ayora";
        String tipoInstitucion = "Fiscomicional";
        int numeroAlumnos = 2310200;
        int numeroDocentes = 100;
        int numeroSedes = 5;

        i1.establecerNombre(nombres);
        i1.establecerTipoInstitucion(tipoInstitucion);
        i1.establecerNumeroAlumnos(numeroAlumnos);
        i1.establecerNumeroDocentes(numeroDocentes);
        i1.establecerNumeroSedes(numeroSedes);

        System.out.printf("Listado del Colegio \n \nInstitucion : %s "
                + "\nTipo de Institucion : %s "
                + "\nNumero de Alumnos : %d "
                + "\nNumero de Docentes : %d "
                + "\nNumero de Sedes : %d  ",
                i1.obtenerNombres(),
                i1.obtenerTipoInstitucion(),
                i1.obtenerNumeroAlumnos(),
                i1.obtenerNumeroDocentes(),
                i1.obtenerNumeroSedes());
    }
}
