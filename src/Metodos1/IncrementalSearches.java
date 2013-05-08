/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Method.java
 *
 * Created on 18/09/2011, 09:34:25 PM
 */
package Metodos1;

import Vistas.Mensage;
import Vistas.OneVariableList;
import java.awt.Color;



/**
 *
 * @author Juan Rivillas
 */
public class IncrementalSearches extends javax.swing.JFrame {

    //private Expresion exp;
    private FunctionList listFunc;
    private OneVariableList oneVariableList;
    private Graphic vistaPrueba;
    
    private boolean errorRela = true;
    private boolean errorAbs = true;
    
    
    /** Creates new form Method */
    public IncrementalSearches(FunctionList a , OneVariableList oneVariableList2) {
        initComponents();
        oneVariableList = oneVariableList2;
       // vistaPrueba = new GraphicForm("x^2+2*x+1","x^2/2+1/2","exp(x)","80*sin(-1*((x/40)^(1/2)))");
        listFunc = a;
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
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        salida = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Inputs"));

        jLabel4.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jLabel4.setText("X0");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jLabel5.setText("delta");
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
                .addContainerGap(35, Short.MAX_VALUE))
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
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel1.setBounds(10, 140, 230, 170);
        jLayeredPane1.add(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Return to Method's Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(280, 400, 153, 23);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(260, 340, 83, 26);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setFont(new java.awt.Font("Segoe Print", 0, 11));
        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(410, 340, 70, 30);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "x0", "Fx"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(260, 140, 230, 140);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        salida.setColumns(20);
        salida.setRows(5);
        salida.setText("\n");
        jScrollPane2.setViewportView(salida);

        jScrollPane2.setBounds(10, 330, 230, 80);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(20, 420, 55, 23);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INCREMENTAL");
        jLabel2.setBounds(50, 20, 340, 60);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 48));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEARCHES");
        jLabel3.setBounds(100, 70, 230, 60);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo10.jpg"))); // NOI18N
        jLabel1.setBounds(0, 0, 500, 460);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        double xinicial = Double.parseDouble(jTextField4.getText());
        double delta = Double.parseDouble(jTextField5.getText());
        int niter = Integer.parseInt(jTextField6.getText());

    
        incrementalSearch(xinicial, delta, niter);
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
    oneVariableList.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    
    System.exit(0);
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
    String titulo = "INCREMENTAL SEARCHES METHOD";
    String texto = "As a help for this method, it’s recommended to take a view to the function graphic \n"
            + "that you are going to use, this way you can be sure that you are working with an \n"
            + "interval that contains a root. On the other hand, you can evidence if this function is\n"
            + "continuous and you will have a judgment to choice the X value for the correct work\n"
            + "of the algorithm. \n";
    Mensage a = new Mensage(titulo, texto);
    a.setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed


    public void incrementalSearch(double x0, double delta, int nIter) {
        int row = 0;
        Object[][] matriz = new Object[nIter+1][2];
        matriz[row][0] = x0;
        double fx0 =listFunc.f(x0);
        matriz[row][1] = fx0;
        row++;
        if (fx0 == 0) {
            //System.out.println("La raiz es= " + x0);
            salida.removeAll();
            salida.setForeground(Color.BLACK);
            salida.setText("The root is : " + x0);
        } else {
            double x1 = x0 + delta;
            int count = 1;
            double fx1 = listFunc.f(x1);
            while (fx0 * fx1 > 0 && count < nIter) {
                x0 = x1;
                fx0 = fx1;
                x1 = x0 + delta;
                fx1 = listFunc.f(x1);
                matriz[row][0] = x0;
                matriz[row][1] = fx0;
                row++;
                count++;

            }
            matriz[row][0] = x1;
            matriz[row][1] = fx1;
            if (fx1 == 0) {
                //System.out.println("La raiz es: " + x1);
                salida.removeAll();
                salida.setForeground(Color.BLACK);
                salida.setText("The root is : " + x1);
            } else if (fx0 * fx1 < 0) {
                //System.out.println("El intervalo va desde: " + x0 + " Hasta: " + x1);
                salida.removeAll();
                salida.setForeground(Color.BLACK);
                salida.setText("The root is between : " + x0 + " and " + x1);
            } else {
                //System.out.println("Error, no se encontro raiz en el intervalo");
                salida.removeAll();
                salida.setForeground(Color.red);
                salida.setText("Cant find a root with " + nIter + " iterations");
            }
        }
        jTable1.setModel(new javax.swing.table.DefaultTableModel(matriz, new String[]{"x0", "Fx"}));
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
