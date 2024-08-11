package ej01;
import java.util.Scanner;
public class CalculadoraConsola {
    public static void main (String args[]) {
        System.out.println("Calculadora consola");
        Scanner leer= new Scanner(System.in);
        double conteo=0;
        boolean reset= true;
        
        
            System.out.print("1.Sumar");
            System.out.print("2.Restar");
            System.out.print("3.Multiplicar");
            System.out.print("4.Dividir");
            System.out.print("5.Seno");
            System.out.print("6.Coseno");
            System.out.print("7.Tangente");
            System.out.print("8.IVA");
            
            
            if(reset=false){
            int option=leer.nextInt();
            double num1;
            double num2;
            switch(option){
                case 1:{
                    
                 System.out.print("Ingrese su primer numero a sumar");
                 num1= leer.nextDouble();
                 System.out.print("Ingrese su segundo numero "); 
                 num2= leer.nextDouble();
                 conteo= suma(num1,num2);
                };break;
                case 2:{
                    if(conteo==0){
                 System.out.print("Ingrese su primer numero a sumar");
                 num1= leer.nextDouble();
                 System.out.print("Ingrese su segundo numero "); 
                 num2= leer.nextDouble();
                 conteo= resta(num1,num2);
                    }
                    else{
                   System.out.print("Ingrese su numero a sumar");
                 num1= leer.nextDouble();
                 conteo= resta(conteo,num1);
                 }};break;
                case 3:{
                };break;
                case 4:{
                };break;
                case 5:{
                };break;
                case 6:{
                };break;
                case 7:{
                };break;
                case 8:{
                };break;}
                
                 
            
        }
    }
    public static double suma(double a, double b){
        return a+b;
    }
    public static double resta(double a, double b){
        return a-b;
    }
    public static double multi(double a, double b){
        return a*b;
    }
    public static double divi(double a, double b){
        return a/b;
    }
    public static double potencia(double a, double b){
        return Math.pow(a, b);
    }
    public static double raiz(double a, double b){
        return Math.pow(a, 1.0 / b);
    }
}
