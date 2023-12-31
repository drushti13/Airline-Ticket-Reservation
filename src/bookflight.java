
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author drush
 */
public class bookflight extends javax.swing.JInternalFrame {
private static final String username ="root";
    private static final String password ="root";
    private static final String dataConn ="jdbc:mysql://localhost:3360/airlines";
    Connection sqlConn;
    PreparedStatement pst=null;
    ResultSet rs=null; 
    int q,i,id,deleteItem;
    
public Object DefaultTableMode1;
    /**
     * Creates new form bookflight
     */
    public bookflight() {
        initComponents();
        init();
    }
    
    private void init(){
        jPanel1.setVisible(false);
        bookflightBookButton.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookflightPane = new javax.swing.JPanel();
        bookflightCustId = new javax.swing.JLabel();
        bookflightSource = new javax.swing.JLabel();
        bookflightDestination = new javax.swing.JLabel();
        bookflightCustIdTextField1 = new javax.swing.JTextField();
        bookflightSourceTextField = new javax.swing.JTextField();
        bookflightDestinationTextField2 = new javax.swing.JTextField();
        bookflightSubmitButton = new javax.swing.JButton();
        bookflightBookButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bookflightTable = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(1267, 638));

        bookflightPane.setBackground(new java.awt.Color(0, 51, 51));
        bookflightPane.setPreferredSize(new java.awt.Dimension(1400, 800));

        bookflightCustId.setBackground(new java.awt.Color(255, 255, 255));
        bookflightCustId.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        bookflightCustId.setForeground(new java.awt.Color(255, 255, 255));
        bookflightCustId.setText("CUSTOMER ID");

        bookflightSource.setBackground(new java.awt.Color(255, 255, 255));
        bookflightSource.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        bookflightSource.setForeground(new java.awt.Color(255, 255, 255));
        bookflightSource.setText("SOURCE");

        bookflightDestination.setBackground(new java.awt.Color(255, 255, 255));
        bookflightDestination.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        bookflightDestination.setForeground(new java.awt.Color(255, 255, 255));
        bookflightDestination.setText("DESTINATION");

        bookflightSubmitButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookflightSubmitButton.setText("SUBMIT");
        bookflightSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookflightSubmitButtonActionPerformed(evt);
            }
        });

        bookflightBookButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookflightBookButton.setText("BOOK FLIGHT");
        bookflightBookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookflightBookButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));

        bookflightTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Source", "Destination", "Departure time", "Arrival Time", "Class", "Price", "Airline"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
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
        bookflightTable.getTableHeader().setReorderingAllowed(false);
        bookflightTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookflightTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookflightTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1098, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout bookflightPaneLayout = new javax.swing.GroupLayout(bookflightPane);
        bookflightPane.setLayout(bookflightPaneLayout);
        bookflightPaneLayout.setHorizontalGroup(
            bookflightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookflightPaneLayout.createSequentialGroup()
                .addGroup(bookflightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bookflightPaneLayout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addGroup(bookflightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookflightCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookflightSource, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookflightDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(235, 235, 235)
                        .addGroup(bookflightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookflightDestinationTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookflightSourceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookflightCustIdTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(bookflightPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookflightPaneLayout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(bookflightSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bookflightPaneLayout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(bookflightBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(284, Short.MAX_VALUE))
        );
        bookflightPaneLayout.setVerticalGroup(
            bookflightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bookflightPaneLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(bookflightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookflightCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookflightCustIdTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(bookflightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bookflightSource, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookflightSourceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bookflightPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bookflightDestination, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookflightDestinationTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(bookflightSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bookflightBookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bookflightPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 358, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookflightPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookflightSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookflightSubmitButtonActionPerformed
     String custId =bookflightCustIdTextField1.getText();
        String source =bookflightSourceTextField.getText();
        String destination =bookflightDestinationTextField2.getText();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn =DriverManager.getConnection(dataConn ,username ,password );
            pst= sqlConn.prepareStatement("SELECT * FROM airlinedetails WHERE source=? AND destination=?;");
            pst.setString(1, source);
            pst.setString(2, destination);
            rs = pst.executeQuery();
            
            int columns = rs.getMetaData().getColumnCount();
            if(!rs.isBeforeFirst())
                JOptionPane.showMessageDialog(null, "No flights found for selected source and destinations. Please try again!");
            else{
                jPanel1.setVisible(true);
                while(rs.next())
                {  
                    Object[] row = new Object[columns];
                    for (int j = 1; j <= columns; j++)
                    {  
                        row[j - 1] = rs.getObject(j);
                    }
                    ((DefaultTableModel) bookflightTable.getModel()).insertRow(rs.getRow()-1,row);
                }
                bookflightBookButton.setVisible(true);
            
            }
        rs.close();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(bookflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bookflight.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookflightSubmitButtonActionPerformed

    private void bookflightTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookflightTableMouseClicked
        
  
    }//GEN-LAST:event_bookflightTableMouseClicked

    private void bookflightBookButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookflightBookButtonActionPerformed
        DefaultTableModel model = (DefaultTableModel)bookflightTable.getModel();
        int selectedRow = bookflightTable.getSelectedRow();
        String flightNumber = model.getValueAt(selectedRow, 0).toString();
        String custId =bookflightCustIdTextField1.getText();
        String insertBookingInfo = "INSERT INTO bookingdetails (flightNo, CustId) VALUES (?,?); ";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            sqlConn =DriverManager.getConnection(dataConn ,username ,password );
            pst= sqlConn.prepareStatement(insertBookingInfo);
            pst.setString(1, flightNumber);
            pst.setString(2, custId);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Congratulation flight booked successfully!!");
        }catch(ClassNotFoundException ex) {
            Logger.getLogger(bookflight.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(bookflight.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Customer ID doesnot exist please check again");
        }
    }//GEN-LAST:event_bookflightBookButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bookflightBookButton;
    private javax.swing.JLabel bookflightCustId;
    private javax.swing.JTextField bookflightCustIdTextField1;
    private javax.swing.JLabel bookflightDestination;
    private javax.swing.JTextField bookflightDestinationTextField2;
    private javax.swing.JPanel bookflightPane;
    private javax.swing.JLabel bookflightSource;
    private javax.swing.JTextField bookflightSourceTextField;
    private javax.swing.JButton bookflightSubmitButton;
    private javax.swing.JTable bookflightTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
