/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioscondicionalescomplejas;

import java.util.Scanner;

/**
 *
 * @author Montagut
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Preguntas realizadas: ");
        int preguntasRealizadas = entrada.nextInt();
        System.out.println("Preguntas correctas: ");
        int preguntasCorrectas = entrada.nextInt();
        
        int porcentaje = ((preguntasCorrectas*100)/preguntasRealizadas);
        
        
        
        if(porcentaje >= 90){
            System.out.println("Su porcentaje de acierto fue de: "+porcentaje+"%");
            System.out.println("Nivel: Maximo");
        }else if(porcentaje >= 75 && porcentaje < 90){
            System.out.println("Su porcentaje de acierto fue de: "+porcentaje+"%");
            System.out.println("Nivel: Medio");
        }else if(porcentaje >= 50 && porcentaje < 75){
            System.out.println("Su porcentaje de acierto fue de: "+porcentaje+"%");
            System.out.println("Nivel: regular");
        }else if(porcentaje < 50){
            System.out.println("Su porcentaje de acierto fue de: "+porcentaje+"%");
            System.out.println("Nivel: Fuera de nivel");
        }else{
            System.out.println("error en datos");
        }
    }
}
