/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
public class ToltaThread extends Thread {

    public int n;
    public double matrizA[][];
    private double matrizM[][];
    public String vm[];
    private boolean espera;
    private int filaMayor = 0;
    private int columnaMayor = 0;
    public double X[];
    public ToltaThread(Boolean esperar, int n2, double[][] matrizA2) {
        super();
        espera = esperar;
        n = n2;
        matrizA = matrizA2;
        vm = new String[n + 1];
        for (int i = 0; i < n; i++) {
            vm[i] = i + 1 + "";
        }
        vm[n] = "b";
    }

    public double mayorTot(int k) {
        double mayor = 0.0;
        for (int r = k; r < n; r++) {
            for (int s = k; s < n; s++) {
                if (mayor < Math.abs(matrizA[s][r])) {
                    mayor = Math.abs(matrizA[s][r]);
                    filaMayor = s;
                    columnaMayor = r;
                }
            }
        }
        return mayor;
    }

    public double[][] cambioFila(int k) {
        double aux = 0.0;
        for (int i = 0; i < n + 1; i++) {
            aux = matrizA[k][i];
            matrizA[k][i] = matrizA[filaMayor][i];
            matrizA[filaMayor][i] = aux;
        }
        return matrizA;
    }

    public void cambiarColumna(int k) {

        for (int a = 0; a < n; a++) {
            double aux = matrizA[a][k];
            matrizA[a][k] = matrizA[a][columnaMayor];
            matrizA[a][columnaMayor] = aux;
        }
        int aux = Integer.parseInt(vm[k]);
        vm[k] = vm[columnaMayor];
        vm[columnaMayor] = aux + "";
    }

    public void run() {
        synchronized (this) {
            matrizM = new double[n][n];
             X = new double[n];
            //String[] vm = new String[matrizA[0].length];

            double mayor = 0.0;
            for (int k = 0; k < n ; k++) {
                mayor = mayorTot(k);
                if (mayor == 0) {
                    System.out.println("Error, Infinitas Soluciones");
                }
                if (filaMayor != k) {
                    matrizA = cambioFila(k);
                }
                if (columnaMayor != k) {
                    cambiarColumna(k);
                }
                for (int i = k+1; i < n; i++) {
                    matrizM[i][k] =(double) matrizA[i][k] / matrizA[k][k];
                    for (int j = k; j < n + 1; j++) {
                        matrizA[i][j] = matrizA[i][j] - matrizM[i][k] * matrizA[k][j];
                    }
                }
                try {
                    if (espera) {
                        wait();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(ToltaThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
             notify();
        } 
        double b[]=new double [n];
        for (int k=0; k<n ;k++){
            b[k]=matrizA[k][n];
            //System.out.println("b[k]= " + b[k]);
        }
        X=sustitucionregresiva(b);
    }
    public double[] sustitucionregresiva(double[] b) {
        double[] x = new double[n];
        double resultado = 0;
        for (int k = n - 1; k >= 0; k--) {
            resultado = b[k];
            for (int l = k + 1; l < n; l++) {
                //solo para gauss simple
                resultado -= matrizA[k][l] * x[Integer.parseInt(vm[l])-1];
            }
            resultado = resultado / matrizA[k][k];
            //System.out.println(resultado);
            x[Integer.parseInt(vm[k])-1]=resultado;
        }
        
        return x;
    }
}
