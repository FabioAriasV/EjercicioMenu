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
public class MenuMatriz {
    public void Menu(){
    int m[][] = new int[10][3];
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
                  int numero = 0;
                  int f;
                  int c;
                  numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable A:"));
        
            for(f=0; f<10; f++){
            for(c=0; c<3; c++){
                if(c == 0)
                    m[f][c] = numero;
                if(c == 1)
                    m[f][c] = f +1;
                if(c == 2)
                    m[f][c] = numero * (f+1);
            }
            }
                break;
                case 2:
                    for(f=0; f<10; f++){
                    JOptionPane.showMessageDialog(null, m[f][0] + " X " + m[f][1] + " = "+ m[f][2]);
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
