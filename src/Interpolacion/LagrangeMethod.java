/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LagrangeMethod.java
 *
 * Created on 15/11/2011, 04:53:14 PM
 */
package Interpolacion;

import Vistas.Interpolation;
import Vistas.Mensage;
import java.util.Vector;

/**
 *
 * @author Mao Ricardo
 */

public class LagrangeMethod extends javax.swing.JFrame {

    private int n ;
    private double [][] A;    
    private double [] x;
    private double [] y ;
    private double xValue;
    private Interpolation interpolation;
    
    /** Creates new form LagrangeMethod */
    public LagrangeMethod(Interpolation interpolation2) {
        initComponents();  
        interpolation = interpolation2;
    }
    
      public double lagrange (double x[],double y[],double xValor){      
        double productoria =1;
        int tamano=x.length;
        double lagrange[] = new double[tamano];

        for(int j=0;j<tamano;j++){
            for(int i=0;i<tamano;i++){
                if (i!=j){
                    productoria=productoria*((xValor-x[i])/(x[j]-x[i]));                
                }                                
                System.out.println("la prod "+i+" es "+productoria);
            }            
            jTextArea1.setText("L"+j+" ");            
            lagrange[j]=productoria;          
            productoria=1;
        }
       double valorFinal=0;
       for(int i=0;i<tamano;i++){
           valorFinal=valorFinal+(lagrange[i]* y[i]);

       }       
       jTextArea1.setText(valorFinal+" ");
        System.out.println(valorFinal);
        return valorFinal;
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton5 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "n", "Xn", "F(Xn)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(40, 70, 452, 90);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("N");
        jLabel3.setBounds(390, 170, 40, 48);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField1.setBounds(430, 230, 60, 20);
        jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Resize");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(303, 180, 80, 23);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("X");
        jLabel4.setBounds(390, 220, 24, 47);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField2.setBounds(430, 180, 60, 20);
        jLayeredPane1.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane2.setBounds(40, 170, 250, 96);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setText("Help");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(150, 270, 53, 23);
        jLayeredPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Calculate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(40, 270, 90, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LAGRANGE");
        jLabel1.setBounds(120, 0, 330, 70);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Return To Method's List");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(350, 290, 170, 23);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("EXIT");
        jButton4.setBounds(230, 270, 55, 23);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        jLabel2.setBounds(0, -40, 540, 370);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
    try{
        n=Integer.parseInt(jTextField1.getText());
       
        Object [][]a=new Object [n][3];
        jTable1.setModel(new javax.swing.table.DefaultTableModel(a,new String [] {"n", "xn","f(xn)"}));     
     } catch(Exception ex){
            System.out.println("exception en em metodo de redimension "+ ex);
     }    
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here: 
     n = Integer.parseInt(jTextField1.getText());
     x = new double[n];
     y = new double [n];
     System.out.println("undiste calcular");
    for(int i = 0; i < n; i++){
        x[i] = Double.parseDouble(jTable1.getValueAt(i, 1)+"");      
        y[i] = Double.parseDouble(jTable1.getValueAt(i, 2)+"");   
    }
    
    xValue = Double.parseDouble(jTextField2.getText());  
 
    lagrange(x, y, xValue);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
// TODO add your handling code here:
        String titulo="Lagrenge Help ";
    String texto="In this method, the causes of error are due to truncation and rounding. The first of these arises  \n"
+"because only take a limited number of points, on the other hand, the rounding error appears when calculations. \n"
+"The formula tedious and have values far from each other are problems that would yield undesirable results. \n";

    Mensage a=new Mensage(titulo,texto);
       a.setVisible(true);
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    interpolation.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton3ActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
