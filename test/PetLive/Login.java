/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PetLive;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class Login extends javax.swing.JFrame implements PetLive {

    public Login() {
        initComponents();
        validasi.setVisible(false);
    }
    @Override
    public void close(){
        WindowEvent tutup = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(tutup);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        login = new javax.swing.JButton();
        validasi = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MS PGothic", 0, 18)); // NOI18N
        jLabel2.setText("Please insert your username anda password.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        jLabel3.setText("Username");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, -1, -1));

        username.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        getContentPane().add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 240, 370, 50));

        jLabel4.setFont(new java.awt.Font("MS PGothic", 0, 24)); // NOI18N
        jLabel4.setText("Password");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 310, -1, -1));
        getContentPane().add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, 370, 50));

        login.setBackground(new java.awt.Color(0, 204, 153));
        login.setFont(new java.awt.Font("Swis721 Hv BT", 0, 24)); // NOI18N
        login.setForeground(new java.awt.Color(255, 255, 255));
        login.setText("Login");
        login.setActionCommand("tombolLogin");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        getContentPane().add(login, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 130, 40));

        validasi.setFont(new java.awt.Font("MS PGothic", 1, 14)); // NOI18N
        validasi.setForeground(new java.awt.Color(255, 0, 0));
        validasi.setText("validasi");
        getContentPane().add(validasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 400, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Log in.png"))); // NOI18N
        jLabel5.setPreferredSize(new java.awt.Dimension(1284, 652));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -8, -1, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        if(password.getPassword().length != 8){
            validasi.setText("Password harus 8 karakter.");
            validasi.setVisible(true);
        }else{
            close();
            Pilihan ph = new Pilihan();
            ph.setVisible(true);
        }
    }//GEN-LAST:event_loginActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton login;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    private javax.swing.JLabel validasi;
    // End of variables declaration//GEN-END:variables
}
