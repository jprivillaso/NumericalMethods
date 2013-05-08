/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewtonMethod.java
 *
 * Created on 19/09/2011, 02:22:39 PM
 */
package Metodos1;

import Vistas.Mensage;
import Vistas.OneVariableList;
import java.awt.Color;

/**
 *
 * @author Mao Ricardo
 */
public class NewtonMethod extends javax.swing.JFrame {
    
    FunctionList listFunc;
    private OneVariableList oneVariableList;
    private Graphic vistaPrueba;
    
    
    private boolean errorRela = true;
    private boolean errorAbs = true;
    
    /** Creates new form NewtonMethod */
    public NewtonMethod(FunctionList a, OneVariableList oneVariableList2) {
        initComponents();
        oneVariableList = oneVariableList2;
        //vistaPrueba = new GraphicForm(null, null, null, null)
        listFunc=a;
    }
    
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Inputs"));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jLabel4.setText("X0");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jLabel5.setText("tol");
        jLabel5.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jLabel6.setText("niter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6)
                    .addComponent(jTextField5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel1.setBounds(10, 70, 205, 160);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Xn", "F(Xn)", "Fp(Xn)", "Error"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(230, 70, 430, 150);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("NEWTON METHOD");
        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel1.setBounds(130, 10, 325, 52);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(10, 280, 83, 26);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(130, 280, 73, 26);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        salida.setColumns(20);
        salida.setRows(5);
        salida.setText("\n");
        jScrollPane2.setViewportView(salida);

        jScrollPane2.setBounds(240, 240, 420, 77);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Absolute Error");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jCheckBox1.setBounds(10, 250, 100, 23);
        jLayeredPane1.add(jCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Relative Error");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        jCheckBox2.setBounds(120, 250, 100, 23);
        jLayeredPane1.add(jCheckBox2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(600, 330, 55, 23);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("Return To Method's List");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(10, 330, 180, 23);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo9.jpg"))); // NOI18N
        jLabel2.setBounds(0, 0, 670, 370);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        double xinicial = Double.parseDouble(jTextField4.getText());
        double tolerancia = Double.parseDouble(jTextField5.getText());
        int niter = Integer.parseInt(jTextField6.getText());
        
        if(jCheckBox1.isSelected() == true){
            errorRela = true;
        }             
        if(jCheckBox2.isSelected() == true){
            errorAbs = true;
        }
    
        
        newtonMet(xinicial, tolerancia, niter, errorRela, errorAbs);                
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    oneVariableList.setVisible(true);
    this.setVisible(false);
    
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    System.exit(0);
}//GEN-LAST:event_jButton3ActionPerformed

private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
// TODO add your handling code here:
    jCheckBox2.setSelected(!jCheckBox1.isSelected());
}//GEN-LAST:event_jCheckBox1ActionPerformed

private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
// TODO add your handling code here:
    jCheckBox1.setSelected(!jCheckBox2.isSelected());
}//GEN-LAST:event_jCheckBox2ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
        String titulo = "NEWTON MEHTOD";
    String texto = "It starts with the assumption of a continuous and growing function. This method is \n"
            + "variant of Fixed Point, with the difference that it works with the tangent, in \n"
            + "consequence if the input value is n – maximum, the method could be slow because\n"
            + "the derived will be so close to 0. Respect the error in this method, we can say that:\n"
            + "En+1 = k(En)^2. \n";
    Mensage a = new Mensage(titulo, texto);
    a.setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

     public void newtonMet(double x0, double tolerancia, int nIter,boolean errorRela,boolean errorAbs){    
         
        int row = 0;
        Object[][] matriz = new Object[nIter+1][4];
        matriz[row][0] = x0;         
        double fx0 = listFunc.f(x0);        
        matriz[row][1] = fx0;
        double fpx0 = listFunc.fp(x0);
        matriz[row][2] = fpx0;
        double error = tolerancia+1;
        //matriz[row][3]= error;
        row++;                   
        int counter = 0;
        while(error > tolerancia && fx0!=0 && counter < nIter && fpx0 != 0){              
            double xaux = x0;
            x0= x0- fx0/fpx0;
            fx0 = listFunc.f(x0);
            fpx0 = listFunc.fp(x0);
             if(errorAbs == true){
                    error = Math.abs(x0 - xaux);
            }
            if(errorRela == true){
                   error = Math.abs((x0 - xaux)/x0);
            } 
            matriz[row][0] = x0;
            matriz[row][1] = fx0;
            matriz[row][2] = fpx0;
            matriz[row][3] = error;                      
            row++;
            counter++;               
        }
        /*
        matriz[row][0] = x0;
        matriz[row][1] = fx0;
        matriz[row][2] = fpx0;
        matriz[row][3] = error;  
         * 
         */
        if(fx0==0){            
            salida.removeAll();
            salida.setForeground(Color.BLACK);
            salida.setText("The root is : " + x0);
        }else if(error <= tolerancia){           
            salida.removeAll();
            salida.setForeground(Color.BLACK);
            salida.setText(x0+ " es una aproximacion a una raiz con tolerancia " + tolerancia);
        }else if(fpx0==0){            
            salida.removeAll();
            salida.setForeground(Color.BLACK);
            salida.setText("Error: division por 0");
        }else{                        
            salida.removeAll();
            salida.setForeground(Color.BLACK);
            salida.setText("El metodo fallo en " + nIter + " iteraciones.");
        }        
        jTable1.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"xn", "F(xn)","Fp(xn)","Error"}));
     }                   
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextArea salida;
    // End of variables declaration//GEN-END:variables
}
