/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import Enterprise.main.EcoSystem;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import Enterprise.Customer.Customer;
import userinterface.EnterpriseManager.AdminHomePanel;
import userinterface.Customer.CustomerHomePanel;
import userinterface.DiningMenu.DiningMenuPanel;
import userinterface.InhouseShoppingMall.ShopPanel;
import userinterface.GameRoom.BookGamePanel;
import userinterface.CaretakerShift.CareTakerPanel;
import userinterface.Laundry.BookLaundryPanel;
import userinterface.SwimmingPool.BookPoolPanel;
import userinterface.BookaRide.BookVehiclePanel;

/**
 *
 * @author Harshika
 */
public class LoginPanel extends javax.swing.JPanel {

    private EcoSystem system;
    private javax.swing.JSplitPane SplitPane;

    /**
     * Creates new form LoginPanel
     */
    public LoginPanel(EcoSystem system, javax.swing.JSplitPane SplitPane) {
        initComponents();
        this.system = system;
        this.SplitPane = SplitPane;
    }

    public void resetData() {
        txtEUserName.setText("");
        txtEPassword.setText("");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLoginUser = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtEUserName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(157, 193, 131));
        setLayout(null);

        btnLoginUser.setBackground(new java.awt.Color(242, 233, 174));
        btnLoginUser.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLoginUser.setText("LOGIN ");
        btnLoginUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginUserActionPerformed(evt);
            }
        });
        add(btnLoginUser);
        btnLoginUser.setBounds(390, 420, 130, 30);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Username");
        add(jLabel1);
        jLabel1.setBounds(290, 300, 120, 30);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        add(jLabel2);
        jLabel2.setBounds(300, 350, 90, 30);

        txtEUserName.setBackground(new java.awt.Color(242, 233, 174));
        txtEUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEUserNameActionPerformed(evt);
            }
        });
        add(txtEUserName);
        txtEUserName.setBounds(450, 300, 170, 30);

        jLabel3.setBackground(new java.awt.Color(204, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("LOGIN PAGE");
        add(jLabel3);
        jLabel3.setBounds(330, 210, 290, 60);

        txtEPassword.setBackground(new java.awt.Color(242, 233, 174));
        add(txtEPassword);
        txtEPassword.setBounds(450, 350, 170, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginUserActionPerformed
    
        String userName = txtEUserName.getText();
        String password = txtEPassword.getText();
        ArrayList<Customer> list = system.getCustomerList().getCustomer();

        if (userName.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all the details !!");
        } else {
            if (list.isEmpty()) {
                JOptionPane.showMessageDialog(this, "You have not registered !!");
            } else {
                int index = 0;
                for (Customer temp : list) {
                    if (userName.equalsIgnoreCase(temp.getCustomerName()) && password.equalsIgnoreCase(temp.getPassword())) {
                        if (temp.getRoleType().equalsIgnoreCase("Customer")) {
                            CustomerHomePanel customerHomePanel = new CustomerHomePanel(system, temp);
                            SplitPane.setRightComponent(customerHomePanel);
                        } else if (temp.getRoleType().equalsIgnoreCase("Admin")) {
                            AdminHomePanel adminHomePanel = new AdminHomePanel(system);
                            SplitPane.setRightComponent(adminHomePanel);
                        } else if (temp.getRoleType().equalsIgnoreCase("Vehicle Contractor")) {
                            BookVehiclePanel bookVehiclePanel = new BookVehiclePanel(system);
                            SplitPane.setRightComponent(bookVehiclePanel);
                        } else if (temp.getRoleType().equalsIgnoreCase("Pool Incharge")) {
                            BookPoolPanel bookPoolPanel = new BookPoolPanel(system);
                            SplitPane.setRightComponent(bookPoolPanel);
                        } else if (temp.getRoleType().equalsIgnoreCase("Food Manager")) {
                            DiningMenuPanel foodandBevPanel = new DiningMenuPanel(system);
                            SplitPane.setRightComponent(foodandBevPanel);
                        } else if (temp.getRoleType().equalsIgnoreCase("Gaming Incharge")) {
                            BookGamePanel bookGamePanel = new BookGamePanel(system);
                            SplitPane.setRightComponent(bookGamePanel);
                        } else if (temp.getRoleType().equalsIgnoreCase("Laundry Manager")) {
                            BookLaundryPanel bookLaundryPanel = new BookLaundryPanel(system);
                            SplitPane.setRightComponent(bookLaundryPanel);
                        } else if (temp.getRoleType().equalsIgnoreCase("Janitor")) {
                            CareTakerPanel janitorPanel = new CareTakerPanel(system, temp);
                            SplitPane.setRightComponent(janitorPanel);
                        } else if (temp.getRoleType().equalsIgnoreCase("Shop Manager")) {
                            ShopPanel shopPanel = new ShopPanel(system);
                            SplitPane.setRightComponent(shopPanel);
                        }
                    } else {
                        index++;
                    }
                }
                if (index == list.size()) {
                    JOptionPane.showMessageDialog(this, "You have not registered !!");
                    resetData();
                }
            }
        }

//                JOptionPane.showMessageDialog(this, "Invalid User");
    }//GEN-LAST:event_btnLoginUserActionPerformed

    private void txtEUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEUserNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLoginUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtEPassword;
    private javax.swing.JTextField txtEUserName;
    // End of variables declaration//GEN-END:variables
}
