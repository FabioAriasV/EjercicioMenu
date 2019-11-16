/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */

public class MenuArboles {

    public void Menu(){
    Nodo raiz = new Nodo(1); 
    Nodo nodo2= new Nodo(2);  
    Nodo nodo3= new Nodo(3);         
    raiz.setNodoIzquierdo(nodo2); 
    raiz.setNodoDerecho(nodo3);                
    nodo2.setNodoIzquierdo(new Nodo(4)); 
    nodo3.setNodoIzquierdo(new Nodo(5)); 
    nodo3.setNodoDerecho(new Nodo(6));
    int opcionDos=0;
    do {
        try {
            opcionDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
            +"\n 1. Recorrido Pre orden"
            +"\n 2. Recorrido In orden"
            +"\n 3. Recorrido Post orden"
            +"\n 4. Volver al menu anterior"
            +"\n 5. Salir"));
            
            switch(opcionDos){
                case 1:                   
                    preOrden(raiz);        
                break;
                case 2:                    
                    inOrden(raiz);
                break;
                case 3:                    
                    postOrden(raiz);
                break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Regresando...");
                break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Finalizando aplicación");
                    System.exit(0);
                break;
                default:
                    JOptionPane.showMessageDialog (null,"No ha ingresado una opcion valida");
                    JOptionPane.showMessageDialog (null,"Intente de nuevo...............");
                break;
                }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
                } 
        }while (opcionDos!=4);
    }
                
    private static void preOrden(Nodo raiz) { 
        if(raiz != null){
            JOptionPane.showMessageDialog(null, raiz.getDato()+" - ");   
            preOrden(raiz.getNodoIzquierdo());  
            preOrden(raiz.getNodoDerecho());  
        }
            
    }

    private static void inOrden(Nodo raiz) {
        if(raiz != null){ 
            inOrden(raiz.getNodoIzquierdo());
            JOptionPane.showMessageDialog(null, raiz.getDato()+" - ");
            inOrden(raiz.getNodoDerecho());
        }
    }

    private static void postOrden(Nodo raiz) {
        if(raiz != null){
            postOrden(raiz.getNodoIzquierdo());
            postOrden(raiz.getNodoDerecho());
            JOptionPane.showMessageDialog(null, raiz.getDato()+" - ");
             
        }
    }
    public class Nodo {
    private int dato;
    private Nodo izq;  
    private Nodo der; 
    
    public Nodo(int dato) { 
        this.dato=dato;
    }
    public Nodo getNodoIzquierdo(){  
        return izq;                  
    }
    public Nodo getNodoDerecho(){
        return der;
    }
    public void setNodoDerecho(Nodo nodo){  
                                            
            der=nodo;
    }
    public void setNodoIzquierdo(Nodo nodo){  
            izq=nodo;
    }
    public int getDato(){ 
            return dato;
    }
}
}
