
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
  public static void ordenShell(int a[])
    {
        int intervalo, i, j, k;
        int n= a.length;
        intervalo = n / 2;
        while (intervalo > 0){
            for (i = intervalo; i < n; i++){
                j = i - intervalo;
                while (j >= 0){
                    k = j + intervalo;
                    if (a[j] <= a[k]){
                        j = -1; // par de elementos ordenado
                    }else{
                        intercambiar(a, j, j+1);
                        j -= intervalo;
                    }
                }
            }
            intervalo = intervalo / 2;
        }
    }
  
    public static void intercambiar(int []a, int i, int j)
    {
        int aux = a[i];
        a[i] = a[j];
        a[j]= aux ;
    }
    
    public static void imprimeLista(int[] arreglo){
        for(int i = 0; i < arreglo.length;i++){
            System.out.print(arreglo[i]+",");
        }
        System.out.println();
    }
     public static void Ordenacionshell() {
        System.out.print(" !!  Bienvenidos al Metodo Ordenacion Shell: !!\n\n");
        int lista[] = new int[5]; 
        for(int i=0; i<5; i++){
            lista[i] =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor en la posicion ["+ i + "]:"));
        }        
        System.out.print("Lista desordenada: ");
        imprimeLista(lista);
        ordenShell(lista);

        System.out.print("Lista ordenada:    ");
        imprimeLista(lista);
        System.out.print("\n");
    }
    
    public void mostrarMensaje() {
        JOptionPane.showMessageDialog (null,"Ingrese su opción entre 1,2 o 3");
        JOptionPane.showMessageDialog (null,"Intente de nuevo...............");
    }
    
}

