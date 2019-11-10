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
public class Ordenamientos {
    public void Menu(){
    int opcionTres=0;
    int opcionDos=0;
    int opcion=0;
    int vectorUno[] = new int[5];
    int lista[] = new int[5]; 
    int auxiliar;
    
    do {
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
            +"\n 1. Metodo burbuja"
            +"\n 2. Metodo shell"
            +"\n 3. Volver al menu anterior"
            +"\n 4. Salir"));
            
            switch(opcion){
                case 1:
                do {
                    try {
                    opcionDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
                    +"\n 1. Cargar arreglo"
                    +"\n 2. Mostrar arreglo"
                    +"\n 3. Ordenar"
                    +"\n 4. Volver al menu anterior"
                    +"\n 5. Salir"));
                    switch(opcionDos){
                case 1:                    
                    for(int i=0; i<5; i++){
                        vectorUno[i] =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor en la posicion ["+ i + "]:"));
                    }
                break;
                case 2:
                    for(int i=0; i<5 ; i++){
                    JOptionPane.showMessageDialog(null,vectorUno[i]);
                    } 
                break;
                case 3:
                    for(int i=0; i<5; i++){
                    for(int j=0; j<5; j++){
                         if(vectorUno[i] > vectorUno[j]){
                            auxiliar = vectorUno[i];
                            vectorUno[i] = vectorUno[j];
                            vectorUno[j] = auxiliar;
                         }
                    }
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
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
                } 
                }while (opcionDos!=5);
                break;
                case 2:
                  do {
                    try {
                    opcionTres = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
                    +"\n 1. Cargar arreglo"
                    +"\n 2. Mostrar arreglo"
                    +"\n 3. Ordenar"
                    +"\n 4. Volver al menu anterior"
                    +"\n 5. Salir"));
                    switch(opcionTres){
                case 1:                    
                    JOptionPane.showMessageDialog(null," !!  Bienvenidos al Metodo Ordenacion Shell: !!\n\n");
                    for(int i=0; i<5; i++){
                    lista[i] =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor en la posicion ["+ i + "]:"));
                    }        

                break;
                case 2:
                    for(int i = 0; i < lista.length;i++){
                    JOptionPane.showMessageDialog(null,lista[i]+",");
                    } 
                break;
                case 3:                 
                    int intervalo, i, j, k;
                    int n= lista.length;
                    intervalo = n / 2;
                    while (intervalo > 0){
                    for (i = intervalo; i < n; i++){
                    j = i - intervalo;
                    while (j >= 0){
                        k = j + intervalo;
                        if (lista[j] <= lista[k]){
                            j = -1; // par de elementos ordenado
                        }else{
                            int aux = lista[i];
                            lista[i] = lista[j];
                            lista[j]= aux ;                       
                            j -= intervalo;
                        }
                    }
                }
                intervalo = intervalo / 2;
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
                }catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
                } 
                }while (opcionTres!=5);
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
        }while (opcion!=4);
    }
}

    
