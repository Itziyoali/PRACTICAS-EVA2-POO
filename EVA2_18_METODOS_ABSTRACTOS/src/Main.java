/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gema Trevizo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caballo cHorse = new Caballo(); //Instanciación de un objeto de tipo Caballo
        cHorse.movimiento();
    }
    
}

class Caballo extends Animal{//La clase Caballo hereda de la Clase Animal

    @Override //Sobre escribe los métodos abstractos de la clase abstracta Animal
    public void movimiento() {
        System.out.println("Galopar");
    }

    @Override
    public void comer() {
        System.out.println("Comer");
    }
}

class Avestruz extends Animal{ //Laa clase avestruz hereda de la clase Animal

    @Override //Sobre escribe los métodos abstractos de la clase abstracta Animal
    public void movimiento() {
        System.out.println("Corre a madre!!");
    }

    @Override
    public void comer() {
        System.out.println("Turistas en el serengueti");
    }
    
}

abstract class Animal{
    abstract public void movimiento();  // Los métodos abstractos sólo pueden estar en clases abstractas
    abstract public void comer(); //Los métodos abstractos solo estan declarados pero no puede tener código
    public void respirar(){
            System.out.println("El animal está respirando");
    }
}
