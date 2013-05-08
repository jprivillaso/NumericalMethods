/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * GaussSeidelForm.java
 *
 * Created on 17/10/2011, 04:12:02 PM
 */
package Metodos2;

import Vistas.Mensage;

/**
 *
 * @author Mao Ricardo
 */
public class GaussSeidelForm extends javax.swing.JFrame {
    
    private int n;
    private static double A [][];
    private static double b [];
    private String it;
    private String tol;
    private int iteraciones ;
    private double tolerancia ;

    /** Creates new form GaussSeidelForm */
    public GaussSeidelForm(double [][] A,int n) {                
        initComponents();
        this.n = n;
        this.A = A;
        Object [][] matrix = new Object[4][n+2];
        String[] nomColum=new String[n+2];
         nomColum[0]="Iteraciones";
        nomColum[n+1]="error";
        for(int i=1; i<n+1 ; i++){
            nomColum[i]="x"+i;
        }
         jTable1.setModel(new javax.swing.table.DefaultTableModel(matrix, nomColum));
        String[][] cantX = new String[n][3];
        for (int k = 0; k < n; k++) {
            cantX[k][0] = "X[" + k + "]=";
        }
        String[] nomColum1 = {"X", "Value","B"};
        jTable2.setModel(new javax.swing.table.DefaultTableModel(cantX, nomColum1));
    }
    
     public void GaussSeidel(double A [][], double b[], double Tolerancia, double x0 [] ,int Iteraciones){
        this.n = A.length;
        this.A = A;
        this.b = b;
        MacroAlgoritmo(Tolerancia, x0, Iteraciones);
    }

    private void MacroAlgoritmo(double Tolerancia, double x0 [], int Iteraciones){
        int cont = 0;
        double error = Tolerancia + 1;    
        double [] aux = new double[x0.length];
        Object [][] matrix = new Object[Iteraciones][n+3];
        int row = 0;
        int columna = 0;
        double resta [] = new double [aux.length];
        double x1 [] = new double [x0.length];
        for (int i = 0; i < n; i++) {
                aux [i] = x0[i];                  
            }       
        while(error > Tolerancia && cont < Iteraciones){                             
            x1 = CalcularNuevoGaussSeidel(x0);        
            resta  = restaVectores(aux,x1);                   
            error = Norma1(resta);
            System.out.println("error:" + error);
            for (int i = 1; i < n-1; i++) {
                matrix [cont][i] = x1[i];                  
            }                          
            for (int i = 1; i < n+1; i++) {
                matrix[cont][0] = cont;
                matrix[cont][i] = x0[i - 1];
                matrix[cont][n+1] = error;
            } 
            String [] vm = new String[n+2];
            vm[0] = "Iteraciones";
            vm[n+1] = "Error";
            for (int i = 1; i < n+1; i++) {
                vm[i]= "x"+i;
            }
            //jTable1.setModel(new javax.swing.table.DefaultTableModel(matrix, vm));
            cont++;              
        } 
        String[] nomColum=new String[n+2];
         nomColum[0]="Iteraciones";
        nomColum[n+1]="error";
         jTable1.setModel(new javax.swing.table.DefaultTableModel(matrix, nomColum));
        for(int i=1; i<n+1 ; i++){
            nomColum[i]="x"+i;
        }
        if(error <= Tolerancia){
            System.out.println("Es una aproximacion con una tolerancia = " + Tolerancia);        
        }else{
            System.out.println("Fracaso en " + Iteraciones + " iteraciones");
        }
    }

    private double [] CalcularNuevoGaussSeidel(double aux []){         
        double rela = 1;
        for(int i = 0 ; i < n ; i++){
            double suma = 0;
            for(int j = 0 ; j < n ; j++){
                if(j != i){
                    suma = suma + A[i][j] * aux[j];
                }
                if(jCheckBox1.isSelected()){
                     rela = Double.parseDouble(jTextField3.getText());                    
                }
                    aux[i] = rela*((b[i] - suma) / A[i][i]);                    
            }
        }
        return aux;
    }
    
    private double Norma1(double[] vectorResta) {
        double maximo = vectorResta[0];
        for (int i = 0; i < vectorResta.length; i++) {
            if(maximo < vectorResta[i]){
                maximo = vectorResta[i];
            }
        }        
        return maximo;    
    }
       
    public double [] restaVectores(double [] aux,double [] x1){
        System.out.println("vector aux");
            for (int i = 0; i < aux.length; i++) {
                System.out.println(aux[i]);
            }   
         System.out.println("vector x1");
            for (int i = 0; i < x1.length; i++) {
                System.out.println(x1[i]);
            }    
        double [] xr = new double [aux.length];
        for(int i = 0; i < aux.length;i++){
            xr[i] = Math.abs(x1[i]-aux[i]);
        }
        return xr;
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
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Iteraciones", "X0", "X1", "X2", "Error"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jScrollPane1.setBounds(280, 110, 300, 90);
        jLayeredPane1.add(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.setBounds(280, 220, 71, 23);
        jLayeredPane1.add(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "X0", "null", "Title 3"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jScrollPane2.setBounds(10, 110, 260, 90);
        jLayeredPane1.add(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Iteraciones");
        jLabel2.setBounds(20, 250, 110, 14);
        jLayeredPane1.add(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField1.setBounds(150, 250, 60, 20);
        jLayeredPane1.add(jTextField1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Tolerancia");
        jLabel3.setBounds(20, 220, 100, 14);
        jLayeredPane1.add(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField2.setBounds(150, 220, 60, 20);
        jLayeredPane1.add(jTextField2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Relax");
        jCheckBox1.setBounds(60, 280, 70, 23);
        jLayeredPane1.add(jCheckBox1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton4.setText("help");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jButton4.setBounds(280, 260, 53, 23);
        jLayeredPane1.add(jButton4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTextField3.setBounds(150, 280, 60, 20);
        jLayeredPane1.add(jTextField3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton2.setText("Return To Method's List");
        jButton2.setBounds(410, 220, 170, 23);
        jLayeredPane1.add(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3.setText("EXIT");
        jButton3.setBounds(520, 250, 55, 23);
        jLayeredPane1.add(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 48));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("GAUSS SEIDEL");
        jLabel1.setBounds(140, 0, 335, 90);
        jLayeredPane1.add(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo3.jpg"))); // NOI18N
        jLabel4.setBounds(0, 0, 580, 320);
        jLayeredPane1.add(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:        
    
    double [] x0 = new double [n];   
    double [] b = new double [n];
    for(int i = 0; i < n;i++){
        String aux = (jTable2.getValueAt(i,1)).toString();
        System.out.println(aux);
        x0[i] = Double.parseDouble(aux);       
    }  
    
    for(int i = 0; i < n;i++){
        String aux = (jTable2.getValueAt(i,2)).toString();
        System.out.println(aux);
        b[i] = Double.parseDouble(aux);       
    } 
    
    it = jTextField1.getText();
    tol = jTextField2.getText();
    
    iteraciones = Integer.parseInt(it);
    tolerancia = Double.parseDouble(tol);
    
  GaussSeidel(A,b,tolerancia,x0,iteraciones);      
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
// TODO add your handling code here:
              String titulo = "Gauss Seidel Method";
    String texto = "To begin, we note that this is a variant of the Jacobi method, except hat unlike the Jacobi \n,"
+"makes use of the values old. If the dominant matrix is strictly diagonally entered the \n "
+"method always converges. Unlike Jacobi, not always converge to a solution or \n "
+"sometimesconverges more slowly than Jacobi. \n";

    Mensage a = new Mensage(titulo, texto);
    a.setVisible(true);
}//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(GaussSeidelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GaussSeidelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GaussSeidelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GaussSeidelForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                  double [][] A = {
                    {25,-6,3,1},
                    {4,16,-1,1},                    
                    {5,-3,12,1},   
                    {5,-3,12,1}
                    };                       
                  //double [] x0 = {1,3,4};                                   
                GaussSeidelForm obj =  new GaussSeidelForm(A,4);
                obj.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
