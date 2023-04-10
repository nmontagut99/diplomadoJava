package Ejercicios;
/**
 * @author Montagut
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        double notaUno = (int)(Math.random()*10);
        double notaDos = (int)(Math.random()*10);
        double notaTres = (int)(Math.random()*10);
        double notaCuatro = (int)(Math.random()*10);
        double notaCinco = (int)(Math.random()*10);
        
        double promedio = (notaCinco+notaCuatro+notaTres+notaDos+notaUno)/5;
        System.out.println(notaUno);
        System.out.println(notaDos);
        System.out.println(notaTres);
        System.out.println(notaCuatro);
        System.out.println(notaCinco);
        System.out.println("Promedio: "+promedio);
    }
}

