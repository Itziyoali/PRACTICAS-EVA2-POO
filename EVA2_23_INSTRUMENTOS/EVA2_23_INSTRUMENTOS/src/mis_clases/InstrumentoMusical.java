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
// Clase abstracta (clase padre) Instrumento musical
abstract public class InstrumentoMusical {
    // Atributo de la clase
    private String nombre;
    // Métodos get y set del atributo de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Método abstracto que se implementa para definir una acción de tocar el instrumento
    abstract public void tocarInstrumento();
    
}
