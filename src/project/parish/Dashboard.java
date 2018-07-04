/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.parish;

import javax.swing.JFrame;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author sunny
 */
public class Dashboard extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuParishDetails = new javax.swing.JMenu();
        mnuManageParishInfo = new javax.swing.JMenuItem();
        mnuParishioners = new javax.swing.JMenu();
        mnuManageFamilies = new javax.swing.JMenuItem();
        jSeparator17 = new javax.swing.JPopupMenu.Separator();
        mnuFamiliesList = new javax.swing.JMenuItem();
        mnuZoneDivisions = new javax.swing.JMenu();
        mnuManageZones = new javax.swing.JMenuItem();
        jSeparator16 = new javax.swing.JPopupMenu.Separator();
        mnuZoneMembersList = new javax.swing.JMenuItem();
        mnuCatechism = new javax.swing.JMenu();
        mnuManageStudents = new javax.swing.JMenuItem();
        jSeparator14 = new javax.swing.JPopupMenu.Separator();
        mnuAllotClass = new javax.swing.JMenuItem();
        jSeparator15 = new javax.swing.JPopupMenu.Separator();
        mnuExamResult = new javax.swing.JMenuItem();
        mnuTansfers = new javax.swing.JMenu();
        mnuParishionerTransIN = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        mnuParishionerTransOUT = new javax.swing.JMenuItem();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        mnuPriestTransIN = new javax.swing.JMenuItem();
        jSeparator13 = new javax.swing.JPopupMenu.Separator();
        mnuPriestTransOUT = new javax.swing.JMenuItem();
        mnuDeceasedRecord = new javax.swing.JMenu();
        mnuGroups = new javax.swing.JMenu();
        mnuManageVolunteerGroups = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        mnuManageVolunteers = new javax.swing.JMenuItem();
        jSeparator18 = new javax.swing.JPopupMenu.Separator();
        mnuManagePiousGroups = new javax.swing.JMenuItem();
        mnuCommittees = new javax.swing.JMenu();
        mnuManageCommittees = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        mnuManageCommitteeMembers = new javax.swing.JMenuItem();
        mnuContributions = new javax.swing.JMenu();
        mnuManageContriType = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        mnuManageContri = new javax.swing.JMenuItem();
        mnuSacraments = new javax.swing.JMenu();
        mnuBaptism = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuConfession = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        mnuEucharist = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        mnuConfirmation = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        mnuMatrimony = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        mnuHolyOrders = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        mnuAnointingOfSick = new javax.swing.JMenuItem();
        mnuAccounts = new javax.swing.JMenu();
        mnuInventory = new javax.swing.JMenu();
        mnuHelp = new javax.swing.JMenu();
        mnuAboutProjParish = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuAboutDeveloper = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard - Project Parish");
        setBackground(new java.awt.Color(32, 48, 90));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(32, 48, 90));
        jPanel1.setToolTipText("Welcome to Project Parish");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(32, 48, 90));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/images/ProjectParish_400x100.png"))); // NOI18N
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(508, 508, 508)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(409, 409, 409))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 1280, 120));

        jMenuBar1.setFont(new java.awt.Font("Ubuntu", 0, 13)); // NOI18N

        mnuParishDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/home.png"))); // NOI18N
        mnuParishDetails.setText("Parish");

        mnuManageParishInfo.setText("Manage Parish Info");
        mnuManageParishInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mnuManageParishInfoMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnuManageParishInfoMouseClicked(evt);
            }
        });
        mnuParishDetails.add(mnuManageParishInfo);

        jMenuBar1.add(mnuParishDetails);

        mnuParishioners.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/people.png"))); // NOI18N
        mnuParishioners.setText("Parishioners");

        mnuManageFamilies.setText("Manage Families");
        mnuParishioners.add(mnuManageFamilies);
        mnuParishioners.add(jSeparator17);

        mnuFamiliesList.setText("Families List");
        mnuFamiliesList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFamiliesListActionPerformed(evt);
            }
        });
        mnuParishioners.add(mnuFamiliesList);

        jMenuBar1.add(mnuParishioners);

        mnuZoneDivisions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/location.png"))); // NOI18N
        mnuZoneDivisions.setText("Zones");

        mnuManageZones.setText("Manage Zones");
        mnuZoneDivisions.add(mnuManageZones);
        mnuZoneDivisions.add(jSeparator16);

        mnuZoneMembersList.setText("Zone Members List");
        mnuZoneMembersList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuZoneMembersListActionPerformed(evt);
            }
        });
        mnuZoneDivisions.add(mnuZoneMembersList);

        jMenuBar1.add(mnuZoneDivisions);

        mnuCatechism.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/people-1.png"))); // NOI18N
        mnuCatechism.setText("Catechism");

        mnuManageStudents.setText("Manage Students");
        mnuCatechism.add(mnuManageStudents);
        mnuCatechism.add(jSeparator14);

        mnuAllotClass.setText("Allot Class");
        mnuCatechism.add(mnuAllotClass);
        mnuCatechism.add(jSeparator15);

        mnuExamResult.setText("Exam Result");
        mnuCatechism.add(mnuExamResult);

        jMenuBar1.add(mnuCatechism);

        mnuTansfers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/arrows.png"))); // NOI18N
        mnuTansfers.setText("Transfers");

        mnuParishionerTransIN.setText("Parishioner Transfer (IN)");
        mnuTansfers.add(mnuParishionerTransIN);
        mnuTansfers.add(jSeparator11);

        mnuParishionerTransOUT.setText("Parishioner Transfer (OUT)");
        mnuTansfers.add(mnuParishionerTransOUT);
        mnuTansfers.add(jSeparator12);

        mnuPriestTransIN.setText("Priest Transfer (IN)");
        mnuTansfers.add(mnuPriestTransIN);
        mnuTansfers.add(jSeparator13);

        mnuPriestTransOUT.setText("Priest Transfer (OUT)");
        mnuTansfers.add(mnuPriestTransOUT);

        jMenuBar1.add(mnuTansfers);

        mnuDeceasedRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/buildings.png"))); // NOI18N
        mnuDeceasedRecord.setText("Deceased");
        jMenuBar1.add(mnuDeceasedRecord);

        mnuGroups.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/people-2.png"))); // NOI18N
        mnuGroups.setText("Groups");

        mnuManageVolunteerGroups.setText("Manage V. Groups");
        mnuGroups.add(mnuManageVolunteerGroups);
        mnuGroups.add(jSeparator10);

        mnuManageVolunteers.setText("Manage Volunteers");
        mnuGroups.add(mnuManageVolunteers);
        mnuGroups.add(jSeparator18);

        mnuManagePiousGroups.setText("Manage Pious Groups");
        mnuGroups.add(mnuManagePiousGroups);

        jMenuBar1.add(mnuGroups);

        mnuCommittees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/people-3.png"))); // NOI18N
        mnuCommittees.setText("Committees");

        mnuManageCommittees.setText("Manage Committees");
        mnuCommittees.add(mnuManageCommittees);
        mnuCommittees.add(jSeparator9);

        mnuManageCommitteeMembers.setText("Manage Members");
        mnuCommittees.add(mnuManageCommitteeMembers);

        jMenuBar1.add(mnuCommittees);

        mnuContributions.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/money.png"))); // NOI18N
        mnuContributions.setText("Contributions");

        mnuManageContriType.setText("Manage Contribution Type");
        mnuContributions.add(mnuManageContriType);
        mnuContributions.add(jSeparator8);

        mnuManageContri.setText("Manage Contributions");
        mnuContributions.add(mnuManageContri);

        jMenuBar1.add(mnuContributions);

        mnuSacraments.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/shapes.png"))); // NOI18N
        mnuSacraments.setText("Sacraments");

        mnuBaptism.setText("Baptism");
        mnuSacraments.add(mnuBaptism);
        mnuSacraments.add(jSeparator2);

        mnuConfession.setText("Confession");
        mnuSacraments.add(mnuConfession);
        mnuSacraments.add(jSeparator3);

        mnuEucharist.setText("Eucharist");
        mnuSacraments.add(mnuEucharist);
        mnuSacraments.add(jSeparator4);

        mnuConfirmation.setText("Confirmation");
        mnuSacraments.add(mnuConfirmation);
        mnuSacraments.add(jSeparator5);

        mnuMatrimony.setText("Matrimony");
        mnuSacraments.add(mnuMatrimony);
        mnuSacraments.add(jSeparator6);

        mnuHolyOrders.setText("Holy Orders");
        mnuSacraments.add(mnuHolyOrders);
        mnuSacraments.add(jSeparator7);

        mnuAnointingOfSick.setText("Anointing of the sick");
        mnuSacraments.add(mnuAnointingOfSick);

        jMenuBar1.add(mnuSacraments);

        mnuAccounts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/business.png"))); // NOI18N
        mnuAccounts.setText("Accounts");
        jMenuBar1.add(mnuAccounts);

        mnuInventory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/people-4.png"))); // NOI18N
        mnuInventory.setText("Inventory");
        jMenuBar1.add(mnuInventory);

        mnuHelp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/icons/sheet.png"))); // NOI18N
        mnuHelp.setText("Help");

        mnuAboutProjParish.setText("About Project Parish");
        mnuHelp.add(mnuAboutProjParish);
        mnuHelp.add(jSeparator1);

        mnuAboutDeveloper.setText("About Developer");
        mnuHelp.add(mnuAboutDeveloper);

        jMenuBar1.add(mnuHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1290, 548));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Program to load saved Parish Details from database
    public void loadParishDetails(){
        try{
            String sql="Select * from parish_details";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if(rs.next()){               
                JOptionPane.showMessageDialog(null, "WELCOME TO PROJECT PARISH","Hello !",JOptionPane.INFORMATION_MESSAGE);
                mnuParishioners.setEnabled(true);
                mnuZoneDivisions.setEnabled(true);
                mnuCatechism.setEnabled(true);
                mnuTansfers.setEnabled(true);
                mnuDeceasedRecord.setEnabled(true);
                mnuGroups.setEnabled(true);
                mnuCommittees.setEnabled(true);
                mnuContributions.setEnabled(true);
                mnuSacraments.setEnabled(true);
                mnuAccounts.setEnabled(true);
                mnuInventory.setEnabled(true);
            }
            else{
                mnuParishioners.setEnabled(false);
                mnuZoneDivisions.setEnabled(false);
                mnuCatechism.setEnabled(false);
                mnuTansfers.setEnabled(false);
                mnuDeceasedRecord.setEnabled(false);
                mnuGroups.setEnabled(false);
                mnuCommittees.setEnabled(false);
                mnuContributions.setEnabled(false);
                mnuSacraments.setEnabled(false);
                mnuAccounts.setEnabled(false);
                mnuInventory.setEnabled(false);
                ParishDetails.getObj().setVisible(true);
            }
            pst.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e,"loadParishDetails() Exception",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        loadParishDetails();
    }//GEN-LAST:event_formWindowOpened

    private void mnuFamiliesListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFamiliesListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuFamiliesListActionPerformed

    private void mnuZoneMembersListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuZoneMembersListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuZoneMembersListActionPerformed

    private void mnuManageParishInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuManageParishInfoMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_mnuManageParishInfoMouseClicked

    private void mnuManageParishInfoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnuManageParishInfoMousePressed
        // TODO add your handling code here:
        ParishDetails.getObj().setVisible(true);
    }//GEN-LAST:event_mnuManageParishInfoMousePressed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator13;
    private javax.swing.JPopupMenu.Separator jSeparator14;
    private javax.swing.JPopupMenu.Separator jSeparator15;
    private javax.swing.JPopupMenu.Separator jSeparator16;
    private javax.swing.JPopupMenu.Separator jSeparator17;
    private javax.swing.JPopupMenu.Separator jSeparator18;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    private javax.swing.JMenuItem mnuAboutDeveloper;
    private javax.swing.JMenuItem mnuAboutProjParish;
    private javax.swing.JMenu mnuAccounts;
    private javax.swing.JMenuItem mnuAllotClass;
    private javax.swing.JMenuItem mnuAnointingOfSick;
    private javax.swing.JMenuItem mnuBaptism;
    private javax.swing.JMenu mnuCatechism;
    private javax.swing.JMenu mnuCommittees;
    private javax.swing.JMenuItem mnuConfession;
    private javax.swing.JMenuItem mnuConfirmation;
    private javax.swing.JMenu mnuContributions;
    private javax.swing.JMenu mnuDeceasedRecord;
    private javax.swing.JMenuItem mnuEucharist;
    private javax.swing.JMenuItem mnuExamResult;
    private javax.swing.JMenuItem mnuFamiliesList;
    private javax.swing.JMenu mnuGroups;
    private javax.swing.JMenu mnuHelp;
    private javax.swing.JMenuItem mnuHolyOrders;
    private javax.swing.JMenu mnuInventory;
    private javax.swing.JMenuItem mnuManageCommitteeMembers;
    private javax.swing.JMenuItem mnuManageCommittees;
    private javax.swing.JMenuItem mnuManageContri;
    private javax.swing.JMenuItem mnuManageContriType;
    private javax.swing.JMenuItem mnuManageFamilies;
    private javax.swing.JMenuItem mnuManageParishInfo;
    private javax.swing.JMenuItem mnuManagePiousGroups;
    private javax.swing.JMenuItem mnuManageStudents;
    private javax.swing.JMenuItem mnuManageVolunteerGroups;
    private javax.swing.JMenuItem mnuManageVolunteers;
    private javax.swing.JMenuItem mnuManageZones;
    private javax.swing.JMenuItem mnuMatrimony;
    private javax.swing.JMenu mnuParishDetails;
    private javax.swing.JMenuItem mnuParishionerTransIN;
    private javax.swing.JMenuItem mnuParishionerTransOUT;
    private javax.swing.JMenu mnuParishioners;
    private javax.swing.JMenuItem mnuPriestTransIN;
    private javax.swing.JMenuItem mnuPriestTransOUT;
    private javax.swing.JMenu mnuSacraments;
    private javax.swing.JMenu mnuTansfers;
    private javax.swing.JMenu mnuZoneDivisions;
    private javax.swing.JMenuItem mnuZoneMembersList;
    // End of variables declaration//GEN-END:variables
}