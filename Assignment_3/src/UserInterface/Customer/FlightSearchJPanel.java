/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Customer;

import Business.TravelAgency.Airline;
import Business.TravelAgency.AirlineDirectory;
import Business.TravelAgency.Flight;
import UserInterface.TravelAgency.ViewAirlineJPanel;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prabhu Surbamanian
 */
public class FlightSearchJPanel extends javax.swing.JPanel {

    /**
     * Creates new form FlightSearJPanel
     */
    private JPanel rightJPanel;
    private AirlineDirectory airlineDirectory;
    private DefaultTableModel dtm;

    FlightSearchJPanel(JPanel rightJPanel, AirlineDirectory airlineDirectory) {
        initComponents();
        this.rightJPanel=rightJPanel;
        this.airlineDirectory=airlineDirectory;
        
    }
    public void populate(){
        dtm = (DefaultTableModel)flightSearchTbl.getModel();
        dtm.setRowCount(0);
        
        for(Airline airline : airlineDirectory.getAirlinerDiroctory()){
            for(Flight flight : airline.getFlightDirectory()){
                if (flight.getFromLocation() == fromLocationDropDown.getSelectedItem() || 
                    flight.getToLocation() == toLocationDropDown.getSelectedItem()){
                        Object[] row = new Object[dtm.getColumnCount()];
                        row[0]=airline;
                        row[1]=flight;
                        row[2]=flight.getFromLocation();
                        row[3]=flight.getToLocation();
                        row[4]=flight.getSchedule();
                        dtm.addRow(row);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Sorry, no Flights found!");
                    
                }
            }
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fromLocationDropDown = new javax.swing.JComboBox();
        toLocationDropDown = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        flightSearchTbl = new javax.swing.JTable();
        bookBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Flight Search");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("From Location:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("To Location:");

        fromLocationDropDown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fromLocationDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select From>", "Boston", "New York", "Washingtone" }));

        toLocationDropDown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        toLocationDropDown.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "<Select From>", "Boston", "New York", "Washingtone" }));

        flightSearchTbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        flightSearchTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airlines", "Flight", "From Location", "To Location", "Seats Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(flightSearchTbl);

        bookBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookBtn.setText("Book");
        bookBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookBtnActionPerformed(evt);
            }
        });

        searchBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchBtn.setText("Search");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backBtn.setText("<Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(fromLocationDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(145, 145, 145)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(toLocationDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bookBtn, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel1)
                .addGap(48, 48, 48)
                .addComponent(backBtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(toLocationDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(fromLocationDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchBtn)
                .addGap(44, 44, 44)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bookBtn)
                .addContainerGap(157, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_searchBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_backBtnActionPerformed

    private void bookBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = flightSearchTbl.getSelectedRow();
        if(selectRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Row");
        }else{
            Airline airline = (Airline)flightSearchTbl.getValueAt(selectRow, 0);
            Flight flight = (Flight)flightSearchTbl.getValueAt(selectRow, 1);
            FlightBookJPanel bookFlight = new FlightBookJPanel(rightJPanel, airline, flight);
            rightJPanel.add("FlightBookJPanel", bookFlight);
            CardLayout layout = (CardLayout)rightJPanel.getLayout();
            layout.next(rightJPanel);
        }
    }//GEN-LAST:event_bookBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookBtn;
    private javax.swing.JTable flightSearchTbl;
    private javax.swing.JComboBox fromLocationDropDown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchBtn;
    private javax.swing.JComboBox toLocationDropDown;
    // End of variables declaration//GEN-END:variables
}
