package Metodos1;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
 /*
 * basado en varios ejemplos de jfree
 */
public class Graphic extends JPanel{  
    private double xi=0.0;
    private double xf=10.0;
    private double yi=0.0;
    private double yf=10.0;
    private FunctionList listFunc;
    private double calidad=0.05;
   
  
   public void setCalidad(double x){
       calidad=x;
   }
    public void setDimensionXY(double xInicial, double xFinal, double yInicial, double yFinal){
        xi=xInicial;
        xf=xFinal;
        yi=yInicial;
        yf=yFinal;
    }
    
    public Graphic(){
       super();  
    }
    
    public void setListFunc(FunctionList a){
        listFunc=a;
    }
    
    public void pintarGrafica(){
        XYDataset paresDeDatos = generarDatos();
        JFreeChart diagrama = crearDiagrama(paresDeDatos);
        ChartPanel chartPanel = new ChartPanel(diagrama);
        chartPanel.setPreferredSize(new Dimension(400,400));
        add(chartPanel);
    }
    private XYDataset generarDatos(){
        //primera serie eje Y
         XYSeries ejeY=new XYSeries("primero");
         ejeY.add(0,yi);
         ejeY.add(0,yf);
         
         //segunda serie eje X
         XYSeries ejeX=new XYSeries("segundo");
         ejeX.add(xi,0);
         ejeX.add(xf,0);
         
         //tercera serie funcion
         double fx;
         XYSeries datosF = new XYSeries("tercero");
        if(listFunc.getFunc()) 
        for(double x=xi; x<=xf; x+=calidad){ 
            fx=listFunc.f(x);
            if(fx>yi && fx<yf)        
            datosF.add(x,fx);}
        
         //cuarta serie funcion
         XYSeries funcPrime = new XYSeries("cuarto");
        if(listFunc.getFuncp()) 
        for(double x=xi; x<=xf; x+=calidad){
            fx=listFunc.fp(x);
            if(fx>yi && fx<yf) 
            funcPrime.add(x,fx);
        }
        
        XYSeries datosF2P = new XYSeries("doble prima");
        if(listFunc.getFunc2p()) 
        for(double x=xi; x<=xf; x+=calidad){
            fx=listFunc.f2p(x);
            if(fx>yi && fx<yf)
            datosF2P.add(x,fx);
        }
        
        XYSeries datosG = new XYSeries("GFuncion");
        if(listFunc.getGfunc()) 
        for(double x=xi; x<=xf; x+=calidad) {
            fx=listFunc.g(x);
            if(fx>yi && fx<yf)
            datosG.add(x,fx);
        }
        
        XYSeries datosH = new XYSeries("h");
        if(listFunc.getAux()) 
        for(double x=xi; x<=xf; x+=calidad) {
            fx=listFunc.h(x);
            if(fx>yi && fx<yf)
            datosH.add(x,fx);
        }
        XYSeriesCollection conjuntoDatos = new XYSeriesCollection();
       
        conjuntoDatos.addSeries(ejeY);
        conjuntoDatos.addSeries(ejeX);
        conjuntoDatos.addSeries(datosF);
        conjuntoDatos.addSeries(funcPrime);
        conjuntoDatos.addSeries(datosF2P);
        conjuntoDatos.addSeries(datosG);
        conjuntoDatos.addSeries(datosH);
         
        return conjuntoDatos;
    }
 
    private JFreeChart crearDiagrama(XYDataset conjuntoDatos){
        JFreeChart diag = ChartFactory.createXYLineChart(
                                "Graficador", //Titulo Grafica
                                "X", // Leyenda eje X
                                "Y", // Leyenda eje Y
                                conjuntoDatos, // Los datos
                                PlotOrientation.VERTICAL, //orientacion
                                false, // ver titulo de linea
                                false, //tooltips
                                false  //URL
                            );
        return diag;
    }
 
    
   
    public static void main(String[] arg){
        FunctionList a=new FunctionList();
        a.setAux("sin(x)");
        System.out.println(a.h(1));
        //a.setFunc("sin(x)");
        //pruebas
        Graphic miGraficador = new Graphic();
        miGraficador.setDimensionXY(-100, 100, -100, 100);
        miGraficador.setBounds(0, 0, 400, 400);
        miGraficador.setListFunc(a);
        miGraficador.pintarGrafica();
        miGraficador.setVisible(true);
       
    }

  
     
     
}