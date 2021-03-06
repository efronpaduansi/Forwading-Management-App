/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.MDS;

//Import Package yang dibutuhkan
import java.awt.Color;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;
import pt.MDS.dashboard;

//Import Package SQL Connection
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import pt.MDS.koneksi;
import pt.MDS.entitas;



/**
 *
 * ----------------Author-------------
 * Nama : Efronius Paduansi
 * Website : myefronius.blogspot.com
 */


public class login extends javax.swing.JFrame {
    
        //Deklarasikan SQL Connection
            Connection conn = null;
            ResultSet rs = null;
            PreparedStatement pst = null;

       /*Menghitung nilai gagal login*/
        int gagalLogin=0;
        
    
        //Validasi Username agar user memasukkan huruf kecil
        public void usernameKarakter(KeyEvent d) {

            if (Character.isUpperCase(d.getKeyChar())) {
                d.consume();

                //Pesan dialog
                JOptionPane.showMessageDialog(null, "Enter lowercase only!", "Warning", JOptionPane.WARNING_MESSAGE);
             }
         }
    
    public login() {
        initComponents();
        mainPanel.setFocusable(true);
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
        mainPanel = new javax.swing.JPanel();
        sidePanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        mnForgotPassword = new javax.swing.JLabel();
        mnExit = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        textUsername = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Gayathri", 1, 18)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PT/MDS/assets/account.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(106, 90, 205));
        mainPanel.setPreferredSize(new java.awt.Dimension(700, 500));

        sidePanel.setBackground(new java.awt.Color(54, 33, 89));
        sidePanel.setPreferredSize(new java.awt.Dimension(300, 500));

        jLabel4.setFont(new java.awt.Font("FreeSerif", 1, 20)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("PT. MITRA DUA SEHATI");

        mnForgotPassword.setFont(new java.awt.Font("Gayathri", 1, 22)); // NOI18N
        mnForgotPassword.setForeground(java.awt.Color.white);
        mnForgotPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PT/MDS/assets/baseline_lock.png"))); // NOI18N
        mnForgotPassword.setText("Forgot Password");

        mnExit.setFont(new java.awt.Font("Gayathri", 1, 22)); // NOI18N
        mnExit.setForeground(java.awt.Color.white);
        mnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PT/MDS/assets/baseline_cancel.png"))); // NOI18N
        mnExit.setText("Exit");
        mnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout sidePanelLayout = new javax.swing.GroupLayout(sidePanel);
        sidePanel.setLayout(sidePanelLayout);
        sidePanelLayout.setHorizontalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidePanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(30, 30, 30))
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mnExit)
                    .addComponent(mnForgotPassword))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        sidePanelLayout.setVerticalGroup(
            sidePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidePanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mnForgotPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );

        jLabel2.setFont(new java.awt.Font("Gayathri", 1, 18)); // NOI18N
        jLabel2.setForeground(java.awt.Color.white);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PT/MDS/assets/account.png"))); // NOI18N

        btnLogin.setFont(new java.awt.Font("Gayathri", 1, 26)); // NOI18N
        btnLogin.setForeground(java.awt.Color.white);
        btnLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PT/MDS/assets/icons8-login-50.png"))); // NOI18N
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Gayathri", 1, 22)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PT/MDS/assets/username.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Gayathri", 1, 22)); // NOI18N
        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PT/MDS/assets/password.png"))); // NOI18N

        textUsername.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        textUsername.setCaretColor(new java.awt.Color(72, 61, 139));
        textUsername.setMargin(new java.awt.Insets(2, 2, 2, 2));
        textUsername.setPreferredSize(new java.awt.Dimension(22, 40));
        textUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                textUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                textUsernameFocusLost(evt);
            }
        });
        textUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsernameActionPerformed(evt);
            }
        });
        textUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textUsernameKeyTyped(evt);
            }
        });

        textPassword.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
        textPassword.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textPassword.setCaretColor(new java.awt.Color(72, 61, 139));
        textPassword.setMargin(new java.awt.Insets(2, 2, 2, 2));
        textPassword.setPreferredSize(new java.awt.Dimension(26, 40));
        textPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textPasswordActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(java.awt.Color.white);
        jSeparator1.setForeground(java.awt.Color.white);
        jSeparator1.setToolTipText("");

        jLabel6.setFont(new java.awt.Font("Gayathri", 1, 26)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("WELCOME");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(sidePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(textPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(textUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(148, 148, 148))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(126, 126, 126))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(155, 155, 155))))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(textUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)))
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(sidePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textPasswordActionPerformed

    private void mnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnExitMouseClicked

       int jawab = JOptionPane.showOptionDialog(this, 
                    "Are you sure to exit?", 
                    "Confirm", 
                    JOptionPane.YES_NO_OPTION, 
                    JOptionPane.QUESTION_MESSAGE, null, null, null);
    
        if(jawab == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "The program will exit");
            System.exit(0);
            
        }
    }//GEN-LAST:event_mnExitMouseClicked

    private void textUsernameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textUsernameKeyTyped
        
        usernameKarakter(evt);

    }//GEN-LAST:event_textUsernameKeyTyped

    private void textUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textUsernameActionPerformed

    private void textUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textUsernameFocusLost
       

    }//GEN-LAST:event_textUsernameFocusLost

    private void textUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textUsernameFocusGained
        
    }//GEN-LAST:event_textUsernameFocusGained

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        String idmember = null , level = null;
        Connection conn = new koneksi().koneksi();
        String query = "SELECT * FROM employee WHERE idmember=? AND password=? ";
        try {
        pst = conn.prepareStatement(query);
        pst.setString(1, textUsername.getText());
        pst.setString(2, textPassword.getText());
        rs = pst.executeQuery();
        while (rs.next()){
            idmember = rs.getString("idmember");
            level = rs.getString("level");
        }
        rs.last();
        if(rs.getRow() == 1){
                if(level.equals("Admin")){
                entitas.setIdmember(idmember);
                entitas.setLevel(level);
                JOptionPane.showMessageDialog(null, "Berhasil login sebagai "+textUsername.getText());
                dashboard menu = new dashboard();
                menu.setVisible(true);
                this.dispose();
            }
            else if(level.equals("Manager")){
                entitas.setIdmember(idmember);
                entitas.setLevel(level);
                JOptionPane.showMessageDialog(null, "Berhasil login dengan sebagai "+textUsername.getText());
                dashboard menu = new dashboard();
                menu.setVisible(true);
                this.dispose();
            }else{
                entitas.setIdmember(idmember);
                entitas.setLevel(level);
                JOptionPane.showMessageDialog(null, "Berhasil login sebagai "+textUsername.getText());
                dashboard menu = new dashboard();
                menu.setVisible(true);
                dispose();
            }
        }else {
            JOptionPane.showMessageDialog(null, "Invalid Username dan Password!", "Warning", JOptionPane.WARNING_MESSAGE);
            gagalLogin ++;
        }
            
            /*Membuat kondisi apabila gagal login sebanyak 3 kali */
          if(gagalLogin == 3)
          {
              JOptionPane.showMessageDialog(null, "Anda sudah gagal login 3 kali. Coba lagi nanti!", "Warning", JOptionPane.WARNING_MESSAGE);
              System.exit(0);
          }
        
        
        }catch (Exception e ){
            JOptionPane.showMessageDialog(null, "Gagal pada database : "+e);
            System.out.println(e);
            textUsername.setText("");
            textPassword.setText("");
        }
        
        /* Membuat sistem Login*/
//        String username = null , level = null;
//        Connection conn = new koneksi().koneksi();
//        String sql = "SELECT * FROM employee WHERE idmember=? AND password=? ";
//        
//        try{
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ps.setString(1, textUsername.getText());
//            ps.setString(2, textPassword.getText());
//            ResultSet rs = ps.executeQuery();
//            
//            //Validasi Form agar tidak boleh kosong
//            if(textUsername.getText().equals(""))
//            {
//                 JOptionPane.showMessageDialog(this, "Username tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
//            }
//            else if(textPassword.getText().equals(""))
//            {
//                 JOptionPane.showMessageDialog(this, "Password tidak boleh kosong", "Warning", JOptionPane.WARNING_MESSAGE);
//            }
//            
//            //Melakukan pengecekan ke dalam Database
//            else if(rs.next())
//            {
//                JOptionPane.showMessageDialog(null, "Berhasil login sebagai" +" "  + textUsername.getText());
//                this.dispose();
//                dashboard mn = new dashboard();
//                mn.show();
//            } 
//            else
//            {
//                JOptionPane.showMessageDialog(null, "Invalid Username or Password", "Warning", JOptionPane.WARNING_MESSAGE);
//                
//                gagalLogin ++;
//            }
//            
//          /*Membuat kondisi apabila gagal login sebanyak 3 kali */
//          if(gagalLogin == 3)
//          {
//              JOptionPane.showMessageDialog(null, "Anda sudah gagal login 3 kali. Coba lagi nanti!", "Warning", JOptionPane.WARNING_MESSAGE);
//              System.exit(0);
//          }
//             
//        } 
//        catch(Exception e)
//        {
//            JOptionPane.showMessageDialog(null, "Gagal pada database : ", "Warning", JOptionPane.WARNING_MESSAGE);
//            
//        }   
    }//GEN-LAST:event_btnLoginMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel mnExit;
    private javax.swing.JLabel mnForgotPassword;
    private javax.swing.JPanel sidePanel;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUsername;
    // End of variables declaration//GEN-END:variables
}
