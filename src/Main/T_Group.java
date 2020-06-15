/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Ledger.CONNECTION;
import Ledger.CONNECTION;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
//import ledger.CONNECTION;

public class T_Group {
    private int id;
    private String description;
    
    public Integer getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description =description;
    }
    T_Group(){}
    T_Group(Integer ID ,String DESCRIPTION){
        this.description=DESCRIPTION;
        this.id=ID;
    }
    public boolean execTypeQuery(String queryType, T_Group type){
        PreparedStatement ps;
        if(queryType.equals("add")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("INSERT INTO `tran_group`(`Transporter`) VALUES (?)");
                 ps.setString(1, type.getDescription());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(T_Group.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
        else if(queryType.equals("edit")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("UPDATE `tran_group` SET `Transporter`=? WHERE `id`= ?");
                 ps.setString(1, type.getDescription());
                  ps.setInt(2, type.getId());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(T_Group.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
         else if(queryType.equals("remove")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("DELETE FROM `tran_group` WHERE `id`= ?");
                 ps.setInt(1, type.getId());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(T_Group.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
         else{
             JOptionPane.showMessageDialog(null,"Enter the correct Query" ,"Invalid Operation" ,2);
         return false;
         }
        
    }
    
}

