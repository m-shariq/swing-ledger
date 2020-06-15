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


public class party_Group extends javax.swing.JFrame {
PreparedStatement pst;
ResultSet rs;
Connection cnx;
int set =0;

    /**
     * Creates new form item_Group
     */
    public party_Group() {
        initComponents();
        setTitle("Parties");
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
        textField_cell = new java.awt.TextField();
        jLabel6 = new javax.swing.JLabel();
        textField_address = new java.awt.TextField();
        jLabel8 = new javax.swing.JLabel();
        textField_id = new java.awt.TextField();
        jLabel_city = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        textField_phone = new java.awt.TextField();
        textField_city = new java.awt.TextField();
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
        jLabel3.setText("       Party Name");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 490, 140, 30);

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
        textField_party.setBounds(170, 490, 530, 30);

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
        edit.setBounds(850, 490, 120, 50);

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
        remove.setBounds(710, 550, 260, 40);

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
        add.setBounds(710, 490, 120, 50);

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
        close.setBounds(710, 600, 260, 40);

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 970, 410);

        textField_cell.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_cellMouseClicked(evt);
            }
        });
        textField_cell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_cellActionPerformed(evt);
            }
        });
        textField_cell.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_cellKeyPressed(evt);
            }
        });
        jPanel2.add(textField_cell);
        textField_cell.setBounds(520, 610, 180, 30);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("              ID");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 450, 140, 30);

        textField_address.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_addressMouseClicked(evt);
            }
        });
        textField_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_addressActionPerformed(evt);
            }
        });
        textField_address.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textField_addressTextValueChanged(evt);
            }
        });
        textField_address.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_addressKeyPressed(evt);
            }
        });
        jPanel2.add(textField_address);
        textField_address.setBounds(170, 530, 530, 30);

        jLabel8.setBackground(new java.awt.Color(204, 204, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("          Address");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 530, 140, 30);

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
        textField_id.setBounds(170, 450, 190, 30);

        jLabel_city.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_city.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel_city.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_city.setOpaque(true);
        jPanel2.add(jLabel_city);
        jLabel_city.setBounds(370, 570, 330, 30);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("        Phone No.");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 610, 140, 30);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("           Cell No.");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12);
        jLabel12.setBounds(370, 610, 140, 30);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("             City");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 570, 140, 30);

        textField_phone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_phoneMouseClicked(evt);
            }
        });
        textField_phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_phoneActionPerformed(evt);
            }
        });
        textField_phone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_phoneKeyPressed(evt);
            }
        });
        jPanel2.add(textField_phone);
        textField_phone.setBounds(170, 610, 190, 30);

        textField_city.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textField_cityMouseClicked(evt);
            }
        });
        textField_city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField_cityActionPerformed(evt);
            }
        });
        textField_city.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textField_cityKeyPressed(evt);
            }
        });
        jPanel2.add(textField_city);
        textField_city.setBounds(170, 570, 190, 30);

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 440, 970, 210);

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
        String cell = textField_cell.getText();
        String address = textField_address.getText();
        String phone = textField_phone.getText();
        String city=textField_city.getText();
        P_Class type = new P_Class(id,party,address,city,phone,cell);
        
         if((!party.trim().equals(""))&&(!cell.trim().equals(""))&&(!address.trim().equals(""))&&(!phone.trim().equals(""))&&(!city.trim().equals(""))){
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
        
        P_Class type = new P_Class(id,"","","","","");
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
        String cell = textField_cell.getText();
        String address = textField_address.getText();
        String phone = textField_phone.getText();
        String city=textField_city.getText();
        P_Class type = new P_Class(0,party,address,city,phone,cell);
        
        if((!party.trim().equals(""))&&(!cell.trim().equals(""))&&(!address.trim().equals(""))&&(!phone.trim().equals(""))&&(!city.trim().equals(""))){
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

    private void textField_cellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_cellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_cellActionPerformed

    private void textField_cellKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_cellKeyPressed
       String number = textField_cell.getText();
        int length = number.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){        
            if(length<17){
                    textField_cell.setEditable(true);
            }
            else
                textField_cell.setEditable(false);
        }
        else
        {
            if((evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE)||(evt.getExtendedKeyCode()==KeyEvent.VK_DELETE))
                 textField_cell.setEditable(true);
            else
                 textField_cell.setEditable(false);
        }
    }//GEN-LAST:event_textField_cellKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if(set==0){
            try{
           
        DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
        int selectedRowIndex = (jTable1).getSelectedRow();
        textField_cell.setText(model.getValueAt(selectedRowIndex,2).toString());
        textField_party.setText(model.getValueAt(selectedRowIndex,1).toString());
        textField_address.setText(model.getValueAt(selectedRowIndex,3).toString());
        textField_id.setText(model.getValueAt(selectedRowIndex,0).toString());
        textField_city.setText(model.getValueAt(selectedRowIndex,4).toString());
        textField_phone.setText(model.getValueAt(selectedRowIndex,5).toString());
        updatetable();
       }
       catch(Exception e){
       
       }
            }
        if(set==1){    
        try{
           
        DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
        int selectedRowIndex = (jTable1).getSelectedRow();
        textField_city.setText(model.getValueAt(selectedRowIndex,1).toString());
        jLabel_city.setText(model.getValueAt(selectedRowIndex,0).toString());
        updatetable();
       }
       catch(Exception e){   
       }
 }
 
    }//GEN-LAST:event_jTable1MouseClicked

    private void textField_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_addressActionPerformed

    private void textField_addressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_addressKeyPressed
       
    }//GEN-LAST:event_textField_addressKeyPressed

    private void textField_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_idActionPerformed

    private void textField_idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_idKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_idKeyPressed

    private void textField_addressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_addressMouseClicked
      set=0;
      updatetable();       
    }//GEN-LAST:event_textField_addressMouseClicked

    private void textField_cellMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_cellMouseClicked
    set=0;
    updatetable(); 
    }//GEN-LAST:event_textField_cellMouseClicked

    private void textField_idMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_idMouseClicked
       set=0;
        updatetable();
    }//GEN-LAST:event_textField_idMouseClicked

    private void textField_partyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_partyMouseClicked
        set=0;
        updatetable();
    }//GEN-LAST:event_textField_partyMouseClicked

    private void textField_addressTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textField_addressTextValueChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_addressTextValueChanged

    private void textField_phoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_phoneMouseClicked
        set=0;
        updatetable();
    }//GEN-LAST:event_textField_phoneMouseClicked

    private void textField_phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_phoneActionPerformed
        
    }//GEN-LAST:event_textField_phoneActionPerformed

    private void textField_phoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_phoneKeyPressed
        String number = textField_phone.getText();
        int length = number.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){        
            if(length<17){
                    textField_phone.setEditable(true);
            }
            else
                textField_phone.setEditable(false);
        }
        else
        {
            if((evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE)||(evt.getExtendedKeyCode()==KeyEvent.VK_DELETE))
                 textField_phone.setEditable(true);
            else
                 textField_phone.setEditable(false);
        }
    }//GEN-LAST:event_textField_phoneKeyPressed

    private void textField_cityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textField_cityMouseClicked
        set=1;
        updatetable();
    }//GEN-LAST:event_textField_cityMouseClicked

    private void textField_cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textField_cityActionPerformed

    private void textField_cityKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField_cityKeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_SPACE)
        {        
            set=1;
            updatetable();
        }
    }//GEN-LAST:event_textField_cityKeyPressed
 private void updatetable(){
 
 if(set==0){
    try {
        
        String sql = "SELECT * FROM `party_group`";
        pst=CONNECTION.getConnection().prepareStatement(sql);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(null, ex);
    }}
    if(set==1){
        
            try {        
        String sql = "SELECT * FROM `city_group`";
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
            java.util.logging.Logger.getLogger(party_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(party_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(party_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(party_Group.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new party_Group().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton close;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_city;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton remove;
    private java.awt.TextField textField_address;
    private java.awt.TextField textField_cell;
    private java.awt.TextField textField_city;
    private java.awt.TextField textField_id;
    private java.awt.TextField textField_party;
    private java.awt.TextField textField_phone;
    // End of variables declaration//GEN-END:variables
}
