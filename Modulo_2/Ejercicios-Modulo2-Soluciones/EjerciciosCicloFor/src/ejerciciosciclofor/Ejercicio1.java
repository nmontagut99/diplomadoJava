package ejerciciosciclofor;

import java.util.Scanner;
/**
 * @author Montagut
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();
        int j = 1;
        System.out.println("----------");
        for (int i = 1; i <= num ; i++){
            System.out.println(i);
            
            j = j*i;
             
        }
        System.out.println("----------");
        System.out.println("El resultado del factorial es: "+j);
       
    }
}
