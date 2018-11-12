/*
 * Métodos estáticos no requieren que se cree una instancia de la clase para poderlos usar
	En el momento en que se instancia el objeto, se crea la clase junto con todos sus métodos.
	Antes de tener el new no existe el código.
	A menos de que sea estático
	En cuanto el programa arranca, todo lo que está declarado estático se crea.

	Principalmente el método estático se usa para crear librerías
 */

/**
 *
 * @Gema Trevizo
 */
public class Principal {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
            // Impresión de los métodos sin necesidad de instanciar el objeto debido a que son estáticos
		System.out.println("Hola" + Operaciones.valor);
                System.out.println(Operaciones.suma(5, 10));
                System.out.println(Operaciones.suma(true, true));
                System.out.println(Operaciones.suma("Hola", " Adiós"));
	}
	
}

class Operaciones{
	static int valor = 100;
	public static int suma(int x, int y){
		return x + y;
	}
	
	public static String suma(String x, String y){
		return x + y;
	}
	
	public static boolean suma(boolean x, boolean y){
		return x && y;
	}
}
