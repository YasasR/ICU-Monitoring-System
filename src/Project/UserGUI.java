/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import java.awt.Toolkit;
import java.sql.*;
 import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author ASUS
 */
public class UserGUI extends javax.swing.JFrame {
         Connection conn=null;
         PreparedStatement st=null;
         ResultSet rs=null;
         String hos=null;
         //String hos="Kuliyapitiya Base hospital";
         int bedno=0;
         
    /**
     * Creates new form UserGUI
     */
    public UserGUI() {
        
        initComponents();
        
        //showbox(10);
         this.setLocation(300, 100);
        initialize();
         try {
                conn=DbUtill.getConnection();
               
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
       
       Done.hide();
         selectBedNo();
          tableop(bedno);
          setselected();
    }
    public UserGUI(String hos){
        
        this.hos=hos;
        initComponents();
         this.setLocation(300, 100);
        initialize();
         try {
                conn=DbUtill.getConnection();
               
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
            }
         Done.hide();
         selectBedNo();
         tableop(bedno);
         setselected();
        
    }
    private void initialize(){
        this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("ico.png")));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup buttonGroup1 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Beds = new javax.swing.JTextField();
        Done = new javax.swing.JButton();
        avbds = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ICU Operater");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 131, 167));
        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/CHANGEICO.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 40, 50));

        jLabel2.setBackground(new java.awt.Color(51, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 390, 40));

        jTable1.setBackground(new java.awt.Color(229, 236, 246));
        jTable1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Bed No", "unavailability"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(20);
        jTable1.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1.setSelectionForeground(new java.awt.Color(51, 51, 255));
        jTable1.setShowHorizontalLines(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jTable1PropertyChange(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 290, 310));

        Beds.setEditable(false);
        Beds.setBackground(new java.awt.Color(177, 233, 239));
        Beds.setBorder(null);
        Beds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BedsActionPerformed(evt);
            }
        });
        Beds.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                BedsPropertyChange(evt);
            }
        });
        getContentPane().add(Beds, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 50, 30));

        Done.setBackground(new java.awt.Color(88, 126, 195));
        Done.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Done.setText("OK");
        Done.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Done.setBorderPainted(false);
        Done.setFocusPainted(false);
        Done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoneActionPerformed(evt);
            }
        });
        getContentPane().add(Done, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 50, 30));

        avbds.setBackground(new java.awt.Color(0, 131, 167));
        avbds.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(avbds, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 170, 50, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Userbackground.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 510, 640));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("MENU");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("LOGOUT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Beds.setEditable(true);
        Done.setVisible(true);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jTable1PropertyChange
        
    }//GEN-LAST:event_jTable1PropertyChange

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int ubed=0;
        String b=null;
        Object ob=null;
        for(int i=0;i<bedno;i++){
           ob=jTable1.getValueAt(i,1);
           if(ob!=null){
               b=ob.toString();
            if(b.equalsIgnoreCase("true")){
            ubed++;
        }
           }
               
          
            
      }
        //jLabel3.setText(String.valueOf(ubed));
        int avbed=bedno-ubed;
        avbds.setText(String.valueOf(avbed));
        String sq="UPDATE `icu` SET `AvailableBeds` = '"+avbed+"' WHERE `icu`.`hospitalname` = '"+hos+"';";
             try {
                 Statement stt=conn.createStatement();
                 stt.executeUpdate(sq);
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex);
             }
             String sq1="UPDATE `markers` SET `avbeds` = '"+avbed+"' WHERE `markers`.`hname` = '"+hos+"';";
             try {
                 Statement stt=conn.createStatement();
                 stt.executeUpdate(sq1);
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex);
             }
         Done.hide();
         selectBedNo();
         tableop(bedno);
         setselected();
         
    }//GEN-LAST:event_jTable1MouseClicked

    private void BedsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_BedsPropertyChange
        
    }//GEN-LAST:event_BedsPropertyChange
public void setselected(){
    String sql="SELECT `AvailableBeds`FROM `icu` WHERE `hospitalname`='"+hos+"';";
    
             try {
                 st=conn.prepareStatement(sql);
                 rs=st.executeQuery();
                 if(rs.next()){
                     int av=bedno-rs.getInt("AvailableBeds");
                     avbds.setText(rs.getString("AvailableBeds"));
                     for(int i=0;i<av;i++){
                         jTable1.setValueAt(true, i,1);
                     }
                 }
             } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, ex);
             }
    
    
}
    private void DoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoneActionPerformed
        int bd=Integer.parseInt(Beds.getText());
        String sql="SELECT `icuID` FROM `icu` WHERE `hospitalname`='"+hos+"';";       
        String id="";
        try {
            
            st=conn.prepareStatement(sql);
            rs=st.executeQuery();
            if(rs.next()){
                
                id = rs.getString("icuID");
               
            }
            //rs.close();
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        if(!id.isEmpty())
         try {
            String sq="INSERT INTO `icuupd` (`des`, `icuID`, `hospitalname`,`beds`) VALUES ('Bedchange','"+id+"','"+hos+"', '"+bd+"');";
            Statement s=conn.prepareStatement(sq);
            s.executeUpdate(sq);
            JOptionPane.showMessageDialog(null, "Done");
            Done.hide();
            
            
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        
    }//GEN-LAST:event_DoneActionPerformed

    private void BedsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BedsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BedsActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        selectBedNo();
          tableop(bedno);
          setselected();
    }//GEN-LAST:event_formMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Login lg=new Login();
       lg.setVisible(true);
       dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        
        String number=null;

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserGUI().setVisible(true);
            }
        });
    }
    public void tableop(int cnt){
      DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       model.setRowCount(bedno);
        for(int i=1;i<=cnt;i++){
            jTable1.setValueAt("Bed No :"+i, (i-1),0);
        }
    }
    
    
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Beds;
    private javax.swing.JButton Done;
    private javax.swing.JLabel avbds;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void selectBedNo() {
        jLabel2.setText(hos);
        
        String sq="Select * from icu where hospitalname='"+hos+"';  ";
         try {
            
            st=conn.prepareStatement(sq);
            rs=st.executeQuery();
            if(rs.next()){
                bedno=rs.getInt("Beds");
                String number = rs.getString("Beds");
                Beds.setText(number);
            }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
