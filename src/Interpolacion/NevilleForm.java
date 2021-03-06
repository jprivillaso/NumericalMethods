/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * NevilleForm.java
 *
 * Created on 15/11/2011, 02:39:34 PM
 */
package Interpolacion;

import Vistas.Interpolation;
import Vistas.Mensage;

/**
 *
 * @author Juan Rivillas
 */
public class NevilleForm extends javax.swing.JFrame {
    
    private double [][] matriz;
    private String polinomio;
    private int n;
    private double valorPolinomio = 0;  
    private Interpolation interpolation;
    
    /** Creates new form NevilleForm */
    public NevilleForm(Interpolation interpolation2) {
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
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
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
                "Title 1", "Title 2"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(40, 100, 490, 90);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(40, 320, 80, 23);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Help");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.setBounds(330, 280, 53, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jScrollPane2.setBounds(40, 210, 280, 96);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("N");
        jLabel2.setBounds(430, 200, 40, 60);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField1.setBounds(470, 220, 60, 20);
        jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("Resize");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jButton3.setBounds(330, 210, 70, 23);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField2.setBounds(470, 260, 60, 20);
        jLayeredPane1.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("X");
        jLabel3.setBounds(430, 250, 24, 47);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("EXIT");
        jButton4.setBounds(470, 320, 60, 23);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton5.setText("Return To Method's List");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jButton5.setBounds(160, 320, 160, 23);
        jLayeredPane1.add(jButton5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("NEVILLE");
        jLabel1.setBounds(170, 10, 230, 80);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo4.png"))); // NOI18N
        jLabel4.setBounds(0, 0, 580, 350);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    
     try {
        int n = Integer.parseInt(jTextField1.getText());
       
        Object[][] b = new Object[n][2 + (n-1)];
        String [] nombres=new String[n+1];
        nombres[0]="x";
        nombres[1]="f(x)";
        jTable1.setModel(new javax.swing.table.DefaultTableModel(b, nombres));
        
    } catch (Exception ex) {
        System.out.println("exception en em metodo de redimension " + ex);
    }
}//GEN-LAST:event_jButton3ActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    double valorACalcular = Double.parseDouble(jTextField2.getText()); 
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
    calcularMatriz(valorACalcular , xi , fx);  
    
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
// TODO add your handling code here:
       String titulo="Neville Help ";
    String texto="Algorithm is a variant of Newton's divided differences with the ease of adding nodes recursively. \n"
+"Is right if you want to evaluate a polynomial interpolation on a single point or a very small number”  \n"
+"of points. This is why the calculations are too complicated even managing small amounts of numbers. \n";

    Mensage a=new Mensage(titulo,texto);
       a.setVisible(true);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

    interpolation.setVisible(true);
    this.setVisible(false);
}//GEN-LAST:event_jButton5ActionPerformed

private void calcularMatriz(double x , double [] xi, double [] fx) {        
        matriz = new double[n][n + 1];
        for(int i = 0; i < n ; i++){
            matriz[i][0] = xi[i];
            matriz[i][1] = fx[i];
        }

        int loop = 0;
        for(int i = 2; i < n + 1; i++){
            int min = 0;
            int max = 1 + loop;
            for(int j = i - 1; j < n; j++){
                matriz[j][i] = ( (x - matriz[min][0])* matriz[j][i - 1] - (x-matriz[max][0])*matriz[j - 1][i - 1])
                        / ( matriz[max][0] - matriz[min][0]);
                min ++;
                max ++;
            }
            loop++;
        }
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j]+ "    ");
            }
            System.out.println();
        } 
        
        CalcularPolinomio(valorPolinomio);
        
        
    }
        
    public double CalcularPolinomio(double x){
        double resultado = 0;
        polinomio ="P(x) = ";
        for (int i = 0 ; i < n ; i++) {            
            double multi = 1;
            polinomio += matriz[i][i+1]+"";
            for (int j = 0 ; j < i; j++) {
                multi = multi * (x - matriz[j][0]);
                polinomio += " ( x" +" - "+ matriz[j][0]+" )";
            }
            resultado = resultado + matriz[i][i+1] * multi;
            if(i + 1 != n){                
                polinomio += " + ";
            }
        }
        return resultado;
    }

    
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
