/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_clases;

/**
 *
 * @author Rogelio Antonio Chacón Alfaro
 */
public interface GuitarraElectrica {
    // Interfaz GuitarraElectrica que implementa los métodos para asignar el tipo de efecto que tendrá la guitarra y la potencia del amplificador
    public void efectos(String tipoEfecto);
    public void amplificador(int potencia);    
}
