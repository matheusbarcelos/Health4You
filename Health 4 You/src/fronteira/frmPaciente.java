/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

import javax.swing.JOptionPane;
import entidade.Paciente;
import java.awt.Color;
import persistencia.PacienteDAO;
import persistencia.VerificarUsuarioDAO;

/**
 *
 * @author ma-th
 */
public class frmPaciente extends javax.swing.JFrame {
        String teste;
    /**
     * Creates new form frmCliente
     */
    public frmPaciente() {
        initComponents();
        this.getContentPane().setBackground(new Color(240,240,240));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtEndereco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        txtDataDeNascimento = new javax.swing.JFormattedTextField();
        txtCPF = new javax.swing.JFormattedTextField();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtCelular = new javax.swing.JFormattedTextField();
        txtEstado = new javax.swing.JFormattedTextField();
        lblSair = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 73, 125));
        jLabel1.setText("CADASTRO DE PACIENTES");

        jLabel2.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 73, 125));
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 73, 125));
        jLabel3.setText("Rua:");

        jLabel4.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 73, 125));
        jLabel4.setText("CPF:");

        jLabel5.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 73, 125));
        jLabel5.setText("Numero:");

        jLabel6.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 73, 125));
        jLabel6.setText("Data de Nascimento:");

        jLabel7.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 73, 125));
        jLabel7.setText("E-mail:");

        txtNome.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtNome.setForeground(new java.awt.Color(0, 73, 125));
        txtNome.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtNome.setCaretColor(new java.awt.Color(0, 73, 125));
        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });

        txtEndereco.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtEndereco.setForeground(new java.awt.Color(0, 73, 125));
        txtEndereco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtEndereco.setCaretColor(new java.awt.Color(0, 73, 125));

        txtNumero.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtNumero.setForeground(new java.awt.Color(0, 73, 125));
        txtNumero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtNumero.setCaretColor(new java.awt.Color(0, 73, 125));

        txtEmail.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(0, 73, 125));
        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtEmail.setCaretColor(new java.awt.Color(0, 73, 125));

        btnSalvar.setBackground(new java.awt.Color(0, 155, 219));
        btnSalvar.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Salvar.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(0, 155, 219));
        btnCancelar.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fronteira/imgs/Cancelar IMG - Sistema.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 73, 125));
        jLabel8.setText("Bairro:");

        txtBairro.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtBairro.setForeground(new java.awt.Color(0, 73, 125));
        txtBairro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtBairro.setCaretColor(new java.awt.Color(0, 73, 125));

        jLabel9.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 73, 125));
        jLabel9.setText("Cidade:");

        jLabel10.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 73, 125));
        jLabel10.setText("UF:");

        jLabel12.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 73, 125));
        jLabel12.setText("Celular:");

        jLabel13.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 73, 125));
        jLabel13.setText("Telefone:");

        txtCidade.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(0, 73, 125));
        txtCidade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtCidade.setCaretColor(new java.awt.Color(0, 73, 125));

        txtDataDeNascimento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtDataDeNascimento.setForeground(new java.awt.Color(0, 73, 125));
        try {
            txtDataDeNascimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtDataDeNascimento.setCaretColor(new java.awt.Color(0, 73, 125));
        txtDataDeNascimento.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtCPF.setForeground(new java.awt.Color(0, 73, 125));
        try {
            txtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCPF.setCaretColor(new java.awt.Color(0, 73, 125));
        txtCPF.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        txtTelefone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtTelefone.setForeground(new java.awt.Color(0, 73, 125));
        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.setCaretColor(new java.awt.Color(0, 73, 125));
        txtTelefone.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        txtCelular.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtCelular.setForeground(new java.awt.Color(0, 73, 125));
        try {
            txtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCelular.setCaretColor(new java.awt.Color(0, 73, 125));
        txtCelular.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        txtEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 155, 219), 2));
        txtEstado.setForeground(new java.awt.Color(0, 73, 125));
        txtEstado.setCaretColor(new java.awt.Color(0, 73, 125));
        txtEstado.setFont(new java.awt.Font("Open Sans", 0, 12)); // NOI18N

        lblSair.setFont(new java.awt.Font("Open Sans", 1, 24)); // NOI18N
        lblSair.setForeground(new java.awt.Color(0, 73, 125));
        lblSair.setText("X");
        lblSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblSair)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addComponent(txtEndereco, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6)
                                        .addComponent(txtDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(txtCelular))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblSair)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDataDeNascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(btnCancelar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.setVisible(false);
        frmPesquisarPaciente pu  = new frmPesquisarPaciente();
        pu.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        cadastrarPaciente();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void lblSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSairMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_lblSairMouseClicked

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    
 
    
    
    private void cadastrarPaciente(){
        
        if(txtNome.getText().isEmpty() || txtCPF.getText().isEmpty()
                || txtDataDeNascimento.getText().isEmpty() || txtEndereco.getText().isEmpty()
                || txtNumero.getText().isEmpty() || txtBairro.getText().isEmpty() ||
                txtCidade.getText().isEmpty() || txtEstado.getText().isEmpty()
                
                ){
        
            JOptionPane.showMessageDialog(null,"Existem campos obrigatórios a serem preenchidos","Preencher Campos",
                    JOptionPane.INFORMATION_MESSAGE);
            
    }else{
        
        VerificarUsuarioDAO verificarDAO = new  VerificarUsuarioDAO();
        
        String cpf = txtCPF.getText();
        
        // Comentario teste //
        
 
        boolean resposta = verificarDAO.verificaPaciente(cpf); 
        
        if(resposta == true){    
           
            JOptionPane.showMessageDialog(null,"Esse paciente já está cadastrado !","Cadastro de Paciente",
                JOptionPane.INFORMATION_MESSAGE);
        }else{
            
        
        Paciente paciente = new Paciente();
        paciente.setNome(txtNome.getText().trim());
        paciente.setCpf(txtCPF.getText().trim());
        paciente.setDatanascimento(txtDataDeNascimento.getText().trim());
        paciente.setRua(txtEndereco.getText().trim());
        paciente.setNumero(txtNumero.getText().trim());
        paciente.setBairro(txtBairro.getText().trim());
        paciente.setEstado(txtEstado.getText().trim());
        paciente.setCidade(txtCidade.getText().trim());
        paciente.setTelefone(txtTelefone.getText().trim());
        paciente.setCelular(txtCelular.getText().trim());
        paciente.setEmail(txtEmail.getText().trim());
        
  
        PacienteDAO pacienteDAO = new PacienteDAO();
        pacienteDAO.cadastrarPaciente(paciente);
        JOptionPane.showMessageDialog(null,"Paciente Cadastrado com sucesso !","Cadastro de Cliente",
                JOptionPane.INFORMATION_MESSAGE);
        
        frmPesquisarPaciente pes = new frmPesquisarPaciente();
        
        String n = txtNome.getText();
       
        pes.listaPacientes = pacienteDAO.listarPacientes("%"+
             n + "%");
        pes.mostrarPacientes(pes.listaPacientes);
        pes.listarPacientes();
        dispose();
        pes.setVisible(true);
        
        }
    }
    
    
    }
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
//            java.util.logging.Logger.getLogger(frmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(frmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(frmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(frmPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSair;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCPF;
    private javax.swing.JFormattedTextField txtCelular;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtDataDeNascimento;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JFormattedTextField txtEstado;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JFormattedTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}
