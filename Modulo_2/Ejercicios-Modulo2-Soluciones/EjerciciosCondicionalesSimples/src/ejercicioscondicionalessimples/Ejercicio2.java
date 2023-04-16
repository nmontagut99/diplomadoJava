package ejercicioscondicionalessimples;

import java.util.Scanner;

/**
 * @author Montagut
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        byte num1, num2;
        double pot;
        System.out.println("Primer numero: ");
        num1 = entrada.nextByte();
        System.out.println("Segundo numero: ");
        num2 = entrada.nextByte();

        if (num1 >= num2) {
            System.out.println("El numero base sera el " + num1 + " y el exponenete el " + num2);
            pot = Math.pow(num1, num2);
            System.out.println("Resultado: " + pot);
        } else {
            System.out.println("El numero base sera el " + num2 + " y el exponenete el " + num1);
            pot = Math.pow(num2, num1);
            System.out.println("Resultado: " + pot);
        }
    }
}
