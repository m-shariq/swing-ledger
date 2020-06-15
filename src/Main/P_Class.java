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

public class P_Class {
    private int id;
    private String partyname;
    private String address;
    private String city;
    private String phone;
    private String cell;
    
    
    public Integer getId(){
        return id;
    }
    public String getPartyname(){
        return partyname;
    }
    public void setPartyname(String partyname){
        this.partyname =partyname;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address =address;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city =city;
    }
    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone =phone;
    }
    public String getCell(){
        return cell;
    }
    public void setCell(String cell){
        this.cell =cell;
    }
    P_Class(){}
    P_Class(Integer ID ,String PARTYNAME, String ADDRESS , String CITY,String PHONE, String CELL){
        this.partyname=PARTYNAME;
        this.id=ID;
        this.address=ADDRESS;
        this.city=CITY;
        this.phone=PHONE;
        this.cell=CELL;
                
    }
    public boolean execTypeQuery(String queryType, P_Class type){
        PreparedStatement ps;
        if(queryType.equals("add")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("INSERT INTO `party_group`(`Party Name`, `Phone No.`, `Address`, `City`, `Cell No.`) VALUES (?,?,?,?,?)");
                 ps.setString(1, type.getPartyname());
                  ps.setString(2, type.getPhone());
                  ps.setString(3, type.getAddress());
                  ps.setString(4, type.getCity());
                  ps.setString(5, type.getCell());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(P_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
        else if(queryType.equals("edit")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("UPDATE `party_group` SET `Party Name`=?,`Phone No.`=?,`Address`=?,`City`=?,`Cell No.`=? WHERE `id`=?");
                  ps.setString(1, type.getPartyname());
                  ps.setString(2, type.getPhone());
                  ps.setString(3, type.getAddress());
                  ps.setString(4, type.getCity());
                  ps.setString(5, type.getCell());
                  ps.setInt(6, type.getId());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(P_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
         else if(queryType.equals("remove")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("DELETE FROM `party_group` WHERE `id` = ?");
                 ps.setInt(1, type.getId());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(P_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
         else{
             JOptionPane.showMessageDialog(null,"Enter the correct Query" ,"Invalid Operation" ,2);
         return false;
         }
        
    }}
    
