
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

/**
 *
 * @author drush
 */
public class options extends javax.swing.JInternalFrame {
    

    public options() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        optsPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        addcustButton2 = new javax.swing.JButton();
        bookflightButton2 = new javax.swing.JButton();
        cancelButton2 = new javax.swing.JButton();
        flightschedulesButton2 = new javax.swing.JButton();
        ExitButton2 = new javax.swing.JButton();

        setOpaque(true);
        setPreferredSize(new java.awt.Dimension(1500, 800));

        optsPanel.setBackground(new java.awt.Color(0, 51, 51));
        optsPanel.setPreferredSize(new java.awt.Dimension(1400, 800));

        javax.swing.GroupLayout optsPanelLayout = new javax.swing.GroupLayout(optsPanel);
        optsPanel.setLayout(optsPanelLayout);
        optsPanelLayout.setHorizontalGroup(
            optsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1561, Short.MAX_VALUE)
        );
        optsPanelLayout.setVerticalGroup(
            optsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("WELCOME ONBOARD!!");

        addcustButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addcustButton2.setText("ADD CUSTOMER");
        addcustButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcustButton2ActionPerformed(evt);
            }
        });

        bookflightButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bookflightButton2.setText("BOOK FLIGHT");
        bookflightButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookflightButton2ActionPerformed(evt);
            }
        });

        cancelButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelButton2.setText("CANCEL FLIGHT");
        cancelButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButton2ActionPerformed(evt);
            }
        });

        flightschedulesButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        flightschedulesButton2.setText("FLIGHT SCHEDULES");
        flightschedulesButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flightschedulesButton2ActionPerformed(evt);
            }
        });

        ExitButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ExitButton2.setText("EXIT");
        ExitButton2.setPreferredSize(new java.awt.Dimension(134, 23));
        ExitButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ExitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookflightButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(flightschedulesButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addcustButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(239, 239, 239))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addcustButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(flightschedulesButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(bookflightButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(cancelButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(ExitButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(optsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(optsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        optsPanel.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents
private JFrame frame;
    private void bookflightButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookflightButton2ActionPerformed
        optsPanel.removeAll();
        bookflight bk=new bookflight();
        optsPanel.add(bk);
        bk.setVisible(true);


    }//GEN-LAST:event_bookflightButton2ActionPerformed

    private void addcustButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcustButton2ActionPerformed
        optsPanel.removeAll();
        addCustomer cs=new addCustomer();
        optsPanel.add(cs).setVisible(true);
    }//GEN-LAST:event_addcustButton2ActionPerformed

    private void ExitButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitButton2ActionPerformed
        frame = new JFrame("Cancel");
        if(JOptionPane.showConfirmDialog(frame, "Confirm you want to cancel?", "MYSQL Connector",
            JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    {
        System.exit(0);
        } else {
        }
    }//GEN-LAST:event_ExitButton2ActionPerformed

    private void flightschedulesButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flightschedulesButton2ActionPerformed
        optsPanel.removeAll();
        flightSchedules fs=new flightSchedules();
        optsPanel.add(fs);
        fs.setVisible(true);
    }//GEN-LAST:event_flightschedulesButton2ActionPerformed

    private void cancelButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButton2ActionPerformed
        optsPanel.removeAll();
        Cancelflight cf=new Cancelflight();
        optsPanel.add(cf);
        cf.setVisible(true);
    }//GEN-LAST:event_cancelButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitButton2;
    private javax.swing.JButton addcustButton2;
    private javax.swing.JButton bookflightButton2;
    private javax.swing.JButton cancelButton2;
    private javax.swing.JButton flightschedulesButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel optsPanel;
    // End of variables declaration//GEN-END:variables
}