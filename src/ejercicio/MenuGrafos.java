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
//prueba
public class MenuGrafos {
    public void Menu(){
    int source = 0,numero,i,j,nodes = 0;
    Dijkstra d = new Dijkstra();
    int opcionDos=0;
    do {
        try {
            opcionDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
            +"\n 1. Ingrese el numero de nodos"
            +"\n 2. Ingrese los pesos del grafo"
            +"\n 3. Ingrese el vertice fuente"
            +"\n 4. Mostrar camino mas corto"
            +"\n 5. Volver al menu anterior"
            +"\n 6. Salir"));
            
            switch(opcionDos){
                case 1:
                    nodes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de nodos "));                   
                break;
                case 2:                    
                    for(i=1;i<=nodes;i++){
                    for(j=1;j<=nodes;j++){
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese los pesos del grafo "));
                    d.cost[i][j]=numero;
                    if(d.cost[i][j]==0)
                    d.cost[i][j]=999;
                    }   
                }
                break;
                case 3:
                    source = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el vertice fuente "));
                break;
                case 4:
                    d.calc(nodes,source);
                    JOptionPane.showMessageDialog(null, "El camino mas corto desde la fuente \t"+source+"\t a todos los demas vertices : \n");
                    for(i=1;i<=nodes;i++)
                    if(i!=source)
                    JOptionPane.showMessageDialog(null, "Fuente: "+source+"\t destino: "+i+"\t Costo minimo es: "+d.distance[i]+"\t");
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
    public class Dijkstra {
            public  int distance[] = new int[10];
            public  int cost[][] = new int[10][10];

            public void calc(int n,int s){
            int flag[] = new int[n+1];
            int i,minpos=1,k,c,minimum;

            for(i=1;i<=n;i++){  
            flag[i]=0; 
            this.distance[i]=this.cost[s][i]; 
            }
            c=2;
            while(c<=n){
            minimum=99;
            for(k=1;k<=n;k++){ 
                if(this.distance[k]<minimum && flag[k]!=1){
                minimum=this.distance[i];
                minpos=k;
                }
            } 
                flag[minpos]=1;
                c++;
                for(k=1;k<=n;k++){
                if(this.distance[minpos]+this.cost[minpos][k] <  this.distance[k] && flag[k]!=1 )
                this.distance[k]=this.distance[minpos]+this.cost[minpos][k];
                }   
            } 
        }
    }
}