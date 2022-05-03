/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Santiago Espinoza
 */
public class EntidadAdministrativa {
    private String nombre;
    private String tipoDeInstitucion;
    private int numeroDeEstudiantes;
    private int numeroDeDocentes;
    private int numeroDeSedes;
    private double gastosProyectadoPorEstudiante;
    private double presupuesto;
    
    public void establecerNombre(String a){
        nombre = a;
    }
    
    public void establecerTipoDeInstitucion(String a){
        tipoDeInstitucion = a;
    }
    
    public void establecerNumeroDeEstudiantes(int a){
        numeroDeEstudiantes = a;
    }
    
    public void establecerNumeroDeDocentes(int a){
        numeroDeDocentes = a;
    }
    
    public void establecerNumeroDeSedes(int a){
        numeroDeSedes = a;
    }
    
    public void establecerGastosProyectadoPorEstudiante(double a){
        gastosProyectadoPorEstudiante = a;
    }
    
    public void calcularPresupuesto(){
        presupuesto = numeroDeEstudiantes * gastosProyectadoPorEstudiante;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoDeInstitucion(){
        return tipoDeInstitucion;
    }
    
    public int obtenerNumeroDeEstudiantes(){
        return numeroDeEstudiantes;
    }
    
    public int obtenerNumeroDeDocentes(){
        return numeroDeDocentes;
    }
    
    public int obtenerNumeroDeSedes(){
        return numeroDeSedes;
    }
    
    public double obtenerGastosProyectadoPorEstudiante(){
        return gastosProyectadoPorEstudiante;
    }
    
    public double obtenerCalcularPresupuesto(){
        return presupuesto;
    }
    
}
