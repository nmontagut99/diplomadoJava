package ejerciciosoperadores;

/**
 * @author Montagut
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        int numeroUno = 8;
        int numeroDos = 2;
        int auxiliar = numeroUno;

        System.out.println("numeroUno: " + numeroUno);
        System.out.println("numeroDos: " + numeroDos);
        System.out.println("-----------------------");
        numeroUno = numeroDos;
        numeroDos = auxiliar;

        System.out.println("numeroUno: " + numeroUno);
        System.out.println("numeroDos: " + numeroDos);
    }

}
