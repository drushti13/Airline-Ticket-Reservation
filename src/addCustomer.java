
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author drush
 */
public class addCustomer extends javax.swing.JInternalFrame {
    private static final String username ="root";
    private static final String password ="root";
    private static final String dataConn ="jdbc:mysql://localhost:3360/airlines";
    Connection sqlConn;
    PreparedStatement pst=null;
    ResultSet rs=null; 
    int q,i,id,deleteItem;
    
public Object DefaultTableMode1;



public addCustomer() {
        initComponents();
        autoID();
    }
    // </editor-fold>

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        addCustPanel = new javax.swing.JPanel();
        custidLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        passportidLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        conatctnoLabel = new javax.swing.JLabel();
        firstnameTextField = new javax.swing.JTextField();
        lastnameTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        passportidTextField = new javax.swing.JTextField();
        contactnoTextField = new javax.swing.JTextField();
        r1 = new javax.swing.JRadioButton();
        r2 = new javax.swing.JRadioButton();
        addButton1 = new javax.swing.JButton();
        custidLabel2 = new javax.swing.JLabel();

        jTextField6.setText("jTextField1");

        jTextField8.setText("jTextField1");

        setPreferredSize(new java.awt.Dimension(1145, 626));

        addCustPanel.setBackground(new java.awt.Color(0, 51, 51));
        addCustPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CUSTOMER DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        addCustPanel.setPreferredSize(new java.awt.Dimension(1400, 800));

        custidLabel1.setFont(new java.awt.Font("Calibri", 3, 20)); // NOI18N
        custidLabel1.setForeground(new java.awt.Color(255, 255, 255));
        custidLabel1.setText("CUSTOMER ID");

        firstnameLabel.setBackground(new java.awt.Color(51, 51, 51));
        firstnameLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        firstnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        firstnameLabel.setText("FIRST NAME");
        firstnameLabel.setAutoscrolls(true);

        lastnameLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        lastnameLabel.setForeground(new java.awt.Color(255, 255, 255));
        lastnameLabel.setText("LAST NAME");

        genderLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        genderLabel.setForeground(new java.awt.Color(255, 255, 255));
        genderLabel.setText("GENDER");

        ageLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        ageLabel.setForeground(new java.awt.Color(255, 255, 255));
        ageLabel.setText("AGE");

        passportidLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        passportidLabel.setForeground(new java.awt.Color(255, 255, 255));
        passportidLabel.setText("PASSPORT ID");

        cityLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        cityLabel.setForeground(new java.awt.Color(255, 255, 255));
        cityLabel.setText("CITY");

        conatctnoLabel.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        conatctnoLabel.setForeground(new java.awt.Color(255, 255, 255));
        conatctnoLabel.setText("CONTACT NO.");

        firstnameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameTextFieldActionPerformed(evt);
            }
        });

        r1.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        r1.setForeground(new java.awt.Color(255, 255, 255));
        r1.setText("MALE");

        r2.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        r2.setForeground(new java.awt.Color(255, 255, 255));
        r2.setText("FEMALE");
        r2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r2ActionPerformed(evt);
            }
        });

        addButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addButton1.setText("ADD CUSTOMER");
        addButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButton1ActionPerformed(evt);
            }
        });

        custidLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        custidLabel2.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout addCustPanelLayout = new javax.swing.GroupLayout(addCustPanel);
        addCustPanel.setLayout(addCustPanelLayout);
        addCustPanelLayout.setHorizontalGroup(
            addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCustPanelLayout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(addCustPanelLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addCustPanelLayout.createSequentialGroup()
                                .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(addCustPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addCustPanelLayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cityTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(ageTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                                .addComponent(lastnameTextField, javax.swing.GroupLayout.Alignment.LEADING)))))
                                .addGap(78, 78, 78))
                            .addGroup(addCustPanelLayout.createSequentialGroup()
                                .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addCustPanelLayout.createSequentialGroup()
                                        .addComponent(custidLabel1)
                                        .addGap(123, 123, 123)
                                        .addComponent(custidLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(addCustPanelLayout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(firstnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lastnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 6, Short.MAX_VALUE)))))
                .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addCustPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addCustPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(conatctnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passportidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(passportidTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                            .addComponent(contactnoTextField))))
                .addContainerGap(552, Short.MAX_VALUE))
            .addGroup(addCustPanelLayout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addCustPanelLayout.setVerticalGroup(
            addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addCustPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(custidLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custidLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(r2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(conatctnoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactnoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastnameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passportidLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passportidTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(addCustPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(addButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCustPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addCustPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
   public void autoID()
    {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            sqlConn =DriverManager.getConnection(dataConn ,username ,password );
            Statement s= sqlConn.createStatement();
            rs = s.executeQuery("select MAX(CustId) from customerdetails");
            rs.next(); 
            rs.getString("MAX(CustId)");
            if(rs.getString("MAX(CustId)")==null)
            {
              custidLabel2.setText("1000");
            }
            else
            {
                long CustId =Long.parseLong(rs.getString("MAX(CustId)"));
                CustId++;
                custidLabel2.setText(""+ CustId);
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    private void firstnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameTextFieldActionPerformed

    private void addButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButton1ActionPerformed

        String firstname =firstnameTextField.getText();
        String lastname =lastnameTextField.getText();
        String city =cityTextField.getText();
        String age=ageTextField.getText();
        String Gender;
        if(r1.isSelected())
        {
            Gender="Male";
        }
        else{
            Gender="Female";
        }
        String contactno=contactnoTextField.getText();
        String passportid=passportidTextField.getText();
     String custid=custidLabel2.getText();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn =DriverManager.getConnection(dataConn ,username ,password );
            pst= sqlConn.prepareStatement("insert into customerdetails(CustId,FirstName,"
                    + "LastName, City,Age,ContactNo,PassportId,Gender)values(?,?,?,?,?,?,?,?)");
            pst.setString(1, custid);
            pst.setString(2, firstname);
            pst.setString(3, lastname);
            pst.setString(4, city);
            pst.setString(5, age);
            pst.setString(6, contactno);
            pst.setString(7, passportid);
            pst.setString(8, Gender);
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registration Created");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
        }
                                      
   
                                          
                                  
                                  
    }//GEN-LAST:event_addButton1ActionPerformed

    private void r2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_r2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton1;
    private javax.swing.JPanel addCustPanel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel conatctnoLabel;
    private javax.swing.JTextField contactnoTextField;
    private javax.swing.JLabel custidLabel1;
    private javax.swing.JLabel custidLabel2;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.JTextField firstnameTextField;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JTextField lastnameTextField;
    private javax.swing.JLabel passportidLabel;
    private javax.swing.JTextField passportidTextField;
    private javax.swing.JRadioButton r1;
    private javax.swing.JRadioButton r2;
    // End of variables declaration//GEN-END:variables

   
    
}
