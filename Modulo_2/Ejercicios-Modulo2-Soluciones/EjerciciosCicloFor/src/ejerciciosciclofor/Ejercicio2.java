package ejerciciosciclofor;

import java.util.Scanner;
/**
 * @author Montagut
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num = 12;
        
        for (int i = 1 ; i <= num ; i++){
            if (num % i == 0){
                System.out.println(i+" es divisor de "+num);
            }
        }
    }
}
