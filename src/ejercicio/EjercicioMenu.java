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
        int elemento;
        Cola colita = new Cola();
        
       do{ 
           try {
        opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese un valor de las siguientes opciones"
            +"\n 1. Operaciones Basicas"
            +"\n 2. Arreglos"
            +"\n 3. Matrices"
            +"\n 4. Ordenamientos"
            +"\n 5. Listas"
            +"\n 6. Pila"
            +"\n 7. Cola"
            +"\n 8. Arboles"
            +"\n 9. Grafos"                          
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
                }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Solo ingrese numeros");
                } 
                }while (opcionDos!=5);
                break;
                case 2:
                    MenuArreglos menu = new MenuArreglos(); 
                    menu.Menu();
                break;
                case 3:
                    MenuMatriz menuDos = new MenuMatriz();
                    menuDos.Menu();//               
                break;
                case 4:
                    Ordenamientos menuTres = new Ordenamientos();
                    menuTres.Menu();
                break;
                case 5:    
                    MenuListas menuCuatro = new MenuListas();
                    menuCuatro.Menu();
                break;
                case 6:
                    MenuPilas menuCinco = new MenuPilas();
                    menuCinco.Menu();
                break;
                case 7:
               
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
