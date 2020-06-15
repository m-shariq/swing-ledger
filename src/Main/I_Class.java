package Main;
import Ledger.CONNECTION;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class I_Class {
    private int id;
    private String description;
    private String AC_Group;
    private String Item_Group;
    
    
    public Integer getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description =description;
    }
    public String getAC_Group(){
        return AC_Group;
    }
    public void setAC_Group(String AC_Group){
        this.AC_Group =AC_Group;
    }
    public String getItem_Group(){
        return Item_Group;
    }
    public void setItem_Group(String Item_Group){
        this.Item_Group =Item_Group;
    }
    I_Class(){}
    I_Class(Integer ID ,String DESCRIPTION, String AC_GROUP , String ITEM_GROUP){
        this.description=DESCRIPTION;
        this.id=ID;
        this.AC_Group=AC_GROUP;
        this.Item_Group=ITEM_GROUP;
    }
    public boolean execTypeQuery(String queryType, I_Class type){
        PreparedStatement ps;
        if(queryType.equals("add")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("INSERT INTO `items`(`Description`, `AC Unit`, `Item Group`) VALUES (?,?,?)");
                 ps.setString(1, type.getDescription());
                 ps.setString(2, type.getAC_Group());
                 ps.setString(3, type.getItem_Group());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(I_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
        else if(queryType.equals("edit")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("UPDATE `items` SET `Description`=?,`AC Unit`=?,`Item Group`=? WHERE `id`=?");
                  ps.setString(1, type.getDescription());
                  ps.setString(2, type.getAC_Group());
                  ps.setString(3, type.getItem_Group());
                  ps.setInt(4, type.getId());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(I_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
         else if(queryType.equals("remove")){
            try {
                ps=CONNECTION.getConnection().prepareStatement("DELETE FROM `items` WHERE `id`= ?");
                 ps.setInt(1, type.getId());
                 return (ps.executeUpdate()>0);
                } 
            catch (SQLException ex) {
                Logger.getLogger(I_Class.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
     
        }
         else{
             JOptionPane.showMessageDialog(null,"Enter the correct Query" ,"Invalid Operation" ,2);
         return false;
         }
        
    }
    
}