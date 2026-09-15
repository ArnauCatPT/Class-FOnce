/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosiniciales;

/**
 *
 * @author UsuarioM
 */
public class PrecioDto {
    public static void mostrarDto(float precioO, float precioP){
        float descuento = precioO - precioP;
        float porcentaje = ((precioO - precioP)/precioO)*100;
        
        
        System.out.println("Ahorro en cantidad (Descueto): "+descuento);
        System.out.println("Porcentaje del Descuento: "+porcentaje);
    }

}
