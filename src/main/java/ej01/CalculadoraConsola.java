package ej01;

import java.util.Scanner;
import funcionesPuras.Operacion;
public class CalculadoraConsola {
    
    public static void main (String args[]) {
        System.out.println("Calculadora consola");
        Scanner leer= new Scanner(System.in);
        double conteo=0;
        boolean reset= true;
        boolean salir=true;
        
       while(salir){
        double num1;
        double num2=0;
       
          System.out.println(" ");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            System.out.println("5.Seno");
            System.out.println("6.Coseno");
            System.out.println("7.Tangente");
            System.out.println("8.IVA");
            System.out.println("9.Potencia");
            System.out.println("10.Raiz");
            System.out.println("11.Salir");
            System.out.println("Digita tu opcion");
            int option=leer.nextInt();
            
            if (reset) {
                System.out.print("Ingresa el primer numero o base (si es potencia o raiz): ");
                num1 = leer.nextDouble();
                if (option >= 1 && option <= 4 || option == 9 || option == 10 || option == 8) {
                    System.out.print("Ingresa el segundo numero o indice (o exponente en caso de potencia o raiz): ");
                    num2 = leer.nextDouble();
                }
            } else {
                num1 = conteo;
                if (option >= 1 && option <= 4 || option == 9 || option == 8) {
                    System.out.print("Ingresa el siguiente numero para hacer la operacion: ");
                    num2 = leer.nextDouble();
                }
            }
            
            
            
            switch(option){
                case 1:{
                    
                 conteo = Operacion.suma(num1,num2);
                 System.out.println("Esto da="+conteo);
                 reset=false;
                };break;
                case 2:{ 
                 conteo= Operacion.resta(num1,num2);
                    System.out.println("Esto da="+conteo);
                    reset=false;
                 };break;
                case 3:{
                    conteo= Operacion.multi(num1,num2);
                    System.out.println("Esto da="+conteo);
                    reset=false;
                };break;
                case 4:{if(num2!=0){
                    conteo=Operacion.divi(num1,num2);
                    System.out.println("Esto da="+conteo);
                    reset=false;}else{System.out.println("ERROR");}
                };break;
                case 5:{
                    conteo = Operacion.seno(num1); 
                    System.out.println("Esto da=" + conteo);
                    reset = false;
                  
                    
                };break;
                case 6:{
                    conteo = Operacion.coseno(num1); 
                    System.out.println("Esto da=" + conteo);
                    reset = false;
                   
                };break;
                case 7:{
                    if (num1 != 90 && num1 != 270) { 
                        conteo = Operacion.tan(num1);
                        System.out.println("Esto da=" + conteo);
                        reset = false;
                    } else {
                        System.out.println("ERROR: Tangente indefinida en 90° o 270°.");
                     }
                };break;
                case 8:{conteo=num1*(num2/100);
                System.out.println("Esto da="+conteo);
                reset=false;
                };break;
                case 9:{
                    conteo=Operacion.potencia(num1,num2);
                    System.out.println("Esto da="+conteo);
                    reset=false;
                };break;
                case 10:{
                    
                    if (num1 > 0 || num2 % 2 != 0) {
                        conteo = Operacion.raiz(num1, num2);
                        System.out.println("Esto da=" + conteo);
                        reset = false;
                    } else {
                        System.out.println("ERROR: Raíz no valida.");
                }};break;
                case 11:{
                salir=false;}
             }
                
                 
            
        }
    }
    
}
