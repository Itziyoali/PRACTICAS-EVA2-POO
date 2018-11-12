/*
 * This ---> Palabra reservada, se usa para acceder a los miembros de la clase.
 * Apuntador a la instancia actual de la clase.
 */

/**
 *
 * @author Gema Trevizo
 */
public class Principal {
	int x;
	
	public Principal(){ // Constructor usado para inicializar la variable x
		x = 10;
	}
	/**
	 * @param args the command line arguments
	 */
	static String Mensaje = "Hola";
	public static void main(String[] args) {
		Principal p = new Principal(); // Instanciación de un objeto de tipo Principal
		p.Imprimir(); // Llamada al método imprimir
		p.Imprimir2(10000); // Llamada al método imprimir2 con un argumento
		String Mensaje = "Nada de hola";
		System.out.println(Mensaje); // Impresión de la variable Mensaje que está dentro del main
		for (int i = 0; i < args.length; i++) {
			System.out.println(i); // Impresión de la variable i que sólo existe dentro del for
		}
		
	} // Aquí se eliminan todas las variables creadas
	
	public void Imprimir(){
		System.out.println("X = " + x); // Impresión de la variable x de la clase
	}
	
	public void Imprimir2(int x){
		System.out.println("X = " + x); // Impresión de la variable x (argumento del método)
		System.out.println("X = " + this.x); // Impresión de la variable x de la clase usando el this para referirse a ella
	}
	
}
