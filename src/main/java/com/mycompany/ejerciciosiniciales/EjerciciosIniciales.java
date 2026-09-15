/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciosiniciales;

import java.util.Scanner;

/**
 *
 * @author UsuarioM
 */
public class EjerciciosIniciales {

    public static void main(String[] args) {

        //Ejkercicio 1: Euros a pesetas
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ejercicio 1: Ingrrese una cantidad de Euros");

        float euros = sc.nextFloat();
        
        EurosPesetas.mostrarPesetas(euros);
        
        //Ejercio 2: Pesetas a Euros
        
        System.out.println("Ejercicio2 : Ingrrese una cantidad de Pesetas");
        int pesetas = sc.nextInt();

        PesetasEuros.mostrarEuros(pesetas);

        //Ejercicio 3: 
        System.out.println("Ejercicio 3");

        System.out.println("Ingrrese una cantidad de km");
        //se ha de teclear al entrar en el valor una coma, pero las operaciones en punto
        int e = sc.nextInt();
        System.out.println("Ingrrese una cantidad en horas");
        //se ha de teclear al entrar en el valor una coma, pero las operaciones en punto
        float t = sc.nextInt();

        Kilometros.mostrarMetros(e,t);
        
        //Ejercicio 4: base x altura
        System.out.println("Ejercicio 4");

        System.out.println("Ingrrese la base de un triangulo rectangulo");
        int base = sc.nextInt();
        System.out.println("Ingrrese la altura  de un triangulo rectangulo");
        int altura = sc.nextInt();

        BaseXAltura.mostrarArea(base,altura);
        
        //Ejercicio 5: Millas maritimas
        System.out.println("Ejercicio 5");

        System.out.println("Ingrrese una cantidad de Millas maritiumas");
        int distancia = sc.nextInt();

        MillasMaritimas.mostrarMetro(distancia);
        
        //Ejercicio 6: circumferencia 
        System.out.println("Ejercicio 6");

        System.out.println("Ingrrese el radio de la circumferencia");
        int radio = sc.nextInt();
        
        LongCircum.mostrarLongArea(radio);

        //Ejercicio 7: Potencia
        System.out.println("Ejercicio 7");
        System.out.println("Ingrrese el Voltaje");
        int voltaje = sc.nextInt();
        System.out.println("Ingrrese la Intensidad");
        int intensidad = sc.nextInt();

        Potencia.mostrarPotencia(voltaje,intensidad);
        
        //Ejercicio 8: Precio x Descuento
        System.out.println("Ejercicio 8");
        System.out.println("Precio Original");
        float precioO = sc.nextFloat();
        System.out.println("Precio Pagado");
        float precioP = sc.nextFloat();
        
        PrecioDto.mostrarDto(precioO,precioP);
        
        //Ejercicio 9: 
        System.out.println("Ejercicio 9");
        
        System.out.println("Introduce una cantidad en segundos");
        int segundos = sc.nextInt();

        HorMinSec.mostrarSec(segundos);
        
    }
}
