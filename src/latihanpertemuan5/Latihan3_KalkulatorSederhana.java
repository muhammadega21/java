/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanpertemuan5;

/**
 *
 * @author LENOVO IDEAPAD
 */
public class Latihan3_KalkulatorSederhana extends javax.swing.JPanel {

    /**
     * Creates new form Latihan3_KalkulatorSederhana
     */
    public Latihan3_KalkulatorSederhana() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txthasil = new javax.swing.JTextField();
        txtangka1 = new javax.swing.JTextField();
        pengurangan = new javax.swing.JButton();
        perkalian = new javax.swing.JButton();
        pembagian = new javax.swing.JButton();
        penjumlahan = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtangka2 = new javax.swing.JTextField();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Futura Md BT", 0, 18)); // NOI18N
        jLabel1.setText("HASIL :");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Futura Md BT", 1, 18)); // NOI18N
        jLabel2.setText("APLIKASI KALKULATOR SEDERHANA");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Futura Md BT", 0, 12)); // NOI18N
        jLabel3.setText("INPUT ANGKA 1 :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        txthasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthasilActionPerformed(evt);
            }
        });
        add(txthasil, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 260, 60));
        add(txtangka1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 220, 30));

        pengurangan.setText("-");
        pengurangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penguranganActionPerformed(evt);
            }
        });
        add(pengurangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 60, 40));

        perkalian.setText("*");
        perkalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perkalianActionPerformed(evt);
            }
        });
        add(perkalian, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 60, 40));

        pembagian.setText("/");
        pembagian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembagianActionPerformed(evt);
            }
        });
        add(pembagian, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 60, 40));

        penjumlahan.setText("+");
        penjumlahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penjumlahanActionPerformed(evt);
            }
        });
        add(penjumlahan, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 60, 40));

        jLabel4.setFont(new java.awt.Font("Futura Md BT", 0, 12)); // NOI18N
        jLabel4.setText("INPUT ANGKA 2 :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));
        add(txtangka2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 220, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void penguranganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penguranganActionPerformed
        // TODO add your handling code here:
        int angka1, angka2, hasil;
            angka1 = Integer.valueOf(txtangka1.getText());
            angka2 = Integer.valueOf(txtangka2.getText());
            hasil = angka1 - angka2;
            txthasil.setText(String.valueOf(hasil)); 
    }//GEN-LAST:event_penguranganActionPerformed

    private void perkalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perkalianActionPerformed
        // TODO add your handling code here:
        int angka1, angka2, hasil;
            angka1 = Integer.valueOf(txtangka1.getText());
            angka2 = Integer.valueOf(txtangka2.getText());
            hasil = angka1 * angka2;
            txthasil.setText(String.valueOf(hasil)); 
    }//GEN-LAST:event_perkalianActionPerformed

    private void pembagianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembagianActionPerformed
        // TODO add your handling code here:
        int angka1, angka2, hasil;
            angka1 = Integer.valueOf(txtangka1.getText());
            angka2 = Integer.valueOf(txtangka2.getText());
            hasil = angka1 / angka2;
            txthasil.setText(String.valueOf(hasil)); 
        
    }//GEN-LAST:event_pembagianActionPerformed

    private void penjumlahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penjumlahanActionPerformed
        // TODO add your handling code here:
        int angka1, angka2, hasil;
            angka1 = Integer.valueOf(txtangka1.getText());
            angka2 = Integer.valueOf(txtangka2.getText());
            hasil = angka1 + angka2;
            txthasil.setText(String.valueOf(hasil)); 
    }//GEN-LAST:event_penjumlahanActionPerformed

    private void txthasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthasilActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_txthasilActionPerformed

    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
    // Create and display the form
    javax.swing.SwingUtilities.invokeLater(() -> {
        // Create a new JFrame
        javax.swing.JFrame frame = new javax.swing.JFrame("Kalkulator Sederhana");
        
        // Create an instance of your JPanel
        Latihan3_KalkulatorSederhana kalkulatorPanel = new Latihan3_KalkulatorSederhana();
        
        // Add the panel to the frame
        frame.add(kalkulatorPanel);
        
        // Set default close operation
        frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        
        // Set frame size
        frame.setSize(400, 350);
        
        // Set frame visibility
        frame.setVisible(true);
    });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton pembagian;
    private javax.swing.JButton pengurangan;
    private javax.swing.JButton penjumlahan;
    private javax.swing.JButton perkalian;
    private javax.swing.JTextField txtangka1;
    private javax.swing.JTextField txtangka2;
    private javax.swing.JTextField txthasil;
    // End of variables declaration//GEN-END:variables
}
