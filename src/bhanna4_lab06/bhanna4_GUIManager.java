/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bhanna4_lab06;

import java.util.LinkedList;

/**
 *
 * @author baile_000
 */
public class bhanna4_GUIManager extends javax.swing.JFrame {
    
    public LinkedList passenger = new LinkedList();
    public bhanna4_flight[] flights;
    public bhanna4_GUIManager() {
        initComponents();
        
        
        bhanna4_passenger P1;
        bhanna4_passenger P2;
        bhanna4_passenger P3;
        bhanna4_passenger P4;
        bhanna4_passenger P5;
        bhanna4_passenger P6;
        bhanna4_passenger P7;
        bhanna4_passenger P8;
        bhanna4_passenger P9;
        bhanna4_passenger P10;
        bhanna4_passenger P11;
        bhanna4_passenger P12;
        bhanna4_passenger P13;
        
        
        P1 = new bhanna4_passenger ();
        P1.ID = 1111;
        P1.name = "Larry";
        passenger.add(P1);
        P2 = new bhanna4_passenger ();
        P2.ID = 2222;
        P2.name = "Jill";
        passenger.add(P2);
        P3 = new bhanna4_passenger ();
        P3.ID = 3333;
        P3.name = "John";
        passenger.add(P3);
        P4 = new bhanna4_passenger ();
        P4.ID = 4444;
        P4.name = "Mike";
        passenger.add(P4);
        P5 = new bhanna4_passenger ();
        P5.ID = 5555;
        P5.name = "Sarah";
        passenger.add(P5);
        P6 = new bhanna4_passenger ();
        P6.ID = 6666;
        P6.name = "Dan";
        passenger.add(P6);
        P7 = new bhanna4_passenger ();
        P7.ID = 7777;
        P7.name = "Julia";
        passenger.add(P7);
        P8 = new bhanna4_passenger ();
        P8.ID = 8888;
        P8.name = "Bradley";
        passenger.add(P8);
        P9 = new bhanna4_passenger ();
        P9.ID = 9999;
        P9.name = "Rita";
        passenger.add(P9);
        P10 = new bhanna4_passenger ();
        P10.ID = 1010;
        P10.name = "Bill";
        passenger.add(P10);
        P11 = new bhanna4_passenger ();
        P11.ID = 1111;
        P11.name = "Alfred";
        passenger.add(P11);
        P12 = new bhanna4_passenger ();
        P12.ID = 3333;
        P12.name = "Jane";
        passenger.add(P12);
        P13= new bhanna4_passenger ();
        P13.ID = 1212;
        P13.name = "Alma";
        passenger.add(P13);
        
        
        
        bhanna4_flight F1, F2, F3, F4, F5;
        
        F1 = new bhanna4_flight ();
        F1.fNumber = "WS1413";
        F2 = new bhanna4_flight ();
        F2.fNumber = "WS1050";
        F3 = new bhanna4_flight ();
        F3.fNumber = "WS1411";
        F4 = new bhanna4_flight ();
        F4.fNumber = "all";
        
        
        bhanna4_flight [] tempfArray = {F1, F2, F3, F4};
        flights = tempfArray;
        
        bhanna4_passenger temp;
        for(int i=0; i<4;i++)
        {
            temp = (bhanna4_passenger) passenger.get(i);
            F1.addPassenger(temp);
        }
        for(int i=4; i<8;i++)
        {
            temp = (bhanna4_passenger) passenger.get(i);
            F2.addPassenger(temp);
        }
        for(int i = 6; i<10; i++)
        {
            temp = (bhanna4_passenger) passenger.get(i);
            F3.addPassenger(temp);
        }
        for(int i=0; i<passenger.size(); i++)
        {
            temp = (bhanna4_passenger) passenger.get(i);
            F4.addPassenger(temp);
        }
        F1.addPassenger(P11);
        F1.addPassenger(P12);
        
    }

    public int flightIndex(String Flight)
    {
        int valid = 0;
        int index = 99;
        for(int i = 0; i < flights.length; i++)
        {
            if(Flight.equals(flights[i].fNumber))
            {
                valid++;
                index = i;
            }
            
        }
        if(valid==0)
        {
            return 99;
        }
        else
            return index;
                
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        EnterFlightLabel = new javax.swing.JLabel();
        EnterFlight = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        MainLabel = new javax.swing.JLabel();
        SortButton = new javax.swing.JButton();
        ShuffleButton = new javax.swing.JButton();
        ReverseButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 334, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        EnterFlightLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EnterFlightLabel.setText("Enter the Flight Number :");

        EnterFlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterFlightActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 153)));
        jPanel1.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );

        SortButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        SortButton.setText("Sort");
        SortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortButtonActionPerformed(evt);
            }
        });

        ShuffleButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ShuffleButton.setText("Shuffle");
        ShuffleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShuffleButtonActionPerformed(evt);
            }
        });

        ReverseButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ReverseButton.setText("Reverse");
        ReverseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReverseButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Display");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(EnterFlightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EnterFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SortButton)
                                .addGap(49, 49, 49)
                                .addComponent(ShuffleButton)))
                        .addGap(38, 38, 38)
                        .addComponent(ReverseButton)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnterFlightLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EnterFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SortButton)
                    .addComponent(ShuffleButton)
                    .addComponent(ReverseButton))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterFlightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EnterFlightActionPerformed

    private void SortButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortButtonActionPerformed
        // TODO add your handling code here:
        String flight;
        flight = EnterFlight.getText();
        int index;
        index = flightIndex(flight);
        
        if(index!=99)
        {
            flights[index].sortPassengers();

            String line;
            line = flights[index].printPassengers();

            MainLabel.setText(line);
            MainLabel.setVisible(true);
        }
        
    }//GEN-LAST:event_SortButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String flight;
        flight = EnterFlight.getText();
        int index;
        index = flightIndex(flight);
        
        if(index!=99)
        {
            String line;
            line = flights[index].printPassengers();

            MainLabel.setText(line);
            MainLabel.setVisible(true);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ReverseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReverseButtonActionPerformed
        // TODO add your handling code here:
        String flight;
        flight = EnterFlight.getText();
        int index;
        index = flightIndex(flight);
        
        if(index!=99)
        {
            flights[index].reversePassengers();

            String line;
            line = flights[index].printPassengers();

            MainLabel.setText(line);
            MainLabel.setVisible(true);
        }
    }//GEN-LAST:event_ReverseButtonActionPerformed

    private void ShuffleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShuffleButtonActionPerformed
        // TODO add your handling code here:
        String flight;
        flight = EnterFlight.getText();
        int index;
        index = flightIndex(flight);
        
        if(index!=99)
        {
            flights[index].shufflePassengers();

            String line;
            line = flights[index].printPassengers();

            MainLabel.setText(line);
            MainLabel.setVisible(true);
        }
    }//GEN-LAST:event_ShuffleButtonActionPerformed

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
            java.util.logging.Logger.getLogger(bhanna4_GUIManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bhanna4_GUIManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bhanna4_GUIManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bhanna4_GUIManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        // TODO code application logic here
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bhanna4_GUIManager().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EnterFlight;
    private javax.swing.JLabel EnterFlightLabel;
    private javax.swing.JLabel MainLabel;
    private javax.swing.JButton ReverseButton;
    private javax.swing.JButton ShuffleButton;
    private javax.swing.JButton SortButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
