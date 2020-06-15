package Main;

import Ledger.CONNECTION;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;


public class Items1 extends javax.swing.JFrame {
PreparedStatement pst;
ResultSet rs;
Connection cnx;
int set =0;

    /**
     * Creates new form item_Group
     */
    public Items1() {
        initComponents();
        setTitle("Items");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("NS.PNG")));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        updatetable();
    }

    
    
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
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel_id = new javax.swing.JLabel();
        textField_AC = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        textField_item = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        textField_id = new java.awt.TextField();
        jLabel_item = new javax.swing.JLabel();
        jLabel_ac = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
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
        jLabel3.setBounds(60, 470, 140, 30);

        textField_description.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_descriptionMouseClicked(evt);
            }
        });
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
        textField_description.setBounds(210, 470, 440, 30);

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
        edit.setBounds(810, 430, 120, 50);

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
        remove.setBounds(670, 490, 260, 40);

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
        add.setBounds(670, 430, 120, 50);

        close.setBackground(new java.awt.Color(153, 153, 153));
        close.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        close.setText("Close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
        });
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        jPanel2.add(close);
        close.setBounds(670, 540, 260, 40);

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(50, 30, 890, 380);

        jLabel_id.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_id.setOpaque(true);
        jPanel2.add(jLabel_id);
        jLabel_id.setBounds(380, 430, 270, 30);

        textField_AC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_ACMouseClicked(evt);
            }
        });
        textField_AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_ACActionPerformed(evt);
            }
        });
        textField_AC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_ACKeyPressed(evt);
            }
        });
        jPanel2.add(textField_AC);
        textField_AC.setBounds(210, 550, 160, 30);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("              ID");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(60, 430, 140, 30);

        textField_item.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_itemMouseClicked(evt);
            }
        });
        textField_item.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_itemActionPerformed(evt);
            }
        });
        textField_item.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField_itemTextValueChanged(evt);
            }
        });
        textField_item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_itemKeyPressed(evt);
            }
        });
        jPanel2.add(textField_item);
        textField_item.setBounds(210, 510, 160, 30);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("       Item Group");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(60, 510, 140, 30);

        textField_id.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_idMouseClicked(evt);
            }
        });
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
        textField_id.setBounds(210, 430, 160, 30);

        jLabel_item.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_item.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_item.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_item.setOpaque(true);
        jPanel2.add(jLabel_item);
        jLabel_item.setBounds(380, 510, 270, 30);

        jLabel_ac.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_ac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_ac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_ac.setOpaque(true);
        jPanel2.add(jLabel_ac);
        jLabel_ac.setBounds(380, 550, 270, 30);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("           AC Unit");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11);
        jLabel11.setBounds(60, 550, 140, 30);

        jLabel1.setText("jLabel1");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 420, 890, 170);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(11, 12, 992, 670);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\shari\\OneDrive\\Desktop\\LEDGER_PICS\\LEDGER_NS.PNG")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1050, 30, 230, 190);

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
set=0;
updatetable();
        try{
            int id = Integer.valueOf(textField_id.getText());
        String description = textField_description.getText();
        String ac = textField_AC.getText();
        String item = textField_item.getText();
        I_Class type = new I_Class(id,description,ac,item);
        
        if((!ac.trim().equals(""))&&(!description.trim().equals(""))&&(!item.trim().equals(""))){
        if(type.execTypeQuery("edit",type)){
            JOptionPane.showMessageDialog(null,"Description Edited!", "Edit Description", 2);
            set=0;
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
     updatetable();
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
set=0;
updatetable();
        try{
        int id = Integer.valueOf(textField_id.getText());
        
        I_Class type = new I_Class(id,"","","");
        if(!textField_id.getText().trim().equals("")){
        if(type.execTypeQuery("remove",type)){
            JOptionPane.showMessageDialog(null,"Description Removed!", "Remove Description", 1);
            set=0;
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
        updatetable();
    }//GEN-LAST:event_removeActionPerformed

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setForeground(Color.black);
        close.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_closeMouseExited

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(Color.white);
        close.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_closeMouseEntered

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
           this.dispose();
        
    }//GEN-LAST:event_closeActionPerformed

    private void addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseExited
        add.setForeground(Color.black);
        add.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_addMouseExited

    private void addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseEntered
        add.setBackground(Color.white);
        add.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_addMouseEntered

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        
        set=0;
        updatetable();
        String description = textField_description.getText();
        String ac = textField_AC.getText();
        String item = textField_item.getText();
        I_Class type = new I_Class(0,description,ac,item);
        
        
        if((!description.trim().equals(""))&&(!ac.trim().equals(""))&&(!item.trim().equals(""))){
        if(type.execTypeQuery("add",type)){
            JOptionPane.showMessageDialog(null,"New Description Added!", "Add Description", 1);
            set=0;
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
        updatetable();
    }//GEN-LAST:event_addActionPerformed

    private void textField_ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_ACActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_ACActionPerformed

    private void textField_ACKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_ACKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_SPACE)
        {          
            set=2;
            updatetable();
                   
           
        }
    }//GEN-LAST:event_textField_ACKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(set==0){
            try{
           
        DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
        int selectedRowIndex = (jTable1).getSelectedRow();
        textField_AC.setText(model.getValueAt(selectedRowIndex,2).toString());
        textField_description.setText(model.getValueAt(selectedRowIndex,1).toString());
        textField_item.setText(model.getValueAt(selectedRowIndex,3).toString());
        textField_id.setText(model.getValueAt(selectedRowIndex,0).toString());
        updatetable();
       }
       catch(Exception e){
       
       }
            }
        if(set==1){    
        try{
           
        DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
        int selectedRowIndex = (jTable1).getSelectedRow();
        textField_item.setText(model.getValueAt(selectedRowIndex,1).toString());
        jLabel_item.setText(model.getValueAt(selectedRowIndex,0).toString());
        updatetable();
       }
       catch(Exception e){   
       }
 }
 else if(set==2){
        try{
           
        DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
        int selectedRowIndex = (jTable1).getSelectedRow();
        textField_AC.setText(model.getValueAt(selectedRowIndex,1).toString());
        jLabel_ac.setText(model.getValueAt(selectedRowIndex,0).toString());
       }
       catch(Exception e){
       }
        set=0;
 }
    }//GEN-LAST:event_jTable1MouseClicked

    private void textField_itemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_itemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_itemActionPerformed

    private void textField_itemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_itemKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_SPACE)
        {        
            set=1;
            updatetable();
        }
    }//GEN-LAST:event_textField_itemKeyPressed

    private void textField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_idActionPerformed

    private void textField_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_idKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_idKeyPressed

    private void textField_itemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_itemMouseClicked
      set=1;
      updatetable();       
    }//GEN-LAST:event_textField_itemMouseClicked

    private void textField_ACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_ACMouseClicked
    set=2;
    updatetable(); 
    }//GEN-LAST:event_textField_ACMouseClicked

    private void textField_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_idMouseClicked
       set=0;
        updatetable();
    }//GEN-LAST:event_textField_idMouseClicked

    private void textField_descriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_descriptionMouseClicked
        set=0;
        updatetable();
    }//GEN-LAST:event_textField_descriptionMouseClicked

    private void textField_itemTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField_itemTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_itemTextValueChanged
 private void updatetable(){
 
 
    try {
        
        String sql = "SELECT * FROM `items`";
        pst=CONNECTION.getConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
    if(set==1){
        
            try {        
        String sql = "SELECT * FROM `item_group`";
        pst=CONNECTION.getConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } 
        catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
         }   
    }
    if(set==2){
     try {        
        String sql = "SELECT * FROM `ac_group`";
        pst=CONNECTION.getConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } 
        catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
            }   }
 
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
            java.util.logging.Logger.getLogger(Items1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Items1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Items1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Items1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Items1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton close;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_ac;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_item;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton remove;
    private java.awt.TextField textField_AC;
    private java.awt.TextField textField_description;
    private java.awt.TextField textField_id;
    private java.awt.TextField textField_item;
    // End of variables declaration//GEN-END:variables
}
