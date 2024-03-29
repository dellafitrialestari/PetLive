/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PetLive;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class PetGrooming extends javax.swing.JFrame implements PetLive{

    public PetGrooming() {
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

        NamaPemilik = new javax.swing.JLabel();
        NamaPeliharaan = new javax.swing.JLabel();
        Jenis = new javax.swing.JLabel();
        TglReservasi = new javax.swing.JLabel();
        Treatment = new javax.swing.JLabel();
        Harga = new javax.swing.JLabel();
        IsiNamaPemilik = new javax.swing.JTextField();
        IsiNamaPeliharaan = new javax.swing.JTextField();
        IsiJenis = new javax.swing.JComboBox<>();
        IsiHarga = new javax.swing.JTextField();
        KlikReservasi = new javax.swing.JButton();
        KlikBatal = new javax.swing.JButton();
        IsiTreatment = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        IsiTglReservasi = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NamaPemilik.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        NamaPemilik.setText("Nama Pemilik");
        getContentPane().add(NamaPemilik, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 310, 30));

        NamaPeliharaan.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        NamaPeliharaan.setText("Nama Peliharaan");
        getContentPane().add(NamaPeliharaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 310, 40));

        Jenis.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        Jenis.setText("Jenis");
        getContentPane().add(Jenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 310, 40));

        TglReservasi.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        TglReservasi.setText("Tanggal Reservasi");
        getContentPane().add(TglReservasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 310, 40));

        Treatment.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        Treatment.setText("Treatment");
        getContentPane().add(Treatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 310, 30));

        Harga.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        Harga.setText("Harga");
        getContentPane().add(Harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 530, 310, 30));

        IsiNamaPemilik.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        getContentPane().add(IsiNamaPemilik, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 235, 510, 38));

        IsiNamaPeliharaan.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        getContentPane().add(IsiNamaPeliharaan, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 293, 510, 38));

        IsiJenis.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        IsiJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Kucing", "Anjing" }));
        getContentPane().add(IsiJenis, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 351, 510, 38));

        IsiHarga.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        getContentPane().add(IsiHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 525, 510, 38));

        KlikReservasi.setBackground(new java.awt.Color(0, 204, 153));
        KlikReservasi.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        KlikReservasi.setForeground(new java.awt.Color(255, 255, 255));
        KlikReservasi.setText("Reservasi");
        KlikReservasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KlikReservasiActionPerformed(evt);
            }
        });
        getContentPane().add(KlikReservasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 580, 160, 50));

        KlikBatal.setBackground(new java.awt.Color(0, 204, 153));
        KlikBatal.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        KlikBatal.setForeground(new java.awt.Color(255, 255, 255));
        KlikBatal.setText("Batal");
        KlikBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KlikBatalActionPerformed(evt);
            }
        });
        getContentPane().add(KlikBatal, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 580, 160, 50));

        IsiTreatment.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        IsiTreatment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Treatment kutu", "Treatment jamur", "Grooming reguler" }));
        IsiTreatment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IsiTreatmentActionPerformed(evt);
            }
        });
        getContentPane().add(IsiTreatment, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 467, 510, 38));

        jButton1.setBackground(new java.awt.Color(0, 204, 153));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Back.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 580, 40, 50));

        IsiTglReservasi.setFont(new java.awt.Font("MS PGothic", 1, 24)); // NOI18N
        getContentPane().add(IsiTglReservasi, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 407, 510, 38));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/PetGrooming (1).png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, -1, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void KlikBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KlikBatalActionPerformed
        IsiNamaPemilik.setText("");
        IsiNamaPeliharaan.setText("");
        IsiJenis.setSelectedItem("Pilih");
        IsiTglReservasi.setCalendar(null);
        IsiTreatment.setSelectedItem("Pilih");
        IsiHarga.setText("");
        //untuk mengosongkan form saat membatalkan pesanan
    }//GEN-LAST:event_KlikBatalActionPerformed

    private void IsiTreatmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IsiTreatmentActionPerformed
        if(IsiJenis.getSelectedItem().equals("Kucing")){
            if(IsiTreatment.getSelectedItem().equals("Treatment kutu")){
                IsiHarga.setText("Rp.80.000");
            }else if(IsiTreatment.getSelectedItem().equals("Treatment jamur")){
                IsiHarga.setText("Rp.95.000");
            }else if(IsiTreatment.getSelectedItem().equals("Grooming reguler")){
                IsiHarga.setText("Rp.100.000");
            }
        }else if(IsiJenis.getSelectedItem().equals("Anjing")){
            if(IsiTreatment.getSelectedItem().equals("Treatment kutu")){
                IsiHarga.setText("Rp.88.000");
            }else if(IsiTreatment.getSelectedItem().equals("Treatment jamur")){
                IsiHarga.setText("Rp.98.000");
            }else if(IsiTreatment.getSelectedItem().equals("Grooming reguler")){
                IsiHarga.setText("Rp.120.000");
            }
        }
    }//GEN-LAST:event_IsiTreatmentActionPerformed

    private void KlikReservasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KlikReservasiActionPerformed
        this.toBack();
        ReservasiGrooming rg = new ReservasiGrooming();
        rg.TampilNamaPet.setText(IsiNamaPeliharaan.getText());
        rg.TampilNamaUser.setText(IsiNamaPemilik.getText());
        String pilih1 = IsiJenis.getSelectedItem().toString();
        rg.TampilJenis.setText(pilih1);
        DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
        String tgl = fmt.format(IsiTglReservasi.getDate());
        rg.TampilTanggal.setText(tgl);
        String pilih2 = IsiTreatment.getSelectedItem().toString();
        rg.TampilTreatment.setText(pilih2);
        rg.TampilHarga.setText(IsiHarga.getText());
        rg.setVisible(true);
        rg.toFront();
    }//GEN-LAST:event_KlikReservasiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        close();
        Pilihan p = new Pilihan();
        p.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PetGrooming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PetGrooming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PetGrooming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PetGrooming.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PetGrooming().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Harga;
    private javax.swing.JTextField IsiHarga;
    private javax.swing.JComboBox<String> IsiJenis;
    private javax.swing.JTextField IsiNamaPeliharaan;
    private javax.swing.JTextField IsiNamaPemilik;
    private com.toedter.calendar.JDateChooser IsiTglReservasi;
    private javax.swing.JComboBox<String> IsiTreatment;
    private javax.swing.JLabel Jenis;
    private javax.swing.JButton KlikBatal;
    public javax.swing.JButton KlikReservasi;
    private javax.swing.JLabel NamaPeliharaan;
    private javax.swing.JLabel NamaPemilik;
    private javax.swing.JLabel TglReservasi;
    private javax.swing.JLabel Treatment;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
