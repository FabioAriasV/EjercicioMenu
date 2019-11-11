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
public class MenuListas {
    public void Menu(){
    int opcionDos=0;
    String elemento;
    MenuListas listaSimple = new MenuListas();
    do {
        try {
            opcionDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
            +"\n 1. Insertar datos"
            +"\n 2. Mostrar lista"
            +"\n 3. Limpiar lista"
            +"\n 4. Volver al menu anterior"
            +"\n 5. Salir"));
            
            switch(opcionDos){
                case 1:
                elemento = JOptionPane.showInputDialog(null, "Insertar un Nodo.");
                listaSimple.insertar(elemento);                  
                      
                break;
                case 2:
                if(!listaSimple.listaVacia()){
                listaSimple.mostrarListaInicioFin();
                }else{
                JOptionPane.showMessageDialog(null, "No hay nodos en la lista",
                "Lista Vacia", JOptionPane.ERROR_MESSAGE);
                }
                break;
                case 3:
                
                       
                if(!listaSimple.listaVacia()){
                listaSimple.limpiarLista();
                JOptionPane.showMessageDialog(null, "La pila se ha limpiado correctamente.");
                }else{
                JOptionPane.showMessageDialog(null, "No hay datos en la pila.",
                "Pila Vacia", JOptionPane.INFORMATION_MESSAGE);
                }    
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

    Nodo primero;
    Nodo ultimo;
    int tamano = 0;
    public void insertar(String o) {
            Nodo nuevoNodo = new Nodo();
            nuevoNodo.setInformacion(o);
        
            if(primero == null){
            primero = nuevoNodo;
            primero.setSiguiente(null);
            ultimo  = primero;
            tamano += 1;
        }else{
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(null);
            ultimo = nuevoNodo;
            tamano += 1;
        }
      }
    public void mostrarListaInicioFin(){
            if(!listaVacia()){
            String datos = "";
            Nodo auxiliar = primero;
            while(auxiliar != null){
            datos = datos + "[" + auxiliar.getInformacion() + "] =>";
            auxiliar = auxiliar.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, datos,
            "Mostrando Lista Inicio a Fin",
            JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public void limpiarLista() {
        Nodo nodo;
        while(!listaVacia()) {
            nodo = primero;
            nodo.siguiente = null;
            primero = primero.siguiente;
        }
    }
    public boolean listaVacia() {
            if (primero == null)
              return true;
            else
              return false;
          }
    public class Nodo {
            private String informacion;
            private Nodo siguiente;

    public String getInformacion() {
            return informacion;
    }

    public void setInformacion(String informacion) {
            this.informacion = informacion;
    }

    public Nodo getSiguiente() {
            return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
    }
}
}
   

