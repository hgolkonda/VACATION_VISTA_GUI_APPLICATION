/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Laundry;

import Enterprise.main.EcoSystem;
import Enterprise.Maintenance.Laundry.LaundryService;
import Enterprise.RecreationEvents.SwimmingPool.SwimmingPool;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anjana
 */
public class ManageLaundryPanel extends javax.swing.JPanel {
    private EcoSystem system;
    
    String mainValidationString = "";
    String validationString1 = "";
    String validationString2 = "";

    /**
     * Creates new form ManageLaundryPanel
     */
    public ManageLaundryPanel(EcoSystem system) {
        initComponents();
        this.system = system;
        
        populateTable();
    }
    
     private void resetLaundryData() {
        txtCategory.setText("");
        txtPrice.setText("");
    }
    
    public boolean areDataFieldsEmpty() {
        validationString1 = "";
        if (txtCategory.getText().isEmpty()) {
            validationString1 += "Category, ";
        }
       
        if (txtPrice.getText().isEmpty()) {
            validationString1 += "Price, ";
        }
        
        return isNotValid(validationString1);
    }

    public boolean areDataTypesCorrect() {
        validationString2 = "";
        if (!validateFloatDataType(txtPrice.getText())) {
            validationString2 += "Price, ";
        }
        return isNotValid(validationString2);
    }

    public boolean isNotValid(String str) {
        if (str.equals("")) {
            return false;
        } else {
            return true;
        }
    }

    public boolean validateFloatDataType(String str) {
        try {
            Float.parseFloat(str);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public void validationErrorMessagesDialog(boolean validation1, boolean validation2) {
        if (validation1) {
            mainValidationString = validationString1;
            JOptionPane.showMessageDialog(this, "Please update the data for these fields: " + mainValidationString);
        } else if (validation2) {
            mainValidationString = validationString2;
            JOptionPane.showMessageDialog(this, "Please enter only numbers for these fields: " + mainValidationString);
        }
    }
    
    private boolean laundryDetailsExistence() {
        String category = txtCategory.getText();
        boolean exist = false;
            for (LaundryService laundry : system.getLaundryServiceList().getLaundryDirectory()) {
                if (category.equals(laundry.getCategory())) {
                    exist = true;
                    break;
                }
            }
        return exist;
    }
    
    private void populateTable() {

        DefaultTableModel model = (DefaultTableModel) tblLaundry.getModel();

        model.setRowCount(0);

        for (LaundryService laundry : system.getLaundryServiceList().getLaundryDirectory()) {
            Object[] row = new Object[2];

            row[0] = laundry;
            row[1] = laundry.getPrice();

            model.addRow(row);
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
        tblLaundry = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 222, 242));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 82, 255));
        jLabel1.setText("Manage Laundry Category");

        tblLaundry.setBackground(new java.awt.Color(255, 222, 242));
        tblLaundry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Laundry Category", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLaundry);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(140, 82, 255));
        jLabel2.setText("Price per cloth ($): ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(140, 82, 255));
        jLabel3.setText("Laundry Category:");

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(140, 82, 255));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(140, 82, 255));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnView.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(140, 82, 255));
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(140, 82, 255));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCategory, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                    .addComponent(txtPrice)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(40, 40, 40)
                                .addComponent(btnDelete)
                                .addGap(40, 40, 40)
                                .addComponent(btnView)
                                .addGap(37, 37, 37)
                                .addComponent(btnUpdate))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(249, 249, 249))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnView)
                    .addComponent(btnUpdate))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            boolean validation1 = areDataFieldsEmpty();
            boolean validation2 = areDataTypesCorrect();

            if (!validation1 && !validation2) {
                String laundryName = txtCategory.getText();
                Float price = Float.parseFloat(txtPrice.getText());

                if (!laundryDetailsExistence()) {
                    LaundryService laundry = system.getLaundryServiceList().addLaundryDetails();
                    laundry.setCategory(laundryName);
                    laundry.setPrice(price);

                    JOptionPane.showMessageDialog(this, "Laundry category - " + laundryName + " added");
                    resetLaundryData();
                    populateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Laundry category details already exists with the category name"
                            + " : " + laundryName);
                }
            } else {
                validationErrorMessagesDialog(validation1, validation2);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblLaundry.getSelectedRow();

            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row for deletion");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblLaundry.getModel();
            LaundryService selectedLaundry = (LaundryService) model.getValueAt(selectedRowIndex, 0);

            system.getLaundryServiceList().deleteLaundry(selectedLaundry);

            JOptionPane.showMessageDialog(this, "Laundry category Deleted");

            populateTable();
            resetLaundryData();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblLaundry.getSelectedRow();

            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row for viewing");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblLaundry.getModel();
            LaundryService selectedLaundry = (LaundryService) model.getValueAt(selectedRowIndex, 0);

            txtCategory.setText(selectedLaundry.getCategory());
            txtPrice.setText(String.valueOf(selectedLaundry.getPrice()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) tblLaundry.getModel();

            if (tblLaundry.getSelectedRowCount() == 1) {

                String laundryName = txtCategory.getText();
                float price = Float.parseFloat(txtPrice.getText());

                int selectedRowIndex = tblLaundry.getSelectedRow();
                LaundryService laundry = system.getLaundryServiceList().getLaundries(selectedRowIndex);

                laundry.setCategory(laundryName);
                laundry.setPrice(price);

                populateTable();
                resetLaundryData();

                JOptionPane.showMessageDialog(this, "Update successful!");
            } else if (tblLaundry.getRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Table is empty");
            } else {
                JOptionPane.showMessageDialog(this, "Please select single row");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLaundry;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
