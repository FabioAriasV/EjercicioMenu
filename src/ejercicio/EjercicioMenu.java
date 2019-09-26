package ejercicio;

import javax.swing.JOptionPane;

public class EjercicioMenu {
    
    public static void main(String[] args) {
        int opcion = 0;
        int opcionDos= 0;
        double A=0;
        double B=0;
        int opciontres=0;
       do{ 
        opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones"
            +"\n 1. Operaciones Basicas"
            +"\n 2. Arreglo"
            +"\n 3. Matriz"
            +"\n 4. Salir"));
        
        switch(opcion){
            case 1:
                do{
        opcionDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones"
            +"\n 1. Suma"
            +"\n 2. Resta"
            +"\n 3. Multiplicacion"
            +"\n 4. Division"
            +"\n 5. Volver al menu anterior"));
        
        switch(opcionDos){
            case 1:
                try {
                A=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable A:"));
                B=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable B:"));
                } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "A ingresado una variable no valida");
                }
                JOptionPane.showMessageDialog(null, "A + B = " + (A + B));
                
                break;
            case 2:
                try {
                A=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable A:"));
                B=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable B:"));
                } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "A ingresado una variable no valida");
                }
                JOptionPane.showMessageDialog(null, "A - B = " + (A - B));  
                break;
            case 3:
                try {
                A=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable A:"));
                B=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable B:"));
                } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "A ingresado una variable no valida");
                }
                JOptionPane.showMessageDialog(null, "A * B = " + (A * B));
                break;
            case 4:
                try {
                A=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable A:"));
                B=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la variable B:"));
                } catch(Exception e) {
                JOptionPane.showMessageDialog(null, "A ingresado una variable no valida");
                }
                JOptionPane.showMessageDialog(null, "A / B = " + (A / B));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "Salir");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No ingreso una opcion valida");
             
                }
                }while(opcionDos !=5); 
                
                break;
            case 2:
                  String arregloNumeros[ ] = new String[3];
                  for(int n = 0; n < arregloNumeros.length; n++){

                  arregloNumeros[n] = JOptionPane.showInputDialog(null, "Ingrese los valores del arreglo");

                  }for(int n = 0; n < arregloNumeros.length; n++){
                  JOptionPane.showMessageDialog(null, arregloNumeros[n]);
                  }    
                 break;
            case 3:
                
            int numero = 0;
            int m[][] = new int[10][3];
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
        
        for(f=0; f<10; f++){
            
            JOptionPane.showMessageDialog(null, m[f][0] + " X " + m[f][1] + " = "+ m[f][2]);
            
        }
             break;
            case 4:
                JOptionPane.showMessageDialog(null, "Salir");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No ingreso una opcion valida");
             break;
        }
    }while(opcion !=4); 
}
}