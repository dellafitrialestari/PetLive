/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PetLive;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;

public class Pilihan extends javax.swing.JFrame implements PetLive{

    public Pilihan() {
        initComponents();
    }
    @Override
    public void close(){
        WindowEvent tutup = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(tutup);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        klikVeterinary = new javax.swing.JButton();
        klikPetHotel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        klikPetGrooming = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        klikVeterinary.setBackground(new java.awt.Color(67, 130, 100));
        klikVeterinary.setFont(new java.awt.Font("MS PGothic", 1, 20)); // NOI18N
        klikVeterinary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/jarum suntik 1.png"))); // NOI18N
        klikVeterinary.setText("Veterinary");
        klikVeterinary.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        klikVeterinary.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        klikVeterinary.setMaximumSize(new java.awt.Dimension(185, 60));
        klikVeterinary.setMinimumSize(new java.awt.Dimension(185, 60));
        klikVeterinary.setPreferredSize(new java.awt.Dimension(185, 60));
        klikVeterinary.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                klikVeterinaryMouseClicked(evt);
            }
        });
        klikVeterinary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klikVeterinaryActionPerformed(evt);
            }
        });
        getContentPane().add(klikVeterinary, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 240, 120));
        klikVeterinary.getAccessibleContext().setAccessibleDescription("");

        klikPetHotel.setBackground(new java.awt.Color(67, 130, 99));
        klikPetHotel.setFont(new java.awt.Font("MS PGothic", 1, 20)); // NOI18N
        klikPetHotel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/home 1.png"))); // NOI18N
        klikPetHotel.setText("Pet Hotel");
        klikPetHotel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        klikPetHotel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        klikPetHotel.setMaximumSize(new java.awt.Dimension(185, 60));
        klikPetHotel.setMinimumSize(new java.awt.Dimension(185, 60));
        klikPetHotel.setPreferredSize(new java.awt.Dimension(185, 60));
        klikPetHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klikPetHotelActionPerformed(evt);
            }
        });
        getContentPane().add(klikPetHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 240, 120));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hitam.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 240, 120));

        klikPetGrooming.setBackground(new java.awt.Color(67, 130, 99));
        klikPetGrooming.setFont(new java.awt.Font("MS PGothic", 1, 20)); // NOI18N
        klikPetGrooming.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/hairdryer 1.png"))); // NOI18N
        klikPetGrooming.setText("Pet Grooming");
        klikPetGrooming.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        klikPetGrooming.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        klikPetGrooming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                klikPetGroomingActionPerformed(evt);
            }
        });
        getContentPane().add(klikPetGrooming, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 270, 240, 120));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hitam.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 240, 110));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hitam.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 240, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hitam.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, 240, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Frame 1.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(1284, 654));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -40, 1330, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void klikPetGroomingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klikPetGroomingActionPerformed
        close();
        PetGrooming pg = new PetGrooming();
        pg.setVisible(true);
    }//GEN-LAST:event_klikPetGroomingActionPerformed

    private void klikVeterinaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klikVeterinaryActionPerformed
        close();
        Veterinary vet = new Veterinary();
        vet.setVisible(true);
    }//GEN-LAST:event_klikVeterinaryActionPerformed

    private void klikPetHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_klikPetHotelActionPerformed
        close();
        PetHotel ph = new PetHotel();
        ph.setVisible(true);
    }//GEN-LAST:event_klikPetHotelActionPerformed

    private void klikVeterinaryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_klikVeterinaryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_klikVeterinaryMouseClicked

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
            java.util.logging.Logger.getLogger(Pilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pilihan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pilihan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton klikPetGrooming;
    private javax.swing.JButton klikPetHotel;
    private javax.swing.JButton klikVeterinary;
    // End of variables declaration//GEN-END:variables
}
