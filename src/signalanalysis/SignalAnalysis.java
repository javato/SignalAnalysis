/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package signalanalysis;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.function.Function2D;
import org.jfree.data.function.NormalDistributionFunction2D;
import org.jfree.data.general.DatasetUtilities;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

import org.jfree.chart.ChartFactory;
 import org.jfree.chart.ChartPanel;
 import org.jfree.chart.JFreeChart;
 import org.jfree.chart.plot.PlotOrientation;
 import org.jfree.data.xy.XYSeries;
 import org.jfree.data.xy.XYSeriesCollection;
 import org.jfree.ui.ApplicationFrame;
 import org.jfree.ui.RefineryUtilities;

import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Jvt-WinLaptop
 */
public class SignalAnalysis extends ApplicationFrame{
    
    public SignalAnalysis(final String title, ArrayList<Float> lags, String x, String y, String name) {

    super(title);
    final XYSeries series = new XYSeries(name);
        for (int i = 0; i < lags.size(); i++) {
            series.add(i, lags.get(i));
        }
        
    final XYSeriesCollection data = new XYSeriesCollection(series);
    final JFreeChart chart = ChartFactory.createXYLineChart(
        title,
        x, 
        y, 
        data,
        PlotOrientation.VERTICAL,
        true,
        true,
        false
    );
    final ChartPanel chartPanel = new ChartPanel(chart);
    chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
    setContentPane(chartPanel);
}

    
    
    public static void main(String[] args) {
        // reales
        float[] array1 = {0f, 0.1f, 0.3f, 0.2f, -0.1f, -0.3f, -0.2f, -0.1f, 0.1f, 0.4f, 0.8f, 1.3f, 1.5f, 1.7f, 1.6f, 1.3f, 1.1f, 0.8f, 0.4f, 0.2f, -0.1f, -0.4f, -0.7f, -0.9f, -1f, -1.4f, -1.7f, -1.9f, -2.2f, -2.5f, -2.8f, -2.4f, -1.9f, -1.7f, -1.4f, -1.2f, -0.9f, -0.6f, -0.2f, 0.1f, 0.4f, 0.8f, 1.1f, 1.4f, 1.6f, 1.8f, 1.9f, 2.2f, 2.5f, 2.6f, 2.3f, 2.1f, 1.8f, 1.7f, 1.5f, 1.3f, 1f, 0.7f, 0.5f, 0.3f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, -0.2f, 0.1f, 0.4f, 0.8f, 1.1f, 1.4f, 1.6f, 1.8f, 1.6f, 1.4f, 1.1f, 0.6f, 0.2f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f};
        float[] array2 = {0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0.1f, 0.2f, 0.1f, -0.1f, -0.3f, -0.2f, -0.1f, 0.1f, 0.4f, 0.8f, 0.9f, 1.1f, 1.2f, 1.4f, 1.3f, 1.1f, 0.8f, 0.4f, 0.2f, -0.1f, -0.3f, -0.4f, -0.6f, -0.8f, -0.9f, -1f, -1.2f, -1.4f, -1.7f, -2f, -1.8f, -1.9f, -1.7f, -1.4f, -1.2f, -0.9f, -0.5f, -0.2f, 0f, 0.4f, 0.8f, 1.1f, 1.4f, 1.6f, 1.8f, 1.9f, 2.1f, 2.3f, 2.4f, 2.3f, 2.1f, 1.8f, 1.7f, 1.5f, 1.3f, 1f, 0.7f, 0.5f, 0.3f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f};
        
        // ejemplo youtube crosscorr
        //float[] array1 = {0.1f, 0.2f, -0.1f, 4.1f, -2f, 1.5f, -0.1f};
        //float[] array2 = {0.1f, 4f, -2.2f, 1.6f, 0.1f, 0.1f, 0.2f};
        
        // ejemplo youtube normalization
        //float[] array1 = {2, 3, -1, 3};
        //float[] array2 = {100, -1, 4, -2};
        
        ArrayList<Float> xArray = new ArrayList<Float>();
        for (int i = 0; i < array1.length; i++) {
            xArray.add(array1[i]);
        }
        ArrayList<Float> yArray = new ArrayList<Float>();
        for (int i = 0; i < array2.length; i++) {
            yArray.add(array2[i]);
        }
        
        final SignalAnalysis graphSignal1 = new SignalAnalysis("Signal X", xArray, "Time", "Y", "Sent Signal");
        graphSignal1.pack();
        RefineryUtilities.centerFrameOnScreen(graphSignal1);
        graphSignal1.setVisible(true);
        
        final SignalAnalysis graphSignal2 = new SignalAnalysis("Signal Y", yArray, "Time", "Y", "Received Signal");
        graphSignal2.pack();
        RefineryUtilities.centerFrameOnScreen(graphSignal2);
        graphSignal2.setVisible(true);
        
        System.out.println(array1.length);
        System.out.println(array2.length);
        
        /*System.out.println(Arrays.toString(xArray));
        System.out.println(Arrays.toString(yArray));
        System.out.println("numero " + xArray.length);
        System.out.println("numero " + yArray.length);
        System.out.println(doCorrelation(xArray, yArray));
        System.out.println(doCorrelationNeg(xArray, yArray));*/
        //System.out.println(doNormalised(xArray, yArray));
        
        //float[] lagsArray = new float[xArray.length];
        
        //System.out.println(doCorrelation(xArray, yArray));
        //System.out.println(doCorrelationNeg(xArray, yArray));
        //System.out.println(doCorrelationNeg(xArray, yArray));
        
        //System.out.println("Correlation simple: " + doCorrelation(xArray, yArray));
        //System.out.println("Correlation norm: " + doCorrelationNorm(xArray, yArray));
        
        //Cross Correlation execution NO NORMALIZED
        ArrayList<Float> lags = new ArrayList<Float>();
        lags.addAll(doCrossCorrelationNeg(xArray, yArray));
        lags.addAll(doCrossCorrelation(xArray, yArray));
        
        //Cross Correlation execution NORMALIZED
        ArrayList<Float> lagsNorm = new ArrayList<Float>();
        lagsNorm.addAll(doCrossCorrelationNegNorm(xArray, yArray));
        lagsNorm.addAll(doCrossCorrelationNorm(xArray, yArray));
  
        System.out.println("LAGS VECTOR: " + lags.toString());
        System.out.println("MEJOR LAG: " + bestLag(lags));
        System.out.println("RESUL LAG: " + lags.get(bestLag(lags)));
        
        System.out.println("LAGS VECTOR NORMALIZADO: " + lagsNorm.toString());
        System.out.println("MEJOR LAG: " + bestLag(lagsNorm));
        System.out.println("RESUL LAG: " + lagsNorm.get(bestLag(lagsNorm)));

        //Graphing NO Normalized Lags
        final SignalAnalysis graph = new SignalAnalysis("Lags", lags,  "Time", "Y", " ");
        graph.pack();
        RefineryUtilities.centerFrameOnScreen(graph);
        graph.setVisible(true);
        
        //Graphing Normalized Lags
        final SignalAnalysis graphNorm = new SignalAnalysis("Normalized Lags", lagsNorm,  "Time", "Y", " ");
        graphNorm.pack();
        RefineryUtilities.centerFrameOnScreen(graphNorm);
        graphNorm.setVisible(true);
    }
    
    private static Float doCorrelation(ArrayList<Float> xArray, ArrayList<Float> yArray){
        float x, y;
        x = 0; y = 0;
        //float lags[] = new float[xArray.size()];
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        int iteraciones = 0;
        for (int i = 0; i < xArray.size(); i++) {
            counter = counter + (xArray.get(i)*yArray.get(i));
        }
        return counter;
    }
    
    private static Float doCorrelationNorm(ArrayList<Float> xArray, ArrayList<Float> yArray){
        float x, y;
        x = 0; y = 0;
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        int iteraciones = 0;
        for (int i = 0; i < xArray.size(); i++) {
            counter = counter + (xArray.get(i)*yArray.get(i));
        }
        for (int i = 0; i < xArray.size(); i++) {
            x = x + (xArray.get(i)*xArray.get(i));
            y = y + (yArray.get(i)*yArray.get(i));
        }
        //debug
        /*
        System.out.println("Counter: " + counter);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("sqrt(x*y): " + counter/((float)sqrt(x*y)));
        */
        
        return counter/((float)sqrt(x*y));
    }
    
    private static ArrayList<Float> doCrossCorrelation(ArrayList<Float> xArray, ArrayList<Float> yArray){
        //float x, y;
        //x = 0; y = 0;
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        int iteraciones = 0;
        for (int i = 0; i < xArray.size(); i++) {
            System.out.println("---- " + iteraciones + " LAG ----");
            
            for (int j = 0; j < xArray.size() - iteraciones; j++) {
                //System.out.println(counter + " + " + xArray.get(j+iteraciones) + "**" + yArray.get(j));
                counter = counter + (xArray.get(j+iteraciones)*yArray.get(j));
                
                //Normalizing values
                
                //System.out.println("X: " + x + " + " + xArray.get(j+iteraciones) + " ** " + xArray.get(j+iteraciones));
                //x = x + (xArray.get(j+iteraciones)*xArray.get(j+iteraciones));
                //System.out.println("Y: " + y + " + " + yArray.get(j) + " ** " + yArray.get(j));
                //y = y + (yArray.get(j)*yArray.get(j));
                
            }
            System.out.println("Counter: " + counter);
            //System.out.println("DENOM: " + (float)sqrt(x*y));
            //System.out.println("NORMALISATION: " + counter/(float)sqrt(x*y));
            //lags.add(counter/(float)sqrt(x*y));
            lags.add(counter);
            //System.out.println("iteraciones: " + iteraciones + " valor: " + counter);
            
            //x=0;y=0;
            counter = 0;
            iteraciones++;
        }
        return lags;
    }
    
    private static ArrayList<Float> doCrossCorrelationNeg(ArrayList<Float> xArray, ArrayList<Float> yArray){
        //float x, y;
        //x = 0; y = 0;
        ArrayList<Float> lags = new ArrayList<Float>();
        //float lags[] = new float[xArray.size() - 1];
        float counter = 0;
        int iteraciones = 1;
        for (int i = 0; i < yArray.size() - 1; i++) {
            System.out.println("---- -" + iteraciones + " LAG ----");
            
            for (int j = 0; j < yArray.size() - iteraciones; j++) {
                counter = counter + (yArray.get(j+iteraciones)*xArray.get(j));
                
                //Normalizing values
                //System.out.println("X: " + x + " + " + xArray.get(j) + " ** " + xArray.get(j));
                //x = x + (xArray.get(j)*xArray.get(j));
                //System.out.println("Y: " + y + " + " + yArray.get(j+iteraciones) + " ** " + yArray.get(j+iteraciones));
                //y = y + (yArray.get(j+iteraciones)*yArray.get(j+iteraciones));
            }

            System.out.println("Counter: " + counter);
            //System.out.println("DENOM: " + (float)sqrt(x*y));
            //System.out.println("NORMALISATION: " + counter/(float)sqrt(x*y));
            lags.add(counter);
            
            counter = 0;
            iteraciones++;
        }
        return reverse(lags);
    }
    
    private static ArrayList<Float> doCrossCorrelationNorm(ArrayList<Float> xArray, ArrayList<Float> yArray){
        float x, y;
        x = 0; y = 0;
        //float lags[] = new float[xArray.size()];
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        int iteraciones = 0;
        for (int i = 0; i < xArray.size(); i++) {
            System.out.println("---- " + iteraciones + " LAG ----");
            
            for (int j = 0; j < xArray.size() - iteraciones; j++) {
                //System.out.println(counter + " + " + xArray.get(j+iteraciones) + "**" + yArray.get(j));
                counter = counter + (xArray.get(j+iteraciones)*yArray.get(j));
                
                //Normalizing values
                System.out.println("X: " + x + " + " + xArray.get(j+iteraciones) + " ** " + xArray.get(j+iteraciones));
                x = x + (xArray.get(j+iteraciones)*xArray.get(j+iteraciones));
                System.out.println("Y: " + y + " + " + yArray.get(j) + " ** " + yArray.get(j));
                y = y + (yArray.get(j)*yArray.get(j));
                
            }
            System.out.println("X DEN: " + x);
            System.out.println("Y DEN: " + y);
            System.out.println("Counter(numerador): " + counter);
            System.out.println("DENOM: " + (float)sqrt(x*y));
            System.out.println("NORMALISATION: " + counter/(float)sqrt(x*y));
            lags.add(counter/(float)sqrt(x*y));
            //System.out.println("iteraciones: " + iteraciones + " valor: " + counter);
            
            x=0;y=0;
            counter = 0;
            iteraciones++;
        }
        return lags;
    }
    
    private static ArrayList<Float> doCrossCorrelationNegNorm(ArrayList<Float> xArray, ArrayList<Float> yArray){
        float x, y;
        x = 0; y = 0;
        ArrayList<Float> lags = new ArrayList<Float>();
        //float lags[] = new float[xArray.size() - 1];
        float counter = 0;
        int iteraciones = 1;
        for (int i = 0; i < yArray.size() - 1; i++) {
            System.out.println("---- -" + iteraciones + " LAG ----");
            
            for (int j = 0; j < yArray.size() - iteraciones; j++) {
                System.out.println("Counter = " + counter + " + " + yArray.get(j+iteraciones) + " * " + xArray.get(j));
                counter = counter + (yArray.get(j+iteraciones)*xArray.get(j));
                System.out.println("counter = " + counter);
                //System.out.println("multip: " + (float)0.2*0.1);
                
                //Normalizing values
                System.out.println("X: " + x + " + " + xArray.get(j) + " ** " + xArray.get(j));
                x = x + (xArray.get(j)*xArray.get(j));
                System.out.println("Y: " + y + " + " + yArray.get(j+iteraciones) + " ** " + yArray.get(j+iteraciones));
                y = y + (yArray.get(j+iteraciones)*yArray.get(j+iteraciones));
            }
            System.out.println("X DEN: " + x);
            System.out.println("Y DEN: " + y);
            System.out.println("Counter(numerador): " + counter);
            System.out.println("DENOM: " + (float)sqrt(x*y));
            System.out.println("NORMALISATION: " + counter/(float)sqrt(x*y));
            lags.add(counter/(float)sqrt(x*y));
            x=0;y=0;
            counter = 0;
            iteraciones++;
        }
        return reverse(lags);
    }
    
    /*private static float doNormalised(ArrayList<Float> xArray, ArrayList<Float> yArray){
        float x, y;
        x = 0; y = 0;
        //for (int i = 0; i < xArray.length; i++) {
            //x = x + (xArray[i]*xArray[i]);
            //y = y + (yArray[i]*yArray[i]);
        //}
        System.out.println("corr_den: " + (float)sqrt(x*y));
        return 4f;
        //return doCorrelation(xArray, yArray)/(float)sqrt(x*y);
    }*/
    
    private static ArrayList<Float> reverse(ArrayList<Float> list) {
        if(list.size() > 1) {                   
            Float value = list.remove(0);
            reverse(list);
            list.add(value);
        }
        return list;
    }
    
    private static int bestLag(ArrayList<Float> lags){
        float counter = 0f;
        int pos = 0;
        for (int i = 0; i < lags.size(); i++) {
            if(lags.get(i) > counter){    
                counter = lags.get(i);
                pos = i;
            }
        }
        return pos;
    }

}
