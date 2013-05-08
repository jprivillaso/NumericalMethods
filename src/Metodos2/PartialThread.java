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
public class PartialThread extends Thread {

    public int n;
    public double matrizA[][];
    private double matrizM[][];
    public String vm[];
    private boolean espera;
    private int filaMayor;
    public double X[];

    public PartialThread(Boolean esperar, int n2, double[][] matrizA2) {
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
            //String[] vm = new String[matrizA[0].length];
            X = new double[n];

            for (int k = 0; k < n ; k++) {
                double mayor = mayor(k);

                if (mayor == 0) {

                    System.out.println("Error, Infinitas Soluciones");

                }

                if (filaMayor != k) {

                    matrizA = cambioFila(k);

                }
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
                    Logger.getLogger(PartialThread.class.getName()).log(Level.SEVERE, null, ex);
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
    }//fin clase run
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
    public double mayor(int k) {
        double mayor = 0.0;

        for (int r = k; r < n; r++) {

            if (mayor < Math.abs(matrizA[k][r])) {

                mayor = Math.abs(matrizA[k][r]);

                filaMayor = r;

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
}
