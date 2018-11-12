/*
 * clase abstracta --> una que no sirve para generar objetos, solo sirve como base para herencia 
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
        Ostra oPalCocktail = new Ostra(); //Instanciación de un Objeto de tipo Ostra
        oPalCocktail.movimiento();
    }
}
//FINAL --> YA NOSE PUEDE HEREDAR DE OSTRA
final class Ostra extends Animal{
    
}
abstract class Animal{ //Creación de una clase abstracta
public void movimiento(){
    System.out.println("Movimiento indefinido");
}
        }