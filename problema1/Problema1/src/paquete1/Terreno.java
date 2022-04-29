/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author UTPL
 */
public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    public void calcularCosto_terreno(){
        costo_terreno = area * valorMetroCuadrado;
    }
    
    public void establecerAncho(double a){
        ancho = a;
    }
    
    public void establecerLargo(double a){
        largo = a;
    }
    
    public void establecerArea(){
        area = ancho * largo;
    }
    public void establecerValorMetroCuadrado(double a){
        valorMetroCuadrado = a;
    }
    
    public double obtenerCalcularCosto_Terreno(){
        return costo_terreno;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }
}
