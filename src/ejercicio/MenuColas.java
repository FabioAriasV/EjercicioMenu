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
public class MenuColas {
    public void Menu(){
    frente = fin = null;
    MenuColas objCola = new MenuColas();
    int opcionDos=0;
    int dato;
    do {
        try {
            opcionDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
            +"\n 1. Insertar datos"
            +"\n 2. Mostrar dato"
            +"\n 3. Sacar Dato"
            +"\n 4. Limpiar cola"
            +"\n 5. Volver al menu anterior"
            +"\n 6. Salir"));
            
            switch(opcionDos){
                case 1:
                int validarNumero = 0;
                do{
                    try {
                    dato = Integer.parseInt(JOptionPane.showInputDialog(null, "Insertar un dato."));
                    objCola.insertarDato(dato);
                    validarNumero = 1;
                    }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: Debe ingresar un numero entero.");
                    }
                    }while(validarNumero == 0);                   
                break;
                case 2:
                if(!objCola.colaVacia()){
                JOptionPane.showMessageDialog(null, "El dato que esta al inicio es: " + objCola.frenteCola());
                }else{
                JOptionPane.showMessageDialog(null, "No hay datos en la cola.",
                "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                }       
                break;
                case 3:
                if(!objCola.colaVacia()){
                JOptionPane.showMessageDialog(null, "El dato a eliminar es: " + objCola.eliminarDato());
                }else{
                JOptionPane.showMessageDialog(null, "No hay datos en la cola.",
                "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
                case 4:
                if(!objCola.colaVacia()){
                objCola.limpiarCola();
                JOptionPane.showMessageDialog(null, "La cola se ha limpiado correctamente.");
                }else{
                JOptionPane.showMessageDialog(null, "No hay datos en la cola.",
                "Cola Vacia", JOptionPane.INFORMATION_MESSAGE);
                }    
                break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Regresando...");
                break;
                case 6:
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
        }while (opcionDos!=5);
    }
    NodoCola frente;
    NodoCola fin;
    public void insertarDato(int dato) {
        NodoCola nuevoNodo;
        nuevoNodo = new NodoCola(dato);
        if (colaVacia()){
            frente = nuevoNodo;
        }
        else{
            fin.siguiente = nuevoNodo;
        }
        fin = nuevoNodo;
    }
    public boolean colaVacia() {
        return frente == null;
    }
    public int frenteCola() {
        return (frente.informacion);
    }
    public int eliminarDato() {
        int aux = frente.informacion;
        frente = frente.siguiente;
        return aux;
    }
    public void limpiarCola() {
        while (!colaVacia()){
            frente = frente.siguiente;
        }
    }
    public class NodoCola {
        int informacion;
        NodoCola siguiente;

        public NodoCola(int dato)
        {
            informacion = dato;
            siguiente = null;
        }
}
}
