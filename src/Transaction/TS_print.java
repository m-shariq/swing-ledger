package Transaction;

import Ledger.CONNECTION;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class TS_print {
    int id;
    String serial;
    String bilty;
    String trans;
    String date;
    String total;
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getBilty() {
        return bilty;
    }

    public void setBilty(String bilty) {
        this.bilty = bilty;
    }

    public String getTrans() {
        return trans;
    }

    public void setTrans(String trans) {
        this.trans = trans;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    TS_print(){}
    TS_print(int ID,String SERIAL,String BILTY,String DATE,String TRANS,String TOTAL,String STATUS)
    {
        this.id=ID;
        this.serial=SERIAL;
        this.bilty=BILTY;
        this.date=DATE;
        this.trans=TRANS;
        this.total=TOTAL;
        this.status=STATUS;
    }
    public boolean printTypeQuery(String queryType, TS_print type){
        PreparedStatement ps;
        if(queryType.equals("POST")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("INSERT INTO `sale_print`(`SERIAL`, `BILTY`, `TRANS`, `DATE`, `TOTAL`, `STATUS`) VALUES (?,?,?,?,?,?)");
                ps.setString(1, type.getSerial());
                ps.setString(2, type.getBilty());
                ps.setString(3, type.getTrans());
                ps.setString(4, type.getDate());
                ps.setString(5, type.getTotal());
                ps.setString(6, type.getStatus());
                 
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(S_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }     
        }     
           else if(queryType.equals("UNPOST")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("DELETE FROM `sale_print` WHERE `SERIAL`=?");
                    ps.setString(1, type.getSerial());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(S_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
         else{
             JOptionPane.showMessageDialog(null,"Enter the correct Query" ,"Invalid Operation" ,2);
         return false;
         }
        
    }
           
}
