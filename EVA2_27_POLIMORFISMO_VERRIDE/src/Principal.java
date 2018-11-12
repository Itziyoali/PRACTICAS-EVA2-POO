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
        Doctor dDoc = new Doctor(); //Intaciación de un objeto de tipo Doctor
        dDoc.tratarPaciente();
        Cirujano cStrange = new Cirujano(); //Instanciación de un objeto de tipo Cirujano
        cStrange.tratarPaciente();
        cStrange.cobrar();
        Doctor dChapatin = new Cirujano(); //Instanciación de un objeto de tipo Paciente
        dChapatin.tratarPaciente();
        Cirujano cHouse = (Cirujano)dChapatin;
        cHouse.cobrar();
    }    
}

class Cirujano extends Doctor{ //La clase Cirujano hereda de la clase Doctor
    public void cobrar(){
        System.out.println("Harta lana!!");
    }
    @Override //Sobre escribe el método de la clase Doctor
    public void tratarPaciente() {
        System.out.println("Cirugía a corazón abierto");
    }    
}

class Doctor{
    public void tratarPaciente(){
        System.out.println("Paracetamol");
    }
}
