/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Users;
import Ledger.CONNECTION;
import Main.I_Class;
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

class user{
          private int id;
          private String username;
          private String pass;

    public String getPass() {
        return pass;
    }

        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }
          public user(int ID,String USER,String PASS)
          {
              this.id=ID;
              this.username=USER;
              this.pass=PASS;
          }
     }
//---------------------------------------------------------------------------//
public class Change_Credentials extends javax.swing.JFrame {
    PreparedStatement ps;
    int a;
    String b,c;
    
    
public boolean execTypeQuery(String queryType){
            if(queryType.equals("edit")){
            try {
               ps=CONNECTION.getConnection().prepareStatement("UPDATE `users` SET `username`=? WHERE `id`=?");
                  ps.setString(1, user_new.getText());
                 
                  ps.setInt(2, Integer.valueOf(id.getText()));
                 
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(I_Class.class.getName()).log(Level.SEVERE, null, ex);                
            }     
        }
            
            else if(queryType.equals("edit1"))
            {
                try {
               ps=CONNECTION.getConnection().prepareStatement("UPDATE `users` SET `password`=? WHERE `id`=?");
               String newpass=String.valueOf(Pass2.getPassword());
                  ps.setString(1, newpass);                 
                  ps.setInt(2, Integer.valueOf(id.getText()));
                 
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(I_Class.class.getName()).log(Level.SEVERE, null, ex);                
            }   
            }
                
        return false;
 }
//-----------------------------------------------------------------------------
    public Change_Credentials() {
        initComponents();
        setTitle("Change Credentials");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("NS.PNG")));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        populate();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        user_new = new javax.swing.JTextField();
        USER_BUTTON = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        PASS_BUTTON = new javax.swing.JButton();
        user_pass = new javax.swing.JPasswordField();
        Pass2 = new javax.swing.JPasswordField();
        Pass1 = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Pass3 = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Id", "Username"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 70, 380, 310);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("   CHANGE PASSWORD");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(580, 360, 282, 54);

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ID");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(60, 510, 170, 30);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel2.add(id);
        id.setBounds(260, 510, 150, 30);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(" NEW USERNAME");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(520, 170, 200, 24);

        user_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_newActionPerformed(evt);
            }
        });
        jPanel2.add(user_new);
        user_new.setBounds(760, 170, 150, 24);

        USER_BUTTON.setBackground(new java.awt.Color(153, 153, 153));
        USER_BUTTON.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        USER_BUTTON.setText("CONFIRM");
        USER_BUTTON.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        USER_BUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                USER_BUTTONMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                USER_BUTTONMouseEntered(evt);
            }
        });
        USER_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USER_BUTTONActionPerformed(evt);
            }
        });
        jPanel2.add(USER_BUTTON);
        USER_BUTTON.setBounds(600, 250, 230, 50);

        jLabel8.setBackground(new java.awt.Color(153, 153, 153));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PASSWORD");
        jLabel8.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel8.setOpaque(true);
        jPanel2.add(jLabel8);
        jLabel8.setBounds(520, 210, 200, 21);

        jLabel9.setBackground(new java.awt.Color(153, 153, 153));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText(" NEW PASSWORD");
        jLabel9.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(520, 490, 200, 21);

        jLabel10.setBackground(new java.awt.Color(153, 153, 153));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText(" CONFIRM NEW PASSWORD ");
        jLabel10.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10);
        jLabel10.setBounds(520, 520, 200, 20);

        PASS_BUTTON.setBackground(new java.awt.Color(153, 153, 153));
        PASS_BUTTON.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        PASS_BUTTON.setText("CONFIRM");
        PASS_BUTTON.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PASS_BUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PASS_BUTTONMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PASS_BUTTONMouseEntered(evt);
            }
        });
        PASS_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASS_BUTTONActionPerformed(evt);
            }
        });
        jPanel2.add(PASS_BUTTON);
        PASS_BUTTON.setBounds(600, 560, 230, 51);

        user_pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_passActionPerformed(evt);
            }
        });
        jPanel2.add(user_pass);
        user_pass.setBounds(760, 210, 150, 20);
        jPanel2.add(Pass2);
        Pass2.setBounds(760, 490, 150, 20);
        jPanel2.add(Pass1);
        Pass1.setBounds(760, 520, 150, 20);

        jLabel11.setBackground(new java.awt.Color(153, 153, 153));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setText("   CHANGE USERNAME");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11);
        jLabel11.setBounds(580, 50, 282, 54);

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 20, 460, 400);

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel6);
        jLabel6.setBounds(480, 20, 470, 290);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("TYPE ID of the user you want to change the credentials");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel12);
        jLabel12.setBounds(10, 440, 460, 40);

        jLabel13.setBackground(new java.awt.Color(153, 153, 153));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText(" OLD PASSWORD");
        jLabel13.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13);
        jLabel13.setBounds(520, 440, 200, 21);

        Pass3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pass3ActionPerformed(evt);
            }
        });
        jPanel2.add(Pass3);
        Pass3.setBounds(760, 440, 150, 20);

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel14);
        jLabel14.setBounds(480, 330, 470, 300);

        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel2.add(user);
        user.setBounds(760, 130, 150, 24);

        jLabel15.setBackground(new java.awt.Color(153, 153, 153));
        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("OLD USERNAME");
        jLabel15.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel15.setOpaque(true);
        jPanel2.add(jLabel15);
        jLabel15.setBounds(520, 130, 200, 24);

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
        close.setBounds(90, 580, 260, 40);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(11, 12, 992, 670);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\shari\\OneDrive\\Desktop\\LEDGER_PICS\\NS_LOGO.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1080, 50, 200, 170);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("A PROJECT BY");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1110, 30, 180, 30);

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

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed

    }//GEN-LAST:event_idActionPerformed

    private void user_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_newActionPerformed

    }//GEN-LAST:event_user_newActionPerformed
static ArrayList<user> setUsers()
    {
        ArrayList<user> use= new ArrayList<user>();
        
         try{
                PreparedStatement pst;
                ResultSet rs;
                String query = "SELECT * FROM `users`";
                pst=CONNECTION.getConnection().prepareStatement(query);
                rs=pst.executeQuery();
                user u;
        while(rs.next())
        {
                u= new user(rs.getInt("id"),rs.getString("username"),rs.getString("password"));
                use.add(u);
            
        }        
        }
        catch(Exception e)
        {
        }
     return use;
    }
//-----------------------------------------------------------------------------
    private void USER_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USER_BUTTONActionPerformed
                
            try{  
        int ids = Integer.valueOf(id.getText());
        String username = user.getText();
        String username1=user_new.getText();
        String password= String.valueOf(user_pass.getPassword());
        
        ArrayList<user> use= new ArrayList<user>();
                
                Object[] data=new Object[3];
                for(int i=0;i<setUsers().size();i++)
                {
                        data[0]=setUsers().get(i).getId();
                        data[1]=setUsers().get(i).getUsername();
                        data[2]=setUsers().get(i).getPass();
                        if(ids==(int)data[0])
                        {
                            a=(int)data[0];
                            b=(String)data[1];
                            c=(String)data[2];
                            break;                            
                        }                
                }
        try{           
               
                if((!id.getText().trim().equals(""))&&(!username.trim().equals(""))&&(!password.trim().equals(""))&&(!username1.trim().equals(""))){
                if((ids==a)&&(username.equals(b))&&(password.equals(c)))
                {                   
                         
                        if(execTypeQuery("edit"))
                        {        
                          JOptionPane.showMessageDialog(null,"Username Changed!", "Change Credentials", 2);  
                        populate();
                       
                        }            
               }
                 else
                    JOptionPane.showMessageDialog(null,"Write in the correct Information", "Change Credentials", 2);
                }
                else
                    JOptionPane.showMessageDialog(null,"Fill The Appropiate Fields", "Change Credentials", 2);          
        }
        catch(Exception e)
        {
        }    
         }
        catch(Exception e)
        {
        }     
        
    }//GEN-LAST:event_USER_BUTTONActionPerformed

    private void PASS_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASS_BUTTONActionPerformed
       try{  
        int ids = Integer.valueOf(id.getText());
        String oldpass = String.valueOf(Pass3.getPassword());
        String newpass=String.valueOf(Pass2.getPassword());
        String newpass1= String.valueOf(Pass1.getPassword());
        
        ArrayList<user> use= new ArrayList<user>();
                
                Object[] data=new Object[3];
                for(int i=0;i<setUsers().size();i++)
                {
                        data[0]=setUsers().get(i).getId();
                        data[1]=setUsers().get(i).getId();
                        data[2]=setUsers().get(i).getPass();
                        if(ids==(int)data[0])
                        {
                            a=(int)data[0];
                            b=(String)data[2];
                            break;                            
                        }                
                }
        try{           
               
                if((!id.getText().trim().equals(""))&&(!oldpass.trim().equals(""))&&(!newpass.trim().equals(""))&&(!newpass1.trim().equals(""))){
                if((ids==a)&&(oldpass.equals(b)))
                {
                    if(newpass.equals(newpass1)){
                         
                        if(execTypeQuery("edit1"))
                        {                             
                        populate();
                         JOptionPane.showMessageDialog(null,"Password Changed!", "Change Credentials", 1);
                        } 
                    }
                    else
                        JOptionPane.showMessageDialog(null,"Write in same new Password", "Change Credentials", 2);
               }
                 else
                    JOptionPane.showMessageDialog(null,"Write in the correct Information", "Change Credentials", 2);
                }
                else
                    JOptionPane.showMessageDialog(null,"Fill The Appropiate Fields", "Change Credentials", 2);          
        }
        catch(Exception e)
        {
        }    
         }
        catch(Exception e)
        {
        }

    }//GEN-LAST:event_PASS_BUTTONActionPerformed

    private void user_passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_passActionPerformed

    private void Pass3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pass3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Pass3ActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{
           
        DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
        int selectedRowIndex = (jTable1).getSelectedRow();
        id.setText(model.getValueAt(selectedRowIndex,0).toString());
        user.setText(model.getValueAt(selectedRowIndex,1).toString());
        populate();
       }
       catch(Exception e){
       
       }
    }//GEN-LAST:event_jTable1MouseClicked

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

    private void USER_BUTTONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USER_BUTTONMouseEntered
         USER_BUTTON.setBackground(Color.white);
       USER_BUTTON.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_USER_BUTTONMouseEntered

    private void USER_BUTTONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_USER_BUTTONMouseExited
        USER_BUTTON.setForeground(Color.black);
        USER_BUTTON.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_USER_BUTTONMouseExited

    private void PASS_BUTTONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PASS_BUTTONMouseEntered
       PASS_BUTTON.setBackground(Color.white);
       PASS_BUTTON.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_PASS_BUTTONMouseEntered

    private void PASS_BUTTONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PASS_BUTTONMouseExited
       PASS_BUTTON.setForeground(Color.black);
       PASS_BUTTON.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_PASS_BUTTONMouseExited

   
    static ArrayList<user> getUsers()
    {
        ArrayList<user> use= new ArrayList<user>();
        
         try{
                PreparedStatement pst;
                ResultSet rs;
                String query = "SELECT * FROM `users`";
                pst=CONNECTION.getConnection().prepareStatement(query);
                rs=pst.executeQuery();
                user u;
        while(rs.next())
        {
                u= new user(rs.getInt("id"),rs.getString("username"),"");
                use.add(u);
            
        }        
        }
        catch(Exception e)
        {
        }
     return use;
    } 
    
    public void populate(){
    DefaultTableModel model=new DefaultTableModel();
    Object[] coloumnsName=new Object[2];
    
    coloumnsName[0]="ID";
    coloumnsName[1]="Username";
    
    model.setColumnIdentifiers(coloumnsName);
    Object[] rowData=new Object[2];
    for(int i=0;i<getUsers().size();i++)
    {
        rowData[0]=getUsers().get(i).getId();
        rowData[1]=getUsers().get(i).getUsername();
        model.addRow(rowData);
        
    }
    jTable1.setModel(model);
    }
    
    
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {                
                new Change_Credentials().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PASS_BUTTON;
    private javax.swing.JPasswordField Pass1;
    private javax.swing.JPasswordField Pass2;
    private javax.swing.JPasswordField Pass3;
    private javax.swing.JButton USER_BUTTON;
    private javax.swing.JButton close;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField user;
    private javax.swing.JTextField user_new;
    private javax.swing.JPasswordField user_pass;
    // End of variables declaration//GEN-END:variables
}
