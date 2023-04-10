package ejerciciosoperadores;
/**
 * @author Montagut
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        int baseTriangulo = 9;
        int alturaTriangulo = 8;
        int ladoUnoTriangulo = 8;
        int ladoDosTriangulo = 8;
        int baseRectangulo = 8;
        int alturaRectangulo = 6;
        
        double areaTriangulo = ((baseTriangulo*alturaTriangulo)/2);
        int perimetroTriangulo = ladoUnoTriangulo+ladoDosTriangulo+baseTriangulo;
        
        int areaRectangulo = (baseRectangulo*alturaRectangulo);
        int perimetroRectagulo = ((baseRectangulo*2)+(alturaRectangulo*2));
        
        System.out.println("Area Triangulo: "+areaTriangulo+"cm^2");
        System.out.println("Perimetro Triangulo: "+perimetroTriangulo+"cm");
        
        System.out.println("Area Rectangulo: "+areaRectangulo+"cm^2");
        System.out.println("Perimetro Rectangulo: "+perimetroRectagulo+"cm");
        
        
    }
    
}
