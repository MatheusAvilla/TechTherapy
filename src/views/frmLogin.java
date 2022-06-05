
package views;

import dao.UsuarioDAO;
import entity.Usuario;
import java.awt.Color;
import javax.swing.JOptionPane;

public class frmLogin extends javax.swing.JFrame {
    
    private boolean autenticado = false;
    private Usuario usuarioLogado;
    
    public boolean getAutenticado() {
        return autenticado;
    }
    
    public Usuario getUsuarioLogado() {
        return usuarioLogado;
    }
    
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
        this.getContentPane().setBackground(new Color(171, 206, 209));
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblStart = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        chbxSenha = new javax.swing.JCheckBox();
        lblEsqSenha = new javax.swing.JLabel();
        btnAcessar = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        rbtAdm = new javax.swing.JRadioButton();
        rbtProf = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(202, 232, 252));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

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

        lblEsqSenha.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        lblEsqSenha.setForeground(new java.awt.Color(3, 98, 93));
        lblEsqSenha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEsqSenha.setText("Esqueci minha senha");
        lblEsqSenha.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblEsqSenha.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblEsqSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEsqSenhaMouseClicked(evt);
            }
        });

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

        btnCadastrar.setBackground(new java.awt.Color(73, 255, 151));
        btnCadastrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCadastrar.setForeground(new java.awt.Color(0, 120, 70));
        btnCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/sign-up-logo.png"))); // NOI18N
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.setAlignmentX(0.5F);
        btnCadastrar.setMaximumSize(new java.awt.Dimension(148, 50));
        btnCadastrar.setMinimumSize(new java.awt.Dimension(148, 50));

        jPanel2.setBackground(new java.awt.Color(202, 232, 252));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/login-image.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        buttonGroup1.add(rbtAdm);
        rbtAdm.setText("Administrador");

        buttonGroup1.add(rbtProf);
        rbtProf.setText("Professor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbxSenha)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(rbtAdm)
                            .addGap(18, 18, 18)
                            .addComponent(rbtProf))
                        .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblStart, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(59, 59, 59))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblEsqSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(51, 51, 51))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStart)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtAdm)
                    .addComponent(rbtProf))
                .addGap(18, 18, 18)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(chbxSenha)
                .addGap(18, 18, 18)
                .addComponent(lblEsqSenha)
                .addGap(32, 32, 32)
                .addComponent(btnAcessar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(749, 545));
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
        UsuarioDAO usuDao = new UsuarioDAO();
        String tipoUsuario = null;
        frmMenu menu = new frmMenu();

        if(rbtAdm.isSelected()) {
            tipoUsuario = rbtAdm.getText();
        }
        else if(rbtProf.isSelected()) {
            tipoUsuario = rbtProf.getText();
        } 
        try {
            usuarioLogado = usuDao.selecionarPorUsuarioESenha(txtEmail.getText(), new String(txtSenha.getPassword()), tipoUsuario);
            if(usuarioLogado != null) {
                autenticado = true;
                menu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Usuário, Senha ou Tipo errados");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        if(txtEmail.getText().equals("E-mail") && txtSenha.getText().equals("Senha")) {
            JOptionPane.showMessageDialog(this, "Insira suas credenciais!");
        }
        
    }//GEN-LAST:event_btnAcessarActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (!autenticado) {
            System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        rbtAdm.setSelected(true);
    }//GEN-LAST:event_formWindowActivated

    private void lblEsqSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEsqSenhaMouseClicked
        frmNovaSenha novaSenha = new frmNovaSenha(this, true);
        novaSenha.setVisible(true);
    }//GEN-LAST:event_lblEsqSenhaMouseClicked

      
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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox chbxSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEsqSenha;
    private javax.swing.JLabel lblStart;
    private javax.swing.JRadioButton rbtAdm;
    private javax.swing.JRadioButton rbtProf;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
