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
        Caballo cHorse = new Caballo();//Instaciación de un objeto de tipo Caballo
        //Imprimir
        cHorse.movimiento();
        cHorse.comer();
    }
    
}

class Caballo implements ComportamientoAnimal{ //La clase Caballo hereda de la interfaz ComportamientoAnimal
    //Sobre escribe los métodos de la interfaz 
    @Override
    public void movimiento() {
        System.out.println("Galopar");
    }
    @Override
    public void comer() {
        System.out.println("Comer pasto");
    }
}

interface ComportamientoAnimal{
    public void movimiento();
    public void comer();
    
}