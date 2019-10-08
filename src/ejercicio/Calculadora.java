
package ejercicio;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Calculadora {
    Scanner sc=new Scanner(System.in);

    public int primerNumero;
    public int segundoNumero;
      
    public void sumar(){
        int suma;
        this.primerNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
        this.segundoNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));

        suma=primerNumero+segundoNumero;
        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
    }
     public void restar(int x,int y){
         int resta=x-y;
         JOptionPane.showMessageDialog(null, "La resta es de " +resta);
     }
     public int multiplicar(){
         int multiplicar;
         this.primerNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
         this.segundoNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
         multiplicar=primerNumero*segundoNumero;
         return multiplicar;
     }
     public float dividir(int x,int y){
         float division;
         division =(float)(x/y);
         return division;
     }
     public void salir() {
         System.exit(0);
    }

    public void mostrarMensaje() {
        JOptionPane.showMessageDialog (null,"Ingrese su opción entre 1,2 o 3");
        JOptionPane.showMessageDialog (null,"Intente de nuevo...............");
    }
    
}

