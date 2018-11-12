/*
 * Los métodos estáticos existen desde que el programa inicia, y solamente se pueden usar a través de la clase a la que pertenecen.
	No son instanciables.
	Son utiles para crear librerías de constantes y funciones, para usarlas sin crear objetos
 */

/**
 *
 * @author Gema Trevizo
 */
public class Principal {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
            System.out.println("Área de un Círculo  = " + Geometria.AreaCirculo(5));
            System.out.println("Área de un Cuadrado = " + Geometria.AreaCuadrado(5));
            System.out.println("Área de un Romboide = " + Geometria.AreaRomboide(5,5));
            System.out.println("Área de un Rombo = " + Geometria.AreaRombo(5, 5));
            System.out.println("Área de un Triángulo = " + Geometria.AreaTriangulo(5,5));
            System.out.println("Área de un Trapecio = " + Geometria.AreaTrapecio(5, 5, 5));
            System.out.println("Área de un Rectángulo = " + Geometria.AreaRectangulo(5, 6));
            System.out.println("Área de un Polígono regular = " + Geometria.AreaPoligonoRegular(10, 5, 2));
	}
	
}

class Geometria{
	
	// 08 Funciones de cálculos de área
	public static double AreaRectangulo(double b, double h){
		return (b*h)/2;
	}
	
	public static double AreaCuadrado(double l){
		return Math.pow(l, 2);
	}
	
	public static double AreaRomboide(double b,double h){
		return b*h;
	}
	
	public static double AreaRombo(double D,double d){
		return (D*d)/2;
	}
	
	public static double AreaTriangulo(double b, double h){
		return (b*h)/2;
	}
	
	public static double AreaTrapecio(double B, double b, double h ){
		return ((B+b)*h)/2;
	}
	
	public static double AreaCirculo(double r){
		return Math.PI*Math.pow(r, 2);
	}
	
	public static double AreaPoligonoRegular(double nLados, double l, double a){
		double perimetro = nLados*l;
		return (perimetro*a)/2;
	}
}
