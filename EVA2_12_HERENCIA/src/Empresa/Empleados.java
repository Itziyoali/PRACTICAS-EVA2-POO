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
public class Empleados extends Persona{ // Clase empleado que extiende de la clase persona
    private double Salario; // Atributo de la clase

    public double getSalario() { // Método get para obtener el salario
        return Salario;
    }

    public void setSalario(double Salario) { // Método set para asignar el salario
        this.Salario = Salario;
    }
    
    
}
