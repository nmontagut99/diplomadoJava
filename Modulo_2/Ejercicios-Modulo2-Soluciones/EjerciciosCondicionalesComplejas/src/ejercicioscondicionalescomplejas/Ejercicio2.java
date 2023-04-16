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
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero de 4 cifras");
        int num = entrada.nextInt();
        if(num >999 && num < 10000){
            System.out.println(num+" Si es un numero de 4 cifras");
        }else{
            System.out.println(num+" No es un numero de 4 cifras");
        }
    }
}
