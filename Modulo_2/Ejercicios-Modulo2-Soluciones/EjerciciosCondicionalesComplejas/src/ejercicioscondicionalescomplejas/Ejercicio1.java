package ejercicioscondicionalescomplejas;

import java.util.Scanner;

/**
 * @author Montagut
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        byte edad = entrada.nextByte();
        
        if(edad >= 0 && edad <6){
            System.out.println("Infante");
        }else if(edad >= 6 && edad <11){
            System.out.println("Niño");
        }else if(edad >= 11 && edad <16){
            System.out.println("Pre adolescente");
        }else if(edad >= 16 && edad <19){
            System.out.println("Adolescente");
        }else if(edad >= 19 && edad <26){
            System.out.println("Pre adulto");
        }else if(edad >= 26 && edad <41){
            System.out.println("Adulto");
        }else if(edad >= 41 && edad <56){
            System.out.println("Pre anciano");
        }else if(edad >= 56){
            System.out.println("Anciano");
        }else{
            System.out.println("Edad erronea");
        }
    }
 
}
