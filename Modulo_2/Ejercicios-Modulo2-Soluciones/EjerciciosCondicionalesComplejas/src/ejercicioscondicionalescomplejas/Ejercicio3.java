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
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Primer numero: ");
        int num1 = entrada.nextInt();
        System.out.println("Segundo numero: ");
        int num2 = entrada.nextInt();
        System.out.println("Tercer numero: ");
        int num3 = entrada.nextInt();
        
        if(num1 > num2 && num1 > num3){
            if(num2 > num3){
                System.out.println("El numero mayor es "+ num1 + " seguido del "+ num2 + " y el menor es "+num3);
            }else{
                System.out.println("El numero mayor es "+ num1 + " seguido del "+ num3 + " y el menor es "+num2);
            }
        }else if (num2 > num1 && num2 > num3){
            if(num1 > num3){
                System.out.println("El numero mayor es "+ num2 + " seguido del "+ num1 + " y el menor es "+num2);
            }else{
                System.out.println("El numero mayor es "+ num2 + " seguido del "+ num3 + " y el menor es "+num1);
            }
        }else if (num3 > num1 && num3 > num2){
            if(num1 > num2){
                System.out.println("El numero mayor es "+ num3 + " seguido del "+ num1 + " y el menor es "+num2);
            }else{
                System.out.println("El numero mayor es "+ num3 + " seguido del "+ num2 + " y el menor es "+num1);
            }
        }
    }
}
