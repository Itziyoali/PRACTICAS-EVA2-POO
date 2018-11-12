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
        Animal aObj = new Animal(); //Instancia de un objeto de tipo Animal
        aObj.movimiento();
        Caballo cHorse = new Caballo(); //Intancia de un objeto tipo Caballo
        cHorse.movimiento();
        ostra aOstra = new ostra(); //Instancia de un objeto tipo Osta
        aOstra.movimiento();
    }
    
}
class Caballo extends Animal{//La clase caballo hereda de Animal
    @Override // es para sobre escribir el método de la clase Animal
    public void movimiento(){
        System.out.println("Galopar");
    }
    public void movimiento (String sMovi){
        System.out.println(sMovi);
    }
}
class ostra extends Animal{ //La clase ostra hereda de la clase Animal
    
}
class Animal{ //Clae Padre
    public void movimiento(){
        System.out.println("Movimiento indefinido");
    }
}