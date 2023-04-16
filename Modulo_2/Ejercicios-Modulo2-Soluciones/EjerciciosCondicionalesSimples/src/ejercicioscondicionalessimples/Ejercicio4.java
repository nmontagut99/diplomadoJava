package ejercicioscondicionalessimples;
import java.util.Scanner;
/**
 * @author Montagut
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int num1, num2;
        System.out.println("Primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Segundo numero: ");
        num2 = entrada.nextInt();
        
        int res = num1%num2;
        
        if (num1%num2 == 0){
            System.out.println(num1+" Es multiplo de "+num2);
        }else{
            System.out.println(num1+" No es multiplo de "+num2);
        }
    }
}
