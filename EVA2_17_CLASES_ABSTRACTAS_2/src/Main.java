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
        Caballo cHorse = new Caballo(); //Intanciación de un objeto de tipo Caballo
        cHorse.movimiento();
    }
    
}

class Caballo extends Animal{ //La clase Caballo hereda de la clase Animal
    @Override //Sobre escribe el método movimiento de la clase Animal
    public void movimiento(){
        super.movimiento(); //Con el super la clase caballo puede acceder al movimiento de la clase Animal
        System.out.println("Galopar");//Mensaje
    }
}

class AnimalTrabajo{
    
}

abstract class Animal{
    public void movimiento(){ //Método
        System.out.println("Algún tipo de movimiento");//Mensaje
    }
}
