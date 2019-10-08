package ejercicio;


import javax.swing.JOptionPane;

public class EjercicioMenu {
    
    public static void main(String[] args) {
        int opcion = 0;
        int opcionDos= 0;
        double A=0;
        double B=0;
        
       do{ 
        opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones"
            +"\n 1. Operaciones Basicas"
            +"\n 2. Arreglo"
            +"\n 3. Matriz"
            +"\n 4. Metodo Burbuja"
            +"\n 5. Recursividad"              
            +"\n 6. Salir"));
        
        switch(opcion){
            case 1:
                do {   
            opcionDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
            +"\n 1. Suma"
            +"\n 2. Resta"
            +"\n 3. Multiplicacion"
            +"\n 4. Division"
            +"\n 5. Volver al menu anterior"));
            
            switch(opcionDos){
                case 1:
                   Calculadora obj= new Calculadora();
                   obj.sumar();
                   break;
                case 2:
                    Calculadora res= new Calculadora();
                    res.primerNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    res.segundoNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    res.restar(res.primerNumero, res.segundoNumero);
                   break;
                   case 3:
                    Calculadora mul= new Calculadora();
                    JOptionPane.showMessageDialog(null,"La multiplicacion es de: "+mul.multiplicar());
                   break;
                case 4:
                    Calculadora div= new Calculadora();
                    div.primerNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    div.segundoNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    div.dividir(div.primerNumero, div.segundoNumero);
                    JOptionPane.showMessageDialog(null, "la division es: "+div.dividir(div.primerNumero, div.segundoNumero));
                   break;
                case 5:
                    Calculadora sal= new Calculadora();
                    sal.salir();
                   break; 
                   
                default:
                    Calculadora def= new Calculadora();
                    def.mostrarMensaje();
                   
                   break;
            }
            
        } while (opcionDos!=5);
            
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
                
        int vectorUno[] = new int[5];
        int auxiliar;
        
        // Cargue del primer vector
        for(int i=0; i<5; i++){
            
            vectorUno[i] = vectorUno[i] =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor en la posicion ["+ i + "]:"));
        }
        // Método de la burbuja
        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                // Si utilizo < me organiza de forma ascendente
                // Si utilizo > me organiza de forma descendente
                if(vectorUno[i] > vectorUno[j]){
                    auxiliar = vectorUno[i];
                    vectorUno[i] = vectorUno[j];
                    vectorUno[j] = auxiliar;
                }
            }
        }
        // Imprimir el vectorDos
        for(int i=0; i<5 ; i++){
           
                JOptionPane.showMessageDialog(null,vectorUno[i]);
        }    
             break;
            case 5:                                                                         
     
                
             break;
            case 6:
                JOptionPane.showMessageDialog(null, "Salir");
             break;
            default:
                JOptionPane.showMessageDialog(null, "No ingreso una opcion valida");
             break;
        }
    }while(opcion !=6); 
}
}