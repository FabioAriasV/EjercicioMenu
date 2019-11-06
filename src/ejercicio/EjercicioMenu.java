package ejercicio;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.JOptionPane;

public class EjercicioMenu {
    
    public static void main(String[] args) {
        int opcion = 0;
        int opcionDos= 0;
        int opcionTres=0;
        double A=0;
        double B=0;
        int elemento =0;
        Cola colita = new Cola();
        
       do{ 
           try {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones"
            +"\n 1. Operaciones Basicas"
            +"\n 2. Arreglo"
            +"\n 3. Matriz"
            +"\n 4. Metodo Burbuja"
            +"\n 5. Recursividad"
            +"\n 6. Ordenamiento Shell"
            +"\n 7. Lista"
            +"\n 8. Pila"
            +"\n 9. Cola"              
            +"\n 10. Salir"));
        
        switch(opcion){
            case 1:
                do {
                    try {
            opcionDos = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones" 
            +"\n 1. Suma"
            +"\n 2. Resta"
            +"\n 3. Multiplicacion"
            +"\n 4. Division"
            +"\n 5. Volver al menu anterior"));
            
            switch(opcionDos){
                case 1:
                    Calculadora sum= new Calculadora();
                    sum.primerNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    sum.segundoNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    sum.sumar(sum.primerNumero, sum.segundoNumero);
                    JOptionPane.showMessageDialog(null, "la suma es: "+sum.sumar(sum.primerNumero, sum.segundoNumero));
                   break;
                case 2:
                    Calculadora res= new Calculadora();
                    res.primerNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    res.segundoNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    res.restar(res.primerNumero, res.segundoNumero);
                    JOptionPane.showMessageDialog(null, "la resta es: "+res.restar(res.primerNumero, res.segundoNumero));
                   break;
                   case 3:
                    Calculadora mul= new Calculadora();
                    mul.primerNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero: "));
                    mul.segundoNumero=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero: "));
                    mul.multiplicar(mul.primerNumero, mul.segundoNumero);
                    JOptionPane.showMessageDialog(null, "la multiplicacion es: "+mul.multiplicar(mul.primerNumero, mul.segundoNumero));
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
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
                } 
        } while (opcionDos!=5);
            break;
            case 2:
                try {
                  int arregloNumeros[ ] = new int[3];
                  for(int n = 0; n < arregloNumeros.length; n++){
                  arregloNumeros[n] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los valores del arreglo"));
                  }for(int n = 0; n < arregloNumeros.length; n++){
                  JOptionPane.showMessageDialog(null, arregloNumeros[n]);
                  }    
                  } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
                } 
                 break;
            case 3:     
                try {
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
        } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
                } 
        break;
        case 4:                  
        int vectorUno[] = new int[5];
        int auxiliar;
        
        // Cargue del primer vector
        for(int i=0; i<5; i++){
            vectorUno[i] =Integer.parseInt(JOptionPane.showInputDialog(null, "Digite un valor en la posicion ["+ i + "]:"));
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
                Calculadora fac= new Calculadora();  
                fac.N=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a factorizar:"));
                JOptionPane.showMessageDialog(null, "el factor es: "+fac.factorial(fac.N));
             break;
             case 6:
                Calculadora.Ordenacionshell();
             break;
            case 7:
                List Lista = new ArrayList();
                Lista.add("Juan");
                Lista.add("Pedro");
                Lista.add("José");
                Lista.add("María");
                Lista.add("Sofía");
                 for (int i = 0; i <= Lista.size() - 1; i++) {
            JOptionPane.showMessageDialog(null, Lista.get(i));
        }

             break;
             case 8:
                Stack pila = new Stack();
                pila.push(3); // Posicion 0
                pila.push(5); // Posicion 1
                pila.push("un 5 profe :D");

                System.out.println("El ultimo elemento en la pila es: "+pila.peek());

                while(pila.empty()==false){ //Mientras la pila no este vacia
                System.out.println(pila.pop()); 
                    }
             break;
             case 9:
                do{
        
            try {
                opcionTres= Integer.parseInt(JOptionPane.showInputDialog(null,"1. Insertar un elemento en la Cola\n"
                        + "2. Quitar un elemento en la Cola\n"
                        + "3. ¿La cola está vacia?\n"
                        + "4. Elemento ubicado al inicio de la cola\n"
                        + "5. Tamaño de la cola\n"
                        + "6. Salir","Menú de opciones de una Cola",
                        JOptionPane.QUESTION_MESSAGE));
                
                switch(opcionTres){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento","Insertando en la Cola",JOptionPane.QUESTION_MESSAGE));
                        colita.insertar(elemento);
                        break;
                    case 2:
                        if(!colita.estaVacia()){
                        JOptionPane.showMessageDialog(null, "El elemento atendido es " + colita.quitar(),"Quitando elemento de la cola",JOptionPane.INFORMATION_MESSAGE);
                        }else {
                        JOptionPane.showMessageDialog(null, "La cola está vacia" ,"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                       
                        break;
                    case 3:
                        if(colita.estaVacia()){
                        JOptionPane.showMessageDialog(null, "La Cola está Vacia","Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        
                        }else{
                        JOptionPane.showMessageDialog(null, "La Cola no está Vacia","Cola no Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        break;
                    case 4:
                        if(!colita.estaVacia()){
                        JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de la Cola es "+colita.inicioCola(),"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                        JOptionPane.showMessageDialog(null, "La Cola está Vacia","Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                        
                        break;
                    case 5 :
                        JOptionPane.showMessageDialog(null, "El tamaño de la Cola es "+ colita.tamanioCola(),"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        
                        break;
                        
                    case 6 :
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada","Fin",JOptionPane.INFORMATION_MESSAGE);
                        break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta","¡Cuidado!",JOptionPane.INFORMATION_MESSAGE);
                     
                }
               
            } catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                        
            }
        
        }while(opcionTres!=6);
             case 10:
                JOptionPane.showMessageDialog(null, "Salir");
             break;
            default:
                JOptionPane.showMessageDialog (null,"No ha ingresado una opcion valida");
                JOptionPane.showMessageDialog (null,"Intente de nuevo...............");
             break;
        }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
            } 
    }while(opcion !=10); 
}

     
}
