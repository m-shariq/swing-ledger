package Ledger;

import java.awt.Color;
import java.awt.Toolkit;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Login_Window extends javax.swing.JFrame {

    public Login_Window() {
        initComponents();
        setTitle("Login Window");
        setIconImage();
        //setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        PASSWORD = new javax.swing.JPasswordField();
        USERNAME = new javax.swing.JTextField();
        LOGIN_BUTTON = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(153, 153, 153));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("  LOGIN CREDENTIALS");
        jLabel4.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 60, 282, 54);

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText(" USERNAME");
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel2.setOpaque(true);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 190, 114, 24);

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText(" PASSWORD");
        jLabel3.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 51, 51), null));
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 250, 114, 24);

        PASSWORD.setText("admin");
        PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSWORDActionPerformed(evt);
            }
        });
        jPanel2.add(PASSWORD);
        PASSWORD.setBounds(190, 250, 141, 24);

        USERNAME.setText("admin");
        USERNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERNAMEActionPerformed(evt);
            }
        });
        jPanel2.add(USERNAME);
        USERNAME.setBounds(190, 190, 141, 24);

        LOGIN_BUTTON.setBackground(new java.awt.Color(153, 153, 153));
        LOGIN_BUTTON.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        LOGIN_BUTTON.setText("LOGIN");
        LOGIN_BUTTON.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        LOGIN_BUTTON.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LOGIN_BUTTONMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LOGIN_BUTTONMouseEntered(evt);
            }
        });
        LOGIN_BUTTON.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_BUTTONActionPerformed(evt);
            }
        });
        jPanel2.add(LOGIN_BUTTON);
        LOGIN_BUTTON.setBounds(50, 350, 282, 50);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 10, 390, 490);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\shari\\OneDrive\\Desktop\\LEDGER_PICS\\LEDGER_NS.PNG")); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(430, 300, 260, 180);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(null);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\shari\\OneDrive\\Desktop\\LEDGER_PICS\\ledger.PNG")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(-20, 10, 390, 300);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(400, 10, 320, 290);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 736, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(752, 554));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGIN_BUTTONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_BUTTONActionPerformed
       
        PreparedStatement st;
        ResultSet rs;
        
        String username=USERNAME.getText();
        String password= String.valueOf(PASSWORD.getPassword());
        
        String query = "SELECT * FROM `users` WHERE `username` = ? AND `password` = ?";
        try {
            st = CONNECTION.getConnection().prepareStatement(query);
            
            st.setString(1, username);
            st.setString(2, password);
            rs = st.executeQuery();
            if(rs.next())
            {
                Home login=new Home();
                login.setVisible(true);
                this.dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid Username / Password","Login Error",2);
            }
        } 
        catch (SQLException ex) {
            Logger.getLogger(Login_Window.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
        
        
    }//GEN-LAST:event_LOGIN_BUTTONActionPerformed

    private void PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSWORDActionPerformed
        
    }//GEN-LAST:event_PASSWORDActionPerformed

    private void USERNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERNAMEActionPerformed
        
    }//GEN-LAST:event_USERNAMEActionPerformed

    private void LOGIN_BUTTONMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGIN_BUTTONMouseEntered
        LOGIN_BUTTON.setBackground(Color.white);
        LOGIN_BUTTON.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_LOGIN_BUTTONMouseEntered

    private void LOGIN_BUTTONMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LOGIN_BUTTONMouseExited
        LOGIN_BUTTON.setForeground(Color.black);
        LOGIN_BUTTON.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_LOGIN_BUTTONMouseExited

    public static void main(String args[]) {        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Window().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN_BUTTON;
    private javax.swing.JPasswordField PASSWORD;
    private javax.swing.JTextField USERNAME;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("NS.PNG")));
    }
}
