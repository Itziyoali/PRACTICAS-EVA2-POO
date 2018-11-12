
import mis_vehiculos.Vehiculo;

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
		Vehiculo v = new Vehiculo(); // Instanciación de un objeto de tipo Vehiculo haciendo uso del constructor default
		v.Imprimir(); // Llamada al método imprimir que se encuentra dentro del objeto v
		
		System.out.println("");
		
		Vehiculo V = new Vehiculo("F-150", "Ford", 2017, 8); // Instanciación de un objeto de tipo Vehiculo pero haciendo uso del constructor definido con argumentos
		V.Imprimir(); // Llamada al método imprimir que se encuentra dentro del objeto v
	}
	
}
