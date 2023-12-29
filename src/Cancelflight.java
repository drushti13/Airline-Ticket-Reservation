
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author drush
 */
public class Cancelflight extends javax.swing.JInternalFrame {
    
private static final String username ="root";
    private static final String password ="root";
    private static final String dataConn ="jdbc:mysql://localhost:3360/airlines";
    Connection sqlConn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    int q,i,id,deleteItem;
    private Object DefaultTableModel;
    
    public Cancelflight() {
        initComponents();
        init();
    }
    
    private void init(){
        jPanel1.setVisible(false);
        CancelflightCancelLabel1.setVisible(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        CancelflightPanel = new javax.swing.JPanel();
        CancelflightCustIDTextField = new javax.swing.JTextField();
        CancelflightCustIDLabel = new javax.swing.JLabel();
        CancelflightCustNameTextField = new javax.swing.JTextField();
        CancelflightCustNameLabel = new javax.swing.JLabel();
        CancelflightSubmitLabel1 = new javax.swing.JButton();
        CancelflightBackLabel1 = new javax.swing.JButton();
        CancelflightCancelLabel1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CancelflightTable = new javax.swing.JTable();

        jButton1.setText("jButton1");

        setPreferredSize(new java.awt.Dimension(1400, 800));

        CancelflightPanel.setBackground(new java.awt.Color(0, 51, 51));
        CancelflightPanel.setPreferredSize(new java.awt.Dimension(1400, 800));

        CancelflightCustIDLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CancelflightCustIDLabel.setForeground(new java.awt.Color(255, 255, 255));
        CancelflightCustIDLabel.setText("CUSTOMER ID ");

        CancelflightCustNameLabel.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        CancelflightCustNameLabel.setForeground(new java.awt.Color(255, 255, 255));
        CancelflightCustNameLabel.setText("CUSTOMER NAME");

        CancelflightSubmitLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CancelflightSubmitLabel1.setText("SUBMIT");
        CancelflightSubmitLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelflightSubmitLabel1ActionPerformed(evt);
            }
        });

        CancelflightBackLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CancelflightBackLabel1.setText("BACK");
        CancelflightBackLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelflightBackLabel1ActionPerformed(evt);
            }
        });

        CancelflightCancelLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CancelflightCancelLabel1.setText("CONFIRM CANCELLATION");
        CancelflightCancelLabel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelflightCancelLabel1ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        CancelflightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "SOURCE", "DESTINATION", "ARRIVAL TIME", "DEPARTURE TIME", "CLASS", "PRICE", "AIRLINE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(CancelflightTable);
        if (CancelflightTable.getColumnModel().getColumnCount() > 0) {
            CancelflightTable.getColumnModel().getColumn(0).setResizable(false);
            CancelflightTable.getColumnModel().getColumn(1).setResizable(false);
            CancelflightTable.getColumnModel().getColumn(2).setResizable(false);
            CancelflightTable.getColumnModel().getColumn(3).setResizable(false);
            CancelflightTable.getColumnModel().getColumn(4).setResizable(false);
            CancelflightTable.getColumnModel().getColumn(5).setResizable(false);
            CancelflightTable.getColumnModel().getColumn(6).setResizable(false);
            CancelflightTable.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1044, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout CancelflightPanelLayout = new javax.swing.GroupLayout(CancelflightPanel);
        CancelflightPanel.setLayout(CancelflightPanelLayout);
        CancelflightPanelLayout.setHorizontalGroup(
            CancelflightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelflightPanelLayout.createSequentialGroup()
                .addGroup(CancelflightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CancelflightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(CancelflightPanelLayout.createSequentialGroup()
                            .addGap(320, 320, 320)
                            .addComponent(CancelflightCustNameLabel)
                            .addGap(160, 160, 160)
                            .addComponent(CancelflightCustNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CancelflightPanelLayout.createSequentialGroup()
                            .addGap(159, 159, 159)
                            .addComponent(CancelflightCustIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(145, 145, 145)
                            .addComponent(CancelflightCustIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, CancelflightPanelLayout.createSequentialGroup()
                        .addGap(453, 453, 453)
                        .addComponent(CancelflightCancelLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(970, 970, 970)
                        .addComponent(CancelflightBackLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(CancelflightPanelLayout.createSequentialGroup()
                .addGroup(CancelflightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CancelflightPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CancelflightPanelLayout.createSequentialGroup()
                        .addGap(448, 448, 448)
                        .addComponent(CancelflightSubmitLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        CancelflightPanelLayout.setVerticalGroup(
            CancelflightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CancelflightPanelLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(CancelflightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelflightCustIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelflightCustIDLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(CancelflightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelflightCustNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelflightCustNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(CancelflightSubmitLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(CancelflightPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelflightCancelLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelflightBackLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(265, 265, 265))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CancelflightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(911, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CancelflightPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(323, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CancelflightSubmitLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelflightSubmitLabel1ActionPerformed
        String custId =CancelflightCustIDTextField.getText();
        String custName =CancelflightCustNameTextField.getText();
     
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn =DriverManager.getConnection(dataConn ,username ,password );
            String dbQuery = "SELECT * FROM airlinedetails a JOIN bookingdetails b on b.flightNo = a.flightNo WHERE b.CustId = ?;";
            //String dbQuery1 = "SELECT * FROM airlinedetails a JOIN bookingdetails b on b.flightNo = a.flightNo WHERE b.CustId = ? AND b.flightNo = ?;";
            pst= sqlConn.prepareStatement(dbQuery);
            pst.setString(1, custId);
            rs = pst.executeQuery();
            
            int columns = rs.getMetaData().getColumnCount();
            if(!rs.isBeforeFirst())
                JOptionPane.showMessageDialog(null, "This customer has not booked any flight!");
            else{
                jPanel1.setVisible(true);
            while(rs.next())
            {  
                Object[] row = new Object[columns];
                for (int j = 1; j <= columns; j++)
                {  
                    row[j - 1] = rs.getObject(j);
                }
                ((DefaultTableModel) CancelflightTable.getModel()).insertRow(rs.getRow()-1,row);
            }
            CancelflightCancelLabel1.setVisible(true);
            }

        rs.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(addCustomer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Customer ID doesnot exist please check again");
        }
        
    }//GEN-LAST:event_CancelflightSubmitLabel1ActionPerformed

    private void CancelflightCancelLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelflightCancelLabel1ActionPerformed
        DefaultTableModel model = (DefaultTableModel)CancelflightTable.getModel();
        int selectedRow = CancelflightTable.getSelectedRow();
        String flightNumber = model.getValueAt(selectedRow, 0).toString();
        String custId = CancelflightCustIDTextField.getText();
        String deleteBookingInfo = "DELETE FROM bookingdetails WHERE flightNo = ? AND CustId = ?; ";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn =DriverManager.getConnection(dataConn ,username ,password );
            pst= sqlConn.prepareStatement(deleteBookingInfo);
            pst.setString(1, flightNumber);
            pst.setString(2, custId);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Flight was successfully cancelled.");
        }catch(ClassNotFoundException ex) {
            Logger.getLogger(bookflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bookflight.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Customer ID doesnot exist please check again");
        }
    }//GEN-LAST:event_CancelflightCancelLabel1ActionPerformed

    private void CancelflightBackLabel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelflightBackLabel1ActionPerformed
       this.hide();
    }//GEN-LAST:event_CancelflightBackLabel1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelflightBackLabel1;
    private javax.swing.JButton CancelflightCancelLabel1;
    private javax.swing.JLabel CancelflightCustIDLabel;
    private javax.swing.JTextField CancelflightCustIDTextField;
    private javax.swing.JLabel CancelflightCustNameLabel;
    private javax.swing.JTextField CancelflightCustNameTextField;
    private javax.swing.JPanel CancelflightPanel;
    private javax.swing.JButton CancelflightSubmitLabel1;
    private javax.swing.JTable CancelflightTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
