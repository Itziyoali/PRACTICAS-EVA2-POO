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
        Empleado eEmp = new Empleado(); //Instanciación de un objeto de tipo Empleado
        //Imprimir datos del empleado
        eEmp.setNombre("Ralo ");
        eEmp.setApellido("Solo ");
        eEmp.setRFC("SJDF4895");
        
        Alumno aAlu = new Alumno();//Instanciación de un objeto de tipo Alumno
        //Imprimir datos del alumno
        aAlu.setNombre("Gema ");
        aAlu.setApellido("Trevizo ");
        aAlu.setNoControl(18550294);
        
        imprimirDatos(eEmp);
        imprimirDatos(aAlu);
    }
    public static void imprimirDatos(Persona pPerso){
        pPerso.imprimirNombre();
    }
}
