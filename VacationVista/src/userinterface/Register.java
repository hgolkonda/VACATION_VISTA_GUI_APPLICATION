/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import Enterprise.Database.DB4OUtil;
import Enterprise.main.EcoSystem;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import Enterprise.Customer.Customer;
import java.util.UUID;

/**
 *
 * @author Harshika
 */
public class Register extends javax.swing.JPanel {

    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    /**
     * Creates new form Register
     */
    public Register(EcoSystem system) {
        initComponents();
        this.system = system;
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
        txtFName = new javax.swing.JTextField();
        txtLName = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        cmbRole = new javax.swing.JComboBox<>();
        btnRegister = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtEmailAddress = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        setBackground(new java.awt.Color(157, 193, 131));
        setForeground(new java.awt.Color(255, 222, 242));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("First Name");
        jLabel1.setAlignmentY(0.0F);
        add(jLabel1);
        jLabel1.setBounds(190, 210, 130, 35);

        txtFName.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        txtFName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFNameActionPerformed(evt);
            }
        });
        add(txtFName);
        txtFName.setBounds(359, 209, 290, 30);

        txtLName.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        add(txtLName);
        txtLName.setBounds(359, 249, 290, 30);

        txtUserName.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        add(txtUserName);
        txtUserName.setBounds(359, 289, 290, 30);

        cmbRole.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Customer", "Admin", "Vehicle Contractor", "Pool Incharge", "Gaming Incharge", "Laundry Manager", "Janitor", "Food Manager", "Shop Manager" }));
        cmbRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbRoleActionPerformed(evt);
            }
        });
        add(cmbRole);
        cmbRole.setBounds(360, 369, 290, 30);

        btnRegister.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 14)); // NOI18N
        btnRegister.setText("REGISTER");
        btnRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterActionPerformed(evt);
            }
        });
        add(btnRegister);
        btnRegister.setBounds(290, 599, 150, 30);

        jLabel2.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("User Name");
        jLabel2.setAlignmentY(0.0F);
        add(jLabel2);
        jLabel2.setBounds(190, 290, 130, 35);

        jLabel3.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Last Name");
        jLabel3.setAlignmentY(0.0F);
        add(jLabel3);
        jLabel3.setBounds(190, 250, 130, 35);

        jLabel4.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Password");
        jLabel4.setAlignmentY(0.0F);
        add(jLabel4);
        jLabel4.setBounds(190, 330, 130, 35);

        jLabel5.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Roletype");
        jLabel5.setAlignmentY(0.0F);
        add(jLabel5);
        jLabel5.setBounds(190, 370, 130, 35);

        txtAddress.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        add(txtAddress);
        txtAddress.setBounds(360, 409, 290, 30);

        txtPhoneNumber.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        add(txtPhoneNumber);
        txtPhoneNumber.setBounds(359, 449, 290, 30);

        jLabel8.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Address");
        jLabel8.setAlignmentY(0.0F);
        add(jLabel8);
        jLabel8.setBounds(190, 410, 130, 35);

        jLabel10.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Age");
        jLabel10.setAlignmentY(0.0F);
        add(jLabel10);
        jLabel10.setBounds(190, 485, 130, 30);

        jLabel11.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Phone Number");
        jLabel11.setAlignmentY(0.0F);
        add(jLabel11);
        jLabel11.setBounds(190, 450, 130, 30);

        txtAge.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        add(txtAge);
        txtAge.setBounds(360, 489, 290, 30);

        jLabel13.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 36)); // NOI18N
        jLabel13.setText("REGISTER PAGE");
        add(jLabel13);
        jLabel13.setBounds(220, 130, 310, 60);

        jLabel14.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Email Address");
        jLabel14.setAlignmentY(0.0F);
        add(jLabel14);
        jLabel14.setBounds(200, 525, 130, 30);

        txtEmailAddress.setFont(new java.awt.Font("Arial Hebrew Scholar", 1, 12)); // NOI18N
        txtEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailAddressActionPerformed(evt);
            }
        });
        add(txtEmailAddress);
        txtEmailAddress.setBounds(360, 529, 290, 30);
        add(txtPassword);
        txtPassword.setBounds(360, 330, 290, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void txtFNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFNameActionPerformed

    private void btnRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterActionPerformed
        // TODO add your handling code here:
        Customer user = new Customer();
        
        UUID uuid = UUID.randomUUID();
        String randomUUIDString = uuid.toString();

        String firstName = txtFName.getText();
        String lastName = txtLName.getText();
        String userName = txtUserName.getText();
        String password = txtPassword.getText();
        String address = txtAddress.getText();
        String age = txtAge.getText();
        String phoneNumber = txtPhoneNumber.getText();
        String userId = randomUUIDString;
        String roleType = (String) cmbRole.getSelectedItem();
        String emailAddress = txtEmailAddress.getText();

        if (firstName.isEmpty() || lastName.isEmpty() || userName.isEmpty()|| password.isEmpty()
                || phoneNumber.isEmpty()|| userId.isEmpty()|| age.isEmpty()|| address.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter all details !");
            //clearAllFields();
            return;
        }

        if (validatePhoneNumber(phoneNumber) == null) {
            JOptionPane.showMessageDialog(this, "Please enter a valid phone number !");
            return;
        }
        
        if(validateEmailAddress(emailAddress) == null) {
            JOptionPane.showMessageDialog(this, "Please enter a valid email address !");
            return;
        }

        if (validateAge(age) == null) {
            JOptionPane.showMessageDialog(this, "Please enter a valid age!");
            return;
        }

        for (Customer p : system.getCustomerList().getCustomer()) {
            if (userName.equals(p.getCustomerName())) {
                JOptionPane.showMessageDialog(this, "Person already exists !");
                return;
            }
        }
        Integer a = validateAge(age);
        Long pn = validatePhoneNumber(phoneNumber);

        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setCustomerName(userName);
        user.setPassword(password);
        user.setRoleType(roleType);
        user.setAge(a);
        user.setAddress(address);
        user.setPhoneNumber(pn);
        user.setEmailId(emailAddress);
        user.setCustomerId(userId);

        ArrayList<Customer> users = system.getCustomerList().getCustomer();
        users.add(user);
        system.getCustomerList().setCustomer(users);

        JOptionPane.showMessageDialog(this, "Profile successfully added !");
        dB4OUtil.storeSystem(system);
        clearAllFields();
    }//GEN-LAST:event_btnRegisterActionPerformed

    private void cmbRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbRoleActionPerformed
        // TODO add your handling code here:
        String roleType = (String) cmbRole.getSelectedItem();
        if (roleType.equals("Customer")) {

        } else if (roleType.equals("Admin")) {

        } else {

        }
    }//GEN-LAST:event_cmbRoleActionPerformed

    private void txtEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailAddressActionPerformed

    private Integer validateAge(String age) {
        try {
            return Integer.parseInt(age);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    private Long validatePhoneNumber(String phoneNumber) {
        try {

            String cellPhoneNumberRegex = "^\\d{10}$";

            Pattern cellPhoneNumberPattern = Pattern.compile(cellPhoneNumberRegex);
            Matcher cellPhoneNumberMatcher = cellPhoneNumberPattern.matcher(phoneNumber);

            if (cellPhoneNumberMatcher.matches()) {
                return Long.parseLong(phoneNumber);
            } else {
                //JOptionPane.showMessageDialog(this, "Invalid Phone Number!");
                return null;
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return null;
        }

    }
    
    private String validateEmailAddress(String emailAddress) {
        try {

            String emailAddressRegex = "^(.+)@(\\S+)$";

            Pattern emailPattern = Pattern.compile(emailAddressRegex);
            Matcher emailMatcher = emailPattern.matcher(txtEmailAddress.getText());

            if (emailMatcher.matches()) {
                return emailAddress;
            } else {
//                JOptionPane.showMessageDialog(this, "Invalid Email Address!");
                return null;
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtEmailAddress;
    private javax.swing.JTextField txtFName;
    private javax.swing.JTextField txtLName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables

    private void clearAllFields() {
        txtAge.setText("");
        txtFName.setText("");
        txtLName.setText("");
        txtPassword.setText("");
        txtPhoneNumber.setText("");
        txtAddress.setText("");
        txtUserName.setText("");
        txtEmailAddress.setText("");
    }

}
