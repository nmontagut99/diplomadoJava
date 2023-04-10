package Ejercicios;
/**
 * @author Montagut
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        double num1 = (int)(Math.random()*50);
        double num2 = (int)(Math.random()*50);
        
        int num1R = (int)Math.floor(num1);
        int num2R = (int)Math.ceil(num2);
        
        System.out.println("Num1 redondo = "+num1R);
        System.out.println("Num2 redondo = "+num2R);
        
        double mayor = Math.max(num1R, num2R);
        
        System.out.println("Numero mayor entre: "+num1R+" y "+num2R+" es: "+mayor);
    }
}
