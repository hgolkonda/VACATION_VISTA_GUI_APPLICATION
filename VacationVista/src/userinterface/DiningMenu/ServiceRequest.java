/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.DiningMenu;

import Enterprise.main.EcoSystem;
import Enterprise.EmailAddress.EmailAlert;
import Enterprise.DiningMenu.MenuSelection;
import Enterprise.Payments.CustomerPayments;
import Enterprise.Customer.Customer;
import Enterprise.ServiceRequest.DiningMenuServiceRequest;
import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anjana
 */
public class ServiceRequest extends javax.swing.JPanel {

    private EcoSystem system;
    float totalPrice;

    /**
     * Creates new form WorkRequest
     */
    public ServiceRequest(EcoSystem system) {
        initComponents();
        this.system = system;
        populateWorkRequestTable();
        formatRows();
    }

    public void populateWorkRequestTable() {
        ArrayList<DiningMenuServiceRequest> pendingFoodBevRequest = new ArrayList<DiningMenuServiceRequest>();
        ArrayList<DiningMenuServiceRequest> non_pendingFoodBevRequest = new ArrayList<DiningMenuServiceRequest>();

        for (DiningMenuServiceRequest foodBevWorkRequest : system.getDiningRoomServiceRequestList().getDiningRoomServiceRequestList()) {
            if (foodBevWorkRequest.getStatus().equals("Pending")) {
                pendingFoodBevRequest.add(foodBevWorkRequest);
            } else {
                non_pendingFoodBevRequest.add(foodBevWorkRequest);
            }
        }

        populate_based_on_status(pendingFoodBevRequest, non_pendingFoodBevRequest);
    }

    public void populate_based_on_status(ArrayList<DiningMenuServiceRequest> pendingFoodBevRequest, ArrayList<DiningMenuServiceRequest> non_pendingFoodBevRequest) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        for (DiningMenuServiceRequest pfbr : pendingFoodBevRequest) {
            ArrayList<String> foodItemNames = new ArrayList<String>();
            long foodItemsTotalPrice = 0;
            for (MenuSelection fb : pfbr.getMenuSelectionList()) {
                foodItemNames.add(fb.getMenuName());
                foodItemsTotalPrice += fb.getMenuprice();
            }
            totalPrice = foodItemsTotalPrice;
            Object[] newRow = new Object[4];
            newRow[0] = pfbr;
            newRow[1] = foodItemNames.toString().replace("[", "").replace("]", "");
            newRow[2] = foodItemsTotalPrice;
            newRow[3] = pfbr.getStatus();
            model.addRow(newRow);
        }

        DefaultTableModel modelNon_Pending = (DefaultTableModel) jTable2.getModel();
        modelNon_Pending.setRowCount(0);

        for (DiningMenuServiceRequest pfbr : non_pendingFoodBevRequest) {
            ArrayList<String> foodItemNames = new ArrayList<String>();
            long foodItemsTotalPrice = 0;
            for (MenuSelection fb : pfbr.getMenuSelectionList()) {
                foodItemNames.add(fb.getMenuName());
                foodItemsTotalPrice += fb.getMenuprice();
            }
            Object[] newRow = new Object[4];
            newRow[0] = pfbr;
            newRow[1] = foodItemNames.toString().replace("[", "").replace("]", "");
            newRow[2] = foodItemsTotalPrice;
            newRow[3] = pfbr.getStatus();
            modelNon_Pending.addRow(newRow);
        }
    }

    void updateWorkRequestStatus(DiningMenuServiceRequest selectedFoodBevWorkRequest, String status) {
        selectedFoodBevWorkRequest.setStatus(status);
        int index = 0;
        for (DiningMenuServiceRequest fbr : system.getDiningRoomServiceRequestList().getDiningRoomServiceRequestList()) {
            if (fbr.getCustomerId().equals(selectedFoodBevWorkRequest.getCustomerId())) {
                system.getDiningRoomServiceRequestList().updateFoodBevWorkRequest(fbr, index);
                break;
            }
            index++;
        }
    }

    private void formatRows() {

        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();

        jTable2.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = String.valueOf(model.getValueAt(row, 3));
                c.setBackground(status.equals("Pending") ? Color.WHITE : status.equals("Approved") ? Color.GREEN : Color.RED);
                return c;
            }
        });

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
        jTable1 = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 222, 242));
        setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserId", "Item Details", "Total Price", "Status"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1);
        jScrollPane1.setBounds(30, 150, 933, 163);

        btnApprove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(140, 82, 255));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        add(btnApprove);
        btnApprove.setBounds(610, 330, 120, 40);

        btnReject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReject.setForeground(new java.awt.Color(140, 82, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });
        add(btnReject);
        btnReject.setBounds(760, 330, 120, 40);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "UserId", "Item Details", "Total Price", "Status"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        add(jScrollPane2);
        jScrollPane2.setBounds(30, 410, 933, 182);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 82, 255));
        jLabel1.setText("Service Request");
        add(jLabel1);
        jLabel1.setBounds(350, 40, 380, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = jTable1.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            DiningMenuServiceRequest selectedDiningMenuServiceRequest = (DiningMenuServiceRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedDiningMenuServiceRequest, "Approved");
            CustomerPayments ct = new CustomerPayments();
            ct.setCustomerId(selectedDiningMenuServiceRequest.getCustomerId());
            ct.setFacilityUsed("Food&Beverage");
            ct.setCheckoutprice(totalPrice);
            system.getCustomerPaymentsList().addCustomerPayment(ct);
            Customer getUser = system.getCustomerList().getCustomerById(selectedDiningMenuServiceRequest.getCustomerId());
            new EmailAlert().sendEmail(getUser, "Food and Beverage",true);
            JOptionPane.showMessageDialog(this, "Request approved successfully and email notification sent");
            populateWorkRequestTable();
            formatRows();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = jTable1.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to reject.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            DiningMenuServiceRequest selectedDiningMenuServiceRequest = (DiningMenuServiceRequest) model.getValueAt(selectedRowIndex, 0);
            updateWorkRequestStatus(selectedDiningMenuServiceRequest, "Rejected");
            CustomerPayments ct = new CustomerPayments();
            ct.setCustomerId(selectedDiningMenuServiceRequest.getCustomerId());
            ct.setFacilityUsed("Food&Beverage");
            ct.setCheckoutprice(totalPrice);
            system.getCustomerPaymentsList().addCustomerPayment(ct);
            Customer getUser = system.getCustomerList().getCustomerById(selectedDiningMenuServiceRequest.getCustomerId());
            new EmailAlert().sendEmail(getUser, "Food and Beverage",false);
            JOptionPane.showMessageDialog(this, "Order rejected successfully and email notification sent");
            
            populateWorkRequestTable();
            formatRows();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnRejectActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
