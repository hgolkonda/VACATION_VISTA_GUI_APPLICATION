/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SwimmingPool;

import Enterprise.main.EcoSystem;
import Enterprise.EmailAddress.EmailAlert;
import Enterprise.Payments.CustomerPayments;
import Enterprise.Customer.Customer;
import Enterprise.ServiceRequest.SwimmingPoolServiceRequest;
import Enterprise.ServiceRequest.VehicleServiceRequest;
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
public class ManagePoolRequestsPanel extends javax.swing.JPanel {
    EcoSystem system;
    /**
     * Creates new form ManageRequestsPanel
     */
    public ManagePoolRequestsPanel(EcoSystem system) {
        initComponents();
        
        this.system = system;
        populateSwimmingPoolRequestTable();
        formatRows();
    }
    
    public void populateSwimmingPoolRequestTable() {
        ArrayList<SwimmingPoolServiceRequest> pendingSwimmingPoolRequest = new ArrayList<SwimmingPoolServiceRequest>();
        ArrayList<SwimmingPoolServiceRequest> non_pendingSwimmingPoolRequest = new ArrayList<SwimmingPoolServiceRequest>();

        for (SwimmingPoolServiceRequest swimmingPoolSRequest : system.getSwimmingPoolServiceRequestList().getSwimmingPoolServiceRequestList()) {
            if (swimmingPoolSRequest.getStatus().equals("Pending")) {
                pendingSwimmingPoolRequest.add(swimmingPoolSRequest);
            } else {
                non_pendingSwimmingPoolRequest.add(swimmingPoolSRequest);
            }
        }

        populate_based_on_status(pendingSwimmingPoolRequest, non_pendingSwimmingPoolRequest);
    }

    public void populate_based_on_status(ArrayList<SwimmingPoolServiceRequest> pendingPoolRequest, ArrayList<SwimmingPoolServiceRequest> non_pendingPoolRequest) {
        DefaultTableModel model = (DefaultTableModel) tblPoolRequests.getModel();
        model.setRowCount(0);
        for (SwimmingPoolServiceRequest swimmingPoolSRequest : pendingPoolRequest) {

            Object[] newRow = new Object[6];
            newRow[0] = swimmingPoolSRequest;
            newRow[1] = swimmingPoolSRequest.getSwimmingPoolDetails().getSwimmingpoolName();
            newRow[2] = swimmingPoolSRequest.getSwimmingPoolDetails().getPrice();
            newRow[3] = swimmingPoolSRequest.getBookingDate();
            newRow[4] = swimmingPoolSRequest.getNumberOfHours();
            newRow[5] = swimmingPoolSRequest.getStatus();

            model.addRow(newRow);
        }

        DefaultTableModel modelNon_Pending = (DefaultTableModel) tblPoolConfirmed.getModel();
        modelNon_Pending.setRowCount(0);
        for (SwimmingPoolServiceRequest swimmingPoolSRequest : non_pendingPoolRequest) {

             Object[] newRow = new Object[6];
            newRow[0] = swimmingPoolSRequest;
            newRow[1] = swimmingPoolSRequest.getSwimmingPoolDetails().getSwimmingpoolName();
            newRow[2] = swimmingPoolSRequest.getSwimmingPoolDetails().getPrice();
            newRow[3] = swimmingPoolSRequest.getBookingDate();
            newRow[4] = swimmingPoolSRequest.getNumberOfHours();
            newRow[5] = swimmingPoolSRequest.getStatus();

            modelNon_Pending.addRow(newRow);
        }
    }
    
    public void updateServiceRequestStatus(SwimmingPoolServiceRequest selectedPool, String status) {
        selectedPool.setStatus(status);
        int index = 0;
        for (SwimmingPoolServiceRequest swimmingPoolSRequest : system.getSwimmingPoolServiceRequestList().getSwimmingPoolServiceRequestList()) {
            if (swimmingPoolSRequest.getCustomerId().equals(selectedPool.getCustomerId())) {
                system.getSwimmingPoolServiceRequestList().updateSwimmingPoolServiceRequestList(swimmingPoolSRequest, index);
                break;
            }
            index++;
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPoolRequests = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPoolConfirmed = new javax.swing.JTable();
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 233, 174));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 82, 255));
        jLabel1.setText("Manage Swimming Pool Requests");

        tblPoolRequests.setBackground(new java.awt.Color(242, 233, 174));
        tblPoolRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Pool Name", "Pool Price", "No. of Hours", "Required Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPoolRequests);

        tblPoolConfirmed.setBackground(new java.awt.Color(242, 233, 174));
        tblPoolConfirmed.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "User ID", "Pool Name", "Pool Price", "No. of Hours", "Required Date", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPoolConfirmed);

        btnApprove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(140, 82, 255));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnReject.setForeground(new java.awt.Color(140, 82, 255));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnApprove)
                .addGap(60, 60, 60)
                .addComponent(btnReject)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApprove)
                    .addComponent(btnReject))
                .addGap(48, 48, 48)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblPoolRequests.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tblPoolRequests.getModel();
            SwimmingPoolServiceRequest selectedSwimmingPoolServiceRequest = (SwimmingPoolServiceRequest) model.getValueAt(selectedRowIndex, 0);
            updateServiceRequestStatus(selectedSwimmingPoolServiceRequest, "Approved");
            CustomerPayments ct = new CustomerPayments();
            //User definition for email notif
            Customer getUser = system.getCustomerList().getCustomerById(selectedSwimmingPoolServiceRequest.getCustomerId());

            float swimmingPoolbooking_finalprice = selectedSwimmingPoolServiceRequest.getNumberOfHours() * selectedSwimmingPoolServiceRequest.getSwimmingPoolDetails().getPrice();
            ct.setCustomerId(selectedSwimmingPoolServiceRequest.getCustomerId());
            ct.setFacilityUsed("Swimming Pool Booked - " + selectedSwimmingPoolServiceRequest.getSwimmingPoolDetails().getSwimmingpoolName()+ " for " + selectedSwimmingPoolServiceRequest.getNumberOfHours() + " hours");
            ct.setCheckoutprice(swimmingPoolbooking_finalprice);
            system.getCustomerPaymentsList().addCustomerPayment(ct);
            
            //email notification
            new EmailAlert().sendEmail(getUser, "Pool",true);
            
            JOptionPane.showMessageDialog(this, "Request approved successfully and email notification sent");
            populateSwimmingPoolRequestTable();
            formatRows();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblPoolRequests.getSelectedRow();
            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row to approve.");
                return;
            }
            DefaultTableModel model = (DefaultTableModel) tblPoolRequests.getModel();
            SwimmingPoolServiceRequest selectedSwimmingPoolServiceRequest = (SwimmingPoolServiceRequest) model.getValueAt(selectedRowIndex, 0);
            updateServiceRequestStatus(selectedSwimmingPoolServiceRequest, "Rejected");
            CustomerPayments ct = new CustomerPayments();
            //User definition for email notif
            Customer getCustomer = system.getCustomerList().getCustomerById(selectedSwimmingPoolServiceRequest.getCustomerId());

            float swimmingPoolbooking_finalprice = selectedSwimmingPoolServiceRequest.getNumberOfHours() * selectedSwimmingPoolServiceRequest.getSwimmingPoolDetails().getPrice();
            ct.setCustomerId(selectedSwimmingPoolServiceRequest.getCustomerId());
            ct.setFacilityUsed("Pool Booked - " + selectedSwimmingPoolServiceRequest.getSwimmingPoolDetails().getSwimmingpoolName()+ " for " + selectedSwimmingPoolServiceRequest.getNumberOfHours() + " hours");
            ct.setCheckoutprice(swimmingPoolbooking_finalprice);
            system.getCustomerPaymentsList().addCustomerPayment(ct);
            
            //email notification
            new EmailAlert().sendEmail(getCustomer, "Pool",false);
            JOptionPane.showMessageDialog(this, "Request rejected successfully");
            populateSwimmingPoolRequestTable();
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
    private javax.swing.JTable tblPoolConfirmed;
    private javax.swing.JTable tblPoolRequests;
    // End of variables declaration//GEN-END:variables


    private void formatRows() {

        DefaultTableModel model = (DefaultTableModel) tblPoolConfirmed.getModel();

        tblPoolConfirmed.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = String.valueOf(model.getValueAt(row, 5));
                c.setBackground(status.equals("Pending") ? Color.WHITE : status.equals("Approved") ? Color.GREEN : Color.RED);
                return c;
            }
        });

    }
}
