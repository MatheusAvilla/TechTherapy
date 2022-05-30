/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        chbxSenha.setSelected(true);
        txtSenha.setText("Senha");
        String password = String.valueOf(txtSenha.getPassword());
        if(password.toLowerCase().equals("senha") || password.toLowerCase().equals("") ) {
            txtSenha.setText("Senha");
            txtSenha.setEchoChar((char)0);
            txtSenha.setForeground(new Color(153, 153, 153));
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblStart = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblEsqSenha = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        btnAcessar = new javax.swing.JButton();
        txtSenha = new javax.swing.JPasswordField();
        chbxSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        lblStart.setFont(new java.awt.Font("Dubai", 1, 18)); // NOI18N
        lblStart.setForeground(new java.awt.Color(101, 109, 120));
        lblStart.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStart.setText("Entrar na TechTherapy");
        lblStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtEmail.setText("E-mail");
        txtEmail.setMaximumSize(new java.awt.Dimension(270, 50));
        txtEmail.setMinimumSize(new java.awt.Dimension(270, 50));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmailFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lblEsqSenha.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        lblEsqSenha.setForeground(new java.awt.Color(11, 188, 153));
        lblEsqSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsqSenha.setText("Esqueci minha senha");
        lblEsqSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnCadastrar.setBackground(new java.awt.Color(73, 255, 151));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 120, 70));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign-up-logo.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setAlignmentX(0.5F);
        btnCadastrar.setMaximumSize(new java.awt.Dimension(148, 50));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(148, 50));

        btnAcessar.setBackground(new java.awt.Color(73, 255, 151));
        btnAcessar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAcessar.setForeground(new java.awt.Color(0, 120, 70));
        btnAcessar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign-in-logo.png"))); // NOI18N
        btnAcessar.setText("Acessar");
        btnAcessar.setAlignmentX(0.5F);
        btnAcessar.setMaximumSize(new java.awt.Dimension(148, 50));
        btnAcessar.setMinimumSize(new java.awt.Dimension(148, 50));
        btnAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcessarActionPerformed(evt);
            }
        });

        txtSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSenhaFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSenhaFocusLost(evt);
            }
        });

        chbxSenha.setText("Mostrar senha");
        chbxSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbxSenhaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtSenha)
                        .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblEsqSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(lblStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(59, 59, 59)))
                    .addComponent(chbxSenha))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblStart)
                .addGap(34, 34, 34)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbxSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(lblEsqSenha)
                .addGap(32, 32, 32)
                .addComponent(btnAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        setSize(new java.awt.Dimension(474, 536));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusGained
        // TODO add your handling code here:

        if(txtEmail.getText().equals("E-mail"))
            
        {
        txtEmail.setText("");
        txtEmail.setForeground(new Color (153,153,153));
        }
    }//GEN-LAST:event_txtEmailFocusGained

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // TODO add your handling code here:
        if(txtEmail.getText().equals(""))
            
        {
        txtEmail.setText("E-mail");
        txtEmail.setForeground(new Color (153,153,153));
        }
        
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtSenhaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusGained
        // TODO add your handling code here:
        
        chbxSenha.setSelected(false);
        txtSenha.setEchoChar('*');
        String password = String.valueOf(txtSenha.getPassword());
    
        if(password.toLowerCase().equals("senha")) {
            txtSenha.setText("");
            txtSenha.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtSenhaFocusGained

    
    private void txtSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSenhaFocusLost
        // TODO add your handling code here:
        String password = String.valueOf(txtSenha.getPassword());
        if(password.toLowerCase().equals("senha") || password.toLowerCase().equals("") ) {
            txtSenha.setText("Senha");
            txtSenha.setEchoChar((char)0);
            txtSenha.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSenhaFocusLost

    private void chbxSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbxSenhaActionPerformed
 
        if(chbxSenha.isSelected()) {
            txtSenha.setEchoChar((char)0);
        }
        else {
            txtSenha.setEchoChar('*');
        }
    }//GEN-LAST:event_chbxSenhaActionPerformed

    private void btnAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcessarActionPerformed
        if(txtEmail.getText().equals("admin@teste.com") && String.valueOf(txtSenha.getPassword()).equals("1234")) {
            frmMenu menu = new frmMenu();
            menu.setVisible(true);
            this.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "CREDENCIAIS INVÁLIDAS!");
        }
    }//GEN-LAST:event_btnAcessarActionPerformed

      
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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
            
        });
     
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcessar;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JCheckBox chbxSenha;
    private javax.swing.JLabel lblEsqSenha;
    private javax.swing.JLabel lblStart;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
