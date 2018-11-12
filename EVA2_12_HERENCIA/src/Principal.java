
import Empresa.Clientes;
import Empresa.Empleados;
import Empresa.EstadoCivil;
import Empresa.Persona;

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
        Persona p1 = new Persona(); // Instanciación de un objeto de tipo Persona
//        p1.setNombre("Rogelio");
//        p1.setApellido("Chacón");
//        p1.setEstadoCivil(EstadoCivil.SOLTERO);
System.out.println(p1.getNombre() + " " + p1.getApellido() + " " + p1.getEdad()); // Impresión de los datos del objeto persona
        
        Clientes c1 = new Clientes(); // Instanciación de un objeto de tipo clientes
//        c1.setNombre("Brandon");
//        c1.setApellido("Erives");
//        c1.setRFC("sañdjaskljdlkasjd");

System.out.println(c1.getNombre() + " " + c1.getApellido() + " " + c1.getEdad()); // Impresión de los datos del objeto clientes
        
        Empleados e1 = new Empleados(); // Instanciación de un objeto de tipo Empleados
//        e1.setNombre("Saul");
//        e1.setApellido("Martinez");
//        e1.setSalario(1500);
System.out.println(e1.getNombre() + " " + e1.getApellido() + " " + e1.getEdad()); // Impresión de los datos del objeto empleados
    }
    
}
