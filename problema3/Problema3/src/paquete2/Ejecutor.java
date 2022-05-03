/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

import paquete1.EntidadAdministrativa;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejecutor {

    public static void main(String[] args) {
        EntidadAdministrativa enti = new EntidadAdministrativa();

        //Ingreso de Datos
        String nombre = "Estrellas del Saber";
        String tipoDeInstitucion = "Fiscomisional";
        int numeroDeEstudiantes = 1350;
        int numeroDeDocentes = 30;
        int numeroDeSedes = 1;
        double gastosProyectadoPorEstudiante = 30.6;

        enti.establecerNombre(nombre);
        enti.establecerTipoDeInstitucion(tipoDeInstitucion);
        enti.establecerNumeroDeEstudiantes(numeroDeEstudiantes);
        enti.establecerNumeroDeDocentes(numeroDeDocentes);
        enti.establecerNumeroDeSedes(numeroDeSedes);
        enti.establecerGastosProyectadoPorEstudiante(gastosProyectadoPorEstudiante);
        enti.calcularPresupuesto();

        //Se presenta los Datos
        System.out.printf("\tInstitución Educativa 1\nNombre: %s\nTipo de Institución: %s\n"
                + "Número de Estudiantes: %d\nNúmero de Docentes: %d\nNúmero de Sedes: %d\n"
                + "Gastos Proyectado por Estudiante: %.2f\n\tPresupuesto: %.2f\n", enti.obtenerNombre(),
                enti.obtenerTipoDeInstitucion(), enti.obtenerNumeroDeEstudiantes(), enti.obtenerNumeroDeDocentes(),
                enti.obtenerNumeroDeSedes(), enti.obtenerGastosProyectadoPorEstudiante(), enti.obtenerCalcularPresupuesto());
        
        System.out.println("----------------------------------------");
        
        EntidadAdministrativa enti2 = new EntidadAdministrativa();
         //Ingreso de Datos
        String nombre2 = "Estrellas del Conocimiento";
        String tipoDeInstitucion2 = "Fiscal";
        int numeroDeEstudiantes2 = 2500;
        int numeroDeDocentes2 = 68;
        int numeroDeSedes2 = 2;
        double gastosProyectadoPorEstudiante2 = 61.2;

        enti2.establecerNombre(nombre2);
        enti2.establecerTipoDeInstitucion(tipoDeInstitucion2);
        enti2.establecerNumeroDeEstudiantes(numeroDeEstudiantes2);
        enti2.establecerNumeroDeDocentes(numeroDeDocentes2);
        enti2.establecerNumeroDeSedes(numeroDeSedes2);
        enti2.establecerGastosProyectadoPorEstudiante(gastosProyectadoPorEstudiante2);
        enti2.calcularPresupuesto();

        //Se presenta los Datos
        System.out.printf("\n\tInstitución Educativa 2\nNombre: %s\nTipo de Institución: %s\n"
                + "Número de Estudiantes: %d\nNúmero de Docentes: %d\nNúmero de Sedes: %d\n"
                + "Gastos Proyectado por Estudiante: %.2f\n\tPresupuesto: %.2f\n", enti2.obtenerNombre(),
                enti2.obtenerTipoDeInstitucion(), enti2.obtenerNumeroDeEstudiantes(), enti2.obtenerNumeroDeDocentes(),
                enti2.obtenerNumeroDeSedes(), enti2.obtenerGastosProyectadoPorEstudiante(), enti2.obtenerCalcularPresupuesto());

    }

}
