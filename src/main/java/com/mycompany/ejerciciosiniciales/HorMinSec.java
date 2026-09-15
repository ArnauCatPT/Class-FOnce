/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciosiniciales;

/**
 *
 * @author UsuarioM
 */
public class HorMinSec {
    public static void mostrarSec(int segundos){

        int horas = segundos/3600;
        int minutos = (segundos%3600)/60;
        int segundosF = segundos%60;    
        
        
        System.out.println("Horas: "+horas+"h Minutos: "+minutos+" min Sec: "+segundosF);
        
    }
}
