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
public class MenuArreglos {
 
    public void Menu(){
    int arregloNumeros[ ] = new int[3];
    int opcionDos=0;
    do {
        try {
            opcionDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
            +"\n 1. Cargar datos"
            +"\n 2. Mostrar datos"
            +"\n 3. Volver al menu anterior"
            +"\n 4. Salir"));
            
            switch(opcionDos){
                case 1:
                    for(int n = 0; n < arregloNumeros.length; n++){
                    arregloNumeros[n] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los valores del arreglo"));
                    }
                break;
                case 2:
                    for(int n = 0; n < arregloNumeros.length; n++){
                    JOptionPane.showMessageDialog(null, arregloNumeros[n]);
                    }   
                break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Regresando...");
                break;
                case 4:
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
}
