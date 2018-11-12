/*
 *			Sobre carga de métodos (Override)   
			Mismo nombre diferentes métodos
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
		Banco bMiCuenta = new Banco(); // Instanciación de un objeto de tipo Banco
		Banco bMiCuenta2 = new Banco("Juan Perez", 100000); // Instanciación de un segundo objeto de tipo Banco pero usando un 
                // constructor con argumentos
		
                // Impresión de los datos del primer objeto
		System.out.println("Nombre del cliente: " + bMiCuenta.getNombreCliente());
		System.out.println("Saldo: " + bMiCuenta.getSaldo());
		
		System.out.println("\n");
		// Impresión de los datos del segundo objeto
		System.out.println("Nombre del cliente: " + bMiCuenta2.getNombreCliente());
		System.out.println("Saldo: " + bMiCuenta2.getSaldo());
	}
	
}

class Banco{
	private String nombreCliente; // Atributos de la clase
	private double saldo;
	
	public Banco(){
            // Inicializando los atributos de la clase con un constructor
		nombreCliente = "Rogelio Antonio Chacón Alfaro";
		saldo = 100000;
	}

	public Banco(String nombreCliente, double saldo) {
            // Inicializando los atributos de la clase asignandole los valores de los argumentos
		this.nombreCliente = nombreCliente;
		this.saldo = saldo;
	}
	
	
          // Métodos Get y Set de los atributos
	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
