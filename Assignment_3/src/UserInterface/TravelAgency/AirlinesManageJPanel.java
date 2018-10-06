/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.TravelAgency;

import Business.TravelAgency.Airline;
import Business.TravelAgency.AirlineDirectory;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Prabhu Surbamanian
 */
public class AirlinesManageJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlines
     */
    private AirlineDirectory airlineDirectory;
    private JPanel rightJPanel;
    private DefaultTableModel dtm;
    
    AirlinesManageJPanel(JPanel rightJPanel, AirlineDirectory airlineDirectory) {
        initComponents();
        this.airlineDirectory = airlineDirectory;
        this.rightJPanel = rightJPanel;
        this.dtm = dtm;
        populate();
    }
    
    /*public void refreshTable() {
        int rowCount = productCatalog.getRowCount();
        DefaultTableModel model = (DefaultTableModel)productCatalog.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Product p : supplier.getProductCatalog().getProductCatalog()) {
            Object row[] = new Object[3];
            row[0] = p;
            row[1] = p.getModelNumber();
            row[2] = p.getPrice();
            model.addRow(row);
            }
        }*/
    
    public void populate(){
        
        dtm = (DefaultTableModel)airlineTbl.getModel();
        dtm.setRowCount(0);
        
        for(Airline airline : airlineDirectory.getAirlinerDiroctory()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0]=airline;
            row[1]=airline.getCode();
            row[2]=airline.getDescription();
            dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        airlineTbl = new javax.swing.JTable();
        addFlightBtn = new javax.swing.JButton();
        viewAirlineBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        airlineTbl.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        airlineTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name of Airlines", "Airline Code", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(airlineTbl);

        addFlightBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        addFlightBtn.setText("Add Flights");
        addFlightBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightBtnActionPerformed(evt);
            }
        });

        viewAirlineBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        viewAirlineBtn.setText("View Details");
        viewAirlineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewAirlineBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Airlines Manager");

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
                        .addGap(333, 333, 333)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addFlightBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(viewAirlineBtn))
                            .addComponent(backBtn)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(51, 51, 51)
                .addComponent(backBtn)
                .addGap(48, 48, 48)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addFlightBtn)
                    .addComponent(viewAirlineBtn))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addFlightBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = airlineTbl.getSelectedRow();
        if(selectRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Row");
        }else{
            Airline airline = (Airline)airlineTbl.getValueAt(selectRow, 0);
            CreateFlightJPanel flightPanel = new CreateFlightJPanel(rightJPanel, airline, airlineDirectory);
            rightJPanel.add("FlightManagerJPanel", flightPanel);
            CardLayout layout = (CardLayout)rightJPanel.getLayout();
            layout.next(rightJPanel);
        }
        
    }//GEN-LAST:event_addFlightBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        rightJPanel.remove(this);
        CardLayout layout = (CardLayout)rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }//GEN-LAST:event_backBtnActionPerformed
    
    /*private void backAction() {
        rightJPanel.remove(this);
        Component[] componentArray = rightJPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        MainTravelAgencyJPanel mainTravelJPanel = (MainTravelAgencyJPanel) component;
        mainTravelJPanel.refreshTable();
        CardLayout layout = (CardLayout) rightJPanel.getLayout();
        layout.previous(rightJPanel);
    }*/
    
    private void viewAirlineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewAirlineBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = airlineTbl.getSelectedRow();
        if(selectRow<0){
            JOptionPane.showMessageDialog(null, "Please select a Row");
        }else{
            Airline airline = (Airline)airlineTbl.getValueAt(selectRow, 0);
            ViewAirlineJPanel vPanel = new ViewAirlineJPanel(rightJPanel, airline, airlineDirectory);
            rightJPanel.add("ViewPanel", vPanel);
            CardLayout layout = (CardLayout)rightJPanel.getLayout();
            layout.next(rightJPanel);
        }
    }//GEN-LAST:event_viewAirlineBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFlightBtn;
    private javax.swing.JTable airlineTbl;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton viewAirlineBtn;
    // End of variables declaration//GEN-END:variables
}
