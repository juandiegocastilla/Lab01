package funcionesPuras;

public class Operacion {
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
    
}
