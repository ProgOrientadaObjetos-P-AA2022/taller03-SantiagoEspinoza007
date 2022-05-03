/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

import paquete1.EquipoCelular;

/**
 *
 * @author Santiago Espinoza
 */
public class Ejecutor {

    
    public static void main(String[] args) {
        EquipoCelular celu = new EquipoCelular();
        
        //Ingreso de Datos
        String sistemaOperativo = "Android 10";
        String tamanoDePantalla = "6.5 Inch";
        double costoInicial = 320;
        double iva_enPorcentaje = 12.2;        
        String direccionMac = "D6-59-61-5C-77-B1";
        long informacionIMEI = 255600903967923L;
        
        celu.establecerSistemaOperativo(sistemaOperativo);
        celu.establecerTamanoDePantalla(tamanoDePantalla);
        celu.establecerCostoInicial(costoInicial);
        celu.establecerIva_enPorcentaje(iva_enPorcentaje);
        celu.establecerDireccionMac(direccionMac);
        celu.establecerInformacionIMEI(informacionIMEI);
        celu.calcularIva_delCostoInicial();
        celu.calcularCostoFinal();
        
        //Presentar los Datos
        System.out.printf("\tEquipo Celular\nSistema Operativo: %s \nTamaño de Pantalla: %s  "
                + "\nDirección Mac: %s\nInformación IMEI: %d \nCosto Inicial: %.2f \nIva en Porcentaje: "
                + "%.2f \n\t  Iva del Costo Inicial: %.2f \n\t->Costo Final: %.2f\n", celu.obtenerSistemaOperativo(),     
                celu.obtenerTamanoDePantalla(), celu.obtenerDireccionMac(), celu.obtenerInformacionIMEI(),  
                celu.obtenerCostoInicial(), celu.obtenerIva_enPorcentaje(), celu.obtenerCalcularIva_delCostoInicial(),  
                celu.obtenerCalcularCostoFinal());
        
        System.out.println("------------------------------------------------");
        
        EquipoCelular celu2 = new EquipoCelular();
        
        //Ingreso de Datos
        String sistemaOperativo2 = "iOS 11";
        String tamanoDePantalla2 = "5.8 Inch";
        double costoInicial2 = 780;
        double iva_enPorcentaje2 = 12.2;        
        String direccionMac2 = "5A-B0-004-35-D6-ED";
        long informacionIMEI2 = 356741083257799L;
        
        celu2.establecerSistemaOperativo(sistemaOperativo2);
        celu2.establecerTamanoDePantalla(tamanoDePantalla2);
        celu2.establecerCostoInicial(costoInicial2);
        celu2.establecerIva_enPorcentaje(iva_enPorcentaje2);
        celu2.establecerDireccionMac(direccionMac2);
        celu2.establecerInformacionIMEI(informacionIMEI2);
        celu2.calcularIva_delCostoInicial();
        celu2.calcularCostoFinal();
        
        //Presentar los Datos
        System.out.printf("\n\tEquipo Celular 2\nSistema Operativo: %s \nTamaño de Pantalla: %s  "
                + "\nDirección Mac: %s\nInformación IMEI: %d \nCosto Inicial: %.2f \nIva en Porcentaje: "
                + "%.2f \n\t  Iva del Costo Inicial: %.2f \n\t->Costo Final: %.2f\n", celu2.obtenerSistemaOperativo(),     
                celu2.obtenerTamanoDePantalla(), celu2.obtenerDireccionMac(), celu2.obtenerInformacionIMEI(),  
                celu2.obtenerCostoInicial(), celu2.obtenerIva_enPorcentaje(), celu2.obtenerCalcularIva_delCostoInicial(),  
                celu2.obtenerCalcularCostoFinal());
        
    }
}
