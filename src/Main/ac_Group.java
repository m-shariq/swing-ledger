/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Ledger.CONNECTION;
import Ledger.CONNECTION;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import net.proteanit.sql.Dbutils;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import ledger.CONNECTION;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author shari
 */
public class ac_Group extends javax.swing.JFrame {
PreparedStatement pst;
ResultSet rs;
Connection cnx;

    /**
     * Creates new form item_Group
     */
    public ac_Group() {
        initComponents();
        setTitle("AC units");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("NS.PNG")));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        updatetable();
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
        jLabel3 = new javax.swing.JLabel();
        textField_description = new java.awt.TextField();
        edit = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        add = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        textField_id = new java.awt.TextField();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("       Description");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 140, 140, 30);

        textField_description.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_descriptionActionPerformed(evt);
            }
        });
        textField_description.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_descriptionKeyPressed(evt);
            }
        });
        jPanel2.add(textField_description);
        textField_description.setBounds(220, 140, 140, 30);

        edit.setBackground(new java.awt.Color(153, 153, 153));
        edit.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        edit.setText("Edit");
        edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                editMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                editMouseEntered(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel2.add(edit);
        edit.setBounds(200, 250, 120, 40);

        remove.setBackground(new java.awt.Color(153, 153, 153));
        remove.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        remove.setText("Remove");
        remove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeMouseEntered(evt);
            }
        });
        remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeActionPerformed(evt);
            }
        });
        jPanel2.add(remove);
        remove.setBounds(60, 310, 260, 40);

        add.setBackground(new java.awt.Color(153, 153, 153));
        add.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        add.setText("Add");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMouseEntered(evt);
            }
        });
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel2.add(add);
        add.setBounds(60, 250, 120, 40);

        refresh.setBackground(new java.awt.Color(153, 153, 153));
        refresh.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        refresh.setText("Close");
        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
        });
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });
        jPanel2.add(refresh);
        refresh.setBounds(60, 370, 260, 40);

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(490, 50, 452, 402);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("              ID");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(60, 100, 140, 30);

        textField_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_idActionPerformed(evt);
            }
        });
        textField_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_idKeyPressed(evt);
            }
        });
        jPanel2.add(textField_id);
        textField_id.setBounds(220, 100, 140, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(11, 12, 992, 670);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\shari\\OneDrive\\Desktop\\LEDGER_PICS\\LEDGER_NS.PNG")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1050, 30, 240, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1301, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 692, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textField_descriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_descriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_descriptionActionPerformed

    private void textField_descriptionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_descriptionKeyPressed
        
    }//GEN-LAST:event_textField_descriptionKeyPressed

    private void editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseExited
        edit.setForeground(Color.black);
        edit.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_editMouseExited

    private void editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseEntered
        edit.setBackground(Color.white);
        edit.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_editMouseEntered

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        
        try{
            int id = Integer.valueOf(textField_id.getText());
        String description = textField_description.getText();
        A_Group type = new A_Group(id,description);
        
        if(!description.trim().equals("")){
        if(type.execTypeQuery("edit",type)){
            JOptionPane.showMessageDialog(null,"Description Edited!", "Edit Description", 3);
            updatetable();
        }
        else{
            JOptionPane.showMessageDialog(null,"Operation Failed", "Edit Description", 2);
        }
        }
        else
        {
             JOptionPane.showMessageDialog(null,"Enter The Description", "Empty Description", 2);
        }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()+"Enter The valid ID", "Invalid ID", 0);
        }
     
    }//GEN-LAST:event_editActionPerformed

    private void removeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseExited
        remove.setForeground(Color.black);
        remove.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_removeMouseExited

    private void removeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeMouseEntered
        remove.setBackground(Color.white);
        remove.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_removeMouseEntered

    private void removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeActionPerformed
        try{
        int id = Integer.valueOf(textField_id.getText());
        
        A_Group type = new A_Group(id,"");
        if(!textField_id.getText().trim().equals("")){
        if(type.execTypeQuery("remove",type)){
            JOptionPane.showMessageDialog(null,"Description Removed!", "Remove Description", 1);
            updatetable();
        }
        else{
            JOptionPane.showMessageDialog(null,"Operation Failed", "Remove Description", 2);
        }
        }
        else
        {
             JOptionPane.showMessageDialog(null,"Enter The Description", "Empty Description", 2);
        }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex.getMessage()+"Enter The valid ID", "Invalid ID", 0);
        }
    }//GEN-LAST:event_removeActionPerformed

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh.setForeground(Color.black);
        refresh.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_refreshMouseExited

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh.setBackground(Color.white);
        refresh.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
           this.dispose();
        
    }//GEN-LAST:event_refreshActionPerformed

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setForeground(Color.black);
        add.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_addMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(Color.white);
        add.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_addMouseEntered

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed

        String description = textField_description.getText();
        A_Group type = new A_Group(0,description);
        
        if(!description.trim().equals("")){
        if(type.execTypeQuery("add",type)){
            JOptionPane.showMessageDialog(null,"New Description Added!", "Add Description", 1);
            updatetable();
        }
        else{
            JOptionPane.showMessageDialog(null,"Operation Failed", "Add Description", 2);
        }
        }
        else
        {
             JOptionPane.showMessageDialog(null,"Enter The Description", "Empty Description", 2);
        }
    }//GEN-LAST:event_addActionPerformed

    private void textField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_idActionPerformed

    private void textField_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_idKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_idKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        boolean a = jTable1.isEditing();
      
      if(a==false){
      JOptionPane.showMessageDialog(null, "Not Editable");
      }
    }//GEN-LAST:event_jTable1MouseClicked
 private void updatetable(){
 
 
    try {
        
        String sql = "SELECT * FROM `ac_group`";
        pst=CONNECTION.getConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
 
 
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
            java.util.logging.Logger.getLogger(ac_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ac_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ac_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ac_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ac_Group().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton refresh;
    private javax.swing.JButton remove;
    private java.awt.TextField textField_description;
    private java.awt.TextField textField_id;
    // End of variables declaration//GEN-END:variables
}
