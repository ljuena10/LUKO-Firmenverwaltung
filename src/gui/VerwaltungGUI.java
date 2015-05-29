/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.xml.parsers.ParserConfigurationException;
import xml.xmlCreator;

/**
 *
 * @author Enis Lushtaku
 */
public class VerwaltungGUI extends javax.swing.JFrame
{

    /**
     * Creates new form VerwaltungGUI
     */
    public VerwaltungGUI()
    {
        initComponents();
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paOben = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        paMitte = new javax.swing.JPanel();
        spMainPane = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        treeModule = new javax.swing.JTree();
        jPanel1 = new javax.swing.JPanel();
        btModulAdd = new javax.swing.JButton();
        btExportieren = new javax.swing.JButton();
        paLogo = new javax.swing.JPanel();
        laLogo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        paOben.setBackground(new java.awt.Color(255, 255, 255));
        paOben.setForeground(new java.awt.Color(255, 255, 255));
        paOben.setLayout(new java.awt.GridLayout(1, 2));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText(" LUKO Easy Access");
        jLabel1.setOpaque(true);
        paOben.add(jLabel1);

        getContentPane().add(paOben, java.awt.BorderLayout.PAGE_START);

        paMitte.setLayout(new java.awt.BorderLayout());

        spMainPane.setDividerLocation(300);
        spMainPane.setPreferredSize(new java.awt.Dimension(1300, 859));

        jPanel3.setLayout(new java.awt.BorderLayout());

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Module");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Kunden");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Mitarbeiter");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Bestellungen");
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Material");
        treeNode1.add(treeNode2);
        treeModule.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jScrollPane1.setViewportView(treeModule);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel1.setLayout(new java.awt.GridLayout(2, 0));

        btModulAdd.setText("Modul Hinzufügen & Importieren");
        btModulAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btModulAddActionPerformed(evt);
            }
        });
        jPanel1.add(btModulAdd);

        btExportieren.setText("Exportieren");
        btExportieren.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExportierenActionPerformed(evt);
            }
        });
        jPanel1.add(btExportieren);

        jPanel3.add(jPanel1, java.awt.BorderLayout.SOUTH);

        spMainPane.setLeftComponent(jPanel3);

        paLogo.setLayout(new java.awt.BorderLayout());

        laLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        laLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logos/verwaltungslogo.jpg"))); // NOI18N
        paLogo.add(laLogo, java.awt.BorderLayout.CENTER);

        spMainPane.setRightComponent(paLogo);

        paMitte.add(spMainPane, java.awt.BorderLayout.CENTER);

        getContentPane().add(paMitte, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btModulAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btModulAddActionPerformed
        
    }//GEN-LAST:event_btModulAddActionPerformed

    private void btExportierenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExportierenActionPerformed
        try {
            String [] moduls = treeModule.getSelectionPath().toString().split(",");
            String modulName = moduls[1].replace("]", "");
            xmlCreator.createXMLFile(modulName);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(VerwaltungGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btExportierenActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(VerwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(VerwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(VerwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(VerwaltungGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new VerwaltungGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExportieren;
    private javax.swing.JButton btModulAdd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel laLogo;
    private javax.swing.JPanel paLogo;
    private javax.swing.JPanel paMitte;
    private javax.swing.JPanel paOben;
    private javax.swing.JSplitPane spMainPane;
    private javax.swing.JTree treeModule;
    // End of variables declaration//GEN-END:variables
}
