/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
public class FunctionList {

    private Expresion func;
    private Expresion funcp;
    private Expresion func2p;
    private Expresion gfunc;
    private Expresion aux;

    public boolean getHfunc() {
        if (aux == null) {
            return false;
        }
        return true;
    }

    public FunctionList() {
    }

    public  double f(double x) {
        try {
            return func.evaluar(x);
        } catch (Exception ex) {
            System.out.println("No se puede evaluar la funcion en " + x);
            Logger.getLogger(FunctionList.class.getName()).log(Level.SEVERE, null, ex);
            return 0.0;
        }
    }
    public  double fp(double x) {
        try {
            return funcp.evaluar(x);
        } catch (Exception ex) {
            System.out.println("No se puede evaluar la funcion en " + x);
            Logger.getLogger(FunctionList.class.getName()).log(Level.SEVERE, null, ex);
            return 0.0;
        }
    }
    public  double f2p(double x) {
        try {
            return func2p.evaluar(x);
        } catch (Exception ex) {
            System.out.println("No se puede evaluar la funcion en " + x);
            Logger.getLogger(FunctionList.class.getName()).log(Level.SEVERE, null, ex);
            return 0.0;
        }
    }
    public double g(double x) {
        try {
            return gfunc.evaluar(x);
        } catch (Exception ex) {
            System.out.println("No se puede evaluar la funcion en " + x);
            Logger.getLogger(FunctionList.class.getName()).log(Level.SEVERE, null, ex);
            return 0.0;
        }
    }
    public double h(double x) {
        try {
            return aux.evaluar(x);
        } catch (Exception ex) {
            System.out.println("No se puede evaluar la funcion en " + x);
            Logger.getLogger(FunctionList.class.getName()).log(Level.SEVERE, null, ex);
            return 0.0;
        }
    }
    public  boolean getAux() {
        if (aux == null) {
            return false;
        }
        return true;
    }

    public  void setAux(String funcion) {
        try {
            aux=new Expresion(funcion);
        } catch (Exception ex) {
            Logger.getLogger(FunctionList.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("");
        }
    }

    public boolean getFunc() {
        if (func == null) {
            return false;
        }
        return true;
    }

    public void setFunc(String funcion) {
        try {
             func=new Expresion(funcion);
        } catch (Exception ex) {
            Logger.getLogger(FunctionList.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("");
        }
    }

    public boolean getFunc2p() {
        if (func2p == null) {
            return false;
        }
        return true;
    }

    public void setFunc2p(String funcion) {
       try {
            func2p=new Expresion(funcion);
        } catch (Exception ex) {
            Logger.getLogger(FunctionList.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("");
        }
    }

    public boolean getFuncp() {
        if (funcp == null) {
            return false;
        }
        return true;
    }

    public void setFuncp(String funcion) {
        try {
            funcp=new Expresion(funcion);
        } catch (Exception ex) {
            Logger.getLogger(FunctionList.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("");
        }
    }

    public boolean getGfunc() {
        if (gfunc == null) {
            return false;
        }
        return true;
    }

    public void setGfunc(String funcion) {
        try {
            gfunc=new Expresion(funcion);
        } catch (Exception ex) {
            Logger.getLogger(FunctionList.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("");
        }
    }
}
