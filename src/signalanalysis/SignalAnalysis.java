package signalanalysis;

import static java.lang.Math.abs;
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
import static java.lang.Math.sqrt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Javier Roldan
 */

public class SignalAnalysis{  
    ArrayList<Float> xArrayList = new ArrayList<Float>();
    ArrayList<Float> yArrayList = new ArrayList<Float>();
    
    public SignalAnalysis(){
        
    }
    
    public static void main(String[] args) {

    }
    
    // Execute Correlation without lags processing
    public Float doCorrelation(){
        float counter = 0;
        for (int i = 0; i < this.xArrayList.size(); i++) {
            counter = counter + (this.xArrayList.get(i)*this.yArrayList.get(i));
        }
        return counter;
        //debug
        //System.out.println("Counter: " + counter);
    }
    
    // Execute Correlation without lags processing, but normalized
    public Float doCorrelationNorm(){
        float x, y;
        x = 0; y = 0;
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        int iteraciones = 0;
        for (int i = 0; i < this.xArrayList.size(); i++) {
            counter = counter + (this.xArrayList.get(i)*this.yArrayList.get(i));
        }
        for (int i = 0; i < this.xArrayList.size(); i++) {
            x = x + (this.xArrayList.get(i)*this.xArrayList.get(i));
            y = y + (this.yArrayList.get(i)*this.yArrayList.get(i));
        }
        //debug
        /*
        System.out.println("Counter: " + counter);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("sqrt(x*y): " + counter/((float)sqrt(x*y)));
        */
        //System.out.println("NORMALIZED CORRELATION SIMPLE: " + counter);
        return counter/((float)sqrt(x*y));
    }
    
    //Execute Cross Correlation, on positive lags
    public ArrayList<Float> doCrossCorrelation(){
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        int iteraciones = 0;
        for (int i = 0; i < this.xArrayList.size(); i++) {
            System.out.println("---- " + iteraciones + " LAG ----");
            for (int j = 0; j < this.xArrayList.size() - iteraciones; j++) {
                counter = counter + (this.xArrayList.get(j+iteraciones)*this.yArrayList.get(j));                
            }
            System.out.println("Value: " + counter);
            
            lags.add(counter);
            counter = 0;
            iteraciones++;
        }
        return lags;
    }
    
    //Execute Cross Correlation, on negative lags
    public ArrayList<Float> doCrossCorrelationNeg(){
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        int iteraciones = 1;
        for (int i = 0; i < this.yArrayList.size() - 1; i++) {
            System.out.println("---- -" + iteraciones + " LAG ----");
            
            for (int j = 0; j < this.yArrayList.size() - iteraciones; j++) {
                counter = counter + (this.yArrayList.get(j+iteraciones)*this.xArrayList.get(j));
            }
            System.out.println("Value: " + counter);
            lags.add(counter);
            counter = 0;
            iteraciones++;
        }
        //Reversing lags array, to have an order from -inf to -1 lags
        return reverse(lags);
    }
    
    //Execute NORMALIZED Cross Correlation, on positive lags (alternative equation to normalize) V1
    public ArrayList<Float> doCrossCorrelationNormV1(){
        float x, y;
        x = 0; y = 0;
        //float lags[] = new float[xArray.size()];
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        int iteraciones = 0;
        for (int i = 0; i < this.xArrayList.size(); i++) {
            System.out.println("---- " + iteraciones + " LAG ----");
            for (int j = 0; j < this.xArrayList.size() - iteraciones; j++) {
                System.out.println("Value = " + counter + " + " + this.yArrayList.get(j+iteraciones) + " * " + this.xArrayList.get(j));
                counter = counter + (this.xArrayList.get(j+iteraciones)*this.yArrayList.get(j));
                
                //Normalizing values
                System.out.println("X: " + x + " + " + this.xArrayList.get(j+iteraciones) + " ** " + this.xArrayList.get(j+iteraciones));
                x = x + (this.xArrayList.get(j+iteraciones)*this.xArrayList.get(j+iteraciones));
                System.out.println("Y: " + y + " + " + this.yArrayList.get(j) + " ** " + this.yArrayList.get(j));
                y = y + (this.yArrayList.get(j)*this.yArrayList.get(j));
            }
            //debug
            /*
            System.out.println("X DEN: " + x);
            System.out.println("Y DEN: " + y);
            System.out.println("Counter(numerador): " + counter);
            System.out.println("DENOM: " + (float)sqrt(x*y));
            System.out.println("NORMALISATION: " + counter/(float)sqrt(x*y));
            System.out.println("iteraciones: " + iteraciones + " valor: " + counter);
            */
            
            lags.add(counter/(float)sqrt(x*y));
            x=0;y=0;
            counter = 0;
            iteraciones++;
        }
        return lags;
    }
    
    //Execute NORMALIZED Cross Correlation, on negative lags (alternative equation to normalize) V1
    public ArrayList<Float> doCrossCorrelationNegNormV1(){
        float x, y;
        x = 0; y = 0;
        ArrayList<Float> lags = new ArrayList<Float>();
        //float lags[] = new float[xArray.size() - 1];
        float counter = 0;
        int iteraciones = 1;
        for (int i = 0; i < this.yArrayList.size() - 1; i++) {
            System.out.println("---- -" + iteraciones + " LAG ----");
            for (int j = 0; j < this.yArrayList.size() - iteraciones; j++) {
                System.out.println("Value = " + counter + " + " + this.yArrayList.get(j+iteraciones) + " * " + this.xArrayList.get(j));
                counter = counter + (this.yArrayList.get(j+iteraciones)*this.xArrayList.get(j));            
                
                //Normalizing values
                System.out.println("X: " + x + " + " + this.xArrayList.get(j) + " ** " + this.xArrayList.get(j));
                x = x + (this.xArrayList.get(j)*this.xArrayList.get(j));
                System.out.println("Y: " + y + " + " + this.yArrayList.get(j+iteraciones) + " ** " + this.yArrayList.get(j+iteraciones));
                y = y + (this.yArrayList.get(j+iteraciones)*this.yArrayList.get(j+iteraciones));
            }
            //debug
            /*
            System.out.println("X DEN: " + x);
            System.out.println("Y DEN: " + y);
            System.out.println("Counter(numerador): " + counter);
            System.out.println("DENOM: " + (float)sqrt(x*y));
            System.out.println("NORMALISATION: " + counter/(float)sqrt(x*y));
            */
            
            lags.add(counter/(float)sqrt(x*y));
            x=0;y=0;
            counter = 0;
            iteraciones++;
        }
        //Reversing lags array, to have an order from -inf to -1 lags
        return reverse(lags);
    }
    
    //Execute NORMALIZED Cross Correlation, on positive lags V2
    public ArrayList<Float> doCrossCorrelationNormalized(){
        float xAvg = 0; float yAvg = 0;
        float x = 0; float y = 0;
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        float denom = 0;
        int iteraciones = 0;
        float correlation = 0;

        //Calculating avg
        for (int i = 0; i < this.xArrayList.size(); i++) {
            xAvg = xAvg + this.xArrayList.get(i);
        }
        for (int i = 0; i < this.yArrayList.size(); i++) {
            yAvg = yAvg + this.yArrayList.get(i);
        }
        xAvg = xAvg / this.xArrayList.size();
        yAvg = yAvg / this.yArrayList.size();

        //Calculating denominator
        for (int i = 0; i < this.xArrayList.size(); i++) {
            x = x + ((this.xArrayList.get(i) - xAvg) * (this.xArrayList.get(i) - xAvg));
            y = y + ((this.yArrayList.get(i) - yAvg) * (this.yArrayList.get(i) - yAvg));
        }
        denom = (float)sqrt(x * y);
        
        //Calculating the denominators
        for (int i = 0; i < this.xArrayList.size(); i++) {
            System.out.println("---- " + iteraciones + " LAG ----");
            for (int j = 0; j < this.xArrayList.size() - iteraciones; j++) {
                System.out.println("numerator = " + counter + " + " + this.yArrayList.get(j+iteraciones) + " - " + yAvg + " * " + this.xArrayList.get(j) + " - " + xAvg);
                counter = counter + ((this.xArrayList.get(j+iteraciones) - xAvg) * (this.yArrayList.get(j) - yAvg));
                System.out.println("numerator = " + counter);
            }
            System.out.println("numerator final = " + counter);
            correlation = counter / denom;
            lags.add(correlation);
            System.out.println("Correlation: " + correlation);
            counter = 0;
            iteraciones++;
        }
        return lags;
    }
    
    //Execute NORMALIZED Cross Correlation, on negative lags V2
    public ArrayList<Float> doCrossCorrelationNormalizedNeg(){
        float xAvg = 0; float yAvg = 0;
        float x = 0; float y = 0;
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        float denom = 0;
        int iteraciones = 1;
        float correlation = 0;
        
        //Calculating avg
        for (int i = 0; i < this.xArrayList.size(); i++) {
            xAvg = xAvg + this.xArrayList.get(i);
        }
        for (int i = 0; i < this.yArrayList.size(); i++) {
            yAvg = yAvg + this.yArrayList.get(i);
        }
        xAvg = xAvg / this.xArrayList.size();
        yAvg = yAvg / this.yArrayList.size();

        //Calculating denominator
        for (int i = 0; i < this.xArrayList.size(); i++) {
            x = x + ((this.xArrayList.get(i) - xAvg) * (this.xArrayList.get(i) - xAvg));
            y = y + ((this.yArrayList.get(i) - yAvg) * (this.yArrayList.get(i) - yAvg));
        }
        denom = (float)sqrt(x * y);
        
        //Calculating the denominators
        for (int i = 0; i < this.yArrayList.size() - 1; i++) {
            System.out.println("---- " + iteraciones + " LAG ----");
            for (int j = 0; j < this.yArrayList.size() - iteraciones; j++) {
                System.out.println("numerator = " + counter + " + " + this.yArrayList.get(j+iteraciones) + " - " + yAvg + " * " + this.xArrayList.get(j) + " - " + xAvg);
                counter = counter + ((this.yArrayList.get(j+iteraciones) - yAvg)* (this.xArrayList.get(j) - xAvg));              
                System.out.println("numerator = " + counter);
            }
            System.out.println("numerator final = " + counter);
            correlation = counter / denom;
            lags.add(correlation);
            System.out.println("Correlation: " + correlation);
            counter = 0;
            iteraciones++;
        }
        return reverse(lags);
    }
    
    //Execute NORMALIZED Cross Correlation, on positive lags (alternative method)
    public ArrayList<Float> doCrossCorrelationNorm(){
        float x, y, xAvg, yAvg;
        x = 0; y = 0; xAvg = 0; yAvg = 0;
        //float lags[] = new float[xArray.size()];
        ArrayList<Float> lags = new ArrayList<Float>();
        float counter = 0;
        float denom = 0;
        int iteraciones = 0;
        
        //Calculating avg
        for (int i = 0; i < this.xArrayList.size(); i++) {
            xAvg = xAvg + this.xArrayList.get(i);
        }
        for (int i = 0; i < this.yArrayList.size(); i++) {
            yAvg = yAvg + this.yArrayList.get(i);
        }
        xAvg = xAvg / this.xArrayList.size();
        yAvg = yAvg / this.yArrayList.size();

        for (int i = 0; i < this.xArrayList.size(); i++) {
        //for (int i = 0; i < this.xArrayList.size() - 2; i++) {
            System.out.println("---- " + iteraciones + " LAG ----");
            for (int j = 0; j < this.xArrayList.size() - iteraciones; j++) {
                if(this.xArrayList.get(j+iteraciones) == 0 && this.yArrayList.get(j) == 0){
                    continue;
                }
                else{
                    System.out.println("Corr = " + counter + " + " + this.yArrayList.get(j+iteraciones) + " - " + yAvg + " * " + this.xArrayList.get(j) + " - " + xAvg);
                    counter = counter + ((this.xArrayList.get(j+iteraciones) - xAvg) * (this.yArrayList.get(j) - yAvg));

                    //Normalizing values
                    System.out.println("X = " + x + " + (" + this.xArrayList.get(j+iteraciones) + " - " + xAvg + ") * (" + this.xArrayList.get(j+iteraciones) + " - " + xAvg + ")");
                    x = x + ((this.xArrayList.get(j+iteraciones) - xAvg)*(this.xArrayList.get(j+iteraciones) - xAvg));
                    System.out.println("X = " + x);

                    System.out.println("Y = " + y + " + (" + this.yArrayList.get(j) + " - " + yAvg + ") * (" + this.xArrayList.get(j) + " - " + yAvg + ")");
                    y = y + ((this.yArrayList.get(j) - yAvg)*(this.yArrayList.get(j) - yAvg));
                    System.out.println("Y = " + y);
                }
            }
            //debug
            /*
            System.out.println("X DEN: " + x);
            System.out.println("Y DEN: " + y);
            System.out.println("Counter(numerador): " + counter);
            System.out.println("DENOM: " + (float)sqrt(x*y));
            System.out.println("NORMALISATION: " + counter/(float)sqrt(x*y));
            System.out.println("iteraciones: " + iteraciones + " valor: " + counter);
            */
            System.out.println("counter: " + counter + " || x: " + x + " y: " + y );
            System.out.println("RESUL LAG: " + counter/(float)sqrt(x*y));
            lags.add(counter/(float)sqrt(x*y));
            x=0;y=0;
            counter = 0;
            iteraciones++;
        }
        System.out.println("MEDIAS: " + xAvg + " // " + yAvg);
        return lags;
    }
    
    //Execute NORMALIZED Cross Correlation, on negative lags (alternative method)
    public ArrayList<Float> doCrossCorrelationNegNorm(){
       float x, y, xAvg, yAvg;
        x = 0; y = 0; xAvg = 0; yAvg = 0;
        ArrayList<Float> lags = new ArrayList<Float>();
        //float lags[] = new float[xArray.size() - 1];
        float counter = 0;
        int iteraciones = 1;
        
        //Calculating avg
        for (int i = 0; i < this.xArrayList.size(); i++) {
            xAvg = xAvg + this.xArrayList.get(i);
        }
        for (int i = 0; i < this.yArrayList.size(); i++) {
            yAvg = yAvg + this.yArrayList.get(i);
        }
        xAvg = xAvg / this.xArrayList.size();
        yAvg = yAvg / this.yArrayList.size();
        
        for (int i = 0; i < this.yArrayList.size() - 1; i++) {
        //for (int i = 0; i < (this.yArrayList.size() - 1) - 3; i++) {
            System.out.println("---- -" + iteraciones + " LAG ----");
            for (int j = 0; j < this.yArrayList.size() - iteraciones; j++) {
                if(this.xArrayList.get(j) == 0 && this.yArrayList.get(j+iteraciones) == 0){
                    continue;
                }
                else{
                    System.out.println("Corr = " + counter + " + " + this.yArrayList.get(j+iteraciones) + " - " + yAvg + " * " + this.xArrayList.get(j) + " - " + xAvg);
                    counter = counter + ((this.yArrayList.get(j+iteraciones) - yAvg)* (this.xArrayList.get(j) - xAvg));            

                    //Normalizing values
                    //System.out.println("X: " + x + " + " + this.xArrayList.get(j) + " ** " + this.xArrayList.get(j));
                    System.out.println("X = " + x + " + (" + this.xArrayList.get(j) + " - " + xAvg + ") * (" + this.xArrayList.get(j) + " - " + xAvg + ")");

                    x = x + ((this.xArrayList.get(j) - xAvg) * (this.xArrayList.get(j) - xAvg));
                    System.out.println("X = " + x);
                    //System.out.println("Y: " + y + " + " + this.yArrayList.get(j+iteraciones) + " ** " + this.yArrayList.get(j+iteraciones));
                    System.out.println("Y = " + y + " + (" + this.yArrayList.get(j+iteraciones) + " - " + yAvg + ") * (" + this.xArrayList.get(j+iteraciones) + " - " + yAvg + ")");
                    y = y + ((this.yArrayList.get(j+iteraciones) - yAvg) * (this.yArrayList.get(j+iteraciones) - yAvg));
                    System.out.println("Y = " + y);
                }
                
            }
            //debug
            /*
            System.out.println("X DEN: " + x);
            System.out.println("Y DEN: " + y);
            System.out.println("Counter(numerador): " + counter);
            System.out.println("DENOM: " + (float)sqrt(x*y));
            System.out.println("NORMALISATION: " + counter/(float)sqrt(x*y));
            */
            
            lags.add(counter/(float)sqrt(x*y));
            x=0;y=0;
            counter = 0;
            iteraciones++;
        }
        //Reversing lags array, to have an order from -inf to -1 lags
        System.out.println("MEDIAS: " + xAvg + " // " + yAvg);
        return reverse(lags);
    }
    
    public static ArrayList<Float> reverse(ArrayList<Float> list) {
        if(list.size() > 1) {                   
            Float value = list.remove(0);
            reverse(list);
            list.add(value);
        }
        return list;
    }
    
    public static int bestLag(ArrayList<Float> lags){
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
    
    public static int getLagPos(ArrayList<Float> lags, int bestLag){
        int num = 0;
        if(bestLag == (lags.size()-1)/2){
            num = 0;
        }
        else{
            num = bestLag - ((lags.size()-1)/2);
        }
        return num;   
    }
    public void putArrayList(ArrayList<Float> xArrayList, ArrayList<Float> yArrayList){
        this.xArrayList = xArrayList;
        this.yArrayList = yArrayList;
    }
    
    public ArrayList<Float> getX(){
        return this.xArrayList;
    }
    
    public ArrayList<Float> getY(){
        return this.yArrayList;
    }
}