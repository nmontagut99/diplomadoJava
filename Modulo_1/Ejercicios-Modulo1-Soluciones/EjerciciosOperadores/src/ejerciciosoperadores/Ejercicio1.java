package ejerciciosoperadores;
import java.util.Scanner;
/**
 * @author Montagut
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ejercicio 1 - Promedio de notas");
        String nombre;
        double nota1, nota2, nota3, nota4, nota5;
        double promedio;
        
        System.out.print("Nombre del estudiante: ");
        nombre = entrada.next();
        System.out.print("Ingrese la nota #1: ");
        nota1 = entrada.nextDouble();
        System.out.print("Ingrese la nota #2: ");
        nota2 = entrada.nextDouble();
        System.out.print("Ingrese la nota #3: ");
        nota3 = entrada.nextDouble();
        System.out.print("Ingrese la nota #4: ");
        nota4 = entrada.nextDouble();
        System.out.print("Ingrese la nota #5: ");
        nota5 = entrada.nextDouble();
        
        promedio = (nota1+nota2+nota3+nota4+nota5)/5;
        
        System.out.println("El promedio de notas del estudiante "+nombre+" es: "+promedio);
    
    }
    
}
