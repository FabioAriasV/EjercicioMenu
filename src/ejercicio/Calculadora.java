
package ejercicio;

import java.util.Scanner;
import javax.swing.JOptionPane;
public class Calculadora {
    Scanner sc=new Scanner(System.in);

    public int primerNumero;
    public int segundoNumero;
    public int N;  
    public int sumar(int x,int y){
         int sumar;
         int suma=x+y;
         return suma;
         
    }
     public int restar(int x,int y){
         int restar;
         int resta=x-y;
         return resta;
     }
     public int multiplicar(int x,int y){
         int multiplicar;
         multiplicar=(x*y);
         return multiplicar;
     }
     public float dividir(int x,int y){
         float division;
         division =(float)(x/y);
         return division;
     }
     public void salir() {
         //System.exit(0);
    }
  public double factorial(int n){
      double factorial;
    if (n==0)
        return 1;
    else
        return n*(factorial(n-1));
  }
 
       
    
    public void mostrarMensaje() {
        JOptionPane.showMessageDialog (null,"Ingrese su opción entre 1,2 o 3");
        JOptionPane.showMessageDialog (null,"Intente de nuevo...............");
    }
    
}

