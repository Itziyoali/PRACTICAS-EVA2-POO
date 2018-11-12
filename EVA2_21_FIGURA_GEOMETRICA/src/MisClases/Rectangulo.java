/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author Gema Trevizo
 */
public class Rectangulo extends FiguraGeometrica{ //La clase rectangulo hereda de FiguraGeometrica
    //Atributos de la clase Rectangulo
    private int base;
    private int altura;
//Getter and Setter de los atributos
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }  
    
    @Override
    public int calculaArea() {
        return (base*altura);
    }
    @Override
    public void dibujar() {
       //Aquí definimos cada punto de las lineas para dibujar la figura
        //Asignandole si es parte de la altura o la base
        Punto esqSupDer, esqInfIzq, esqInfDer;
        esqInfIzq = new Punto();
        esqInfDer = new Punto();
        esqSupDer = new Punto();
        esqInfIzq.setX(getEsqSupIz().getX());
        esqInfIzq.setX(getEsqSupIz().getY() - altura);
        
        esqInfDer.setX(getEsqSupIz().getX() + base);
        esqInfDer.setX(getEsqSupIz().getY() - altura);
        
        esqSupDer.setX(getEsqSupIz().getX() + base);
        esqSupDer.setX(getEsqSupIz().getY());
        
        System.out.print("(" + getEsqSupIz().getX() + "," + 
                getEsqSupIz().getY() + ")");
        System.out.println("(" + esqSupDer.getX() + "," + 
                esqSupDer.getY());
        System.out.println("(" + esqInfDer.getX() + "," + 
                esqInfDer.getY());
    }
}
