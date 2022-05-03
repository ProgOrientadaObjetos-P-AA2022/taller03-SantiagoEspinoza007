/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Santiago Espinoza
 */
public class EquipoCelular {
    private String sistemaOperativo;
    private String tamanoDePantalla;
    private double costoInicial;
    private double iva_enPorcentaje;
    private double iva_delCostoInicial;
    private double costoFinal;
    private String direccionMac;
    private long informacionIMEI;
    
    public void establecerSistemaOperativo(String a){
        sistemaOperativo = a;
    }
    
    public void establecerTamanoDePantalla(String a){
        tamanoDePantalla = a;
    }
    
    public void establecerCostoInicial(double a){
        costoInicial = a;
    }
    
    public void establecerIva_enPorcentaje(double a){
        iva_enPorcentaje = a;
    }
    
    public void calcularIva_delCostoInicial(){
        iva_delCostoInicial = costoInicial * (iva_enPorcentaje/100);
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial + iva_delCostoInicial;
    }
    
    public void establecerDireccionMac(String a){
        direccionMac = a;
    }
    
    public void establecerInformacionIMEI(long a){
        informacionIMEI = a;
    }
    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public String obtenerTamanoDePantalla(){
        return tamanoDePantalla;
    }
    
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public double obtenerIva_enPorcentaje(){
        return iva_enPorcentaje;
    }
    
    public double obtenerCalcularIva_delCostoInicial(){
        return iva_delCostoInicial;
    }
    
    public double obtenerCalcularCostoFinal(){
        return costoFinal;
    }
    
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    
    public long obtenerInformacionIMEI(){
        return informacionIMEI;
    }
}
