/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
		Test test = new Test(); // Instanciación de un objeto de tipo Test
		Test copia = test; // Asignando el mismo lugar en memoria que el objeto test
		test.x = 100; // Inicializando la variable x del objeto test con valor de 100
		System.out.println(test.x); // Impresión del valor de la variable x
		System.out.println(test); // Impresión del lugar en memoria del objeto test
		System.out.println(copia); // Impresión del lugar en memoria del objeto copia
		test = new Test(); // Declarando un nuevo lugar en memoria (Perdiendo los datos en la memoria anterior)
		System.out.println("Señor slim, usted tiene: " + test.x); // Impresión del valor en la variable x del objeto test
		System.out.println(test); // Impresión del nuevo lugar en memoria del objeto test
		System.out.println(copia); // Impresión del lugar en memoria del objeto copia
		test = null; // Perdiendo conexión con memoria el objeto test declarandolo como null
		System.out.println(test); // Impresión del lugar en memoria del objeto test (null)
		System.out.println(copia); // Impresión del lugar en memoria de la copia del objeto test
		System.out.println("Pereme Sr. Slim, tiene: " + copia.x); // Impresión del respaldo de la variable x
	}
	
}

class Test{
	int x;
}
