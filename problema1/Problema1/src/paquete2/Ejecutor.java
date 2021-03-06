/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

import paquete1.Terreno;

/**
 *
 * @author UTPL
 */
public class Ejecutor {
    public static void main(String[] args) {
        Terreno tro = new Terreno();
        
        //Valores de Entrada
        double ancho = 40;
        double largo = 80;
        double valorMetroCuadrado = 15.60;
        
        tro.establecerAncho(ancho);
        tro.establecerLargo(largo);
        tro.establecerValorMetroCuadrado(valorMetroCuadrado);
        tro.establecerArea();
        tro.calcularCosto_terreno();
        
        //Se presentan los datos
        System.out.printf("\tCosto de un Terreno \n\nAncho: %.2f \nLargo: %.2f "
                + " \nArea: %.2f \nValor Metro Cuadrado: %.2f \n\tEl Costo del  "
                + "Terreno es: %.2f\n", tro.obtenerAncho(), tro.obtenerLargo(), 
                    tro.obtenerArea(), tro.obtenerValorMetroCuadrado(),     
                    tro.obtenerCalcularCosto_Terreno());
        
        System.out.println("---------------------------------------------");
        
        Terreno tro2 = new Terreno();
        
        //Valores de Entrada
        double ancho2 = 60;
        double largo2 = 20;
        double valorMetroCuadrado2 = 16;
        
        tro2.establecerAncho(ancho2);
        tro2.establecerLargo(largo2);
        tro2.establecerValorMetroCuadrado(valorMetroCuadrado2);
        tro2.establecerArea();
        tro2.calcularCosto_terreno();
        
        //Se presentan los datos
        System.out.printf("\n\tCosto de un Terreno \n\nAncho: %.2f \nLargo: %.2f "
                + " \nArea: %.2f \nValor Metro Cuadrado: %.2f \n\tEl Costo del  "
                + "Terreno es: %.2f\n", tro2.obtenerAncho(), tro2.obtenerLargo(), 
                    tro2.obtenerArea(), tro2.obtenerValorMetroCuadrado(),     
                    tro2.obtenerCalcularCosto_Terreno());
        
    }
}
