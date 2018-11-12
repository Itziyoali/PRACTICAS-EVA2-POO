
import MisClases.Color;
import MisClases.Linea;
import MisClases.Punto;
import MisClases.Rectangulo;
import java.util.Scanner;

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
        Rectangulo rRect = new Rectangulo(); //Instanciación de un Objeto de tipo Rectangulo
        Scanner leer = new Scanner(System.in);
        System.out.println("Base");//Mensaje
        int iBase = leer.nextInt(); //Pedimos al usuario que ingrese la medida de la base
        System.out.println("Altura");//Mensaje
        int iAltura = leer.nextInt();//Pedimos al usuario que ingrese la medida de la altura
        Punto pIni = new Punto(); //Instanciación de un objeto de tipo Punto
        //Con los Set guardamos los atributos
        pIni.setY(0);
        pIni.setX(0);
        rRect.setEsqSupIz(pIni);
        rRect.setBase(iBase);
        rRect.setAltura(iAltura);
        rRect.dibujar();
        System.out.println("\nArea = " + rRect.calculaArea()); //Se imprime el area 
        
    }
    
}
