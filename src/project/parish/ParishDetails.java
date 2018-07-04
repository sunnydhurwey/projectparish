/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.parish;

import javax.swing.JOptionPane;
import java.sql.*;


/**
 *
 * @author sunny
 */
public class ParishDetails extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form ParishDetails
     */
    public ParishDetails() {
        initComponents();
        conn=jConnect.ConnectDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtParishName = new javax.swing.JTextField();
        txtDioceseName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtParishAddress = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtParishContact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtParishEmail = new javax.swing.JTextField();
        btnReset = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblParishDetailsTitle = new javax.swing.JLabel();
        lblClose = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtProductKey = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Parish Details - Project Parish");
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(32, 48, 90));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Parish Name");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 150, 30));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setText("Dioceses Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 150, 30));

        txtParishName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtParishName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 500, 30));

        txtDioceseName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtDioceseName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 500, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Address");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 150, 30));

        txtParishAddress.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtParishAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 500, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Contact");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 150, 30));

        txtParishContact.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtParishContact, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 500, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Email");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 150, 30));

        txtParishEmail.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtParishEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 500, 30));

        btnReset.setBackground(java.awt.Color.white);
        btnReset.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnReset.setText("RESET");
        btnReset.setToolTipText("Reset field values");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 120, 30));

        btnAdd.setBackground(java.awt.Color.white);
        btnAdd.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.setToolTipText("Add Details");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 130, 30));

        btnUpdate.setBackground(java.awt.Color.white);
        btnUpdate.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.setToolTipText("Update Details");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 130, 30));

        btnDelete.setBackground(java.awt.Color.white);
        btnDelete.setFont(new java.awt.Font("Ubuntu", 1, 13)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.setToolTipText("Delete Details");
        jPanel1.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 120, 30));

        lblParishDetailsTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/Parish Details.png"))); // NOI18N
        jPanel1.add(lblParishDetailsTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/close.png"))); // NOI18N
        lblClose.setToolTipText("Close");
        lblClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCloseMouseClicked(evt);
            }
        });
        jPanel1.add(lblClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Product Key");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 150, 30));

        txtProductKey.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jPanel1.add(txtProductKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 500, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(690, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCloseMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_lblCloseMouseClicked

    //Program to empty all fields
    public void resetFields(){
        try{
            txtParishName.setText("");
            txtDioceseName.setText("");
            txtParishAddress.setText("");
            txtParishContact.setText("");
            txtParishEmail.setText("");
            txtProductKey.setText("");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e,"resetField() Exception",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
        resetFields();
    }//GEN-LAST:event_btnResetActionPerformed

    //Program to load saved Parish Details from database
    public void loadParishDetails(){
        try{
            String sql="Select * from parish_details";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){
                txtParishName.setText(rs.getString("p_Name"));
                txtDioceseName.setText(rs.getString("p_DioceseName"));
                txtParishAddress.setText(rs.getString("p_Address"));
                txtParishContact.setText(rs.getString("p_Contact"));
                txtParishEmail.setText(rs.getString("p_Email"));
                txtProductKey.setText(rs.getString("p_ProductKey"));
                txtProductKey.setEditable(false);
                btnAdd.setEnabled(false);
                btnUpdate.setEnabled(true);
                btnDelete.setEnabled(true);
            }
            else{
                resetFields();
                JOptionPane.showMessageDialog(null, "Please register your Parish Details before proceeding for other operations","Welcome to Project Parish",JOptionPane.INFORMATION_MESSAGE);
                txtParishName.requestFocus();
                btnAdd.setEnabled(true);
                btnUpdate.setEnabled(false);
                btnDelete.setEnabled(false);
            }
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e,"loadParishDetails() Exception",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        loadParishDetails();
    }//GEN-LAST:event_formWindowOpened

    //Program to addParishDetails
    public void addDetails(){
        try{
            String sql="Insert into parish_details(p_Name,p_DioceseName,p_Address,p_Contact,p_Email,p_ProductKey)values(?,?,?,?,?,?)";
            pst=conn.prepareStatement(sql);
            pst.setString(1, txtParishName.getText());
            pst.setString(2, txtDioceseName.getText());
            pst.setString(3, txtParishAddress.getText());
            pst.setString(4, txtParishContact.getText());
            pst.setString(5, txtParishEmail.getText());
            pst.setString(6, txtProductKey.getText());
            pst.execute();
            pst.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e,"addDetails() Exception",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        addDetails();
        loadParishDetails();
    }//GEN-LAST:event_btnAddActionPerformed

    //Program to Update Parish Details
    public void updtDetails(){
        try{
            String sql="Update parish_details set p_Name=?, p_DioceseName=?, p_Address=?, p_Contact=?, p_Email=?";
            pst=conn.prepareStatement(sql);
            pst.setString(1, txtParishName.getText());
            pst.setString(2, txtDioceseName.getText());
            pst.setString(3, txtParishAddress.getText());
            pst.setString(4, txtParishContact.getText());
            pst.setString(5, txtParishEmail.getText());
            pst.setString(6, txtProductKey.getText());
            pst.execute();
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e,"updtDetails() Exception",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        updtDetails();
    }//GEN-LAST:event_btnUpdateActionPerformed
    //Program to set one instance on this ManageCompany Form
    private static ParishDetails obj=null;
    public static ParishDetails getObj(){
        if(obj==null){
            obj=new ParishDetails();
        }
        return obj;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ParishDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ParishDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ParishDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ParishDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ParishDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblClose;
    private javax.swing.JLabel lblParishDetailsTitle;
    private javax.swing.JTextField txtDioceseName;
    private javax.swing.JTextField txtParishAddress;
    private javax.swing.JTextField txtParishContact;
    private javax.swing.JTextField txtParishEmail;
    private javax.swing.JTextField txtParishName;
    private javax.swing.JTextField txtProductKey;
    // End of variables declaration//GEN-END:variables
}
