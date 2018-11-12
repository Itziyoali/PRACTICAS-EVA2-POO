/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gema Trevizo
 */
public class Alumno extends Persona{ //La clase Alumno hereda de la clase Persona
    private int noControl; //Atributo
//Métodos Get y Set
    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }
    
    public void imprimirNombre(){
        System.out.println("Alumno: " + getNombre() + "" + getApellido() + getNoControl());
    }
}
