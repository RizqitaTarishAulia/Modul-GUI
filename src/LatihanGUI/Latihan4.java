/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanGUI;

/**
 *
 * @author Tarishaulia
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
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

        pilihanjurusan = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idnama = new javax.swing.JTextField();
        idabsen = new javax.swing.JTextField();
        combo = new javax.swing.JComboBox<>();
        rdbrpl = new javax.swing.JRadioButton();
        rdbtkj = new javax.swing.JRadioButton();
        varalamat = new javax.swing.JTextField();
        buttonsubmit = new javax.swing.JButton();
        buttonexit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BIODATA SISWA");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(160, 30, 160, 20);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAMA");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 70, 60, 40);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ABSEN");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 120, 50, 20);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("KELAS");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 160, 60, 14);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("JURUSAN");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 200, 70, 14);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ALAMAT");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 240, 70, 14);

        idnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idnamaActionPerformed(evt);
            }
        });
        jPanel1.add(idnama);
        idnama.setBounds(120, 80, 180, 30);

        idabsen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idabsenActionPerformed(evt);
            }
        });
        jPanel1.add(idabsen);
        idabsen.setBounds(120, 120, 180, 30);

        combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "X RPL 1", "X RPL 2", "X RPL 3", "X RPL 4", "X RPL 5", "X RPL 6", "X RPL 7", "X TKJ 1", "X TKJ 2", "X TKJ 3", "X TKJ 4", "X TKJ 5", "X TKJ 6" }));
        combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboActionPerformed(evt);
            }
        });
        jPanel1.add(combo);
        combo.setBounds(120, 160, 100, 30);

        rdbrpl.setForeground(new java.awt.Color(255, 255, 255));
        rdbrpl.setText("RPL");
        rdbrpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbrplActionPerformed(evt);
            }
        });
        jPanel1.add(rdbrpl);
        rdbrpl.setBounds(120, 200, 70, 30);

        rdbtkj.setForeground(new java.awt.Color(255, 255, 255));
        rdbtkj.setText("TKJ");
        rdbtkj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtkjActionPerformed(evt);
            }
        });
        jPanel1.add(rdbtkj);
        rdbtkj.setBounds(200, 200, 70, 30);
        jPanel1.add(varalamat);
        varalamat.setBounds(120, 240, 190, 30);

        buttonsubmit.setText("SUBMIT");
        buttonsubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsubmitActionPerformed(evt);
            }
        });
        jPanel1.add(buttonsubmit);
        buttonsubmit.setBounds(330, 130, 90, 30);

        buttonexit.setText("EXIT");
        buttonexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonexitActionPerformed(evt);
            }
        });
        jPanel1.add(buttonexit);
        buttonexit.setBounds(330, 180, 90, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 450, 340);

        setBounds(0, 0, 463, 371);
    }// </editor-fold>//GEN-END:initComponents

    private void rdbtkjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtkjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtkjActionPerformed

    private void comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboActionPerformed

    private void rdbrplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbrplActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbrplActionPerformed

    private void idabsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idabsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idabsenActionPerformed

    private void idnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idnamaActionPerformed

    private void buttonsubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsubmitActionPerformed
        // TODO add your handling code here:
        //deklarasi variable
        String nm,abs,jur,almt;
        String kelas = combo.getSelectedItem().toString();
        nm = idnama.getText();
        abs = idabsen.getText();
        almt = varalamat.getText();
        //jurusan
        if(rdbrpl.isSelected()){
        jur = "RPL";
        if(combo.getSelectedItem()=="X RPL 1"){
        }
        if(combo.getSelectedItem()=="X RPL 2"){
        }
        if(combo.getSelectedItem()=="X RPL 3"){
        }
        if(combo.getSelectedItem()=="X RPL 4"){
        }
        if(combo.getSelectedItem()=="X RPL 5"){
        }
        if(combo.getSelectedItem()=="X RPL 6"){
        }
        if(combo.getSelectedItem()=="X RPL 7"){
        }
        if(rdbtkj.isSelected()){
            jur = "TKJ";
            if(combo.getSelectedItem()=="X TKJ 1"){
            }
            if(combo.getSelectedItem()=="X TKJ 2"){
            }
            if(combo.getSelectedItem()=="X TKJ 3"){  
            }
            if(combo.getSelectedItem()=="X TKJ 4"){
            }
            if(combo.getSelectedItem()=="X TKJ 5"){   
            }
            if(combo.getSelectedItem()=="X TKJ 6"){
        }
        }else{jur = "";}
        
        new Latihan5(nm,abs,jur,almt,kelas).setVisible(true);
        }
    }//GEN-LAST:event_buttonsubmitActionPerformed

    private void buttonexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonexitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_buttonexitActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonexit;
    private javax.swing.JButton buttonsubmit;
    private javax.swing.JComboBox<String> combo;
    private javax.swing.JTextField idabsen;
    private javax.swing.JTextField idnama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.ButtonGroup pilihanjurusan;
    private javax.swing.JRadioButton rdbrpl;
    private javax.swing.JRadioButton rdbtkj;
    private javax.swing.JTextField varalamat;
    // End of variables declaration//GEN-END:variables
}