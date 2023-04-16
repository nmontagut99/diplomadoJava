package ejercicioscondicionalessimples;
/**
 * @author Montagut
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        double aleatorio = Math.random()*100;
        //System.out.println("El numero: "+Math.round(aleatorio)+" es "+((aleatorio<50) ? "menor que 50" : " mayor que 50"));
        if (aleatorio < 50){
            System.out.println("El numero "+Math.round(aleatorio)+" es menor que 50");
        }else if (aleatorio == 50){
            System.out.println("El numero "+Math.round(aleatorio)+" es igual que 50");
        }else{
            System.out.println("El numero "+Math.round(aleatorio)+" es mayor que 50");
        }
    }
}
