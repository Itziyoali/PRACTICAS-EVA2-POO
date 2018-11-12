/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author Rogelio Antonio Chacón Alfaro
 */
public class Persona { // Clase persona (clase padre)
    private String nombre; // Atributos de la clase
    private String apellido;
    private int edad;
    private int estadoCivil;
    private String direccion;

    
    public Persona(){ // Constructor default para inicializar los atributos de la clase
        nombre = "Panfilo";
        apellido = "Pancrasio";
        edad = 15;
        estadoCivil = EstadoCivil.VIUDO;
        direccion = "Avenida siempre viva";
    }
 // Metodos get y set para los atributos de la clase
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    
    
}
