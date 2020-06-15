package Transaction;

import Ledger.CONNECTION;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class S_Class {
    private int id;
    private String serial;
    private String party;
    private String qty;
    private String cost;
    private String total;
    private String prno;
    private String batch;
    private String date;
    private String expiry;
    private String item;
    private String itemdesc;
    private String unit;
    private String dist;

    public String getDist() {
        return dist;
    }

    public void setDist(String dist) {
        this.dist = dist;
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

    public String getParty() {
        return party;
    }

    public void setParty(String qparty) {
        this.party = qparty;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPrno() {
        return prno;
    }

    public void setPrno(String prno) {
        this.prno = prno;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExpiry() {
        return expiry;
    }

    public void setExpiry(String expiry) {
        this.expiry = expiry;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItemdesc() {
        return itemdesc;
    }

    public void setItemdesc(String itemdesc) {
        this.itemdesc = itemdesc;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    S_Class(){}
    S_Class(int ID,String SERIAL,String PARTY,String QTY,String COST,String TOTAL,String PRNO,String BATCH,String DATE,String EXPIRY,String ITEM,String ITEMDESC,String UNIT,String DIST)
    {
        this.id=ID;
        this.serial=SERIAL;
        this.party=PARTY;
        this.qty=QTY;
        this.cost=COST;
        this.total=TOTAL;
        this.prno=PRNO;
        this.batch=BATCH;
        this.date=DATE;
        this.expiry=EXPIRY;
        this.item=ITEM;
        this.itemdesc=ITEMDESC;
        this.unit=UNIT;     
        this.dist=DIST;
    }
    public boolean saleTypeQuery(String queryType, S_Class type){
        PreparedStatement ps;
        if(queryType.equals("add")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("INSERT INTO `sale`(`SERIAL`, `PARTY`, `QTY`, `COST`, `TOTAL`, `PRNO`, `BATCH`, `DATE`, `EXPIRY`, `ITEM`, `ITEM_DESC`, `UNIT`, `DIST`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)");
                 ps.setString(1, type.getSerial());
                 ps.setString(2, type.getParty());
                 ps.setString(3, type.getQty());
                 ps.setString(4, type.getCost());
                 ps.setString(5, type.getTotal());
                 ps.setString(6, type.getPrno());
                 ps.setString(7, type.getBatch());
                 ps.setString(8, type.getDate());
                 ps.setString(9, type.getExpiry());
                 ps.setString(10, type.getItem());
                 ps.setString(11, type.getItemdesc());
                 ps.setString(12, type.getUnit());
                 ps.setString(13, type.getDist());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(S_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
        else if(queryType.equals("edit")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("UPDATE `sale` SET `SERIAL`=?,`PARTY`=?,`QTY`=?,`COST`=?,`TOTAL`=?,`PRNO`=?,`BATCH`=?,`DATE`=?,`EXPIRY`=?,`ITEM`=?,`ITEM_DESC`=?,`UNIT`=?,`DIST`=? WHERE `ID`=?");
                 ps.setString(1, type.getSerial());
                 ps.setString(2, type.getParty());
                 ps.setString(3, type.getQty());
                 ps.setString(4, type.getCost());
                 ps.setString(5, type.getTotal());
                 ps.setString(6, type.getPrno());
                 ps.setString(7, type.getBatch());
                 ps.setString(8, type.getDate());
                 ps.setString(9, type.getExpiry());
                 ps.setString(10, type.getItem());
                 ps.setString(11, type.getItemdesc());
                 ps.setString(12, type.getUnit());
                  ps.setString(13, type.getDist());
                  ps.setInt(14, type.getId());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(S_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
         else if(queryType.equals("remove")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("DELETE FROM `sale` WHERE `ID`=?");
                 ps.setInt(1, type.getId());
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

