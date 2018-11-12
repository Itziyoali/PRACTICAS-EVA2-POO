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
        //POLIMORFISMO
        //ESTO ESTÁ BIEN --> PADRE = new HIJO
        //ESTO NO ESTÁ BIEN --> HIJO = new PADRE
        Persona pPer = new Alumno();
        pPer.setNombre("Josué");
        pPer.setApellido("Martínez");
        //CASTING
        Alumno aAlu = (Alumno)pPer; //OBJETO
        
        //AQUI SE INICA QUE IMPRIMA EL NOMBRE Y EL NUMERO DE CONTROL
        System.out.println(aAlu.getNombre());
        System.out.println(aAlu.getApellido());
        System.out.println(aAlu.getNumeroContol());
    }
    
}
//CLASE
class Alumno extends Persona{//INDICA QUE LA CLASE ALUMNO SE EXTIENDE DE PERSONA 
    private int numeroContol;
    
    public Alumno(){//CONSTRUCTOR
        numeroContol = 18550360; //ATRIBUTOS DEL CONSTRUCTOR
    }

    //METODOS GET Y SET
    public int getNumeroContol() {
        return numeroContol;
    }

    public void setNumeroContol(int numeroContol) {
        this.numeroContol = numeroContol;
    }
    
}
class Empleado extends Persona{//LA CLASE EMPLEADO SE EXTIENDE DE PERSO A
    private String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    
}

class Persona{//CLASE PERSONA
    //PARAMETROS
    private String nombre;
    private String apellido;
    
    //METODOS GET Y SET
    /*El metodo Get y Set funcionan para recibir valores
    , tambien devuelven valores y acceden a los valores de algunaclase.
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    } 
    
}
