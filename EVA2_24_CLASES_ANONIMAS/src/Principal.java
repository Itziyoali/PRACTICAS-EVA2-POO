/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**/
/**
 *
 * @author Gema Trevizo
 */
public class Principal implements ImprimirMensaje{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Principal mPrin = new Principal();
        //IMPRIMIR MENSAJE es una interfaz. NO SE PUEDEN CREAR
        //OBJETOS DE NTERFACES.
        //CREAR UNA CLASE ANÓNIMA QUE IMPLEMENTA LOS MÉTODOS DE
        //LA INTERFAZ
        ImprimirMensaje obImprimir = new ImprimirMensaje() { //Clase anonima
            @Override //Sobre escribe el método de la interfaz Imprimir mensaje
            public void imprimeMensaje(String sMensa) {
                System.out.println("Hola " + sMensa); //Imprime un saludo más el nombre del usuario que esta guardado el sMensa
            }
        };
        obImprimir.imprimeMensaje("Gema");
    }
    @Override
    public void imprimeMensaje(String sMensa) {
        System.out.println("Tevizo");
    }    
}
interface ImprimirMensaje{
    public void imprimeMensaje(String sMensa);
}
