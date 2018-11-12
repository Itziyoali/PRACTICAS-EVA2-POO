/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_vehiculos;

/**
 *
 * @author Gema Trevizo
 */
public class Vehiculo {
    // Atributos de la clase Vehiculo
	private String modelo;
	private String marca;
	private int año;
	private int cilindros;
	private boolean encendido;
	private int velocimetro;
	
	public Vehiculo(){ // Inicialización de los atributos por medio de un constructor default
		this.año = 1950;
		this.marca = "Volkswagen";
		this.cilindros = 1;
		this.modelo = "Vocho";
		this.encendido = false;
		this.velocimetro = 0;
	}
	
	public Vehiculo(String modelo, String marca, int año, int cilindros){ // Inicialización de los atributos por medio de un constructor con argumentos
		this.modelo = modelo;
		this.marca = marca;
		this.año = año;
		this.cilindros = cilindros;
		this.encendido = false;
		this.velocimetro = 0;
	}
        // Métodos get y set de los atributos
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}
	
	// Imprimir los datos del vehículo
	
	public void Imprimir(){
		System.out.println("Datos del vehículo");
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + año);
		System.out.println("Cilindros: " + cilindros);
	}
        
	public void Encender(){
		encendido = true;
	}
	
	public void Apagar(){
		encendido = false;
	}
	// Método para acelerar el vehículo
	public void Acelerar(){
		if(encendido == true){
			velocimetro += 10;
		}
	}
	// Método para frenar el vehículo
	public void Frenar(){
		if(encendido == true && velocimetro > 0){
			velocimetro -= 10;
		}
	}
	
	
}
