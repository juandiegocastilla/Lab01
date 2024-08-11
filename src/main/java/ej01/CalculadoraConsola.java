package ej01;
import java.util.Scanner;
public class CalculadoraConsola {
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
     public static double seno(double a){
        return Math.sin(Math.toRadians(a));
    }
     public static double coseno(double a){
        return Math.cos(Math.toRadians(a));
    }
     public static double tan(double a){
        return Math.tan(Math.toRadians(a));
    }
    
    public static void main (String args[]) {
        System.out.println("Calculadora consola");
        Scanner leer= new Scanner(System.in);
        double conteo=0;
        boolean reset= true;
        boolean salir=true;
       while(salir){
        double num1;
        double num2;
       
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
            
            if(reset){
           System.out.print("Ingresa el primer numero: ");
            num1= leer.nextDouble();
          System.out.print("Ingresa el segundo numero: ");
            num2= leer.nextDouble();
            }
          else{
           num1=conteo;
           System.out.println("Ingresa el siguiente numero para hacerla (con las razones trigonometricas ponga 0): ");
           num2 = leer.nextDouble();}
            
            if(option==5){
            num1=conteo;}
            
            switch(option){
                case 1:{
                    
                 conteo = suma(num1,num2);
                 System.out.println("Esto da="+conteo);
                 reset=false;
                };break;
                case 2:{ 
                 conteo= resta(num1,num2);
                    System.out.println("Esto da="+conteo);
                    reset=false;
                 };break;
                case 3:{
                    conteo= multi(num1,num2);
                    System.out.println("Esto da="+conteo);
                    reset=false;
                };break;
                case 4:{
                    conteo=divi(num1,num2);
                    System.out.println("Esto da="+conteo);
                    reset=false;
                };break;
                case 5:{
                    conteo=seno(conteo);
                    System.out.println("Esto da="+conteo);
                    
                };break;
                case 6:{
                    conteo=coseno(conteo);
                    System.out.println("Esto da="+conteo);
                    reset=false;
                };break;
                case 7:{
                    conteo=tan(conteo);
                    System.out.println("Esto da="+conteo);
                    reset=false;
                };break;
                case 8:{conteo=num1*(num2/100);
                System.out.println("Esto da="+conteo);
                reset=false;
                };break;
                case 9:{
                    conteo=potencia(num1,num2);
                    System.out.println("Esto da="+conteo);
                    reset=false;
                };break;
                case 10:{
                    conteo=raiz(num1,num2);
                    System.out.println("Esto da="+conteo);
                    reset=false;
                };break;
                case 11:{
                salir=false;}
             }
                
                 
            
        }
    }
    
}
