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
public class Guitarra extends InstrumentoMusical implements GuitarraElectrica, GuitarraAcustica{ // Clase guitarra que extiende de la clase instrumento musical e implementa las interfaces de guitarra electrica y guitarra acustica
    // Atributos de la clase
    private int numeroCuerdas;
    private String efectos;
    private int potencia;
     // Métodos get y set de los atributos de la clase
    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }
    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }
    
    //  Método tocar instrumento que imprime toda la información de la guitarra
    @Override
    public void tocarInstrumento() {
        System.out.println("Ráscale!!, Guitarra con " + numeroCuerdas); 
        System.out.println("La Guitarra es de tipo  " + getNombre());
        System.out.println("Tiene efectos: " + efectos);
        System.out.println("Tiene una potencia de: " + potencia);
        
    }
    @Override
    public void efectos(String tipoEfecto) {
        efectos = tipoEfecto;
    }
    @Override
    public void amplificador(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void GuitarraAcustica(String tipoGuitarra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


