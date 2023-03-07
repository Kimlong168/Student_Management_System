/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Kimlong
 */
public class LoginAsAdmin extends javax.swing.JFrame {

    /**
     * Creates new form LoginAsAdmin
     */
    private static final String dataConn="jdbc:mysql://localhost:3306/jdbcdemo";
    private static final String username="root";
    private static final String password="";
    Connection sqlConn = null;
    PreparedStatement pst= null;
    ResultSet rs=null;

    int q,isLogin=0;
    String sql="select * from user";
    public void UserLoginAsAdmin(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            sqlConn = DriverManager.getConnection(dataConn,username,password);
            pst = sqlConn.prepareStatement(sql);

            rs = pst.executeQuery();
            ResultSetMetaData stData = rs.getMetaData();
            q = stData.getColumnCount();

            while(rs.next()){
                if(rs.getString("username").compareTo(adminName.getText())==0
                        && rs.getString("email").compareTo(adminEmail.getText())==0
                        && rs.getString("password").compareTo(adminPassword.getText())==0
                        && rs.getInt("admin")==1){
                    isLogin=1;
                }
            }

        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }
    public LoginAsAdmin() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        adminName = new javax.swing.JTextField();
        adminEmail = new javax.swing.JTextField();
        btnAdminLogin = new javax.swing.JButton();
        adminPassword = new javax.swing.JPasswordField();
        btnback = new javax.swing.JLabel();
        adminWarning1 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Username: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Email:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Password:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("LOGIN AS ADMIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        l1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        l1.setText("Username: ");

        l2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        l2.setText("Email:");

        l3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        l3.setText("Password:");

        btnAdminLogin.setBackground(new java.awt.Color(255, 51, 51));
        btnAdminLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdminLogin.setForeground(new java.awt.Color(242, 242, 242));
        btnAdminLogin.setText("Login");
        btnAdminLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminLoginActionPerformed(evt);
            }
        });

        btnback.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnback.setForeground(new java.awt.Color(255, 0, 51));
        btnback.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnback.setText("Back to Home");
        btnback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnbackMouseClicked(evt);
            }
        });

        adminWarning1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        adminWarning1.setForeground(new java.awt.Color(255, 0, 0));
        adminWarning1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminWarning1.setText(" ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnback, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l1)
                            .addComponent(l2)
                            .addComponent(l3))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(adminEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(adminPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(btnAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(adminWarning1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l1))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adminEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l2))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l3)
                    .addComponent(adminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(adminWarning1)
                .addGap(47, 47, 47)
                .addComponent(btnAdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(btnback)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnbackMouseClicked
        // TODO add your handling code here:
        new Main().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnbackMouseClicked

    private void btnAdminLoginActionPerformed(java.awt.event.ActionEvent evt)  {
        // TODO add your handling code here:

        if(adminName.getText().isEmpty() || adminEmail.getText().isEmpty() || adminPassword.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please input all the information");
        }else {

            UserLoginAsAdmin();

            if(isLogin==1){
                JOptionPane.showMessageDialog(this, "You have logged in as an admin successfully!!!");

                new Setting().setVisible(true);
                this.setVisible(false);

                adminWarning1.setText("");
            }else {
                adminWarning1.setText("Wrong password, username and email!!!");
                adminName.setText("");
                adminPassword.setText("");
                adminEmail.setText("");
            }
        }

    }

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
            java.util.logging.Logger.getLogger(LoginAsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginAsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginAsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginAsAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginAsAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adminEmail;
    private javax.swing.JTextField adminName;
    private javax.swing.JPasswordField adminPassword;
    private javax.swing.JLabel adminWarning1;
    private javax.swing.JButton btnAdminLogin;
    private javax.swing.JLabel btnback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    // End of variables declaration//GEN-END:variables
}