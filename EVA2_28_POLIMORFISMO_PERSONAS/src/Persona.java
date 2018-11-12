/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gema Trevizo
 */
abstract class Persona { //Creación de una clase abstracta
    //Atributos de la Clase Persona y métodos Get y Set
    private String nombre; 
    private String apellido;

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
    //Método
    public void imprimirNombre(){
        
    }
    
}
