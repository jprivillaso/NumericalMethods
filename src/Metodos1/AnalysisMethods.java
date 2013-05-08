/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos1;

/**
 *
 * @author Santiago
 */
public class AnalysisMethods {
    public static double funcion(double x){
        return 0.0;
    }
    
    public static double gfuncion(double x){
        return 0.0;
    }
    
    private static double funcionP(double x0) {
        return 0.0;
    }
    
    private static double funcion2P(double x0) {
        return 0.0;
    }
    
    public static void  incrementalSearch(double x0, double delta, int nIter){
        double fx0= funcion(x0);
        if(fx0==0){    
            System.out.println("La raiz es= " + fx0 );
        }else{
             double x1=x0+delta;
            int count=1;
            double fx1= funcion(x1);
            while(fx0*fx1>0 && count < nIter){
                x0=x1;
                fx0=fx1;
                x1=x0+delta;
                fx1= funcion(x1);
                count++;
            }
            if(fx1==0){
                System.out.println("La raiz es: " + x1);
            }else
            if(fx0*fx1<0){
                System.out.println("El intervalo va desde: " + x0 + " Hasta: " + x1);
            }else
                System.out.println("Error, no se encontro raiz en el intervalo");
            }
       
    }
   
    public static void  biseccion(double xi , double xs, double tolerancia, int nIter){
        double fxi= funcion(xi);
        double fxs= funcion(xs);
        if(fxi==0)
            System.out.println("La raiz es= " + xi);
        else if(fxs==0)
             System.out.println("la raiz es= " + xs);
        else if(fxi*fxs<0){
            double xm=(xi+xs)/2;
            double fxm=funcion(xm);
            int counter=1;
            double error= tolerancia+1;
            while(error>tolerancia && fxm !=0 && counter<nIter){
                if(fxi*fxm<0){
                    xs=xm;
                    fxs=fxm;
                }else{
                    xi=xm;
                    fxi=fxm;
                }
                double xaux=xm;
                xm=(xi+xs)/2;
                fxm=funcion(xm);
                error=Math.abs(xm-xaux);
                counter++;
            }
            if(fxm==0)
                System.out.println("La raiz es= " + xm);
            else if(error <= tolerancia)
                System.out.println(xm+ " es una aproximacion a la raiz con tolerancia de " + tolerancia);
            else 
                System.out.println("El metodo fallo en " + nIter + " iteraciones.");
        }else{
                System.out.println("Se ingreso un intervalo incorrecto");
        }
        
    }
   
    public static void  reglaFalsa(double xi , double xs, double tolerancia, int nIter){
        double fxi= funcion(xi);
        double fxs= funcion(xs);
        if(fxi==0)
            System.out.println("La raiz es= " + xi);
        else if(fxs==0)
             System.out.println("la raiz es= " + xs);
        else if(fxi*fxs<0){
            double xm=xi- ( fxi * (xs - xi)) / ( fxs - fxi);
            double fxm=funcion(xm);
            int counter=1;
            double error= tolerancia+1;
            while(error>tolerancia && fxm !=0 && counter<nIter){
                if(fxi*fxm<0){
                    xs=xm;
                    fxs=fxm;
                }else{
                    xi=xm;
                    fxi=fxm;
                }
                double xaux=xm;
                xm=xm - ( fxi * (xs - xi)) / ( fxs - fxi);
                fxm=funcion(xm);
                error=Math.abs(xm-xaux);
                counter++;
            }
            if(fxm==0)
                System.out.println("La raiz es= " + xm);
            else if(error <= tolerancia)
                System.out.println(xm+ " es una aproximacion a la raiz con tolerancia de " + tolerancia);
            else 
                System.out.println("El metodo fallo en " + nIter + " iteraciones.");
        }else{
                System.out.println("Se ingreso un intervalo incorrecto");
        }
        
    }
    
    public static void puntoFijo(double x0, double tolerancia, int nIter){
        double fx0=funcion(x0);
        double error=tolerancia+1;
        int counter=0;
        while(error>tolerancia && fx0!=0 && counter<nIter){
            double xaux=x0;
            x0=gfuncion(x0);
            fx0=funcion(x0);
            error=Math.abs(x0-xaux);
            counter++;
        }
        if(fx0==0){
            System.out.println("La raiz es=" + x0);
        }else if(error <= tolerancia){
            System.out.println(x0+ " es una aproximacion a una raiz con tolerancia " + tolerancia);
        }else{
            System.out.println("El metodo fallo en " + nIter + " iteraciones.");
        }
            
    } 
   
    public static void newton(double x0, double tolerancia, int nIter){
        double fx0=funcion(x0);
        double error=tolerancia+1;
        double fpx0=funcionP(x0);
        int counter=0;
        while(error>tolerancia && fx0!=0 && counter<nIter && fpx0!=0){
            double xaux=x0;
            x0=x0- fx0/fpx0;
            fx0=funcion(x0);
            fpx0=funcionP(x0);
            error=Math.abs(x0-xaux);
            counter++;
        }
        if(fx0==0){
            System.out.println("La raiz es=" + x0);
        }else if(error <= tolerancia){
            System.out.println(x0+ " es una aproximacion a una raiz con tolerancia " + tolerancia);
        }else if(fpx0==0){
            System.out.println("Error: division por 0");
        }else{
            System.out.println("El metodo fallo en " + nIter + " iteraciones.");
        }
            
     }

    public static void secante(double x0, double x1 , double tolerancia, int nIter){
        double fx0=funcion(x0);
        if(fx0==0){
            System.out.println(x0 + " es una raiz");
        }else{
            double fx1=funcion(x1);
            double denom=fx1-fx0;
            double error=tolerancia+1;
            int counter=0;
            while(error>tolerancia && fx1!=0 && counter<nIter && denom!=0){
                double x2=x1- fx1*(x1-x0)/denom;
                error=Math.abs(x2-x1);
                x0=x1;
                fx0=fx1;
                x1=x2;
                fx1=funcion(x2);
                denom=fx1-fx0;
                counter++;
            }
            if(fx0==0){
                System.out.println("La raiz es=" + x0);
            }else if(error <= tolerancia){
                System.out.println(x0+ " es una aproximacion a una raiz con tolerancia " + tolerancia);
            }else if(denom==0){
                System.out.println("Error: division por 0");
            }else{
                System.out.println("El metodo fallo en " + nIter + " iteraciones.");
            }
        }    
     }
     
    public static void raizMultiple(double x0, double tolerancia, int nIter){
        double fx0=funcion(x0);
        double fpx0=funcionP(x0);
        double f2px0=funcion2P(x0);
        double error=tolerancia+1;
        double denom=Math.pow(fpx0, 2)- fx0 * f2px0;
        int counter=0;
        while(error>tolerancia && fx0!=0 && counter<nIter && denom!=0){
            double x1=x0 - fx0 * fpx0 / denom;
            fx0=funcion(x1);
            fpx0=funcionP(x1);
            f2px0=funcion2P(x1);
            error=Math.abs(x0-x1);
            x0=x1;
            counter++;
        }
        if(fx0==0){
            System.out.println("La raiz es=" + x0);
        }else if(error <= tolerancia){
            System.out.println(x0+ " es una aproximacion a una raiz con tolerancia " + tolerancia);
        }else if(denom==0){
            System.out.println("Error: division por 0");
        }else{
            System.out.println("El metodo fallo en " + nIter + " iteraciones.");
        }
            
     }

    
}
