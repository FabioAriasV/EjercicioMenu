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
public class MenuPilas {
    public void Menu(){
    int opcionDos=0;
    MenuPilas objPila = new MenuPilas();
    int dato;
    do {
        try {
            opcionDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
            +"\n 1. Insertar dato"
            +"\n 2. Mostrar la cima"
            +"\n 3. Sacar dato de la cima"
            +"\n 4. Limpiar pila"
            +"\n 5. Salir"));
            
            switch(opcionDos){
                case 1:
                int validarNumero = 0;
                do{
                   try{
                   dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Insertar un dato."));
                   objPila.insertarDato(dato);
                   validarNumero = 1;
                   }catch (Exception e) {
                   JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero.");
                   }
                   }while(validarNumero == 0);
                break;
                case 2:
                if(!objPila.pilaVacia()){
                JOptionPane.showMessageDialog(null, "El dato que esta en la cima es: " + objPila.cimaPila());
                }else{
                JOptionPane.showMessageDialog(null, "No hay datos en la pila.",
                "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                }   
                break;
                case 3:
                if(!objPila.pilaVacia()){
                JOptionPane.showMessageDialog(null, "El dato a eliminar es: " + objPila.eliminarDato());
                }else{
                JOptionPane.showMessageDialog(null, "No hay datos en la pila.",
                "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
                case 4:
                if(!objPila.pilaVacia()){
                objPila.limpiarPila();
                JOptionPane.showMessageDialog(null, "La pila se ha limpiado correctamente.");
                }else{
                JOptionPane.showMessageDialog(null, "No hay datos en la pila.",
                "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                }
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
        }while (opcionDos!=3);
    }
    NodoPila cima = null;
    public  void insertarDato(int dato) {
        NodoPila nuevoNodo;
        nuevoNodo = new NodoPila(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;        
    }
    public boolean pilaVacia() {
        return cima == null;
    }
    public int cimaPila() {
        return cima.informacion;
    }
    public int eliminarDato() {
        int aux = cima.informacion;
        cima = cima.siguiente;
        return aux;
    }
    public void limpiarPila() {
        NodoPila nodo;
        while(!pilaVacia()) {
            nodo = cima;
            nodo.siguiente = null;
            cima = cima.siguiente;
        }
    }
    public class NodoPila {    
        int informacion;
        NodoPila siguiente;
    
    NodoPila(int dato){    
        informacion = dato;
        siguiente = null;
    }
}
}
