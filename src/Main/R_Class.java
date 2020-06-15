package Main;

import Ledger.CONNECTION;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class R_Class {
    private int id;
    private String partyname;   
    private String product;
    private String price;
    private String partycode;
    private String ac_unit;

    public String getPartycode() {
        return partycode;
    }

    public void setPartycode(String partycode) {
        this.partycode = partycode;
    }

    public String getAc_unit() {
        return ac_unit;
    }

    public void setAc_unit(String ac_unit) {
        this.ac_unit = ac_unit;
    }
    
    
    public Integer getId(){
        return id;
    }
    public String getPartyname(){
        return partyname;
    }
    public void setPartyname(String partyname){
        this.partyname =partyname;
    }
    
    public String getProduct(){
        return product;
    }
    public void setProduct(String product){
        this.product =product;
    }
    public String getPrice(){
        return price;
    }
    public void setPrice(String price){
        this.price =price;
    }
   
    R_Class(){}
    public R_Class(Integer ID ,String PARTYNAME , String PRODUCT,String PRICE,String CODE,String ACUNIT){
        this.partyname=PARTYNAME;
        this.id=ID;
        this.partycode=CODE;
        this.ac_unit=ACUNIT;
        this.product=PRODUCT;
        this.price=PRICE;
       
                
    }
    public boolean execTypeQuery(String queryType, R_Class type){
        PreparedStatement ps;
        if(queryType.equals("add")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("INSERT INTO `party_rate_group`(`Party Name`, `Party Code`, `Product`, `AC unit`, `Price`) VALUES (?,?,?,?,?)");
                 ps.setString(1, type.getPartyname());
                 ps.setString(2, type.getPartycode());   
                  ps.setString(3, type.getProduct());  
                  ps.setString(4, type.getAc_unit());  
                  ps.setString(5, type.getPrice());  
                                
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(R_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
        else if(queryType.equals("edit")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("UPDATE `party_rate_group` SET `Party Name`=?,`Party Code`=?,`Product`=?,`AC unit`=?,`Price`=? WHERE `id`=?");
                 ps.setString(1, type.getPartyname());
                 ps.setString(2, type.getPartycode());   
                  ps.setString(3, type.getProduct());  
                  ps.setString(4, type.getAc_unit());  
                  ps.setString(5, type.getPrice());                 
                                   
                  ps.setInt(6, type.getId());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(R_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
         else if(queryType.equals("remove")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("DELETE FROM `party_rate_group` WHERE `id`=?");
                 ps.setInt(1, type.getId());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(R_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
         else{
             JOptionPane.showMessageDialog(null,"Enter the correct Query" ,"Invalid Operation" ,2);
         return false;
         }
        
    }}
    
