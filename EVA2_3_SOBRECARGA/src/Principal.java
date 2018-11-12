/*
 *			Override ( Sobrecarga)
			- Mientras que los métodos reciban los mismos atributos el programa detecta errores
			- Mientras que los atributos sean diferentes pueden existir los métodos con el mismo nombre que sean requeridos
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
		Operaciones operaciones = new Operaciones(); // Instanciación de un objeto de tipo Operaciones
		System.out.println("La suma de 5 + 7 es = " + operaciones.suma(5, 7)); // Impresión de la suma de dos enteros
		System.out.println("La concatenación de Juan y Pérez es: " + operaciones.suma("Juan", "Pérez")); // Impresión de la concatenación de dos palabras
		System.out.println("La operación lógica de True && False es: " + operaciones.suma(true, false)); // Impresión de la suma booleana
	}
}

class Operaciones{
// Método suma con dos variables de tipo entero, que realiza la suma de dos enteros y regresa la suma
	public int suma(int x, int y){
		return x+y;
	}
	// Método suma de dos variables de tipo String, que realiza la concatenación y regresa una palabra
	public String suma(String palabra1, String palabra2){
		return palabra1+palabra2;		// Concatenando cadenas
	}
	// Método suma de dos variables de tipo booleano, que realiza la multiplicación booleana y regresa el resultado
	public boolean suma(boolean uno, boolean dos){
		return uno&&dos;  // Operación lógica AND
	}
}
