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
        double costo_terreno = 800;
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
        
        Terreno tro2 = new Terreno();
        
        //Valores de Entrada
        double costo_terreno2 = 400;
        double ancho2 = 60;
        double largo2 = 20;
        double valorMetroCuadrado2 = 16;
        
        tro.establecerAncho(ancho2);
        tro.establecerLargo(largo2);
        tro.establecerValorMetroCuadrado(valorMetroCuadrado2);
        tro.establecerArea();
        tro.calcularCosto_terreno();
        
        //Se presentan los datos
        System.out.printf("\n\n\tCosto de un Terreno \n\nAncho: %.2f \nLargo: %.2f "
                + " \nArea: %.2f \nValor Metro Cuadrado: %.2f \n\tEl Costo del  "
                + "Terreno es: %.2f\n", tro.obtenerAncho(), tro.obtenerLargo(), 
                    tro.obtenerArea(), tro.obtenerValorMetroCuadrado(),     
                    tro.obtenerCalcularCosto_Terreno());
        
    }
}
