/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

/**
 *
 * @author Santiago Espinoza
 */
public class EquivalenteHora {

    private double horas;
    private double minutos;
    private double segundos;
    private double dias;
    
    public void establecerHoras(double a){
        horas = a;
    }
    
    public void calcularMinutos(){
        minutos = horas * 60;
    }
    
    public void calcularSegundos(){
        segundos = horas * 3600;
    }
    
    public void calcularDias(){
        dias = horas / 24;
    }
    
    public double obtenerHoras(){
        return horas;
    }
    
    public double obtenerCalcularMinutos(){
        return minutos;
    }
    
    public double obtenerCalcularSegundos(){
        return segundos;
    }
    
    public double obtenerCalcularDias(){
        return dias;
    }
    
}
