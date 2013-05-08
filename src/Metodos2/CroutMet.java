/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GaussSimple.java
 *
 * Created on 10/10/2011, 10:20:52 AM
 */
package Metodos2;

import Vistas.Mensage;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago
 */
public class CroutMet extends javax.swing.JFrame {

    boolean pause = true;
    //boolean boton=true;
    private int n;
    private double matrizA[][];
    private double matrizU[][];
    private double matrizL[][];
    private String vm[];
    private double[] X;
    

    /** Creates new form GaussSimple */
    public CroutMet(double [][] a,int p) {
        initComponents();
        n = p;
        matrizA=a;
        vm = new String[n];
        for (int i = 0; i < n; i++) {
            vm[i] = i + 1 + "";
        }
        //vm[n] = "b";
        String[][] cantX = new String[n][2];
        for (int k = 0; k < n; k++) {
            cantX[k][0] = "B(" + k + ")=";
        }
        String[] nomColum = {"B=", "Value="};
        jTable3.setModel(new javax.swing.table.DefaultTableModel(cantX, nomColum));
        crout();
        imprimir();
        imprimirL();
        //imprimirU();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane2.setBounds(150, 240, 490, 96);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "b"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jTable2);
        jTable2.getColumnModel().getColumn(2).setHeaderValue("3");
        jTable2.getColumnModel().getColumn(3).setHeaderValue("4");
        jTable2.getColumnModel().getColumn(4).setHeaderValue("b");

        jScrollPane3.setBounds(150, 120, 244, 110);
        jLayeredPane1.add(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "1", "2", "3", "4", "b"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getColumn(2).setHeaderValue("3");
        jTable1.getColumnModel().getColumn(3).setHeaderValue("4");
        jTable1.getColumnModel().getColumn(4).setHeaderValue("b");

        jScrollPane1.setBounds(400, 120, 244, 110);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Lindsey", 1, 14));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Matriz L");
        jLabel3.setBounds(150, 90, 75, 29);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Lindsey", 1, 14));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Matriz U");
        jLabel2.setBounds(410, 90, 75, 29);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "B=", "Value"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable3.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jTable3);

        jScrollPane4.setBounds(20, 120, 109, 110);
        jLayeredPane1.add(jScrollPane4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(50, 310, 84, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(20, 240, 110, 35);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CROUT");
        jLabel1.setBounds(220, 10, 180, 60);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Return To Method's List");
        jButton3.setBounds(150, 340, 160, 23);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("EXIT");
        jButton4.setBounds(570, 340, 55, 23);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo13.jpg"))); // NOI18N
        jLabel4.setBounds(0, 0, 660, 380);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 660, 380));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void imprimir() {
        Object[][] matrix = new Object[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrizU[i][j];

            }

        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(matrix, vm));
        
    }
    private void imprimirL(){
        Object[][] matrix = new Object[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                matrix[i][j] = matrizL[i][j];

            }

        }
        jTable2.setModel(new javax.swing.table.DefaultTableModel(matrix, vm));
    }
    
     public void crout() {
        
        matrizL=new double[n][n];  
        matrizU=new double[n][n];
        for (int i = 0; i < n; i++) {
            matrizU[i][i] = 1;
        }
        
        
        for (int k = 0; k < n; k++) {
            double acumulador1 = 0;
            for (int p = 0; p < k; p++) {
                acumulador1 += matrizL[k][p]*matrizU[p][k];
            } 
            
            matrizL[k][k] = matrizA[k][k] - acumulador1;
            
            for (int i = k+1; i < n; i++) {
                double acumulador2 = 0;
                for (int q = 0; q < k; q++) {
                    acumulador2 += matrizL [i][q] * matrizU [q][k]; 
                }
                matrizL[i][k] = matrizA[i][k] - acumulador2;
            }
            
            for (int j = k+1; j < n; j++) {
               double  acumulador3 = 0;
                for (int r = 0; r < k; r++) {
                    acumulador3 += matrizL[k][r] * matrizU[r][j];
                }
                matrizU[k][j] = (matrizA[k][j] - acumulador3)/matrizL[k][k]; 
            }
        }
        
        //imprimirL();
        //imprimirU();
        //return matrizL;
        
    }
    public double[] sustitucionRegresiva(double[][] matrizA, double[] b) {
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
            x[k] = resultado;
        }

        return x;
    }

    public double[] sustitucionProgresiva(double[][] matrizA, double[] b) {
        double[] x = new double[n];
        double resultado = 0;
        for (int k = 0; k < n; k++) {
            resultado = b[k];
            for (int l = k - 1; l >= 0; l--) {
                //solo para gauss simple
                resultado -= matrizA[k][l] * x[l];
            }
            resultado = resultado / matrizA[k][k];
            //System.out.println(resultado);
            x[k] = resultado;
        }

        return x;
    }
private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    String titulo = "Crout METHOD";
    String texto = "The Crout method is a direct factorization method based on the product of matrixes where\n"
+"we use LU factorization, ie, find an upper triangular matrix L and a lower triangle \n"
+"matrix U resulting in a matrix A, where, by the method of crout, matrix U will have ones in \n"
+"the diagonal, then proceed to find the values of L and U to find the solution of the system.\n";

    Mensage a = new Mensage(titulo, texto);
    a.setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    Object[] b = new Object[n];

    for (int i = 0; i < b.length; i++) {

        b[i] = jTable3.getValueAt(i, 1);
        System.out.println("B[]= " + b[i]);

    }
    double[] B = new double[n];
    for (int i = 0; i < b.length; i++) {
        try{
        B[i] = Double.parseDouble((String) b[i]);
        }catch(Exception ex){
            System.out.println("se ingreso dato invalido");
        }

    }
    double[] Z = sustitucionProgresiva(matrizL, B);
    X = sustitucionRegresiva(matrizU, Z);
    jTextArea1.removeAll();
    String frase = "";
    for (int i = 0; i < n; i++) {
        frase += "X(" + (i + 1) + ")=" + X[i] + " \n";
        jTextArea1.setText(frase);
    }

    
}//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;




                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CroutMet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CroutMet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CroutMet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CroutMet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                double [][] a = {
                    {36,3,-4,5},
                    {5,-45,10,-2},
                    {6,8,57,5},
                    {2,3,-8,-42},};

                CroutMet b = new CroutMet(a,4);
                //b.matrizA = a;
                //b.n = 5;
                b.imprimir();
                b.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}