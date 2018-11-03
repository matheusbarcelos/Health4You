/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;
import entidade.Usuario;
import javax.swing.JOptionPane;
import persistencia.UsuarioDAO;
import persistencia.VerificarUsuarioDAO;

/**
 *
 * @author ma-th
 */
public class frmLogin extends javax.swing.JFrame {

    /**
     * Creates new form frmLogin
     */
    public frmLogin() {
        initComponents();
        lblHelp.setText("<html><u>Precisa de Ajuda?</u></html>");
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnEntrar = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();
        lblHelp = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblFechar = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 51, 255));
        setForeground(new java.awt.Color(0, 51, 102));
        setMinimumSize(new java.awt.Dimension(922, 539));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(922, 539));
        setResizable(false);
        setSize(new java.awt.Dimension(922, 539));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 73, 124));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 920, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Health 4 You - Sistema.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, 110));

        btnEntrar.setBackground(new java.awt.Color(0, 155, 219));
        btnEntrar.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Entrar IMG - Sistema.png"))); // NOI18N
        btnEntrar.setText("Entrar");
        btnEntrar.setBorder(null);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 110, 30));

        btnSair.setBackground(new java.awt.Color(0, 155, 219));
        btnSair.setFont(new java.awt.Font("Open Sans", 0, 13)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Cancelar IMG - Sistema.png"))); // NOI18N
        btnSair.setText("Sair");
        btnSair.setBorder(null);
        btnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairActionPerformed(evt);
            }
        });
        jPanel1.add(btnSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 110, 30));

        lblHelp.setFont(new java.awt.Font("Open Sans", 2, 14)); // NOI18N
        lblHelp.setForeground(new java.awt.Color(0, 73, 124));
        lblHelp.setText("Precisa de Ajuda?!");
        jPanel1.add(lblHelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 73, 124));
        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 73, 124));
        jLabel3.setText("Senha:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        txtSenha.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtSenha.setForeground(new java.awt.Color(0, 73, 124));
        txtSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtSenha.setCaretColor(new java.awt.Color(0, 73, 124));
        jPanel1.add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 190, 30));

        jPanel2.setBackground(new java.awt.Color(0, 73, 124));
        jPanel2.setForeground(new java.awt.Color(51, 102, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-630, 520, 920, -1));

        jLabel2.setBackground(new java.awt.Color(0, 73, 124));
        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 73, 124));
        jLabel2.setText("Login:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        txtLogin.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtLogin.setForeground(new java.awt.Color(0, 73, 124));
        txtLogin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtLogin.setCaretColor(new java.awt.Color(0, 73, 124));
        jPanel1.add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 190, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Ma - H4Y2.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Login - H4Y2.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        lblFechar.setBackground(new java.awt.Color(0, 73, 124));
        lblFechar.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblFechar.setForeground(new java.awt.Color(0, 73, 124));
        lblFechar.setText("X");
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
        });
        jPanel1.add(lblFechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 290, 540));

        jPanel4.setForeground(new java.awt.Color(255, 153, 0));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Background - Tela Principal.png"))); // NOI18N
        jPanel4.add(jLabel4);

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void verificarUsuario(){
        
        Usuario usuario = new Usuario();
        
        usuario.setLogin(txtLogin.getText().trim());
        usuario.setSenha(txtSenha.getText().trim());
        
        VerificarUsuarioDAO verificarDAO = new  VerificarUsuarioDAO();
        
    }
    
    
    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairActionPerformed
        telaSair sair = new telaSair();
        sair.setVisible(true);
    }//GEN-LAST:event_btnSairActionPerformed
    
    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        // TODO add your handling code here:
          
        UsuarioDAO dao = new UsuarioDAO();
       
       if(dao.checkLogin(txtLogin.getText(), txtSenha.getText())){
          
           new frmTelaPrincipal().setVisible(true);
           this.dispose();
       }else{
           JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!");
       }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        // TODO add your handling code here:
        telaSair sair = new telaSair();
        sair.setVisible(true);
    }//GEN-LAST:event_lblFecharMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblHelp;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
