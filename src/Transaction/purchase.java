package Transaction;

import Ledger.CONNECTION;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

//--------------------------------------------------------------------//
class print1{
    String serial;
    String bilty;
    String trans;
    String date;
    String total;
    String status;

    public String getSerial() {
        return serial;
    }

    public String getBilty() {
        return bilty;
    }

    public String getTrans() {
        return trans;
    }

    public String getDate() {
        return date;
    }

    public String getTotal() {
        return total;
    }

    public String getStatus() {
        return status;
    }

   
    
    public print1(String SERIAL,String BILTY,String TRANS,String DATE,String TOTAL,String STATUS)
    {
       this.serial=SERIAL;
       this.bilty=BILTY;
       this.trans=TRANS;
       this.date=DATE;
       this.total=TOTAL;
       this.status=STATUS;
    }
}
//------------------------------------------------------------------//
class variable1{
    String item;

    public String getItem() {
        return item;
    }
    String des;
    String unit;
    String quantity;
    String price;
    String total;
    String dist;
    String batch;
    String Expiry;
    int id;

    public int getId() {
        return id;
    }
    public String getDes() {
        return des;
    }

    public String getUnit() {
        return unit;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public String getTotal() {
        return total;
    }

    public String getDist() {
        return dist;
    }

    public String getBatch() {
        return batch;
    }

    public String getExpiry() {
        return Expiry;
    }
    
    public variable1(String DES,String UNIT,String QUANTITY,String PRICE, String TOTAL, String DIST,String BATCH, String EXPIRY,String ITEM,int ID)
    {
        this.Expiry=EXPIRY;
        this.batch=BATCH;
        this.des=DES;
        this.dist=DIST;
        this.price=PRICE;
        this.quantity=QUANTITY;
        this.total=TOTAL;
        this.unit=UNIT;
        this.item=ITEM;
        this.id=ID;
    }
}
//--------------------------------------------------------------------//
class party1{
    int id;
    String city;
    String partyname;

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }

    public String getPartyname() {
        return partyname;
    }
    public party1(int ID,String PARTYNAME,String CITY)
    {
        this.id=ID;
        this.city=CITY;
        this.partyname=PARTYNAME;
    }
}
//--------------------------------------------------------------------//
 class rate1{
    int id;
    String product;
    String price;
    String ac;

        public int getId() {
            return id;
        }

        public String getProduct() {
            return product;
        }

        public String getPrice() {
            return price;
        }

        public String getAc() {
            return ac;
        }

   
    public rate1(int ID,String PRODUCT,String PRICE,String AC)
    {
        this.id=ID;
        this.product=PRODUCT;
        this.price=PRICE;
        this.ac=AC;
    }  
 } 
    //-------------------------------------------------------------------//
    class trans1{
    int id;
    String trans;

            public int getId() {
                return id;
            }

            public String getTrans() {
                return trans;
            }

   
    public trans1(int ID,String TRANS)
    {
        this.id=ID;
        this.trans=TRANS;
    }
        }
    //----------------------------------------------------------------//

public class purchase extends javax.swing.JFrame {
    Connection cnx;
    public purchase() {
        initComponents();
        setTitle("Purchase");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("NS.PNG")));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        //populate();
        newadd();
        jLabel26.setText(jLabel_serial.getText());
        jTextField_serial.setText(jLabel_serial.getText());
        Date date=new Date();
        field_date.setDate(date);
        jTextField_party.requestFocus();
        button_print.setEnabled(false);
        
        
    }
   int set;
     static ArrayList<print1> getprint()
       {
           ArrayList<print1> use= new ArrayList<print1>();
        
         try{
                PreparedStatement pst;
                ResultSet rs;
                String query = "SELECT * FROM `purchase_print`";
               
                pst=CONNECTION.getConnection().prepareStatement(query);
                 
                rs=pst.executeQuery();
                String b=jTextField_serial.getText();
                print1 u;
                
         
          while(rs.next())
        {
            String c= rs.getString("SERIAL");
            if(c.equals(b)){
                u= new print1(rs.getString("SERIAL"),rs.getString("BILTY"),rs.getString("TRANS"),
                        rs.getString("DATE"),rs.getString("TOTAL"),rs.getString("STATUS"));
                use.add(u);
            }
            else
            {
               jLabel1.setText("UNPOSTED");
            jTextField_bilty.setText("");
            jTextField_trans.setText(""); 
            }
        }   
          pst.close();
        }  
         catch(Exception e)
        {
        }
        return use;
        }
   //------------------------------------------------------------------------//
    static ArrayList<variable1> getvariable()
       {
           ArrayList<variable1> use= new ArrayList<variable1>();
        
         try{
                PreparedStatement pst;
                ResultSet rs;
                String query = "SELECT * FROM `purchased`";
               
                pst=CONNECTION.getConnection().prepareStatement(query);
                 
                rs=pst.executeQuery();
                String b=jTextField_serial.getText();
                variable1 u;
                
         
          while(rs.next())
        {
            String c= rs.getString("SERIAL");
            if(c.equals(b)){
                u= new variable1(rs.getString("ITEM_DESC"),rs.getString("UNIT"),rs.getString("QTY"),
                        rs.getString("COST"),rs.getString("TOTAL"),rs.getString("DIST"),
                        rs.getString("BATCH"),rs.getString("EXPIRY"),rs.getString("ITEM"),rs.getInt("ID"));
                use.add(u);
            }
        }   
          pst.close();
        }  
         catch(Exception e)
        {
        }
        return use;
        }
     //----------------------------------------------------------------//
    
    static ArrayList<rate1> getrate()
       {
           ArrayList<rate1> use= new ArrayList<rate1>();
        
         try{
                PreparedStatement pst;
                ResultSet rs;
                String query = "SELECT * FROM `party_rate_group`";               
                pst=CONNECTION.getConnection().prepareStatement(query);                 
                rs=pst.executeQuery();              
                rate1 u;
                String b=jTextField_party.getText();
                
         
          while(rs.next())
        {
           
           String c= rs.getString("Party Code");
          
           
            if(c.equals(b)){
                u= new rate1(rs.getInt("id"),rs.getString("Product"),rs.getString("Price")
                ,rs.getString("AC unit"));
                use.add(u);
            }
        }  
          pst.close();
        }  
         catch(Exception e)
        {
        }
        return use;
        }
    //--------------------------------------------------------------------//
    static ArrayList<party1> getparty()
       {
           ArrayList<party1> use= new ArrayList<party1>();
        
         try{
                PreparedStatement pst;
                ResultSet rs;
                String query = "SELECT * FROM `party_group`";               
                pst=CONNECTION.getConnection().prepareStatement(query);                 
                rs=pst.executeQuery();              
                party1 u;               
         
          while(rs.next())
        {        
                     
                u= new party1(rs.getInt("id"),rs.getString("Party Name"),rs.getString("City"));
                use.add(u);
            
        }   
          pst.close();
        }  
         catch(Exception e)
        {
        }
        return use;
        }
    //-------------------------------------------------------------------//
    static ArrayList<trans1> gettrans()
       {
           ArrayList<trans1> use= new ArrayList<trans1>();
        
         try{
                PreparedStatement pst;
                ResultSet rs;
                String query = "SELECT * FROM `tran_group`";               
                pst=CONNECTION.getConnection().prepareStatement(query);                 
                rs=pst.executeQuery();              
                trans1 u;              
                
         
          while(rs.next())
        {         
                u= new trans1(rs.getInt("id"),rs.getString("Transporter"));
                use.add(u);            
        } 
          pst.close();
        }  
         catch(Exception e)
        {
        }
        return use;
        }
   //-------------------------------------------------------------------//
   public void populate(){
       
   DefaultTableModel model=new DefaultTableModel();
   Object[] coloumnsName=new Object[10];
     
    
    coloumnsName[0]="ICODE";    
    coloumnsName[1]="ITEM";
    coloumnsName[2]="UNIT";
    coloumnsName[3]="QTY";
    coloumnsName[4]="PRICE";
    coloumnsName[5]="TOTAL";
    coloumnsName[6]="DISCOUNT";
    coloumnsName[7]="BATCH";
    coloumnsName[8]="EXPIRY";
    coloumnsName[9]="ID";
    
    
    
    model.setColumnIdentifiers(coloumnsName);
    Object[] rowData=new Object[10];
     Double total=0.00,okay=0.00;
    for(int i=0;i<getvariable().size();i++)
    {
        rowData[0]=getvariable().get(i).getItem();
        rowData[1]=getvariable().get(i).getDes();
        rowData[2]=getvariable().get(i).getUnit();
        rowData[3]=getvariable().get(i).getQuantity();
        rowData[4]=getvariable().get(i).getPrice();
        rowData[5]=getvariable().get(i).getTotal();
        rowData[6]=getvariable().get(i).getDist();
        rowData[7]=getvariable().get(i).getBatch();
        rowData[8]=getvariable().get(i).getExpiry();
        rowData[9]=getvariable().get(i).getId();
        
        model.addRow(rowData); 
        jLabel_totaldigit.setText((String)rowData[5]);
        okay=Double.valueOf(jLabel_totaldigit.getText());
        total+=okay;
    }
    String a=CashWordConverter.doubleConvert(total);
    jLabel_totaldigit.setText(Double.toString(total));
    jLabel_totalword.setText(a);
    jTable1.setModel(model);
    }
    //-------------------------------------------------------------------//
   public void populate_party(){
       try{
   DefaultTableModel model=new DefaultTableModel();
   Object[] coloumnsName=new Object[3];
     
        
    coloumnsName[0]="ID";
    coloumnsName[1]="PARTY NAME";
    coloumnsName[2]="CITY";
    
    
    
    model.setColumnIdentifiers(coloumnsName);
    Object[] rowData=new Object[3];
    for(int i=0;i<getparty().size();i++)
    {
        rowData[0]=getparty().get(i).getId();
        rowData[1]=getparty().get(i).getPartyname();
        rowData[2]=getparty().get(i).getCity();       
        model.addRow(rowData);
        
    }
    jTable1.setModel(model);
     }
       catch(Exception e)
       {}
    }
    //--------------------------------------------------------------------//
   public void populate_party_rate(){
       try{
   DefaultTableModel model=new DefaultTableModel();
   Object[] coloumnsName=new Object[4];
     
        
    coloumnsName[0]="ID";
    coloumnsName[1]="PRODUCT";
    coloumnsName[2]="PRICE";
    coloumnsName[3]="AC UNIT";
    
    
    model.setColumnIdentifiers(coloumnsName);
    Object[] rowData=new Object[4];
    for(int i=0;i<getrate().size();i++)
    {
        rowData[0]=getrate().get(i).getId();
        rowData[1]=getrate().get(i).getProduct();
        rowData[2]=getrate().get(i).getPrice();
        rowData[3]=getrate().get(i).getAc();
        model.addRow(rowData);
        
    }
    jTable1.setModel(model);
     }
       catch(Exception e)
       {}
    }
     //------------------------------------------------------------------//
   public void populate_trans(){
       try{
   DefaultTableModel model=new DefaultTableModel();
   Object[] coloumnsName=new Object[2];
     
        
    coloumnsName[0]="ID";
    coloumnsName[1]="TRANSPORTER";
    
    
    
    
    model.setColumnIdentifiers(coloumnsName);
    Object[] rowData=new Object[2];
    for(int i=0;i<gettrans().size();i++)
    {
        rowData[0]=gettrans().get(i).getId();
        rowData[1]=gettrans().get(i).getTrans();      
        model.addRow(rowData);
        
    }
    jTable1.setModel(model);
       }
       catch(Exception e)
       {}
    }
    //-------------------------------------------------------------------//
    public void newadd()
    {
     try{
         int a=0,c=0;
                PreparedStatement pst;
                ResultSet rs;
                String query = "SELECT * FROM `purchased`";               
                pst=CONNECTION.getConnection().prepareStatement(query);                 
                rs=pst.executeQuery();
                
         c=-1;
          while(rs.next())
        {
            a=rs.getInt("SERIAL");
            if(c<a)
            {
            c=a;}
        }   
          c++;
          String b=Integer.toString(c);
          jLabel_serial.setText(b);
          pst.close();
        }  
         catch(Exception e)
        {
        }   
    }
    public void populate_print()
    {
        
        try{
        Object[] rowData=new Object[6];
        for(int i=0;i<gettrans().size();i++)
    {
        rowData[0] = getprint().get(i).getStatus();
        rowData[1] = getprint().get(i).getBilty();
        rowData[2] = getprint().get(i).getTrans();
        rowData[3] = getprint().get(i).getDate();
        rowData[4] = getprint().get(i).getTotal();
        rowData[5] = getprint().get(i).getStatus();
        
    }
       if(((String)rowData[0]).equals(""))
       {
            jLabel1.setText("UNPOSTED");
           
       }
       else
       {
            jLabel1.setText((String)rowData[0]);
       } 
       jTextField_bilty.setText((String)rowData[1]);
       jTextField_trans.setText((String)rowData[2]);
       String l=(String)rowData[3];
       l=l.replace('-','/');       
       java.util.Date date=new Date(l);
       field_date.setDate(date);
       if(jLabel1.getText().equals("POSTED"))
       {
           button_print.setEnabled(true);
           button_post.setText("UNPOST");
       }
       else
       {
           button_print.setEnabled(false);
           button_post.setText("POST");
       }
        }
        catch(Exception e)
        {}
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel_total = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField_item = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField_qty = new javax.swing.JTextField();
        jTextField_cost = new javax.swing.JTextField();
        jTextField_dist = new javax.swing.JTextField();
        jTextField_batch = new javax.swing.JTextField();
        jTextField_expiry = new javax.swing.JTextField();
        jLabel_itemdesc = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jTextField_bilty = new javax.swing.JTextField();
        jTextField_trans = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField_serial = new javax.swing.JTextField();
        jTextField_party = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel_serial = new javax.swing.JLabel();
        jLabel_party = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        button_new = new javax.swing.JButton();
        button_add = new javax.swing.JButton();
        button_close = new javax.swing.JButton();
        button_post = new javax.swing.JButton();
        button_edit = new javax.swing.JButton();
        button_print = new javax.swing.JButton();
        button_remove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel_unit = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel_totalword = new javax.swing.JLabel();
        jLabel_totaldigit = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        field_date = new com.toedter.calendar.JDateChooser();
        jLabel_id = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204), new java.awt.Color(204, 204, 204)));
        jPanel2.setLayout(null);

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("ITEM DESCIPTION");
        jLabel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel21.setOpaque(true);
        jPanel2.add(jLabel21);
        jLabel21.setBounds(20, 190, 260, 30);

        jLabel_total.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_total.setText("0.00");
        jLabel_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_total.setOpaque(true);
        jPanel2.add(jLabel_total);
        jLabel_total.setBounds(670, 220, 120, 20);

        jLabel9.setBackground(new java.awt.Color(204, 204, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("QTY");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel9.setOpaque(true);
        jPanel2.add(jLabel9);
        jLabel9.setBounds(360, 190, 90, 30);

        jLabel4.setBackground(new java.awt.Color(204, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("PRICE");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(450, 190, 120, 30);

        jLabel11.setBackground(new java.awt.Color(204, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("DIST(%)");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel11.setOpaque(true);
        jPanel2.add(jLabel11);
        jLabel11.setBounds(570, 190, 100, 30);

        jLabel10.setBackground(new java.awt.Color(204, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("TOTAL");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel10.setOpaque(true);
        jPanel2.add(jLabel10);
        jLabel10.setBounds(670, 190, 120, 30);

        jLabel12.setBackground(new java.awt.Color(204, 204, 204));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("BATCH");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel12.setOpaque(true);
        jPanel2.add(jLabel12);
        jLabel12.setBounds(790, 190, 110, 30);

        jLabel14.setBackground(new java.awt.Color(204, 204, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("EXPIRY");
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel14.setOpaque(true);
        jPanel2.add(jLabel14);
        jLabel14.setBounds(900, 190, 140, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTable1FocusGained(evt);
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(20, 260, 1020, 180);

        jTextField_item.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_item.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_itemKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_item);
        jTextField_item.setBounds(20, 220, 90, 20);

        jLabel13.setBackground(new java.awt.Color(204, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("UNIT");
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel13.setOpaque(true);
        jPanel2.add(jLabel13);
        jLabel13.setBounds(280, 190, 80, 30);

        jTextField_qty.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_qty.setText("0");
        jTextField_qty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_qtyFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_qtyFocusLost(evt);
            }
        });
        jTextField_qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_qtyActionPerformed(evt);
            }
        });
        jTextField_qty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_qtyKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_qty);
        jTextField_qty.setBounds(360, 220, 90, 21);

        jTextField_cost.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_cost.setText("0");
        jTextField_cost.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_costFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_costFocusLost(evt);
            }
        });
        jTextField_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_costActionPerformed(evt);
            }
        });
        jTextField_cost.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_costKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_cost);
        jTextField_cost.setBounds(450, 220, 120, 21);

        jTextField_dist.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_dist.setText("0");
        jTextField_dist.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_distFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField_distFocusLost(evt);
            }
        });
        jTextField_dist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_distActionPerformed(evt);
            }
        });
        jTextField_dist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_distKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_dist);
        jTextField_dist.setBounds(570, 220, 100, 21);

        jTextField_batch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_batch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_batchKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_batch);
        jTextField_batch.setBounds(790, 220, 110, 21);

        jTextField_expiry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField_expiry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_expiryKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_expiry);
        jTextField_expiry.setBounds(900, 220, 140, 21);

        jLabel_itemdesc.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_itemdesc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_itemdesc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_itemdesc.setOpaque(true);
        jPanel2.add(jLabel_itemdesc);
        jLabel_itemdesc.setBounds(110, 220, 170, 20);

        jLabel17.setBackground(new java.awt.Color(204, 204, 204));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel17.setOpaque(true);
        jPanel2.add(jLabel17);
        jLabel17.setBounds(380, 70, 280, 50);

        jLabel16.setBackground(new java.awt.Color(204, 204, 204));
        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("PARTY");
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel16.setOpaque(true);
        jPanel2.add(jLabel16);
        jLabel16.setBounds(40, 120, 110, 30);

        jLabel19.setBackground(new java.awt.Color(204, 204, 204));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("STATUS");
        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel19.setOpaque(true);
        jPanel2.add(jLabel19);
        jLabel19.setBounds(720, 40, 130, 30);

        jLabel22.setBackground(new java.awt.Color(204, 204, 204));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("TRANSPORTER");
        jLabel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel22.setOpaque(true);
        jPanel2.add(jLabel22);
        jLabel22.setBounds(720, 120, 130, 30);

        jLabel18.setBackground(new java.awt.Color(204, 204, 204));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("BILTY NO.");
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel18.setOpaque(true);
        jPanel2.add(jLabel18);
        jLabel18.setBounds(720, 80, 130, 30);

        jTextField_bilty.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_bilty.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_bilty.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField_biltyFocusGained(evt);
            }
        });
        jTextField_bilty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_biltyMouseClicked(evt);
            }
        });
        jTextField_bilty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_biltyKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_bilty);
        jTextField_bilty.setBounds(850, 80, 150, 30);

        jTextField_trans.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_trans.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField_trans.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_transKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_trans);
        jTextField_trans.setBounds(850, 120, 150, 30);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UNPOSTED");
        jLabel1.setOpaque(true);
        jPanel2.add(jLabel1);
        jLabel1.setBounds(850, 40, 150, 30);

        jTextField_serial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_serial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_serialKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_serial);
        jTextField_serial.setBounds(150, 40, 120, 30);

        jTextField_party.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_party.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_partyKeyPressed(evt);
            }
        });
        jPanel2.add(jTextField_party);
        jTextField_party.setBounds(150, 120, 120, 30);

        jLabel20.setBackground(new java.awt.Color(204, 204, 204));
        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("SERIAL NO.");
        jLabel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel20.setOpaque(true);
        jPanel2.add(jLabel20);
        jLabel20.setBounds(40, 40, 110, 30);

        jLabel_serial.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_serial.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_serial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_serial.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_serial.setOpaque(true);
        jPanel2.add(jLabel_serial);
        jLabel_serial.setBounds(270, 40, 110, 30);

        jLabel_party.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_party.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_party.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_party.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_party.setOpaque(true);
        jPanel2.add(jLabel_party);
        jLabel_party.setBounds(270, 120, 390, 30);

        jLabel25.setIcon(new javax.swing.ImageIcon("C:\\Users\\shari\\OneDrive\\Desktop\\LEDGER_PICS\\forward.jpg")); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel25);
        jLabel25.setBounds(100, 70, 60, 50);

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("234");
        jLabel26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel26);
        jLabel26.setBounds(160, 80, 100, 30);

        jLabel27.setIcon(new javax.swing.ImageIcon("C:\\Users\\shari\\OneDrive\\Desktop\\LEDGER_PICS\\forward1.jpg")); // NOI18N
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
        });
        jLabel27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel27KeyPressed(evt);
            }
        });
        jPanel2.add(jLabel27);
        jLabel27.setBounds(270, 70, 60, 50);

        button_new.setBackground(new java.awt.Color(153, 153, 153));
        button_new.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button_new.setText("NEW");
        button_new.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_new.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_newMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_newMouseEntered(evt);
            }
        });
        button_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_newActionPerformed(evt);
            }
        });
        jPanel2.add(button_new);
        button_new.setBounds(60, 520, 210, 40);

        button_add.setBackground(new java.awt.Color(153, 153, 153));
        button_add.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button_add.setText("ADD");
        button_add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_addMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_addMouseEntered(evt);
            }
        });
        button_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_addActionPerformed(evt);
            }
        });
        jPanel2.add(button_add);
        button_add.setBounds(300, 520, 210, 40);

        button_close.setBackground(new java.awt.Color(153, 153, 153));
        button_close.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button_close.setText("CLOSE");
        button_close.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_closeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_closeMouseEntered(evt);
            }
        });
        button_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_closeActionPerformed(evt);
            }
        });
        jPanel2.add(button_close);
        button_close.setBounds(380, 580, 300, 51);

        button_post.setBackground(new java.awt.Color(153, 153, 153));
        button_post.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button_post.setText("POST");
        button_post.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_post.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_postMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_postMouseEntered(evt);
            }
        });
        button_post.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_postActionPerformed(evt);
            }
        });
        jPanel2.add(button_post);
        button_post.setBounds(60, 580, 300, 51);

        button_edit.setBackground(new java.awt.Color(153, 153, 153));
        button_edit.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button_edit.setText("EDIT");
        button_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_editMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_editMouseEntered(evt);
            }
        });
        button_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_editActionPerformed(evt);
            }
        });
        jPanel2.add(button_edit);
        button_edit.setBounds(550, 520, 210, 40);

        button_print.setBackground(new java.awt.Color(153, 153, 153));
        button_print.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button_print.setText("PRINT");
        button_print.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_printMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_printMouseEntered(evt);
            }
        });
        button_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_printActionPerformed(evt);
            }
        });
        jPanel2.add(button_print);
        button_print.setBounds(700, 580, 300, 51);

        button_remove.setBackground(new java.awt.Color(153, 153, 153));
        button_remove.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        button_remove.setText("REMOVE");
        button_remove.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button_remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_removeMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_removeMouseEntered(evt);
            }
        });
        button_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_removeActionPerformed(evt);
            }
        });
        jPanel2.add(button_remove);
        button_remove.setBounds(790, 520, 210, 40);

        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel2.add(jLabel2);
        jLabel2.setBounds(30, 500, 1000, 150);

        jLabel_unit.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_unit.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_unit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel_unit.setOpaque(true);
        jPanel2.add(jLabel_unit);
        jLabel_unit.setBounds(280, 220, 80, 20);

        jLabel23.setBackground(new java.awt.Color(204, 204, 204));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("GRAND TOTAL");
        jLabel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel23.setOpaque(true);
        jPanel2.add(jLabel23);
        jLabel23.setBounds(20, 440, 130, 30);

        jLabel_totalword.setBackground(new java.awt.Color(204, 204, 204));
        jLabel_totalword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_totalword.setOpaque(true);
        jPanel2.add(jLabel_totalword);
        jLabel_totalword.setBounds(150, 440, 710, 30);

        jLabel_totaldigit.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_totaldigit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_totaldigit.setOpaque(true);
        jPanel2.add(jLabel_totaldigit);
        jLabel_totaldigit.setBounds(860, 440, 180, 30);

        jLabel6.setBackground(new java.awt.Color(204, 204, 204));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("DATE");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jLabel6.setOpaque(true);
        jPanel2.add(jLabel6);
        jLabel6.setBounds(380, 40, 100, 30);

        field_date.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                field_dateFocusLost(evt);
            }
        });
        jPanel2.add(field_date);
        field_date.setBounds(480, 40, 180, 30);
        jPanel2.add(jLabel_id);
        jLabel_id.setBounds(20, 164, 100, 20);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(11, 12, 1060, 670);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\shari\\OneDrive\\Desktop\\LEDGER_PICS\\NS_LOGO.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(1120, 50, 200, 170);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("A PROJECT BY");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(1150, 30, 180, 30);

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

    private void jTextField_qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_qtyActionPerformed
        double total,dist;
         String str;
        try{
            total=(Double.valueOf(jTextField_cost.getText())*Double.valueOf(jTextField_qty.getText()));
            dist=Double.valueOf(jTextField_dist.getText());
            dist=dist/100;
            double total1=total*dist;
            total=total-total1;
            str=String.format("%.2f", total);
            jLabel_total.setText(str);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Enter The Valid Quantity", "Quantity Error", 2);
        }
    }//GEN-LAST:event_jTextField_qtyActionPerformed

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
        try{
        int a=Integer.valueOf(jLabel_serial.getText());
        int b=Integer.valueOf(jLabel26.getText());
        if(b<a){
        b++;
        }
        jLabel26.setText(String.valueOf(b));
        jTextField_serial.setText(String.valueOf(b));
        
        populate();
        populate_print();
        if(a==b)
        {
            Date date=new Date();
            field_date.setDate(date);
            jTextField_bilty.setText("");
            jTextField_trans.setText("");
            jLabel1.setText("UNPOSTED");
            button_post.setText("POST");
            jLabel_totaldigit.setText("");
            jLabel_totalword.setText("");
        }
        
        }    
        
catch(Exception e)
{}
    }//GEN-LAST:event_jLabel25MouseClicked

    private void button_newMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_newMouseExited
        button_new.setForeground(Color.black);
        button_new.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_button_newMouseExited

    private void button_newMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_newMouseEntered
        button_new.setBackground(Color.white);
        button_new.setForeground(new Color(153,153,153)); 
    }//GEN-LAST:event_button_newMouseEntered

    private void button_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_newActionPerformed
        newadd();   
                    jTextField_party.setText("");
                    jLabel_party.setText("");
                    jTextField_bilty.setText("");
                    jTextField_trans.setText("");
                    jLabel1.setText("UNPOSTED");
                    button_post.setText("POST");
                    jTextField_item.setText("");
                    jLabel_itemdesc.setText("");
                    jTextField_qty.setText("0");
                    jTextField_cost.setText("0");
                    jTextField_dist.setText("0");
                    jLabel_total.setText("0.00");
                    jLabel_unit.setText("");
                    jTextField_expiry.setText("");
                    jTextField_batch.setText("");       
        jLabel26.setText(jLabel_serial.getText());
        jTextField_serial.setText(jLabel_serial.getText());
        populate();
        jLabel_totaldigit.setText("");
               jLabel_totalword.setText("");
    }//GEN-LAST:event_button_newActionPerformed

    private void button_removeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_removeMouseExited
        button_remove.setForeground(Color.black);
        button_remove.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_button_removeMouseExited

    private void button_removeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_removeMouseEntered
       button_remove.setBackground(Color.white);
       button_remove.setForeground(new Color(153,153,153)); 
    }//GEN-LAST:event_button_removeMouseEntered

    private void button_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_removeActionPerformed
if(jLabel1.getText().equals("UNPOSTED")){    
        try{
        int id = Integer.valueOf(jLabel_id.getText());
        
        P_Class type = new P_Class(id,"","","","","","","","","","","","","");
        if(!jLabel_id.getText().trim().equals("")){
        if(type.purchaseTypeQuery("remove",type)){
            JOptionPane.showMessageDialog(null,"Description Removed!", "Remove Description", 1);
           jTextField_item.setText("");
                    jLabel_itemdesc.setText("");
                    jTextField_qty.setText("0");
                    jTextField_cost.setText("0");
                    jTextField_dist.setText("0");
                    jLabel_total.setText("0.00");
                    jLabel_unit.setText("");
                    jTextField_expiry.setText("");
                    jTextField_batch.setText(""); 
                    set=0;
                    populate();
                    jTextField_item.requestFocus();
            
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
        }
else
        JOptionPane.showMessageDialog(null,"UNPOST before any change", "POST", 2);
    
    }//GEN-LAST:event_button_removeActionPerformed

    private void button_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addMouseExited
        button_add.setForeground(Color.black);
        button_add.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_button_addMouseExited

    private void button_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_addMouseEntered
       button_add.setBackground(Color.white);
       button_add.setForeground(new Color(153,153,153)); 
    }//GEN-LAST:event_button_addMouseEntered

    private void button_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_addActionPerformed
if(jLabel1.getText().equals("UNPOSTED")){
        try{
            String serial=jTextField_serial.getText();
            String party=jTextField_party.getText();
            String qty=jTextField_qty.getText();
            String cost=jTextField_cost.getText();
            String totals=jLabel_total.getText();
            String prno=jLabel_serial.getText();
            String batch=jTextField_batch.getText();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(field_date.getDate());
            String expiry=jTextField_expiry.getText();
            String item=jTextField_item.getText();
            String itemdesc=jLabel_itemdesc.getText();
            String unit=jLabel_unit.getText();
            String dist=jTextField_dist.getText();
            P_Class type=new P_Class(0,serial,party,qty,cost,totals,prno,batch,date,expiry,item,itemdesc,unit,dist);
            if(!(party.trim().equals(""))&&!(qty.trim().equals(""))&&!(cost.trim().equals(""))&&!(item.trim().equals(""))){
                if(type.purchaseTypeQuery("add",type)){
                    jTextField_item.setText("");
                    jLabel_itemdesc.setText("");
                    jTextField_qty.setText("0");
                    jTextField_cost.setText("0");
                    jTextField_dist.setText("0");
                    jLabel_total.setText("0.00");
                    jLabel_unit.setText("");
                    jTextField_expiry.setText("");
                    jTextField_batch.setText(""); 
                    set=0;
                    populate();
                    jTextField_item.requestFocus();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Operation Failed", "Add Description", 2);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Fill the Appropiate Fields", "Empty Fields", 2);
            }    //populate();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Select the valid DATE / FIELDS", "Empty Fields", 2);
            }
}
else
        JOptionPane.showMessageDialog(null,"UNPOST before any change", "POST", 2);
    }//GEN-LAST:event_button_addActionPerformed

    private void button_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_closeMouseExited
        button_close.setForeground(Color.black);
        button_close.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_button_closeMouseExited

    private void button_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_closeMouseEntered
        button_close.setBackground(Color.white);
        button_close.setForeground(new Color(153,153,153)); 
    }//GEN-LAST:event_button_closeMouseEntered

    private void button_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_closeActionPerformed
        dispose();
    }//GEN-LAST:event_button_closeActionPerformed

    private void button_postMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_postMouseExited
        button_post.setForeground(Color.black);
        button_post.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_button_postMouseExited

    private void button_postMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_postMouseEntered
      button_post.setBackground(Color.white);
      button_post.setForeground(new Color(153,153,153)); 
    }//GEN-LAST:event_button_postMouseEntered

    private void button_postActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_postActionPerformed

        if(!(jLabel1.getText().equals("N/A"))){
       if(jLabel1.getText().equals("POSTED"))
        button_post.setText("UNPOST");
    else if(jLabel1.getText().equals("UNPOSTED"))
        button_post.setText("POST");
    String b=button_post.getText();
        try
    {
        if(b.equals("POST")){    
                jLabel1.setText("POSTED");
                button_post.setText("UNPOST");}
        String serial=jTextField_serial.getText();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String date=sdf.format(field_date.getDate());
        String bilty=jTextField_bilty.getText();
        String trans=jTextField_trans.getText();
        String total=jLabel_totaldigit.getText();
        String status=jLabel1.getText();
         
        T_print type=new T_print(0,serial,bilty,date,trans,total,status);
        
        if(!(serial.trim().equals(""))&&!(date.trim().equals(""))&&!(bilty.trim().equals(""))&&!(trans.trim().equals(""))&&!(total.trim().equals(""))){
            
            if(type.printTypeQuery("POST",type)){
                    JOptionPane.showMessageDialog(null,"POSTED!", "Purchase Post", 1);
                    button_print.setEnabled(true);
                    set=0;
                    
                }
            else{
                     JOptionPane.showMessageDialog(null,"Operation Failed", "Purchase Post", 2);
                     jLabel1.setText("UNPOSTED");
                     button_post.setText("POST");
                     set=0;
                     
            }
            
            if(b.equals("UNPOST")){  
                 jLabel1.setText("UNPOSTED");
                 button_post.setText("POST");
            if(type.printTypeQuery("UNPOST",type)){
                    JOptionPane.showMessageDialog(null,"UNPOSTED!", "Purchase Post", 1);
                    button_print.setEnabled(false);
                    jLabel1.setText("UNPOSTED");
                    set=0;
                }
            else{
                     JOptionPane.showMessageDialog(null,"Operation Failed", "Purchase Post", 2);
                     jLabel1.setText("POSTED");
                    button_post.setText("UNPOST");
            }}
                
        }
        else
             JOptionPane.showMessageDialog(null,"Empty Fields", "Purchase Post", 2);
    }
    catch(Exception e)
    {}

            
        }
    }//GEN-LAST:event_button_postActionPerformed

    private void button_editMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_editMouseExited
        button_edit.setForeground(Color.black);
        button_edit.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_button_editMouseExited

    private void button_editMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_editMouseEntered
        button_edit.setBackground(Color.white);
        button_edit.setForeground(new Color(153,153,153)); 
    }//GEN-LAST:event_button_editMouseEntered

    private void button_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_editActionPerformed
if(jLabel1.getText().equals("UNPOSTED")){
        try{
            int id=Integer.valueOf(jLabel_id.getText());
            String serial=jTextField_serial.getText();
            String party=jTextField_party.getText();
            String qty=jTextField_qty.getText();
            String cost=jTextField_cost.getText();
            String totals=jLabel_total.getText();
            String prno=jLabel_serial.getText();
            String batch=jTextField_batch.getText();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(field_date.getDate());
            String expiry=jTextField_expiry.getText();
            String item=jTextField_item.getText();
            String itemdesc=jLabel_itemdesc.getText();
            String unit=jLabel_unit.getText();
            String dist=jTextField_dist.getText();
            P_Class type=new P_Class(id,serial,party,qty,cost,totals,prno,batch,date,expiry,item,itemdesc,unit,dist);
            if(!(party.trim().equals(""))&&!(qty.trim().equals(""))&&!(cost.trim().equals(""))&&!(item.trim().equals(""))){
                if(type.purchaseTypeQuery("edit",type)){
                    jTextField_item.setText("");
                    jLabel_itemdesc.setText("");
                    jTextField_qty.setText("0");
                    jTextField_cost.setText("0");
                    jTextField_dist.setText("0");
                    jLabel_total.setText("0.00");
                    jLabel_unit.setText("");
                    jTextField_expiry.setText("");
                    jTextField_batch.setText("");                    
                    populate();
                    jTextField_item.requestFocus();
                    JOptionPane.showMessageDialog(null,"Description Edited", "Edit Description",1);
                    set=0;
                }
                else{
                    JOptionPane.showMessageDialog(null,"Operation Failed", "Edit Description", 2);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Fill the Appropiate Fields", "Empty Fields", 2);
            }    
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Select the valid DATE / FIELDS", "Empty Fields", 2);
            }
}
else
        JOptionPane.showMessageDialog(null,"UNPOST before any change", "POST", 2);
        
    }//GEN-LAST:event_button_editActionPerformed

    private void button_printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_printMouseExited
        button_print.setForeground(Color.black);
        button_print.setBackground(new Color(153,153,153));
    }//GEN-LAST:event_button_printMouseExited

    private void button_printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_printMouseEntered
        button_print.setBackground(Color.white);
        button_print.setForeground(new Color(153,153,153)); 
    }//GEN-LAST:event_button_printMouseEntered

    private void button_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_printActionPerformed
try {
    
            Class.forName("com.mysql.jdbc.Driver");
            cnx=DriverManager.getConnection("jdbc:mysql://localhost/ledger","root","");
            JasperDesign j= JRXmlLoader.load("C:\\Users\\shari\\OneDrive\\Documents\\NetBeansProjects\\Buisness\\src\\Report\\purchase.jrxml");
            String ids=jTextField_serial.getText();
            String query="SELECT * FROM `purchase_print` WHERE `serial`='"+ids+"'";
            JRDesignQuery design=new JRDesignQuery();
            design.setText(query);
            j.setQuery(design);

            JasperReport jreport= JasperCompileManager.compileReport(j);
            JasperPrint jprint=JasperFillManager.fillReport(jreport,null, cnx);

            JasperViewer.viewReport(jprint,false);

        }
        catch (Exception ex) {

        }            
    }//GEN-LAST:event_button_printActionPerformed

    private void field_dateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_field_dateFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_field_dateFocusLost

    private void jTextField_partyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_partyKeyPressed

        if(evt.getKeyCode()==KeyEvent.VK_SPACE)
        {   
            //jTextField_party.setText("");
            set=1;
            populate_party();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_bilty.requestFocus();
        }
    }//GEN-LAST:event_jTextField_partyKeyPressed

    private void jTextField_itemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_itemKeyPressed
if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_qty.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_SPACE)
        {    
            set=3;
            populate_party_rate();
        }
    }//GEN-LAST:event_jTextField_itemKeyPressed

    private void jTextField_transKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_transKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_item.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_SPACE)
        {      
            set=2;
            populate_trans();
        }
    }//GEN-LAST:event_jTextField_transKeyPressed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if(set==0)
       {
           try{

                DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
                int selectedRowIndex = (jTable1).getSelectedRow();
                jLabel_unit.setText(model.getValueAt(selectedRowIndex,2).toString());
                jLabel_itemdesc.setText(model.getValueAt(selectedRowIndex,1).toString());
                jTextField_qty.setText(model.getValueAt(selectedRowIndex,3).toString());
                jTextField_cost.setText(model.getValueAt(selectedRowIndex,4).toString());
                jLabel_total.setText(model.getValueAt(selectedRowIndex,5).toString());
                jTextField_dist.setText(model.getValueAt(selectedRowIndex,6).toString());
                jTextField_batch.setText(model.getValueAt(selectedRowIndex,7).toString());
                jTextField_expiry.setText(model.getValueAt(selectedRowIndex,8).toString());
                jTextField_item.setText(model.getValueAt(selectedRowIndex,0).toString());
                 jLabel_id.setText(model.getValueAt(selectedRowIndex,9).toString());
                
            }
            catch(Exception e){
            }
       }
        
      else if(set==1)
       {
           try{

                DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
                int selectedRowIndex = (jTable1).getSelectedRow();
                jLabel_party.setText(model.getValueAt(selectedRowIndex,1).toString());
                jTextField_party.setText(model.getValueAt(selectedRowIndex,0).toString());

            }
            catch(Exception e){
            }
       }
       else if(set==2)
       {
           try{

                DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
                int selectedRowIndex = (jTable1).getSelectedRow();
                jTextField_trans.setText(model.getValueAt(selectedRowIndex,1).toString());
                

            }
            catch(Exception e){
            }
       }
       else if(set==3){
            try{

                DefaultTableModel model = (DefaultTableModel)(jTable1).getModel();
                int selectedRowIndex = (jTable1).getSelectedRow();
                jTextField_cost.setText(model.getValueAt(selectedRowIndex,2).toString());
                jLabel_unit.setText(model.getValueAt(selectedRowIndex,3).toString());
                jLabel_itemdesc.setText(model.getValueAt(selectedRowIndex,1).toString());
                jTextField_item.setText(model.getValueAt(selectedRowIndex,0).toString());
            }
            catch(Exception e){

            }
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTextField_biltyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_biltyMouseClicked
                  
    }//GEN-LAST:event_jTextField_biltyMouseClicked

    private void jTextField_biltyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_biltyFocusGained
             
    }//GEN-LAST:event_jTextField_biltyFocusGained

    private void jTextField_qtyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_qtyKeyPressed
       String number = jTextField_qty.getText();
        int length = number.length();
        char c = evt.getKeyChar();
        if(evt.getKeyChar()>='0'&&evt.getKeyChar()<='9'){        
            if(length<17){
                    jTextField_qty.setEditable(true);
            }
            else
                jTextField_qty.setEditable(false);
        }
        else
        {
            if((evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE)||(evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)||(evt.getExtendedKeyCode()==KeyEvent.VK_TAB)||(evt.getExtendedKeyCode()==KeyEvent.VK_ENTER)){
                jTextField_qty.setEditable(true);
                if(evt.getExtendedKeyCode()==KeyEvent.VK_ENTER)
                {
                    jTextField_cost.requestFocus();
                }
            }
            else
                 jTextField_qty.setEditable(false);
        }
    }//GEN-LAST:event_jTextField_qtyKeyPressed

    private void jTextField_costKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_costKeyPressed
        
        String number = jTextField_cost.getText();
        int length = number.length();
        char c = evt.getKeyChar();
        if((evt.getKeyChar()>='0'&&evt.getKeyChar()<='9')||evt.getKeyChar()=='.'){        
            if(length<17){
                    jTextField_cost.setEditable(true);
            }
            else
                jTextField_cost.setEditable(false);
        }
        else
        {
            if((evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE)||(evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)||(evt.getExtendedKeyCode()==KeyEvent.VK_TAB)||(evt.getKeyCode()==KeyEvent.VK_ENTER)){
                 jTextField_cost.setEditable(true);
                 if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_dist.requestFocus();
        }
            }
            else
                 jTextField_cost.setEditable(false);
        }
        
    }//GEN-LAST:event_jTextField_costKeyPressed

    private void jTextField_distKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_distKeyPressed
        String number = jTextField_dist.getText();
        int length = number.length();
        char c = evt.getKeyChar();
        if((evt.getKeyChar()>='0'&&evt.getKeyChar()<='9')||evt.getKeyChar()=='.'){        
            if(length<17){
                    jTextField_dist.setEditable(true);
            }
            else
                jTextField_dist.setEditable(false);
        }
        else
        {
            if((evt.getKeyCode()==KeyEvent.VK_ENTER)||(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE)||(evt.getExtendedKeyCode()==KeyEvent.VK_DELETE)||(evt.getExtendedKeyCode()==KeyEvent.VK_TAB))
            { 
                jTextField_dist.setEditable(true);
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_batch.requestFocus();
        }
            }
            else
                 jTextField_dist.setEditable(false);
        }
    }//GEN-LAST:event_jTextField_distKeyPressed

    private void jTextField_expiryKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_expiryKeyPressed

      if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                    
      try{
            String serial=jTextField_serial.getText();
            String party=jTextField_party.getText();
            String qty=jTextField_qty.getText();
            String cost=jTextField_cost.getText();
            String totals=jLabel_total.getText();
            String prno=jLabel_serial.getText();
            String batch=jTextField_batch.getText();
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String date=sdf.format(field_date.getDate());
            String expiry=jTextField_expiry.getText();
            String item=jTextField_item.getText();
            String itemdesc=jLabel_itemdesc.getText();
            String unit=jLabel_unit.getText();
            String dist=jTextField_dist.getText();
            P_Class type=new P_Class(0,serial,party,qty,cost,totals,prno,batch,date,expiry,item,itemdesc,unit,dist);
            if(!(party.trim().equals(""))&&!(qty.trim().equals(""))&&!(cost.trim().equals(""))&&!(item.trim().equals(""))){
                if(type.purchaseTypeQuery("add",type)){
                    jTextField_item.setText("");
                    jLabel_itemdesc.setText("");
                    jTextField_qty.setText("0");
                    jTextField_cost.setText("0");
                    jTextField_dist.setText("0");
                    jLabel_total.setText("0.00");
                    jLabel_unit.setText("");
                    jTextField_expiry.setText("");
                    jTextField_batch.setText("");    
                    
                    populate();
                    jTextField_item.requestFocus();
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(null,"Operation Failed", "Add Description", 2);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Fill the Appropiate Fields", "Empty Fields", 2);
            }    //populate();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"Select the valid DATE / FIELDS", "Empty Fields", 2);
            }
      }
    }//GEN-LAST:event_jTextField_expiryKeyPressed

    private void jTextField_serialKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_serialKeyPressed
    try{    
        int a=Integer.valueOf(jLabel_serial.getText());
        int b=Integer.valueOf(jLabel26.getText());
        int c=Integer.valueOf(jTextField_serial.getText());
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {       
            if(c>=1){
           if(c<a){
           jLabel26.setText(jTextField_serial.getText());  
           populate();
           populate_print();
           }
           else if(c>=a)
           {
               
               jLabel26.setText(jLabel_serial.getText());
               jTextField_serial.setText(jLabel_serial.getText());
               jTextField_bilty.setText("");
               jTextField_trans.setText("");
               jLabel1.setText("UNPOSTED");
               button_post.setText("POST");
               Date date=new Date();
                field_date.setDate(date);
               jLabel_totaldigit.setText("");
               jLabel_totalword.setText("");
           }
         
       }
        
        }
}
catch(Exception e)
{}
    }//GEN-LAST:event_jTextField_serialKeyPressed

    private void jTextField_qtyFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_qtyFocusGained
         double total,dist;
         String str;
        if(jTextField_qty.getText().equals("0")||jTextField_qty.getText().equals("")){
            jTextField_qty.setText("0");
        }
    
    }//GEN-LAST:event_jTextField_qtyFocusGained

    private void jTextField_qtyFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_qtyFocusLost
         double total,dist;
         String str;
        if(jTextField_qty.getText().equals("0")||jTextField_qty.getText().equals("")){
            jTextField_qty.setText("0");
        }
        
    }//GEN-LAST:event_jTextField_qtyFocusLost

    private void jTextField_costFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_costFocusGained
         double total,dist;
         String str;
        if(jTextField_cost.getText().equals("0")||jTextField_cost.getText().equals("")){
            jTextField_cost.setText("0");
        }
        
    }//GEN-LAST:event_jTextField_costFocusGained

    private void jTextField_costFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_costFocusLost
         double total,dist;
         String str;
        if(jTextField_cost.getText().equals("0")||jTextField_cost.getText().equals("")){
            jTextField_cost.setText("0");
        }
       
    }//GEN-LAST:event_jTextField_costFocusLost

    private void jTextField_distFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_distFocusGained
        double total,dist;
         String str;
        if(jTextField_dist.getText().equals("0")||jTextField_dist.getText().equals("")){
            jTextField_dist.setText("0");
        }
        
    }//GEN-LAST:event_jTextField_distFocusGained

    private void jTextField_distFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField_distFocusLost
         double total,dist;
         String str;
        if(jTextField_dist.getText().equals("0")||jTextField_dist.getText().equals("")){
            jTextField_dist.setText("0");
        }
    }//GEN-LAST:event_jTextField_distFocusLost

    private void jTextField_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_costActionPerformed
       double total,dist;
         String str;
        try{
            total=(Double.valueOf(jTextField_cost.getText())*Double.valueOf(jTextField_qty.getText()));
            dist=Double.valueOf(jTextField_dist.getText());
            dist=dist/100;
            double total1=total*dist;
            total=total-total1;
            str=String.format("%.2f", total);
            jLabel_total.setText(str);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Enter The Valid Quantity", "Quantity Error", 2);
        }
    }//GEN-LAST:event_jTextField_costActionPerformed

    private void jTextField_distActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_distActionPerformed
double total,dist;
         String str;
        try{
            total=(Double.valueOf(jTextField_cost.getText())*Double.valueOf(jTextField_qty.getText()));
            dist=Double.valueOf(jTextField_dist.getText());
            dist=dist/100;
            double total1=total*dist;
            total=total-total1;
            str=String.format("%.2f", total);
            jLabel_total.setText(str);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Enter The Valid Quantity", "Quantity Error", 2);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_distActionPerformed

    private void jLabel27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel27KeyPressed
      
    }//GEN-LAST:event_jLabel27KeyPressed

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        try{
            int a=Integer.valueOf(jLabel26.getText());
        if(a>1){
        a--;
        jLabel26.setText(String.valueOf(a));
        jTextField_serial.setText(String.valueOf(a));
        populate();
        populate_print();
        }
      
        }
        catch(Exception e)
        {}
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jTextField_biltyKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_biltyKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_trans.requestFocus();
        }        
    }//GEN-LAST:event_jTextField_biltyKeyPressed

    private void jTextField_batchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_batchKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            jTextField_expiry.requestFocus();
        }        
    }//GEN-LAST:event_jTextField_batchKeyPressed

    private void jTable1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTable1FocusGained
if(set==1){
        jTextField_party.requestFocus();
}
else if(set==2)
{
    jTextField_trans.requestFocus();
}
else if(set==3)
{
    jTextField_item.requestFocus();
}
    }//GEN-LAST:event_jTable1FocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new purchase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_add;
    private javax.swing.JButton button_close;
    private javax.swing.JButton button_edit;
    private javax.swing.JButton button_new;
    private javax.swing.JButton button_post;
    private javax.swing.JButton button_print;
    private javax.swing.JButton button_remove;
    private com.toedter.calendar.JDateChooser field_date;
    private static javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_itemdesc;
    private javax.swing.JLabel jLabel_party;
    private javax.swing.JLabel jLabel_serial;
    private javax.swing.JLabel jLabel_total;
    private javax.swing.JLabel jLabel_totaldigit;
    private javax.swing.JLabel jLabel_totalword;
    private javax.swing.JLabel jLabel_unit;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField_batch;
    private static javax.swing.JTextField jTextField_bilty;
    private javax.swing.JTextField jTextField_cost;
    private javax.swing.JTextField jTextField_dist;
    private javax.swing.JTextField jTextField_expiry;
    private javax.swing.JTextField jTextField_item;
    private static javax.swing.JTextField jTextField_party;
    private javax.swing.JTextField jTextField_qty;
    private static javax.swing.JTextField jTextField_serial;
    private static javax.swing.JTextField jTextField_trans;
    // End of variables declaration//GEN-END:variables
}
