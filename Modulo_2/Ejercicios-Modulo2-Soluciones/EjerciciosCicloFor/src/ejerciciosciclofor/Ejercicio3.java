package ejerciciosciclofor;

import java.util.Scanner;
/**
 * @author Montagut
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();
        int j = 0;
        
        for (int i = 1 ; i < num ; i++){
            if (num % i == 0){
                System.out.println(i+" es divisor de "+num);
                j= j+i;
            }
        }
        if(num == j){
            System.out.println(num+" es un numero perfecto");
        }else{
            System.out.println(num+" no es un numero perfecto");
        }
    }
}
