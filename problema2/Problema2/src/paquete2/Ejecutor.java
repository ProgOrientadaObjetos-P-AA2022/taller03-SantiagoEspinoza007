/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete1.EquivalenteHora;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejecutor {
    public static void main(String[] args) {
        EquivalenteHora covH = new EquivalenteHora();
        
        //Valores de entrada del objeto 1
        double horas = 58.5;
        
        covH.establecerHoras(horas);
        covH.calcularMinutos();
        covH.calcularSegundos();
        covH.calcularDias();
        
        //Se presenta los datos
        System.out.printf("\tEquivalente Horas\n\nHoras: %.2f \nEquivalente en minutos: %.2f \n"
                + "Equivalente en segundos: %.2f \nEquivalente en Días: %.2f\n\n", covH.obtenerHoras(),     
                covH.obtenerCalcularMinutos(), covH.obtenerCalcularSegundos(), covH.obtenerCalcularDias());
        
        System.out.println("----------------------------------------");
        
        EquivalenteHora covH2 = new EquivalenteHora();
        //Valores de entrada del objeto 2
        double horas2 = 125.5;
        
        covH2.establecerHoras(horas2);
        covH2.calcularMinutos();
        covH2.calcularSegundos();
        covH2.calcularDias();
        
        //Se presenta los datos
        System.out.printf("\tEquivalente Horas\n\nHoras: %.2f \nEquivalente en minutos: %.2f \n"
                + "Equivalente en segundos: %.2f \nEquivalente en Días: %.2f\n", covH2.obtenerHoras(),     
                covH2.obtenerCalcularMinutos(), covH2.obtenerCalcularSegundos(), covH2.obtenerCalcularDias());
        
    }
}
