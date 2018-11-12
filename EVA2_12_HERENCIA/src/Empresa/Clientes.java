/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empresa;

/**
 *
 * @author Gema Trevizo
 */
public class Clientes extends Persona{
    private String RFC; // Atributo de la clase clientes que extiende de la clase persona

    public String getRFC() { // Método get para obtener el RFC
        return RFC;
    }

    public void setRFC(String RFC) { // Método set para asignar el RFC
        this.RFC = RFC;
    }
}
