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
        Animal aAni = new Animal();         // Instanciación de un objeto de tipo animal
        Mamifero mMam = new Mamifero();         // Instanciación de un objet de tipo mamifero
        Mamifero mJirafa = new Mamifero("pararse"); // Instanciación de un objeto de tipo Mamifero con el constructor que realiza una accion al iniciarse
        
    }
    
}
class Mamifero extends Animal{
    public Mamifero(){
        //LO PRIMERO ES LLAMAR AL CONSTRUCTOR
        //DE LA CLASE BASE
        super();
    }
    public Mamifero(String accion){ // Constructor con argumento (realiza una accion)
        super(accion);
        System.out.println("Y salir corriendo");
    }
}
class Animal{
    public Animal(){ // Constructor default
        System.out.println("Respirando");
    }
    public Animal(String accion){ // Constructor con argumento (realiza una accion)
        System.out.println("Respirar y " + accion);
    }
}
