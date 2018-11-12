/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gema Trevizo
 */
public class Empleado extends Persona{ //La clase empleado hereda de la clase Persona
    private String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    //Puede tomar los atributos de la clase persona y la Clase empleado
    public void imprimirNombre(){
        System.out.println("Empleado: " + getNombre() + "" + getApellido() + getRFC());
    }
}
