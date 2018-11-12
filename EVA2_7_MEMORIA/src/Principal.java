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
		System.out.println("Iniciando Main");
		A();
                // Núnca termina Main debido a que nunca termina A
		System.out.println("Terminando Main");
	}
	// Secuencia de los métodos, ¿Dónde empiezan, y cuándo terminan?
	public static void A(){
		System.out.println("Iniciando A");
                // Inicia A pero no termina hasta que termine B
		B();
                // Nunca termina A debido a que nunca termina B
		System.out.println("Terminando A");
	}
	
	public static void B(){
		System.out.println("Iniciando B");
                // Inicia B pero no termina hasta que termine C
		C();
                // Nunca termina B debido a que nunca termina C
		System.out.println("Terminando B");
	}
	
	public static void C(){
		System.out.println("Iniciando C");
                // Inicia C pero no termina hasta que termine C, se crea un bucle y hace que se agote la memoria debido a la llamada
                // del método de forma infinita
		C();
		System.out.println("Terminando C");
	}
}
