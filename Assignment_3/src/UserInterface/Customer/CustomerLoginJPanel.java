/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.TravelAgency.AirlineDirectory;
import UserInterface.TravelAgency.UserDirectoryJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Prabhu Surbamanian
 */
public class CustomerLoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CustomerLoginJPanel
     */
    private JPanel rightJPanel;
    private AirlineDirectory airlineDirectory;
    public CustomerLoginJPanel(JPanel rightJPanel, AirlineDirectory airlineDirectory) {
        initComponents();
        this.airlineDirectory=airlineDirectory;
        this.rightJPanel=rightJPanel;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookFlightBtn = new javax.swing.JButton();
        bookingHistoryBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bookFlightBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookFlightBtn.setText("Book Flight>>");
        bookFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookFlightBtnActionPerformed(evt);
            }
        });

        bookingHistoryBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookingHistoryBtn.setText("Booking History>>");
        bookingHistoryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookingHistoryBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bookFlightBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bookingHistoryBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(342, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(bookFlightBtn)
                .addGap(46, 46, 46)
                .addComponent(bookingHistoryBtn)
                .addContainerGap(243, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bookFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookFlightBtnActionPerformed
        // TODO add your handling code here:
        FlightSearchJPanel fligthSearch = new FlightSearchJPanel(rightJPanel, airlineDirectory);
        rightJPanel.add("CustomerLoginJPanel", fligthSearch);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_bookFlightBtnActionPerformed

    private void bookingHistoryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookingHistoryBtnActionPerformed
        // TODO add your handling code here:
        CustomerBookHistoryJPanel historyJPanel = new CustomerBookHistoryJPanel(rightJPanel, airlineDirectory);
        rightJPanel.add("CreateAirlineJPanel", historyJPanel);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.next(rightJPanel);
    }//GEN-LAST:event_bookingHistoryBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookFlightBtn;
    private javax.swing.JButton bookingHistoryBtn;
    // End of variables declaration//GEN-END:variables
}
