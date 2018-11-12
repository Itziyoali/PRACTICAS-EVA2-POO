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
        Hijo hObj = new Hijo(); //Instanciación de un objeto tipo Hijo
        hObj.Algo();
        hObj.mensaje();
        hObj.otroMensaje();
    }    
}
class Hijo extends Padre implements Accesorio, AlgoMas{ //La clase hijo hereda de la clase Padre y hereda de las... 
    //Interfaces Accesorio y Algo más
    @Override //Sobre escribe los metodos de la interefaz Accesorio
    public void mensaje() {
        System.out.println("Hola mundo"); //To change body of generated methods, choose Tools | Templates.
    }
    @Override//Sobre excribe el método de la interfaz Algomas
    public void otroMensaje() {
        System.out.println("Otro mensaje"); //To change body of generated methods, choose Tools | Templates.
    }    
}
class Padre{
    public void Algo(){
        System.out.println("Mensaje en la clase base");
    }
}

interface Accesorio{ 
    public void mensaje();
}
interface AlgoMas{
    public void otroMensaje();
}