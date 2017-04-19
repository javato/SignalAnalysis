package signalanalysis;

import static java.lang.Math.abs;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Javier Roldan
 */

public class uinterface extends javax.swing.JFrame {
    public static ArrayList<Float> lags = new ArrayList<Float>();
    public static ArrayList<Float> lagsNorm = new ArrayList<Float>();
    public static SignalAnalysis SignalPair = new SignalAnalysis();

    public uinterface() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fieldX = new javax.swing.JTextField();
        fieldY = new javax.swing.JTextField();
        signalsLoadedGraphButton = new javax.swing.JButton();
        CorrelationButton = new javax.swing.JButton();
        CorrelationNormButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultsText = new javax.swing.JTextArea();
        CrossCorrelationButton = new javax.swing.JButton();
        CrossCorrelationNormButton = new javax.swing.JButton();
        LoadButton = new javax.swing.JButton();
        CrossCorrelationGraphButton = new javax.swing.JButton();
        CrossCorrelationNormGraphButton = new javax.swing.JButton();
        movedGraphButton = new javax.swing.JButton();
        timeDelayButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fieldX.setText("0 0.1 0.3 0.2 -0.1 -0.3 -0.2 -0.1 0.1 0.4 0.8 1.3 1.5 1.7 1.6 1.3 1.1 0.8 0.4 0.2 -0.1 -0.4 -0.7 -0.9 -1 -1.4 -1.7 -1.9 -2.2 -2.5 -2.8 -2.4 -1.9 -1.7 -1.4 -1.2 -0.9 -0.6 -0.2 0.1 0.4 0.8 1.1 1.4 1.6 1.8 1.9 2.2 2.5 2.6 2.3 2.1 1.8 1.7 1.5 1.3 1 0.7 0.5 0.3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 -0.2 0.1 0.4 0.8 1.1 1.4 1.6 1.8 1.6 1.4 1.1 0.6 0.2 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0f");
        fieldX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldXActionPerformed(evt);
            }
        });

        fieldY.setText("0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0.1 0.2 0.1 -0.1 -0.3 -0.2 -0.1 0.1 0.4 0.8 0.9 1.1 1.2 1.4 1.3 1.1 0.8 0.4 0.2 -0.1 -0.3 -0.4 -0.6 -0.8 -0.9 -1 -1.2 -1.4 -1.7 -2 -1.8 -1.9 -1.7 -1.4 -1.2 -0.9 -0.5 -0.2 0 0.4 0.8 1.1 1.4 1.6 1.8 1.9 2.1 2.3 2.4 2.3 2.1 1.8 1.7 1.5 1.3 1 0.7 0.5 0.3 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0 0f");
        fieldY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldYActionPerformed(evt);
            }
        });

        signalsLoadedGraphButton.setText("Signals Loaded Graph");
        signalsLoadedGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signalsLoadedGraphButtonActionPerformed(evt);
            }
        });

        CorrelationButton.setText("Correlation");
        CorrelationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrelationButtonActionPerformed(evt);
            }
        });

        CorrelationNormButton.setText("Normalized Correlation");
        CorrelationNormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorrelationNormButtonActionPerformed(evt);
            }
        });

        resultsText.setColumns(20);
        resultsText.setRows(5);
        jScrollPane1.setViewportView(resultsText);

        CrossCorrelationButton.setText("xCorr");
        CrossCorrelationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrossCorrelationButtonActionPerformed(evt);
            }
        });

        CrossCorrelationNormButton.setText("Normalized xCorr");
        CrossCorrelationNormButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrossCorrelationNormButtonActionPerformed(evt);
            }
        });

        LoadButton.setText("Load");
        LoadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoadButtonActionPerformed(evt);
            }
        });

        CrossCorrelationGraphButton.setText("xCorr Graph");
        CrossCorrelationGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrossCorrelationGraphButtonActionPerformed(evt);
            }
        });

        CrossCorrelationNormGraphButton.setText("Normalized xCorr Graph");
        CrossCorrelationNormGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrossCorrelationNormGraphButtonActionPerformed(evt);
            }
        });

        movedGraphButton.setText("Moved Graph");
        movedGraphButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movedGraphButtonActionPerformed(evt);
            }
        });

        timeDelayButton.setText("Time Units Delay");
        timeDelayButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeDelayButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldY, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(fieldX, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LoadButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signalsLoadedGraphButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CorrelationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CorrelationNormButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CrossCorrelationButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CrossCorrelationNormButton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CrossCorrelationGraphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CrossCorrelationNormGraphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(movedGraphButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(timeDelayButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fieldX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LoadButton)
                    .addComponent(signalsLoadedGraphButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CorrelationButton)
                    .addComponent(CrossCorrelationGraphButton)
                    .addComponent(movedGraphButton)
                    .addComponent(CrossCorrelationButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CrossCorrelationNormGraphButton)
                    .addComponent(CorrelationNormButton)
                    .addComponent(timeDelayButton)
                    .addComponent(CrossCorrelationNormButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldYActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldYActionPerformed

    //Graphs of X and Y Button
    private void signalsLoadedGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signalsLoadedGraphButtonActionPerformed
        final Graphs graphSignal1 = new Graphs("Signal X", SignalPair.xArrayList, "Time", "Y", "Sent Signal");
        graphSignal1.pack();
        RefineryUtilities.centerFrameOnScreen(graphSignal1);
        graphSignal1.setVisible(true);
        
        final Graphs graphSignal2 = new Graphs("Signal Y", SignalPair.yArrayList, "Time", "Y", "Received Signal");
        graphSignal2.pack();
        RefineryUtilities.centerFrameOnScreen(graphSignal2);
        graphSignal2.setVisible(true);
    }//GEN-LAST:event_signalsLoadedGraphButtonActionPerformed

    //Simple Correlation Button
    private void CorrelationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrelationButtonActionPerformed
        System.out.println("----- RESULTS -----");
        System.out.println("Simple Correlation: " + SignalPair.doCorrelation());
        this.resultsText.setText("----- RESULTS -----\n" + "Simple Correlation: " + SignalPair.doCorrelation());
    
    }//GEN-LAST:event_CorrelationButtonActionPerformed

    //Normalized Correlation Button
    private void CorrelationNormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorrelationNormButtonActionPerformed
        System.out.println("----- RESULTS -----");
        System.out.println("Normalized Correlation: " + SignalPair.doCorrelationNorm());
        this.resultsText.setText("----- RESULTS -----\n" + "Normalized Correlation: " + SignalPair.doCorrelationNorm());
    }//GEN-LAST:event_CorrelationNormButtonActionPerformed

    //Simple Cross Correlation Button
    private void CrossCorrelationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrossCorrelationButtonActionPerformed
        lags.addAll(SignalPair.doCrossCorrelationNeg());
        lags.addAll(SignalPair.doCrossCorrelation());
        
        System.out.println("----- RESULTS -----");
        System.out.println("Lag Vector: " + lags.toString());
        System.out.println("Best element on Lag Vector: " + "LagVector[" + SignalAnalysis.bestLag(lags) + "] = " + lags.get(SignalAnalysis.bestLag(lags)));
        this.resultsText.setText("----- RESULTS -----\n" + "Lag Vector: " + lags.toString() + "\nBest element on Lag Vector: " + "LagVector[" + SignalAnalysis.bestLag(lags) + "] = " + lags.get(SignalAnalysis.bestLag(lags)));
 
    }//GEN-LAST:event_CrossCorrelationButtonActionPerformed

    //Normalized Cross Correlation Button
    private void CrossCorrelationNormButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrossCorrelationNormButtonActionPerformed
        lagsNorm.addAll(SignalPair.doCrossCorrelationNegNorm());
        lagsNorm.addAll(SignalPair.doCrossCorrelationNorm());
        
        System.out.println("----- RESULTS -----");
        System.out.println("NORMALIZED Lag Vector: " + lagsNorm.toString());
        System.out.println("Best element on NORMALIZED Lag Vector: " + "normalizedLagVector[" + SignalAnalysis.bestLag(lagsNorm) + "] = " + lagsNorm.get(SignalAnalysis.bestLag(lagsNorm)));
        
        this.resultsText.setText("----- RESULTS -----\n" + "NORMALIZED Lag Vector: " + lagsNorm.toString() + "\nBest element on NORMALIZED Lag Vector: " + "normalizedLagVector[" + SignalAnalysis.bestLag(lagsNorm) + "] = " + lagsNorm.get(SignalAnalysis.bestLag(lagsNorm)));
    }//GEN-LAST:event_CrossCorrelationNormButtonActionPerformed

    //Load the data arrays
    private void LoadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoadButtonActionPerformed
        //this.resultsText.setText("You must to specify the signals data before!!");
        if(this.fieldX.getText().isEmpty() || this.fieldY.getText().isEmpty()) this.resultsText.setText("You must to specify the signals before!!");
        SignalPair.putArrayList(stringToFloatArrayList(this.fieldX.getText()), stringToFloatArrayList(this.fieldY.getText()));
        this.resultsText.setText("Data Loaded!");
    }//GEN-LAST:event_LoadButtonActionPerformed

    //Cross Correlation Graph Button
    private void CrossCorrelationGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrossCorrelationGraphButtonActionPerformed
        final Graphs graphCrossCorrelation = new Graphs("Lags", lags,  "Time", "Y", " ");
        graphCrossCorrelation.pack();
        RefineryUtilities.centerFrameOnScreen(graphCrossCorrelation);
        graphCrossCorrelation.setVisible(true);
    }//GEN-LAST:event_CrossCorrelationGraphButtonActionPerformed
    
    //Normalized Cross Correlation Graph Button
    private void CrossCorrelationNormGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrossCorrelationNormGraphButtonActionPerformed
        final Graphs graphCrossCorrelation = new Graphs("Normalized Lags", lagsNorm,  "Time", "Y", " ");
        graphCrossCorrelation.pack();
        RefineryUtilities.centerFrameOnScreen(graphCrossCorrelation);
        graphCrossCorrelation.setVisible(true);
    }//GEN-LAST:event_CrossCorrelationNormGraphButtonActionPerformed

    private void movedGraphButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movedGraphButtonActionPerformed
        //Processing the moved signal
        ArrayList<Float> receivedMoved;
        System.out.println("GET LAG POS: " + SignalAnalysis.getLagPos(lagsNorm, SignalAnalysis.bestLag(lagsNorm)));
        //Move the second signal to the left
        if(SignalAnalysis.getLagPos(lagsNorm, SignalAnalysis.bestLag(lagsNorm))<0){
            System.out.println("MENOS 0");
            System.out.println("GET LAG POS: " + SignalAnalysis.getLagPos(lagsNorm, SignalAnalysis.bestLag(lagsNorm)));
            receivedMoved = new ArrayList<Float>(SignalPair.yArrayList.subList(abs(SignalAnalysis.getLagPos(lagsNorm, SignalAnalysis.bestLag(lagsNorm))), SignalPair.yArrayList.size()));
            //receivedMoved = new ArrayList<Float>(yArray.subList(bestLag(lagsNorm), yArray.size()));
        
        }
        //Move the first signal to the left
        
        else if(SignalAnalysis.getLagPos(lagsNorm, SignalAnalysis.bestLag(lagsNorm)) > 1){
            System.out.println("MAS 0");
            System.out.println("BEST LAG: " + SignalAnalysis.bestLag(lagsNorm) + " || XARRAY SIZE: " + SignalPair.xArrayList.size());
            receivedMoved = new ArrayList<Float>(SignalPair.xArrayList.subList(abs(SignalAnalysis.getLagPos(lagsNorm, SignalAnalysis.bestLag(lagsNorm))), SignalPair.xArrayList.size()));
            //receivedMoved = new ArrayList<Float>(xArray.subList(bestLag(lagsNorm), xArray.size()));
        }
        //Leave the original signals
        else{
            System.out.println("IGUAL");
            receivedMoved = new ArrayList<Float>(SignalPair.yArrayList);
        }
        //Drawing the moved signal
        final Graphs graphReceivedMoved = new Graphs("Moved Received Signal", receivedMoved, "Time", "Y", " ");
        graphReceivedMoved.pack();
        RefineryUtilities.centerFrameOnScreen(graphReceivedMoved);
        graphReceivedMoved.setVisible(true);
    }//GEN-LAST:event_movedGraphButtonActionPerformed

    private void fieldXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldXActionPerformed

    private void timeDelayButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeDelayButtonActionPerformed
        System.out.println("----- RESULTS -----");
        System.out.println("There is " + SignalAnalysis.getLagPos(lagsNorm, SignalAnalysis.bestLag(lagsNorm)) + " Units of Time Delay between the sent signal and the received one");
        this.resultsText.setText("There is " + SignalAnalysis.getLagPos(lagsNorm, SignalAnalysis.bestLag(lagsNorm)) + " Units of Time Delay between the sent signal and the received one");
    }//GEN-LAST:event_timeDelayButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(uinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uinterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uinterface().setVisible(true);
            }
        });
    }
    
    public ArrayList<Float> stringToFloatArrayList(String str){
        StringTokenizer strTokenizer = new StringTokenizer(str, " ");
        ArrayList<Float> arrayList = new ArrayList<Float>();
        
        while (strTokenizer.hasMoreTokens()) {
            arrayList.add(Float.valueOf(strTokenizer.nextToken()));
        }
        return arrayList;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CorrelationButton;
    private javax.swing.JButton CorrelationNormButton;
    private javax.swing.JButton CrossCorrelationButton;
    private javax.swing.JButton CrossCorrelationGraphButton;
    private javax.swing.JButton CrossCorrelationNormButton;
    private javax.swing.JButton CrossCorrelationNormGraphButton;
    private javax.swing.JButton LoadButton;
    private javax.swing.JTextField fieldX;
    private javax.swing.JTextField fieldY;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton movedGraphButton;
    private javax.swing.JTextArea resultsText;
    private javax.swing.JButton signalsLoadedGraphButton;
    private javax.swing.JButton timeDelayButton;
    // End of variables declaration//GEN-END:variables
}
