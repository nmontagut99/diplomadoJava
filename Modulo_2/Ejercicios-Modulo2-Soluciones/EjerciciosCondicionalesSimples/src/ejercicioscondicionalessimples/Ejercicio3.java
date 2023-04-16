package ejercicioscondicionalessimples;
import java.util.Scanner;
/**
 * @author Montagut
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();
        //System.out.println("El numero "+num+" es:"+((num < 0) ? " Menor a cero" : " Mayor a cero"));
        
        if (num < 0){
            System.out.println("El numero "+num+" es menor que 0");
        }else{
            System.out.println("El numero "+num+" es mayor que 0");
        }
        
    }
}
