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


public class party_rate_Group extends javax.swing.JFrame {
PreparedStatement pst;
ResultSet rs;
Connection cnx;
int set =0;

    /**
     * Creates new form item_Group
     */
    public party_rate_Group() {
        initComponents();
        setTitle("Party Rate List");
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
        textField_party = new java.awt.TextField();
        edit = new javax.swing.JButton();
        remove = new javax.swing.JButton();
        add = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        textField_id = new java.awt.TextField();
        jLabel_ac = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textField_price = new java.awt.TextField();
        textField_product = new java.awt.TextField();
        jLabel_product = new javax.swing.JLabel();
        jLabel_party = new javax.swing.JLabel();
        jLabel_city3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel_city1 = new javax.swing.JLabel();
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
        jLabel3.setText("       Party Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 510, 140, 30);

        textField_party.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_partyMouseClicked(evt);
            }
        });
        textField_party.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_partyActionPerformed(evt);
            }
        });
        textField_party.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_partyKeyPressed(evt);
            }
        });
        jPanel2.add(textField_party);
        textField_party.setBounds(170, 510, 200, 30);

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
        edit.setBounds(850, 470, 120, 50);

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
        remove.setBounds(710, 530, 260, 40);

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
        add.setBounds(710, 470, 120, 50);

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
        close.setBounds(710, 580, 260, 40);

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 970, 410);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("              ID");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 470, 140, 30);

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
        textField_id.setBounds(170, 470, 190, 30);

        jLabel_ac.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_ac.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_ac.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_ac.setText(" ");
        jLabel_ac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_ac.setOpaque(true);
        jPanel2.add(jLabel_ac);
        jLabel_ac.setBounds(510, 590, 190, 30);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("            Price");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 590, 140, 30);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("         Product");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 550, 140, 30);

        textField_price.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_priceMouseClicked(evt);
            }
        });
        textField_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_priceActionPerformed(evt);
            }
        });
        textField_price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_priceKeyPressed(evt);
            }
        });
        jPanel2.add(textField_price);
        textField_price.setBounds(170, 590, 190, 30);

        textField_product.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_productMouseClicked(evt);
            }
        });
        textField_product.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_productActionPerformed(evt);
            }
        });
        textField_product.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_productKeyPressed(evt);
            }
        });
        jPanel2.add(textField_product);
        textField_product.setBounds(170, 550, 200, 30);

        jLabel_product.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_product.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_product.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_product.setOpaque(true);
        jPanel2.add(jLabel_product);
        jLabel_product.setBounds(370, 550, 330, 30);

        jLabel_party.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_party.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_party.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_party.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_party.setOpaque(true);
        jPanel2.add(jLabel_party);
        jLabel_party.setBounds(370, 510, 330, 30);

        jLabel_city3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_city3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_city3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_city3.setOpaque(true);
        jPanel2.add(jLabel_city3);
        jLabel_city3.setBounds(370, 470, 330, 30);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 450, 970, 190);

        jLabel_city1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_city1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_city1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_city1.setOpaque(true);
        jPanel2.add(jLabel_city1);
        jLabel_city1.setBounds(370, 590, 130, 30);

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

    private void textField_partyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_partyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_partyActionPerformed

    private void textField_partyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_partyKeyPressed
  if(evt.getKeyCode()==KeyEvent.VK_SPACE)
        {        
            set=1;
            updatetable();
        }        
    }//GEN-LAST:event_textField_partyKeyPressed

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
        String party = textField_party.getText();
        String price = textField_price.getText();
        String product=textField_product.getText();
        String code=jLabel_party.getText();
        String ac=jLabel_ac.getText();
        R_Class type = new R_Class(id,party,product,price,code,ac);
        
        if((!party.trim().equals(""))&&(!price.trim().equals(""))&&(!product.trim().equals(""))){
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
        
        R_Class type = new R_Class(id,"","","","","");
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
        String party = textField_party.getText();
        String price = textField_price.getText();
        String product=textField_product.getText();
       String code=jLabel_party.getText();
        String ac=jLabel_ac.getText();
        R_Class type = new R_Class(0,party,product,price,code,ac);
        
        if((!party.trim().equals(""))&&(!price.trim().equals(""))&&(!product.trim().equals(""))){
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

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(set==0){
            try{
           
        DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
        int selectedRowIndex = (jTable1).getSelectedRow();
        jLabel_party.setText(model.getValueAt(selectedRowIndex,2).toString());
        textField_party.setText(model.getValueAt(selectedRowIndex,1).toString());
        jLabel_ac.setText(model.getValueAt(selectedRowIndex,4).toString());
        textField_id.setText(model.getValueAt(selectedRowIndex,0).toString());
        textField_product.setText(model.getValueAt(selectedRowIndex,3).toString());
        textField_price.setText(model.getValueAt(selectedRowIndex,5).toString());
        updatetable();
       }
       catch(Exception e){
       
       }
            }
        if(set==1){    
        try{
           
        DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
        int selectedRowIndex = (jTable1).getSelectedRow();
        textField_party.setText(model.getValueAt(selectedRowIndex,1).toString());
        jLabel_party.setText(model.getValueAt(selectedRowIndex,0).toString());
        
        
        updatetable();
       }
       catch(Exception e){   
       }
 }
        if(set==2){    
        try{
           
        DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
        int selectedRowIndex = (jTable1).getSelectedRow();
        textField_product.setText(model.getValueAt(selectedRowIndex,1).toString());
        jLabel_product.setText(model.getValueAt(selectedRowIndex,0).toString());
        jLabel_ac.setText(model.getValueAt(selectedRowIndex,2).toString());
        updatetable();
       }
       catch(Exception e){   
       }
 }
 
    }//GEN-LAST:event_jTable1MouseClicked

    private void textField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_idActionPerformed

    private void textField_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_idKeyPressed
        set=0;
        updatetable();
    }//GEN-LAST:event_textField_idKeyPressed

    private void textField_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_idMouseClicked
       set=0;
        updatetable();
    }//GEN-LAST:event_textField_idMouseClicked

    private void textField_partyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_partyMouseClicked
        set=1;
        updatetable();
    }//GEN-LAST:event_textField_partyMouseClicked

    private void textField_priceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_priceMouseClicked
        set=0;
        updatetable();
    }//GEN-LAST:event_textField_priceMouseClicked

    private void textField_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_priceActionPerformed
        
    }//GEN-LAST:event_textField_priceActionPerformed

    private void textField_priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_priceKeyPressed
        String number = textField_price.getText();
        int length = number.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){        
            if(length<20){
                    textField_price.setEditable(true);
            }
            else
                textField_price.setEditable(false);
        }
        else
        {
            if((evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE)||(evt.getExtendedKeyCode()==KeyEvent.VK_DELETE))
                 textField_price.setEditable(true);
            else
                 textField_price.setEditable(false);
        }
    }//GEN-LAST:event_textField_priceKeyPressed

    private void textField_productMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_productMouseClicked
        set=2;
        updatetable();
    }//GEN-LAST:event_textField_productMouseClicked

    private void textField_productActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_productActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_productActionPerformed

    private void textField_productKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_productKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_SPACE)
        {        
            set=2;
            updatetable();
        }
    }//GEN-LAST:event_textField_productKeyPressed
 private void updatetable(){
 
 if(set==0){
    try {
        
        String sql = "SELECT * FROM `party_rate_group`";
        pst=CONNECTION.getConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }}
    if(set==1){
        
            try {        
        String sql = "SELECT * FROM `party_group`";
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
        String sql = "SELECT * FROM `items`";
        pst=CONNECTION.getConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        } 
        catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
         }   
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
            java.util.logging.Logger.getLogger(party_rate_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(party_rate_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(party_rate_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(party_rate_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new party_rate_Group().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton close;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_ac;
    private javax.swing.JLabel jLabel_city1;
    private javax.swing.JLabel jLabel_city3;
    private javax.swing.JLabel jLabel_party;
    private javax.swing.JLabel jLabel_product;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton remove;
    private java.awt.TextField textField_id;
    private java.awt.TextField textField_party;
    private java.awt.TextField textField_price;
    private java.awt.TextField textField_product;
    // End of variables declaration//GEN-END:variables
}
