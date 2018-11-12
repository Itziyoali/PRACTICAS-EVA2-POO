/*
 * Constructores:
	- Crear la clase
	- Inicializar su clase

	Java ---> Le agrega automáticamente un constructor default a su clase si el programador no lo declara explícitamente
	Java ---> Garbage collector
	En Java se inicializan automáticamente las variables declaradas: (int y double a 0) (string y char a null) (boolean a false)
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
		Principal pObjPpal = new Principal(); // Instanciando un objeto de tipo Principal
		Prueba pObjPrue = new Prueba(); // Instanciando un objeto de tipo Prueba
		System.out.println(pObjPrue.X); // Impresión de la variable X que se encuentra dentro de la clase Prueba
	}
}

class Prueba{
	int X;
	public Prueba() { // Constructor que inicializa la variable x = 100
		X = 100;
	}
	
}
