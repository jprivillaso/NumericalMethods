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
public class GaussThread extends Thread {

    public int n;
    public double matrizA[][];
    public double X[];
    private double matrizM[][];
    public String vm[];
    private boolean espera;

    public GaussThread(Boolean esperar, int n2, double[][] matrizA2) {
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

    public void run() {
        synchronized (this) {
            matrizM = new double[n][n];
            X = new double[n];
            //String[] vm = new String[matrizA[0].length];


            for (int k = 0; k < n; k++) {

                for (int i = k + 1; i < n; i++) {

                    matrizM[i][k] = (double) matrizA[i][k] / matrizA[k][k];

                    for (int j = k; j < n + 1; j++) {
                        matrizA[i][j] = matrizA[i][j] - matrizM[i][k] * matrizA[k][j];
                    }

                }
                try {
                    if (espera) {
                        wait();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(GaussThread.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            notify();
        }
        //System.out.println("holis");
        double b[]=new double [n];
        for (int k=0; k<n ;k++){
            b[k]=matrizA[k][n];
            //System.out.println("b[k]= " + b[k]);
        }
       X=sustitucionregresiva(b);
       
       //notify();
    }

    public double[] sustitucionregresiva(double[] b) {
        double[] x = new double[n];
        double resultado = 0;
        for (int k = n - 1; k >= 0; k--) {
            resultado = b[k];
            for (int l = k + 1; l < n; l++) {
                //solo para gauss simple
                resultado -= matrizA[k][l] * x[l];
            }
            resultado = resultado / matrizA[k][k];
            //System.out.println(resultado);
            x[k]=resultado;
        }
        
        return x;
    }
}
