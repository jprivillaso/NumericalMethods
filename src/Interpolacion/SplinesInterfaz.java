/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NewtonInterface.java
 *
 * Created on 15/11/2011, 10:43:04 AM
 */
package Interpolacion;

import Vistas.Interpolation;
import Vistas.Mensage;

/**
 *
 * @author Juan Rivillas
 */
public class SplinesInterfaz extends javax.swing.JFrame {

    private double[][] matriz;
    private String polinomio;
    private int n;
    private double valorPolinomio = 0;
    private Interpolation interpolation;

    /** Creates new form NewtonInterface */
    public SplinesInterfaz(Interpolation interpolation2) {
        initComponents();
        interpolation = interpolation2;
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "X", "f(x)"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(320, 110, 200, 110);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Lineal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(320, 290, 90, 23);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(250, 380, 53, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane2.setBounds(30, 110, 270, 260);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.setBounds(450, 240, 70, 20);
        jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36));
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("N");
        jLabel2.setBounds(410, 230, 31, 40);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Resize");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(320, 240, 80, 23);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("Quadratic");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(320, 320, 90, 23);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setText("Cubic");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(320, 350, 90, 23);
        jLayeredPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48));
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("SPLINES");
        jLabel1.setBounds(180, 10, 190, 64);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton8.setText("Help");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jButton8.setBounds(453, 290, 70, 23);
        jLayeredPane1.add(jButton8, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton6.setText("Return To Method's List");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jButton6.setBounds(30, 380, 160, 23);
        jLayeredPane1.add(jButton6, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton7.setText("EXIT");
        jButton7.setBounds(30, 420, 55, 23);
        jLayeredPane1.add(jButton7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24));
        jLabel3.setForeground(new java.awt.Color(204, 255, 255));
        jLabel3.setText("EQUATIONS");
        jLabel3.setBounds(30, 70, 170, 33);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo6.jpg"))); // NOI18N
        jLabel4.setBounds(0, 0, 530, 450);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    int n = Integer.parseInt(jTextField1.getText());
    double[] xi = new double[n];
    double[] fx = new double[n];

    for (int i = 0; i < xi.length; i++) {
        String a = jTable1.getValueAt(i, 0).toString();
        xi[i] = Double.parseDouble(a);
        System.out.println("x" + i + "=" + xi[i]);
    }

    for (int i = 0; i < fx.length; i++) {
        String a = jTable1.getValueAt(i, 1).toString();
        fx[i] = Double.parseDouble(a);

        System.out.println("y" + i + "=" + fx[i]);
    }
    System.out.println("llame calcular");
    HallarSistemaEcuLineal(n, xi, fx);
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    try {
        int n = Integer.parseInt(jTextField1.getText());

        Object[][] b = new Object[n][2];
        jTable1.setModel(new javax.swing.table.DefaultTableModel(b, new String[]{"x", "Fx"}));

    } catch (Exception ex) {
        System.out.println("exception en em metodo de redimension " + ex);
    }

}//GEN-LAST:event_jButton3ActionPerformed

private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jTextField1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
    int n = Integer.parseInt(jTextField1.getText());
    double[] xi = new double[n];
    double[] fx = new double[n];

    for (int i = 0; i < xi.length; i++) {
        String a = jTable1.getValueAt(i, 0).toString();
        xi[i] = Double.parseDouble(a);
        System.out.println("x" + i + "=" + xi[i]);
    }

    for (int i = 0; i < fx.length; i++) {
        String a = jTable1.getValueAt(i, 1).toString();
        fx[i] = Double.parseDouble(a);

        System.out.println("y" + i + "=" + fx[i]);
    }
    System.out.println("llame calcular");
    HallarSistemaEcuCuadratico(n, xi, fx);
}//GEN-LAST:event_jButton4ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
    int n = Integer.parseInt(jTextField1.getText());
    double[] xi = new double[n];
    double[] fx = new double[n];

    for (int i = 0; i < xi.length; i++) {
        String a = jTable1.getValueAt(i, 0).toString();
        xi[i] = Double.parseDouble(a);
        System.out.println("x" + i + "=" + xi[i]);
    }

    for (int i = 0; i < fx.length; i++) {
        String a = jTable1.getValueAt(i, 1).toString();
        fx[i] = Double.parseDouble(a);

        System.out.println("y" + i + "=" + fx[i]);
    }
    System.out.println("llame calcular");
    HallarSistemaEcuCubico(n, xi, fx);// TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
// TODO add your handling code here:
      String titulo="Splines Help ";
    String texto="Given n points (x0, f(x0)), ... (xn, f(xn)),with the cubic splines we pretend to search a function composed by \n "
+"quadratic polynomials that cross these points. We have to enter the values of x and their respective fx.  \n";


    Mensage a=new Mensage(titulo,texto);
       a.setVisible(true);
}//GEN-LAST:event_jButton8ActionPerformed

private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    interpolation.setVisible(true);
    this.setVisible(false);
    
}//GEN-LAST:event_jButton6ActionPerformed
    public void HallarSistemaEcuLineal(int n, double[] pointsX, double[] pointsY) {
        String ecuaciones = "";
        if (n > 1) {
            for (int i = 0; i < n - 1; i++) {
                //System.out.println(pointsY[n]);
                if ((pointsX[i + 1] - pointsX[i]) != 0) {
                    double m = (pointsY[i + 1] - pointsY[i]) / (pointsX[i + 1] - pointsX[i]);

                    ecuaciones = ecuaciones + ((i + 1) + ") Y = " + m + "x + " + (-1 * m * pointsX[i] + pointsY[i])) + "\n";
                }
            }
        }
        jTextArea1.setText(ecuaciones);
    }

    public void HallarSistemaEcuCubico(int n, double[] pointsX, double[] pointsY) {
        int necu = 0;
        String ecuaciones = "";
        if (n > 1) {
            ecuaciones = ecuaciones +((++necu) + ") " + Math.pow(pointsX[0], 3) + "A1 + " + Math.pow(pointsX[0], 2) + "B1 + " + pointsX[0] + "C1 + D1 = " + pointsY[0])+"\n";
            for (int i = 1; i < n - 1; i++) {
                double x3 = Math.pow(pointsX[i], 3);
                double x2 = Math.pow(pointsX[i], 2);
                ecuaciones = ecuaciones +((++necu) + ") " + x3 + "A" + i + " + " + x2 + "B" + i + " + " + pointsX[i] + "C" + i + " + D" + i + " = " + pointsY[i])+"\n";
                ecuaciones = ecuaciones +((++necu) + ") " + x3 + "A" + (i + 1) + " + " + x2 + "B" + (i + 1) + " + " + pointsX[i] + "C" + (i + 1) + " + D" + (i + 1) + " = " + pointsY[i])+"\n";
            }
            ecuaciones = ecuaciones +(++necu + ") " + Math.pow(pointsX[n - 1], 3) + "A" + (n - 1) + " + " + Math.pow(pointsX[n - 1], 2) + "B" + (n - 1) + " + " + pointsX[n - 1] + "C" + (n - 1) + " + D" + (n - 1) + " = " + pointsY[n - 1])+"\n";
            for (int i = 1; i < n - 1; i++) {
                double x2 = Math.pow(pointsX[i], 2);
                ecuaciones = ecuaciones +((++necu) + ") " + 3 * x2 + "A" + i + " + " + pointsX[i] * 2 + "B" + i + " + C" + i + " = " + 3 * x2 + "A" + (i + 1) + " + " + pointsX[i] * 2 + "B" + (i + 1) + " + C" + (i + 1))+"\n";
            }
            for (int i = 1; i < n - 1; i++) {
                //double x2=Math.pow(pointsX[i], 2);
                ecuaciones = ecuaciones +((++necu) + ") " + 6 * pointsX[i] + "A" + i + " + " + 2 + "B" + i + " = " + 6 * pointsX[i] + "A" + (i + 1) + " + " + 2 + "B" + (i + 1))+"\n";
            }
            ecuaciones = ecuaciones +((++necu) + ") " + 6 * pointsX[0] + "A1 + 2B1 = 0")+"\n";
            ecuaciones = ecuaciones +((++necu) + ") " + 6 * pointsX[n - 1] + "A" + n + " 2B" + (n - 1) + " = 0")+"\n";
        }
        jTextArea1.setText(ecuaciones);
    }

    public void HallarSistemaEcuCuadratico(int n, double[] pointsX, double[] pointsY) {
        String ecuaciones = "";
        int necu = 0;
        if (n > 1) {
            ecuaciones = ecuaciones +((++necu) + ") " + Math.pow(pointsX[0], 2) + "A1 + " + pointsX[0] + "B1 + C1 = " + pointsY[0])+"\n";
            for (int i = 1; i < n - 1; i++) {
                double x2 = Math.pow(pointsX[i], 2);
                ecuaciones = ecuaciones +((++necu) + ") " + x2 + "A" + i + " + " + pointsX[i] + "B" + i + " + C" + i + " = " + pointsY[i])+"\n";
                ecuaciones = ecuaciones +((++necu) + ") " + x2 + "A" + (i + 1) + " + " + pointsX[i] + "B" + (i + 1) + " + C" + (i + 1) + " = " + pointsY[i])+"\n";
            }
            ecuaciones = ecuaciones +(++necu + ") " + Math.pow(pointsX[n - 1], 2) + "A" + (n - 1) + " + " + pointsX[n - 1] + "B" + (n - 1) + " + C" + (n - 1) + " = " + pointsY[n - 1])+"\n";
            for (int i = 1; i < n - 1; i++) {
                // double x2=Math.pow(pointsX[i], 2);
               ecuaciones = ecuaciones +((++necu) + ") " + pointsX[i] * 2 + "A" + i + " + B" + i + " = " + pointsX[i] * 2 + "A" + (i + 1) + " + B" + (i + 1))+"\n";
            }
            ecuaciones = ecuaciones +(++necu + ") 2A1 = 0")+"\n";
        }
        jTextArea1.setText(ecuaciones);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
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
    // End of variables declaration//GEN-END:variables
}
