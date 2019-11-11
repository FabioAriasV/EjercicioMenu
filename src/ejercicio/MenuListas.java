/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class MenuListas {
    int opcion=0;
    public void Menu(){
    do {
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
            +"\n 1. Insertar datos"
            +"\n 2. Mostrar lista"
            +"\n 3. Limpiar lista"
            +"\n 4. Volver al menu anterior"
            +"\n 5. Salir"));
            
            switch(opcion){
                case 1:
                    List<String> optionList = new ArrayList<String>();
                    optionList.add("Ham");
                    optionList.add("Eggs");
                    optionList.add("Bacon");
                    Object[] options = optionList.toArray();
                    Object value = JOptionPane.showInputDialog(null, 
                    "Favorite Food", 
                    "Food", 
                    JOptionPane.QUESTION_MESSAGE, 
                    null,
                    options, 
                    options[0]);
                    int index = optionList.indexOf(value);
                break;
                case 2:
                    
                break;
                case 3:
                    
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
        }while (opcion!=4);
    }
}
   

