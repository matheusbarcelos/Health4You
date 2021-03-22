/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

import java.awt.Color;

/**
 *
 * @author joao-
 */
public class telaAvisos extends javax.swing.JFrame {

    /**
     *
     * Creates new form telaSair
     */
    public telaAvisos() {
        initComponents();
    }

    //Avisos tela de login
    public void loginInvalido() {
        setVisible(true);
        String mensagem = "Login ou senha inválida!";
        lblMensagem.setText(mensagem);
    }

    public void loginInforma() {
        setVisible(true);
        String mensagem = "Informe seu login e senha.";
        lblMensagem.setText(mensagem);
    }

    //Avisos telas de agendamento
    public void alteraAgendamento() {
        setVisible(true);
        String mensagem = "Selecione um agendamento para alterar!";
        lblMensagem.setText(mensagem);
    }

    public void excluiAgendamento() {
        setVisible(true);
        String mensagem = "Selecione um agendamento para excluir!";
        lblMensagem.setText(mensagem);
    }

    public void naoEncontraAgendamento() {
        setVisible(true);
        String mensagem = "Nenhum agendamento foi encontrado.";
        lblMensagem.setText(mensagem);
    }

    public void agendamentoAlterado() {
        setVisible(true);
        String mensagem = "Agendamento alterado com sucesso!";
        lblMensagem.setText(mensagem);
    }

    public void agendamentoExcluido() {
        setVisible(true);
        String mensagem = "Agendamento excluido com sucesso!";
        lblMensagem.setText(mensagem);
    }

    public void selecionaNomeAgendamento() {
        setVisible(true);
        String mensagem = "Você precisa selecionar um nome para agendamento!";
        lblMensagem.setText(mensagem);
    }

    public void selecionaServicoAgendamento() {
        setVisible(true);
        String mensagem = "Você precisa selecionar um serviço para agendamento!";
        lblMensagem.setText(mensagem);
    }

    public void selecionaDataAgendamento() {
        setVisible(true);
        String mensagem = "Você precisa selecionar uma data para agendamento!";
        lblMensagem.setText(mensagem);
    }

    public void selecionaHoraAgendamento() {
        setVisible(true);
        String mensagem = "Você precisa selecionar um horário para agendamento!";
        lblMensagem.setText(mensagem);
    }
    
    public void agendamentoCadastrado() {
        setVisible(true);
        this.setAlwaysOnTop(true);
        String mensagem = "Agendamento cadastrado com sucesso!";
        lblMensagem.setText(mensagem);
    }
    
     public void agendamentoJaCadastrado() {
        setVisible(true);
        String mensagem = "Já existe uma consulta marcada para esse dia e horário!";
        lblMensagem.setText(mensagem);
    }

    //Avisos tela de serviço
    public void alteraServico() {
        setVisible(true);
        String mensagem = "Selecione um Serviço para alterar!";
        lblMensagem.setText(mensagem);
    }

    public void excluiServico() {
        setVisible(true);
        String mensagem = "Selecione um Serviço para excluir!";
        lblMensagem.setText(mensagem);
    }

    public void naoEncontraServico() {
        setVisible(true);
        String mensagem = "Nenhum Serviço foi encontrado.";
        lblMensagem.setText(mensagem);
    }
    
    public void servicoCadastrado() {
        setVisible(true);
        this.setAlwaysOnTop(true);
        String mensagem = "Serviço cadastrado com sucesso!";
        lblMensagem.setText(mensagem);
    }
    
    public void servicoAlterado() {
        setVisible(true);
        String mensagem = "Serviço alterado com sucesso!";
        lblMensagem.setText(mensagem);
    }

    public void servicoExcluido() {
        setVisible(true);
        String mensagem = "Serviço excluido com sucesso!";
        lblMensagem.setText(mensagem);
    }

    //Avisos telas de paciente
    public void alteraPaciente() {
        setVisible(true);
        String mensagem = "Selecione um paciente para alterar!";
        lblMensagem.setText(mensagem);
    }

    public void excluiPaciente() {
        setVisible(true);
        String mensagem = "Selecione um paciente para excluir!";
        lblMensagem.setText(mensagem);
    }

    public void naoEncontraPaciente() {
        setVisible(true);
        this.setAlwaysOnTop(true);
        String mensagem = "Nenhum Paciente foi encontrado.";
        lblMensagem.setText(mensagem);
    }

    public void PacienteCadastrado() {
        setVisible(true);
        this.setAlwaysOnTop(true);
        String mensagem = "Paciente cadastrado com sucesso!";
        lblMensagem.setText(mensagem);
    }
    
    public void PacienteAlterado() {
        setVisible(true);
        String mensagem = "Paciente alterado com sucesso!";
        lblMensagem.setText(mensagem);
    }

    public void PacienteExcluido() {
        setVisible(true);
        String mensagem = "Paciente excluido com sucesso!";
        lblMensagem.setText(mensagem);
    }

    public void pacienteAlterado() {
        setVisible(true);
        String mensagem = "Paciente alterado com sucesso!";
        lblMensagem.setText(mensagem);
    }

    public void avisoPacienteMarcado() {
        setVisible(true);
        String mensagem = "Já existe um paciente marcado para esse dia e horário!";
        lblMensagem.setText(mensagem);
    }
    
    public void avisoPacienteJaCadastrado() {
        setVisible(true);
        String mensagem = "Paciente já cadastrado!";
        lblMensagem.setText(mensagem);
    }
    
    public void selecionePaciente() {
        setVisible(true);
        String mensagem = "Por favor, selecione um paciente!";
        lblMensagem.setText(mensagem);
    }

    //Avisos telas de usuários
    public void naoEncontraUsuario() {
        setVisible(true);
        String mensagem = "Nenhum Usuario foi encontrado.";
        lblMensagem.setText(mensagem);
    }

    public void selecioneUsuario() {
        setVisible(true);
        String mensagem = "Por favor, selecione um usuario!";
        lblMensagem.setText(mensagem);
    }
    
    public void usuarioAlterado() {
        setVisible(true);
        String mensagem = "Usuário alterado com sucesso!";
        lblMensagem.setText(mensagem);
    }
    
    public void usuarioCadastrado() {
        setVisible(true);
        this.setAlwaysOnTop(true);
        String mensagem = "Usuário cadastrado com sucesso!";
        lblMensagem.setText(mensagem);
    }
    
    public void excluiUsuario() {
        setVisible(true);
        String mensagem = "Usuário excluido com sucesso!";
        lblMensagem.setText(mensagem);
    }
    
    //Campos 
    public void campoObrigatorio() {
        setVisible(true);
        this.setAlwaysOnTop(true);
        String mensagem = "Existem campos obrigatórios para preencher!";
        lblMensagem.setText(mensagem);
    }
    
    //Informe valor
    public void informaNumero() {
        setVisible(true);
        String mensagem = "Informe apenas números.";
        lblMensagem.setText(mensagem);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblMensagem = new javax.swing.JLabel();
        lblSair = new javax.swing.JLabel();
        btnVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 300));
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(0, 73, 124));
        jPanel1.setMaximumSize(new java.awt.Dimension(355, 2488));

        lblMensagem.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblMensagem.setForeground(new java.awt.Color(255, 255, 255));
        lblMensagem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblSair.setFont(new java.awt.Font("Open Sans", 1, 18)); // NOI18N
        lblSair.setForeground(new java.awt.Color(255, 255, 255));
        lblSair.setText("X");
        lblSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSairMouseExited(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(0, 155, 219));
        btnVoltar.setFont(new java.awt.Font("Open Sans", 0, 14)); // NOI18N
        btnVoltar.setForeground(new java.awt.Color(255, 255, 255));
        btnVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Entrar IMG - Sistema.png"))); // NOI18N
        btnVoltar.setText("Entendido!");
        btnVoltar.setBorder(null);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarMouseExited(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblSair))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblSair)
                .addGap(18, 18, 18)
                .addComponent(lblMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_lblSairMouseClicked

    private void lblSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseEntered
        // TODO add your handling code here:
        lblSair.setForeground(new Color(0, 155, 219));
    }//GEN-LAST:event_lblSairMouseEntered

    private void lblSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseExited
        // TODO add your handling code here:
        lblSair.setForeground(Color.WHITE);
    }//GEN-LAST:event_lblSairMouseExited

    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseEntered
        // TODO add your handling code here:
        btnVoltar.setBackground(new Color(45, 137, 175));
    }//GEN-LAST:event_btnVoltarMouseEntered

    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseExited
        // TODO add your handling code here:
        btnVoltar.setBackground(new Color(0, 155, 219));
    }//GEN-LAST:event_btnVoltarMouseExited

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

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
//            java.util.logging.Logger.getLogger(telaSair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(telaSair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(telaSair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(telaSair.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAvisos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JLabel lblSair;
    // End of variables declaration//GEN-END:variables
}
