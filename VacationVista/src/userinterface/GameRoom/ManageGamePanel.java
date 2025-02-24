/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.GameRoom;

import Enterprise.main.EcoSystem;
import Enterprise.RecreationEvents.GameRoom.GameRoom;
import Enterprise.Commute.BookaRide.Vehicle;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saneeth
 */
public class ManageGamePanel extends javax.swing.JPanel {

    private EcoSystem system;

    String mainValidationString = "";
    String validationString1 = "";
    String validationString2 = "";

    /**
     * Creates new form ManageGamePanel
     */
    public ManageGamePanel(EcoSystem system) {
        initComponents();

        this.system = system;
        populateTable();
    }

    private void resetGameData() {
        cmbCategory.setSelectedItem("Choose Category");
        txtGameName.setText("");
        txtPrice.setText("");
    }

    public boolean areDataFieldsEmpty() {
        validationString1 = "";

        if (txtGameName.getText().isEmpty()) {
            validationString1 += "Game Name, ";
        }
        if (txtPrice.getText().isEmpty() || txtPrice.getText().equals("")) {
            validationString1 += "Price per hour, ";
        }

        if (cmbCategory.getSelectedIndex() == 0) {
            validationString1 += "Category, ";
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

    private boolean gameDetailsExistence() {
        String gameName = txtGameName.getText();
        boolean exist = false;
        for (GameRoom game : system.getGameRoomList().getGameDirectory()) {
            if (gameName.equals(game.getGameName())) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    private void populateTable() {
        //new test

        DefaultTableModel model = (DefaultTableModel) tblGame.getModel();

        model.setRowCount(0);

        for (GameRoom game : system.getGameRoomList().getGameDirectory()) {
            Object[] row = new Object[3];

            row[0] = game;
            row[1] = game.getGameCategory();
            row[2] = game.getGameprice();

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
        tblGame = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtGameName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        setBackground(new java.awt.Color(242, 233, 174));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(140, 82, 255));
        jLabel1.setText("Game Room Management");

        tblGame.setBackground(new java.awt.Color(242, 233, 174));
        tblGame.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Game Name", "Category", "Price per hour ($)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblGame);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(140, 82, 255));
        jLabel2.setText("Game Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(140, 82, 255));
        jLabel3.setText("Price per hour($)");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(140, 82, 255));
        jLabel4.setText("Category");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose Category", "Indoor", "Outdoor" }));

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
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cmbCategory, 0, 209, Short.MAX_VALUE)
                            .addComponent(txtGameName))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(28, 28, 28)
                        .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(114, 114, 114)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnView)
                                .addGap(103, 103, 103)
                                .addComponent(btnUpdate))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(216, 216, 216))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtGameName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd)
                    .addComponent(btnDelete)
                    .addComponent(btnView)
                    .addComponent(btnUpdate))
                .addGap(182, 182, 182))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        try {
            boolean validation1 = areDataFieldsEmpty();
            boolean validation2 = areDataTypesCorrect();

            if (!validation1 && !validation2) {

                String gameName = txtGameName.getText();
                String category = (String) cmbCategory.getSelectedItem();
                Float price = Float.parseFloat(txtPrice.getText());

                if (!gameDetailsExistence()) {
                    GameRoom game = system.getGameRoomList().addGameDetails();
                    game.setGameName(gameName);
                    game.setGameprice(price);
                    game.setGameCategory(category);

                    JOptionPane.showMessageDialog(this, "Game Name " + gameName + " added");
                    resetGameData();
                    populateTable();
                } else {
                    JOptionPane.showMessageDialog(this, "Game details already exists with the Game Name "
                            + " : " + gameName);
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
            int selectedRowIndex = tblGame.getSelectedRow();

            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row for deletion");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblGame.getModel();
            GameRoom selectedGame = (GameRoom) model.getValueAt(selectedRowIndex, 0);

            system.getGameRoomList().deleteGame(selectedGame);

            JOptionPane.showMessageDialog(this, "Game Deleted");

            populateTable();
            resetGameData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        try {
            int selectedRowIndex = tblGame.getSelectedRow();

            if (selectedRowIndex < 0) {
                JOptionPane.showMessageDialog(this, "Please select a row for viewing");
                return;
            }

            DefaultTableModel model = (DefaultTableModel) tblGame.getModel();
            GameRoom selectedGame = (GameRoom) model.getValueAt(selectedRowIndex, 0);

            txtGameName.setText(selectedGame.getGameName());
            cmbCategory.setSelectedItem(selectedGame.getGameCategory());
            txtPrice.setText(String.valueOf(selectedGame.getGameprice()));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel model = (DefaultTableModel) tblGame.getModel();

            if (tblGame.getSelectedRowCount() == 1) {

                String gameName = txtGameName.getText();
                float price = Float.parseFloat(txtPrice.getText());
                String category = (String) cmbCategory.getSelectedItem();

                int selectedRowIndex = tblGame.getSelectedRow();
                GameRoom game = system.getGameRoomList().getGames(selectedRowIndex);

                game.setGameName(gameName);
                game.setGameCategory(category);
                game.setGameprice(price);

                populateTable();
                resetGameData();

                JOptionPane.showMessageDialog(this, "Update successful!");
            } else if (tblGame.getRowCount() == 0) {
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
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblGame;
    private javax.swing.JTextField txtGameName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
