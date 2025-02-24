/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Customer;

import Enterprise.main.EcoSystem;
import Enterprise.InhouseShoppingMall.Giftware;
import Enterprise.Payments.CustomerPayments;
import Enterprise.Customer.Customer;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.MutableComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Subbu
 */
public class ShopPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShopPanel
     */
    EcoSystem system;
    Customer user;
    float totalPrice;

    public ShopPanel(EcoSystem system, Customer user) {
        initComponents();

        this.system = system;
        this.user = user;
        totalPrice = 0;

        MutableComboBoxModel<String> model = new DefaultComboBoxModel<String>();

        for (Giftware souvenirList : system.getGiftwareList().getGiftwareList()) {
            model.addElement(souvenirList.getGiftwareName());
        }

        chooseSouvenirDropdown.setModel(model);

        souvenirNameTxt.setEditable(false);
        subTotalTxt.setEditable(false);
        souvenirPriceTxt.setEditable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        souvenirPriceTxt = new javax.swing.JTextField();
        addSouvenirBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        souvenirListTable = new javax.swing.JTable();
        buySouvenirBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        chooseSouvenirDropdown = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        souvenirNameTxt = new javax.swing.JTextField();
        viewDetailsBtn = new javax.swing.JButton();
        removeSouvenirBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        subTotalTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(242, 233, 174));
        setLayout(null);
        add(souvenirPriceTxt);
        souvenirPriceTxt.setBounds(720, 330, 160, 23);

        addSouvenirBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addSouvenirBtn.setForeground(new java.awt.Color(157, 193, 131));
        addSouvenirBtn.setText("Add Item");
        addSouvenirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSouvenirBtnActionPerformed(evt);
            }
        });
        add(addSouvenirBtn);
        addSouvenirBtn.setBounds(913, 333, 90, 20);

        souvenirListTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Souvenir Name", "Souvenir Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(souvenirListTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(140, 400, 966, 195);

        buySouvenirBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        buySouvenirBtn.setForeground(new java.awt.Color(157, 193, 131));
        buySouvenirBtn.setText("Buy Items");
        buySouvenirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buySouvenirBtnActionPerformed(evt);
            }
        });
        add(buySouvenirBtn);
        buySouvenirBtn.setBounds(999, 669, 100, 40);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 82, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Shop for Giftware");
        add(jLabel1);
        jLabel1.setBounds(340, 160, 380, 50);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(140, 82, 255));
        jLabel2.setText("Choose a Souvenir:");
        add(jLabel2);
        jLabel2.setBounds(253, 257, 170, 20);

        add(chooseSouvenirDropdown);
        chooseSouvenirDropdown.setBounds(450, 250, 220, 23);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(140, 82, 255));
        jLabel3.setText("Souvenir Name:");
        add(jLabel3);
        jLabel3.setBounds(192, 327, 150, 20);
        add(souvenirNameTxt);
        souvenirNameTxt.setBounds(370, 330, 160, 23);

        viewDetailsBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewDetailsBtn.setForeground(new java.awt.Color(157, 193, 131));
        viewDetailsBtn.setText("View Details");
        viewDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDetailsBtnActionPerformed(evt);
            }
        });
        add(viewDetailsBtn);
        viewDetailsBtn.setBounds(692, 253, 110, 20);

        removeSouvenirBtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        removeSouvenirBtn.setForeground(new java.awt.Color(157, 193, 131));
        removeSouvenirBtn.setText("Remove Item");
        removeSouvenirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeSouvenirBtnActionPerformed(evt);
            }
        });
        add(removeSouvenirBtn);
        removeSouvenirBtn.setBounds(667, 609, 140, 40);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(140, 82, 255));
        jLabel5.setText("Souvenir Price:");
        add(jLabel5);
        jLabel5.setBounds(547, 327, 150, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(140, 82, 255));
        jLabel4.setText("Sub-Total:");
        add(jLabel4);
        jLabel4.setBounds(830, 617, 90, 20);
        add(subTotalTxt);
        subTotalTxt.setBounds(950, 620, 161, 23);

        jLabel6.setForeground(new java.awt.Color(255, 222, 242));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/giftware.jpeg"))); // NOI18N
        add(jLabel6);
        jLabel6.setBounds(0, -120, 1510, 1030);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/giftware.jpeg"))); // NOI18N
        add(jLabel7);
        jLabel7.setBounds(-10, 240, 1500, 910);
    }// </editor-fold>//GEN-END:initComponents

    private void addSouvenirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSouvenirBtnActionPerformed
        // TODO add your handling code here:

        try {

            DefaultTableModel itemListModel = (DefaultTableModel) souvenirListTable.getModel();

            if (chooseSouvenirDropdown.getSelectedItem() != null) {

                String itemName = String.valueOf(chooseSouvenirDropdown.getSelectedItem());
                Giftware souvenirDetails = system.getGiftwareList().getGiftwareByName(itemName);

                Object[] newRow = new Object[2];
                newRow[0] = souvenirDetails.getGiftwareName();
                newRow[1] = souvenirDetails.getGiftprice();

                itemListModel.addRow(newRow);
                totalPrice += souvenirDetails.getGiftprice();
                subTotalTxt.setText(String.valueOf(totalPrice));
                clearFields();

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Souvenir item for adding to list");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose a valid Souvenir item for adding to list");
        }
    }//GEN-LAST:event_addSouvenirBtnActionPerformed

    private void buySouvenirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buySouvenirBtnActionPerformed
        // TODO add your handling code here:

        try {
            
            DefaultTableModel itemListModel = (DefaultTableModel) souvenirListTable.getModel();

            if (souvenirListTable.getRowCount() != 0) {
                CustomerPayments shopBill = new CustomerPayments();

                shopBill.setCustomerId(user.getCustomerId());
                shopBill.setFacilityUsed("Items purchased in souvenir shop");
                shopBill.setCheckoutprice(totalPrice);

                system.getCustomerPaymentsList().getCustomerPaymentsList().add(shopBill);

                JOptionPane.showMessageDialog(this, "Souvenir items order placed. Please pickup during checkout");
                clearFields();
                itemListModel.setRowCount(0);
                totalPrice = 0;
                subTotalTxt.setText(String.valueOf(totalPrice));
                
            } else {
                JOptionPane.showMessageDialog(this, "Choose atleast one souvenir item for placing an order");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose valid souvenir items for buying");
        }
    }//GEN-LAST:event_buySouvenirBtnActionPerformed

    private void viewDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDetailsBtnActionPerformed
        // TODO add your handling code here:

        try {
            if (chooseSouvenirDropdown.getSelectedItem() != null) {

                String souvenirName = String.valueOf(chooseSouvenirDropdown.getSelectedItem());
                Giftware souvenirDetails = system.getGiftwareList().getGiftwareByName(souvenirName);

                souvenirNameTxt.setText(souvenirDetails.getGiftwareName());
                souvenirPriceTxt.setText(String.valueOf(souvenirDetails.getGiftprice()));

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Souvenir item for viewing");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose a valid Souvenir item for viewing");
        }
    }//GEN-LAST:event_viewDetailsBtnActionPerformed

    private void removeSouvenirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeSouvenirBtnActionPerformed
        // TODO add your handling code here:

        try {
            int index = souvenirListTable.getSelectedRow();

            if (index < 0) {
                JOptionPane.showMessageDialog(this, "Please select a Souvenir item to be removed from list");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) souvenirListTable.getModel();
            String souvenirName = String.valueOf(model.getValueAt(index, 0));
            Giftware souvenirDetails = system.getGiftwareList().getGiftwareByName(souvenirName);

            model.removeRow(index);
            totalPrice -= souvenirDetails.getGiftprice();
            subTotalTxt.setText(String.valueOf(totalPrice));

            JOptionPane.showMessageDialog(this, "Souvenir item removed successfully from list");
            
            clearFields();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please select a Souvenir item to be removed from list");
        }
    }//GEN-LAST:event_removeSouvenirBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSouvenirBtn;
    private javax.swing.JButton buySouvenirBtn;
    private javax.swing.JComboBox<String> chooseSouvenirDropdown;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeSouvenirBtn;
    private javax.swing.JTable souvenirListTable;
    private javax.swing.JTextField souvenirNameTxt;
    private javax.swing.JTextField souvenirPriceTxt;
    private javax.swing.JTextField subTotalTxt;
    private javax.swing.JButton viewDetailsBtn;
    // End of variables declaration//GEN-END:variables

    private void clearFields() {
        
        souvenirNameTxt.setText("");
        souvenirPriceTxt.setText("");
    }
}
