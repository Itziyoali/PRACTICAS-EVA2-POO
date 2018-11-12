
import mis_clases.Guitarra;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gema Trevizo
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Guitarra gMiGuitarra = new Guitarra(); // Instanciación de un objeto de tipo Guitarra
        gMiGuitarra.setNombre("Gibson"); // Asignación de nombre a la guitarra
        gMiGuitarra.setNumeroCuerdas(6); // Asignación del número de cuerdas de la guitarra
        gMiGuitarra.efectos("Wah"); // Asignación del efecto de la guitarra
        gMiGuitarra.amplificador(10000); // Asignación de la potencia del amplificador de la guitarra
        gMiGuitarra.tocarInstrumento(); // Llamada al método de tocar el instrumento
        
        
    }
    
}
