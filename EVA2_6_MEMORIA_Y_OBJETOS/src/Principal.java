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
		Prueba pO = new Prueba(); // Instanciación de un objeto de tipo Prueba
		pO.valor = 100; // Inicialización de la variable que se encuentra dentro del objeto creado
		
		System.out.println("El valor es " + pO.valor); // Impresión del valor de la variable
		// Copia
		int algo = 70;
		int copia = algo;
		System.out.println("algo = " + algo);
		System.out.println("copia = " + copia);
		algo = 1000;
		System.out.println("algo = " + algo);
		System.out.println("copia = " + copia);
		
		// Copia del objeto
		// Referencias: Variable que uarda una dirección en memoria
		// EN OTROS LENGUAJES: Apuntadores
		Prueba CopiapO = pO; // Creando dos variables que hacen referencia al mismo objeto en una dirección en memoria
		System.out.println("El valor es " + pO.valor);
		System.out.println("El valor es " + CopiapO.valor);
		pO.valor = 9999;
		System.out.println("El valor es " + pO.valor);
		System.out.println("El valor de la copia es " + CopiapO.valor);
	}
	
}

class Prueba{
	int valor; // 4 Bytes (mínimo)
}
