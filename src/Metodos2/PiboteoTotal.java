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
public class PiboteoTotal extends javax.swing.JFrame {

    boolean pause = true;
    //boolean boton=true;
    private int n;
    private double matrizA[][];
    private double matrizM[][];
    private String vm[];
    private double[] X;
    ToltaThread gaussim;
    /** Creates new form GaussSimple */
    public PiboteoTotal(double [][] a,int p) {
        initComponents();
        n=p;
        matrizA=a;
        vm=new String [n+1];
        for (int i = 0; i < n; i++) {
            vm[i] = i + 1 + "";
        }
        vm[n] = "b";
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bolStep = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane2.setBounds(206, 290, 320, 96);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

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

        jScrollPane1.setBounds(120, 130, 404, 108);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setText("Start");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(10, 130, 100, 35);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(430, 250, 90, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        bolStep.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        bolStep.setForeground(new java.awt.Color(255, 255, 255));
        bolStep.setText("Step to Step");
        bolStep.setBounds(10, 170, 110, 25);
        jLayeredPane1.add(bolStep, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("Finish");
        jButton4.setBounds(210, 250, 86, 23);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(120, 250, 85, 23);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setBackground(new java.awt.Color(255, 102, 102));
        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("1");
        jLabel3.setBounds(10, 250, 63, 22);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Step #:");
        jLabel2.setBounds(10, 220, 59, 25);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setText("EXIT");
        jButton5.setBounds(450, 400, 55, 23);
        jLayeredPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setText("Return To Method's List");
        jButton6.setBounds(210, 400, 140, 23);
        jLayeredPane1.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL PIVOTING");
        jLabel1.setBounds(10, 10, 510, 100);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo5.jpg"))); // NOI18N
        jLabel4.setBounds(0, 0, 530, 440);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    if (bolStep.isSelected())gaussim=new ToltaThread(true,n, matrizA);
    else gaussim=new ToltaThread(false,n, matrizA);
    gaussim.start();
    synchronized(gaussim){
        try{
           gaussim.notify(); 
        }catch (Exception ex){
            
        }
    }
    matrizA=gaussim.matrizA;
    vm=gaussim.vm;
    imprimir();
   
}//GEN-LAST:event_jButton1ActionPerformed
    private void imprimir() {
        Object[][] matrix = new Object[n][n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                matrix[i][j] = matrizA[i][j];

            }

        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(matrix, vm));
    }
private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
// TODO add your handling code here:
    
    matrizA=gaussim.matrizA;
    X = gaussim.X;
    imprimir();
    synchronized(gaussim){
        try{
           gaussim.notify(); 
        }catch (Exception ex){
            
        }
    }
    jTextArea1.removeAll();
        String frase="";
         for (int i = 0; i < n; i++) {
            frase+= "X(" + (i+1) + ")="+X[i]+" \n" ;
            jTextArea1.setText(frase);
         }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
   String titulo = "Total pivoting Method";
    String texto = "This technique chooses in each stage i, the max value in absolute value between \n "
+"the elements apq, being q >= I and p >= i. To put the max value in its place we \n "
+"have to make two interchanges, the first between the i and the p row. The second \n "
+"interchange is done between the column i and q. Then we put zeros down the diagonal. \n";

    Mensage a = new Mensage(titulo, texto);
    a.setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PiboteoTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PiboteoTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PiboteoTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PiboteoTotal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                double[][] a = {
                    {6, 48, -2, 5, -8, -50},
                    {75, -6, 4, -8, 1, 21},
                    
                    {3, -7, 125, -4, 7, 38},
                    {5, -6, 7, 95, -11, 79},
                    {3, 8, -19, -12, 131, 728}
                };

                PiboteoTotal b = new PiboteoTotal(a,5);
                b.matrizA = a;
                //b.n = 5;
                b.imprimir();
                b.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox bolStep;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    
}
