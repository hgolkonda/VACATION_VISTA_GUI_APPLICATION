/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Customer;

import Enterprise.main.EcoSystem;
import Enterprise.Commute.BookaRide.Vehicle;
import Enterprise.Customer.Customer;
import Enterprise.ServiceRequest.VehicleServiceRequest;
import java.awt.Color;
import java.awt.Component;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.MutableComboBoxModel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import userinterface.GMapsFrame;

/**
 *
 * @author Subbu
 */
public class VehicleBookingPanel extends javax.swing.JPanel {

    /**
     * Creates new form VehicleBookingPanel
     */
    EcoSystem system;
    Customer user;

    public VehicleBookingPanel(EcoSystem system, Customer user) {
        initComponents();
        this.system = system;
        this.user = user;
        this.latTxt1 = latTxt;
        this.longTxt1 = longTxt;

        MutableComboBoxModel<String> model = new DefaultComboBoxModel<String>();

        for (Vehicle vehicleList : system.getVehicleList().getVehicleList()) {
            model.addElement(vehicleList.getVehicleName());
        }

        chooseVehicleDropdown.setModel(model);

        vehicleNameTxt.setEditable(false);
        vehicleCategoryTxt.setEditable(false);
        vehicleSeaterTxt.setEditable(false);
        priceTxt.setEditable(false);
        vehicleNumberTxt.setEditable(false);

        populateRequestTable();
        formatRows();
    }
    
    public static void setLatLongDetails(double lat, double longitude) {
        latTxt1.setText(String.valueOf(lat));
        longTxt1.setText(String.valueOf(longitude));
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
        chooseVehicleDropdown = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vehicleNameTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        vehicleCategoryTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        vehicleSeaterTxt = new javax.swing.JTextField();
        viewVehicleBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        priceTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        numberOfHoursTxt = new javax.swing.JTextField();
        vehicleBookingDateTxt = new com.toedter.calendar.JDateChooser();
        bookVehicleBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleWorkQueueTable = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        vehicleNumberTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        latTxt = new javax.swing.JTextField();
        longTxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(157, 193, 131));
        setForeground(new java.awt.Color(140, 82, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 82, 255));
        jLabel1.setText("Book A Vehicle");
        add(jLabel1);
        jLabel1.setBounds(450, 200, 260, 30);

        add(chooseVehicleDropdown);
        chooseVehicleDropdown.setBounds(630, 290, 148, 23);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(140, 82, 255));
        jLabel2.setText("Choose a vehicle of your choice:");
        add(jLabel2);
        jLabel2.setBounds(380, 300, 193, 17);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(140, 82, 255));
        jLabel3.setText("Vehicle Name:");
        add(jLabel3);
        jLabel3.setBounds(180, 370, 88, 17);
        add(vehicleNameTxt);
        vehicleNameTxt.setBounds(300, 370, 160, 23);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(140, 82, 255));
        jLabel4.setText("Vehicle Category:");
        add(jLabel4);
        jLabel4.setBounds(500, 370, 108, 17);
        add(vehicleCategoryTxt);
        vehicleCategoryTxt.setBounds(640, 370, 160, 23);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(140, 82, 255));
        jLabel5.setText("Vehicle Seater:");
        add(jLabel5);
        jLabel5.setBounds(840, 370, 91, 17);
        add(vehicleSeaterTxt);
        vehicleSeaterTxt.setBounds(960, 370, 160, 23);

        viewVehicleBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        viewVehicleBtn.setForeground(new java.awt.Color(140, 82, 255));
        viewVehicleBtn.setText("View Details");
        viewVehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVehicleBtnActionPerformed(evt);
            }
        });
        add(viewVehicleBtn);
        viewVehicleBtn.setBounds(820, 290, 105, 23);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(140, 82, 255));
        jLabel6.setText("Price per hour:");
        add(jLabel6);
        jLabel6.setBounds(650, 450, 120, 17);
        add(priceTxt);
        priceTxt.setBounds(810, 440, 160, 23);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(140, 82, 255));
        jLabel7.setText("Select Vehicle Booking Date:");
        add(jLabel7);
        jLabel7.setBounds(200, 520, 174, 17);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(140, 82, 255));
        jLabel8.setText("Enter Number of Hours:");
        add(jLabel8);
        jLabel8.setBounds(600, 520, 150, 17);
        add(numberOfHoursTxt);
        numberOfHoursTxt.setBounds(770, 510, 160, 23);

        vehicleBookingDateTxt.setDateFormatString("MM/dd/yyyy");
        add(vehicleBookingDateTxt);
        vehicleBookingDateTxt.setBounds(410, 510, 160, 23);

        bookVehicleBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        bookVehicleBtn.setForeground(new java.awt.Color(140, 82, 255));
        bookVehicleBtn.setText("Book Vehicle");
        bookVehicleBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookVehicleBtnActionPerformed(evt);
            }
        });
        add(bookVehicleBtn);
        bookVehicleBtn.setBounds(980, 490, 137, 50);

        vehicleWorkQueueTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vehicle Name", "Vehicle Number", "Booking Date", "Price per hour", "Number of hours", "Total price", "Request Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vehicleWorkQueueTable);

        add(jScrollPane1);
        jScrollPane1.setBounds(190, 640, 933, 257);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(140, 82, 255));
        jLabel9.setText("Vehicle Booking Status");
        add(jLabel9);
        jLabel9.setBounds(560, 600, 180, 30);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(140, 82, 255));
        jLabel10.setText("Vehicle Number:");
        add(jLabel10);
        jLabel10.setBounds(310, 440, 103, 17);
        add(vehicleNumberTxt);
        vehicleNumberTxt.setBounds(440, 440, 160, 23);

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(140, 82, 255));
        jButton1.setText("Location");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(370, 560, 83, 23);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(140, 82, 255));
        jLabel11.setText("Latitude :");
        add(jLabel11);
        jLabel11.setBounds(470, 570, 61, 17);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(140, 82, 255));
        jLabel13.setText("Longitude :");
        add(jLabel13);
        jLabel13.setBounds(710, 570, 71, 17);

        latTxt.setEditable(false);
        add(latTxt);
        latTxt.setBounds(530, 570, 170, 23);

        longTxt.setEditable(false);
        add(longTxt);
        longTxt.setBounds(800, 570, 160, 23);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gradientful.jpeg"))); // NOI18N
        add(jLabel12);
        jLabel12.setBounds(10, 90, 1500, 960);

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/gradientful.jpeg"))); // NOI18N
        add(jLabel14);
        jLabel14.setBounds(0, -80, 1500, 960);
    }// </editor-fold>//GEN-END:initComponents

    private void viewVehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVehicleBtnActionPerformed
        // View Vehicle Details on choosing

        try {
            if (chooseVehicleDropdown.getSelectedItem() != null) {

                String vehicleName = String.valueOf(chooseVehicleDropdown.getSelectedItem());
                Vehicle vehicleDetails = system.getVehicleList().getVehicleByName(vehicleName);

                vehicleNameTxt.setText(vehicleDetails.getVehicleName());
                vehicleCategoryTxt.setText(vehicleDetails.getVehiclecategory());
                vehicleSeaterTxt.setText(String.valueOf(vehicleDetails.getVehicleseater()));
                vehicleNumberTxt.setText(vehicleDetails.getVehicleNumber());
                priceTxt.setText(String.valueOf(vehicleDetails.getVehicleprice()));

            } else {
                JOptionPane.showMessageDialog(this, "Choose a valid Vehicle for booking");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Choose a valid Vehicle for booking");
        }
    }//GEN-LAST:event_viewVehicleBtnActionPerformed

    private void bookVehicleBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookVehicleBtnActionPerformed
        // Book a vehicle after entering details
        VehicleServiceRequest bookVehicle = new VehicleServiceRequest();

        try {
            if (chooseVehicleDropdown.getSelectedItem() != null) {
                String vehicleName = String.valueOf(chooseVehicleDropdown.getSelectedItem());
                Vehicle vehicleDetails = system.getVehicleList().getVehicleByName(vehicleName);

                Date selectedDate = vehicleBookingDateTxt.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
                String strDate = dateFormat.format(selectedDate);
                Date bookingDate = dateFormat.parse(strDate);

                int numberOfHours = Integer.parseInt(numberOfHoursTxt.getText());

                bookVehicle.setVehicleDetails(vehicleDetails);
                bookVehicle.setBookingDate(bookingDate);
                bookVehicle.setNumberOfHours(numberOfHours);
                bookVehicle.setCustomerId(user.getCustomerId());
                bookVehicle.setStatus("Pending");

                system.getVehicleServiceRequestList().getVehicleServiceRequestList().add(bookVehicle);

                JOptionPane.showMessageDialog(this, "Vehicle booking request sent to Contractor");
                populateRequestTable();
                clearFields();
                formatRows();

            } else {
                JOptionPane.showMessageDialog(this, "Enter valid values for date and number of hours for booking a Vehicle");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter valid values for date and number of hours for booking a Vehicle");
        }
    }//GEN-LAST:event_bookVehicleBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        GMapsFrame gMapsFrame = new GMapsFrame();
        gMapsFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        gMapsFrame.setVisible(true);
        new GMapsFrame(gMapsFrame);
    }//GEN-LAST:event_jButton1ActionPerformed

    private static javax.swing.JTextField latTxt1;
    private static javax.swing.JTextField longTxt1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookVehicleBtn;
    private javax.swing.JComboBox<String> chooseVehicleDropdown;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField latTxt;
    private javax.swing.JTextField longTxt;
    private javax.swing.JTextField numberOfHoursTxt;
    private javax.swing.JTextField priceTxt;
    private com.toedter.calendar.JDateChooser vehicleBookingDateTxt;
    private javax.swing.JTextField vehicleCategoryTxt;
    private javax.swing.JTextField vehicleNameTxt;
    private javax.swing.JTextField vehicleNumberTxt;
    private javax.swing.JTextField vehicleSeaterTxt;
    private javax.swing.JTable vehicleWorkQueueTable;
    private javax.swing.JButton viewVehicleBtn;
    // End of variables declaration//GEN-END:variables

    private void populateRequestTable() {

        try {
            DefaultTableModel model = (DefaultTableModel) vehicleWorkQueueTable.getModel();
            model.setRowCount(0);

            for (VehicleServiceRequest vehicleWorkRequest : system.getVehicleServiceRequestList().getVehicleServiceRequestList()) {

                if (vehicleWorkRequest.getCustomerId().equals(user.getCustomerId())) {
                    Object[] newRow = new Object[7];
                    newRow[0] = vehicleWorkRequest.getVehicleDetails().getVehicleName();
                    newRow[1] = vehicleWorkRequest.getVehicleDetails().getVehicleNumber();
                    newRow[2] = vehicleWorkRequest.getBookingDate();
                    newRow[3] = vehicleWorkRequest.getVehicleDetails().getVehicleprice();
                    newRow[4] = vehicleWorkRequest.getNumberOfHours();
                    newRow[5] = (vehicleWorkRequest.getVehicleDetails().getVehicleprice() * vehicleWorkRequest.getNumberOfHours());
                    newRow[6] = vehicleWorkRequest.getStatus();

                    model.addRow(newRow);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    private void clearFields() {

        vehicleNameTxt.setText("");
        vehicleCategoryTxt.setText("");
        priceTxt.setText("");
        vehicleSeaterTxt.setText("");
        vehicleNumberTxt.setText("");
        numberOfHoursTxt.setText("");
        vehicleBookingDateTxt.setCalendar(null);
        latTxt.setText("");
        longTxt.setText("");
    }

    private void formatRows() {

        DefaultTableModel model = (DefaultTableModel) vehicleWorkQueueTable.getModel();

        vehicleWorkQueueTable.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
                final Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                String status = String.valueOf(model.getValueAt(row, 6));
                c.setBackground(status.equals("Pending") ? Color.WHITE : status.equals("Approved") ? Color.GREEN : Color.RED);
                return c;
            }
        });

    }

}
