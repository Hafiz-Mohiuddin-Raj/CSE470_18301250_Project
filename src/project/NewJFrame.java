/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        WITHDRAW = new javax.swing.JButton();
        TRANSFER = new javax.swing.JButton();
        DEPOSIT = new javax.swing.JButton();
        CHECKBALANCE = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 255));
        jLabel4.setText("                          NEXTGEN BANK");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1266, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        getContentPane().add(jPanel4, java.awt.BorderLayout.PAGE_START);

        jPanel5.setForeground(new java.awt.Color(204, 204, 255));

        jLabel5.setBackground(new java.awt.Color(51, 0, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 255));
        jLabel5.setText("PIN");

        jLabel6.setBackground(new java.awt.Color(51, 0, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 255));
        jLabel6.setText("USERNAME");

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 51, 255));
        jButton2.setText("ENTER");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        WITHDRAW.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        WITHDRAW.setForeground(new java.awt.Color(153, 153, 255));
        WITHDRAW.setText("WITHDRAW");
        WITHDRAW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WITHDRAWActionPerformed(evt);
            }
        });

        TRANSFER.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        TRANSFER.setForeground(new java.awt.Color(153, 153, 255));
        TRANSFER.setText("TRANSFER");
        TRANSFER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRANSFERActionPerformed(evt);
            }
        });

        DEPOSIT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        DEPOSIT.setForeground(new java.awt.Color(153, 153, 255));
        DEPOSIT.setText("DEPOSIT");
        DEPOSIT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DEPOSITActionPerformed(evt);
            }
        });

        CHECKBALANCE.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CHECKBALANCE.setForeground(new java.awt.Color(153, 153, 255));
        CHECKBALANCE.setText("CHECK BALANCE");
        CHECKBALANCE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CHECKBALANCEActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TRANSFER, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(WITHDRAW, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CHECKBALANCE, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(DEPOSIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(1323, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(WITHDRAW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CHECKBALANCE, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(DEPOSIT)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TRANSFER)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPasswordField2, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(jTextField2)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(jButton2)))
                        .addGap(0, 1264, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
           try{
        String PIN=jPasswordField2.getText();
        String USERNAME=jTextField2.getText();
        String url="jdbc:mysql://127.0.0.1/atm2";
        String user="root";
        String password="";
        
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection= (Connection)DriverManager.getConnection(url, user, password);
       String query="select valid_pin_no from atm where valid_pin_no='"+PIN+"'and valid_unique_username='"+USERNAME+"'" ;
      
       Statement statement= connection.createStatement(); 
      
  
      
      
     statement.executeQuery(query);
     JOptionPane.showMessageDialog(null,"welcome");
     
      
    
    }
        
        
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"wrong info");}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void CHECKBALANCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CHECKBALANCEActionPerformed
        // TODO add your handling code here:
        try{
         String PIN=jPasswordField2.getText();
        String USERNAME=jTextField2.getText();
        String url="jdbc:mysql://127.0.0.1/atm2";
        String user="root";
        String password="";
        
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection= (Connection)DriverManager.getConnection(url, user, password);
       String query="select total_amount from accounts inner join customers on accounts.account_number=customers.account_num where customers.pin_no='"+PIN+"'and customers.username='"+USERNAME+"'" ;
JFrame f=new JFrame();
String date=JOptionPane.showInputDialog(f,"date");

       String query2="update accounts join customers on accounts.account_number=customers.account_num set accounts.date_checked='"+date+"' where customers.pin_no='"+PIN+"'and customers.username='"+USERNAME+"'" ;

      
       Statement statement= connection.createStatement(); 
      
  
      
      
    
      ResultSet result;
      result=statement.executeQuery(query);
      result.next(); 
      String amount= result.getString("total_amount");
   

     JOptionPane.showMessageDialog(null,amount);
     
      
    }//GEN-LAST:event_CHECKBALANCEActionPerformed
  catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"wrong info");}
    }
    private void DEPOSITActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DEPOSITActionPerformed
        // TODO add your handling code here:
                try{
        String PIN=jPasswordField2.getText();
        String USERNAME=jTextField2.getText();
        String url="jdbc:mysql://127.0.0.1/atm2";
        String user="root";
        String password="";
        
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection= (Connection)DriverManager.getConnection(url, user, password);
       
     JFrame f=new JFrame();   
    String amount2=JOptionPane.showInputDialog(f,"Enter amount");
    
    String date=JOptionPane.showInputDialog(f,"date");

     String query=" update deposit inner join accounts on accounts.account_number=deposit.account_number left join customers on customers.account_num=deposit.account_number set accounts.total_amount=(accounts.total_amount+'"+amount2+"'),amountDeposited='"+amount2+"',accounts.date_checked='"+date+"' where customers.pin_no='"+PIN+"'and customers.username='"+USERNAME+"'" ;
                    String account = null;
String query4="update transactions join deposit on transactions.transaction_id=deposit.transaction_id join customers on customers.account_num=deposit.account_number set deposit.transaction_id=22,transactions.transaction_id=22, transactions.toAccount='"+account+"',transactions.fromAccount=deposit.account_number,transactions.amount='"+amount2+"' where customers.pin_no='"+PIN+"'"; 

      
      Statement statement= connection.createStatement(); 
      
  
      
      
     statement.executeUpdate(query);
     statement.executeUpdate(query4);
     
     // JOptionPane.showMessageDialog(null,amount);
    
    }
        
        
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"wrong info");}

    
        
    }//GEN-LAST:event_DEPOSITActionPerformed

    private void TRANSFERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRANSFERActionPerformed
        try{
        String PIN=jPasswordField2.getText();
        String USERNAME=jTextField2.getText();
        String url="jdbc:mysql://127.0.0.1/atm2";
        String user="root";
        String password="";
        
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection= (Connection)DriverManager.getConnection(url, user, password);
       
     JFrame f=new JFrame();   
    String amount2=JOptionPane.showInputDialog(f,"Enter amount");
    String account=JOptionPane.showInputDialog(f,"Enter accountNumber");
     String query=" update transfer inner join accounts on accounts.account_number=transfer.account_number left join customers on customers.account_num=transfer.account_number set accounts.total_amount=(accounts.total_amount-'"+amount2+"') where customers.pin_no='"+PIN+"'and customers.username='"+USERNAME+"'" ;
      
     String query2=" update accounts set total_amount=(total_amount+ '"+amount2+"') where account_number='"+account+"'";
     
     String query4="update transactions join transfer on transactions.transaction_id=transfer.transaction_id join customers on customers.account_num=transfer.account_number set transfer.transaction_id=22,transactions.transaction_id=22, transactions.toAccount='"+account+"',transactions.fromAccount=transfer.account_number,transactions.amount='"+amount2+"' where customers.pin_no='"+PIN+"'"; 
     Statement statement= connection.createStatement(); 
      
  
      
      
     statement.executeUpdate(query);
     statement.executeUpdate(query2);
     
      statement.executeUpdate(query4);
     
     // JOptionPane.showMessageDialog(null,amount);
    
    }
        
        
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"wrong info");}

    
        
                            
              
        
    }//GEN-LAST:event_TRANSFERActionPerformed

    private void WITHDRAWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WITHDRAWActionPerformed
        try{
        String PIN=jPasswordField2.getText();
        String USERNAME=jTextField2.getText();
        String url="jdbc:mysql://127.0.0.1/atm2";
        String user="root";
        String password="";
        
       Class.forName("com.mysql.jdbc.Driver");
       Connection connection= (Connection)DriverManager.getConnection(url, user, password);
       
     JFrame f=new JFrame();   
    String amount2=JOptionPane.showInputDialog(f,"Enter amount");
    String date=JOptionPane.showInputDialog(f,"Enter date");
     String query=" update withdrawal inner join accounts on accounts.account_number=withdrawal.account_number left join customers on customers.account_num=withdrawal.account_number set accounts.total_amount=(accounts.total_amount-'"+amount2+"'),amountWithdrawn='"+amount2+"',accounts.date_checked='"+date+"' where customers.pin_no='"+PIN+"'and customers.username='"+USERNAME+"'" ;
            String account = null;

      
     String query4="update transactions join withdrawal on transactions.transaction_id=withdrawal.transaction_id join customers on customers.account_num=withdrawal.account_number set withdrawal.transaction_id=22,transactions.transaction_id=22, transactions.toAccount='"+account+"',transactions.fromAccount=withdrawal.account_number,transactions.amount='"+amount2+"' where customers.pin_no='"+PIN+"'"; 

      Statement statement= connection.createStatement(); 
      
  
      
      
     
     statement.executeUpdate(query);
statement.executeUpdate(query4);
    
     
     // JOptionPane.showMessageDialog(null,amount);
    
    }
        
        
        catch(HeadlessException | ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"wrong info");}

    
        
                            
    }//GEN-LAST:event_WITHDRAWActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CHECKBALANCE;
    private javax.swing.JButton DEPOSIT;
    private javax.swing.JButton TRANSFER;
    private javax.swing.JButton WITHDRAW;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}



    /**

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
