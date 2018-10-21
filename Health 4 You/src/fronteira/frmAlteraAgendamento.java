/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fronteira;

import persistencia.AgendamentoDAO;
import entidade.Agendamento;
import entidade.Paciente;
import entidade.Servico;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import persistencia.PacienteDAO;
import persistencia.ServicoDAO;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


/**
 *
 * @author ma-th
 */
public class frmAlteraAgendamento extends javax.swing.JFrame {

    public String Nome, Servico;
    
    
    private String[] colunas = new String[]{"Codigo","Nome",
           "Valor"};
    
    private DefaultTableModel tmServicos = new DefaultTableModel
               (null, colunas);
    
    private List<Servico> listaServicos;
    private ListSelectionModel lsmServicos;
    
    
    private String[] colunaspaciente = new String[]{"Codigo","Nome",
           "Endereço","Telefone"};
    
    private DefaultTableModel tmPacientes = new DefaultTableModel
               (null, colunaspaciente);
    
    private List<Paciente> listaPacientes;
    private ListSelectionModel lsmPacientes; 
    
    
    /**
     * Creates new form frmAlteraAgendamento
     */
    public frmAlteraAgendamento() {
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

        txtId = new javax.swing.JTextField();
        txtCPFPacienteAlterar = new javax.swing.JTextField();
        txtNomeServicoAlterar = new javax.swing.JTextField();
        txtValorServicoAlterar = new javax.swing.JTextField();
        txtNomePacienteAlterar = new javax.swing.JTextField();
        btnNovoServico = new javax.swing.JButton();
        txtPesquisaServicos = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblServico = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHorarioAlterar = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPaciente = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        txtPesquisaPaciente = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        btnNovoCliente = new javax.swing.JButton();
        btnPesquisarPaciente = new javax.swing.JButton();
        btnPesquisarServico = new javax.swing.JButton();
        txtRecebeData = new javax.swing.JTextField();
        btnAlterarDataAgendamento = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        btnNovoServico.setText("Novo Serviço");
        btnNovoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoServicoActionPerformed(evt);
            }
        });

        jLabel1.setText("Paciente:");

        tblServico.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        tblServico.setModel(tmServicos);
        tblServico.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmServicos = tblServico.getSelectionModel();
        lsmServicos.addListSelectionListener (new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()) {
                    tblServicoLinhaSelecionada(tblServico);
                }
            }

        });
        jScrollPane1.setViewportView(tblServico);

        jLabel2.setFont(new java.awt.Font("Champagne & Limousines", 1, 24)); // NOI18N
        jLabel2.setText("Alteraração de Agendamento");

        jLabel3.setText("Serviço:");

        try {
            txtHorarioAlterar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtHorarioAlterar.setToolTipText("  ");

        tblPaciente.setFont(new java.awt.Font("Open Sans", 0, 11)); // NOI18N
        tblPaciente.setModel(tmPacientes);
        tblPaciente.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        lsmPacientes = tblPaciente.getSelectionModel();
        lsmPacientes.addListSelectionListener (new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (! e.getValueIsAdjusting()) {
                    tblPacienteLinhaSelecionada(tblPaciente);
                }
            }

        });
        jScrollPane2.setViewportView(tblPaciente);

        jLabel4.setText("Horário:");

        jLabel5.setText("Data:");

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnNovoCliente.setText("Novo Paciente");
        btnNovoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoClienteActionPerformed(evt);
            }
        });

        btnPesquisarPaciente.setText("Pesquisar Paciente");
        btnPesquisarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarPacienteActionPerformed(evt);
            }
        });

        btnPesquisarServico.setText("Pesquisar Serviço");
        btnPesquisarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarServicoActionPerformed(evt);
            }
        });

        txtRecebeData.setEditable(false);

        btnAlterarDataAgendamento.setText("Alterar Data");
        btnAlterarDataAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarDataAgendamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(103, 342, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtPesquisaServicos)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(txtPesquisaPaciente, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnNovoServico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisarServico, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnNovoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnPesquisarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 315, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtHorarioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtRecebeData, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnAlterarDataAgendamento))))))
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(txtPesquisaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNovoCliente)
                    .addComponent(btnPesquisarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(txtPesquisaServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNovoServico)
                    .addComponent(btnPesquisarServico))
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(btnAlterarDataAgendamento)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHorarioAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecebeData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrar)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoServicoActionPerformed
        // TODO add your handling code here:
        new frmCadastraServico().setVisible(true);
    }//GEN-LAST:event_btnNovoServicoActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        alterarAgendamento();
        
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnNovoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoClienteActionPerformed
        // TODO add your handling code here:
        new frmPaciente().setVisible(true);
    }//GEN-LAST:event_btnNovoClienteActionPerformed

    private void btnPesquisarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarPacienteActionPerformed
        // TODO add your handling code here:
        listarPacientes();
        
    }//GEN-LAST:event_btnPesquisarPacienteActionPerformed

    private void btnPesquisarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarServicoActionPerformed
        // TODO add your handling code here:

        listarServicos();
    }//GEN-LAST:event_btnPesquisarServicoActionPerformed

    private void btnAlterarDataAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarDataAgendamentoActionPerformed
        // TODO add your handling code here:
        new frmAlterarDataAgendamento().setVisible(true);
    }//GEN-LAST:event_btnAlterarDataAgendamentoActionPerformed

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
            java.util.logging.Logger.getLogger(frmAlteraAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAlteraAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAlteraAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAlteraAgendamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAlteraAgendamento().setVisible(true);
            }
        });
    }
    
     public void recebeNome(String recebeNome){ 
       txtPesquisaPaciente.setText(recebeNome);
   }
      public void recebeServico(String recebeServico){ 
       txtPesquisaServicos.setText(recebeServico);
   }
       public void recebeHora(String recebeHora){ 
       txtHorarioAlterar.setText(recebeHora);
   }
       public void recebeData(String recebeData){ 
       txtRecebeData.setText(recebeData);
       }
     public void recebeId(String recebeId){ 
       txtId.setText(recebeId);
   }
       
       private void mostrarServicos(List<Servico> servicos){
        
        while (tmServicos.getRowCount() > 0){
            tmServicos.removeRow(0);
        }
        if(servicos.size() == 0){
            JOptionPane.showMessageDialog(this, "Nenhum Serviço foi encontrado!");
        }else{
            
            for (int i = 0; i < servicos.size(); i++){
                tmServicos.addRow(colunas);
                tmServicos.setValueAt(servicos.get(i).getCodigo(), i,0);
                tmServicos.setValueAt(servicos.get(i).getNome(), i,1);
                tmServicos.setValueAt(servicos.get(i).getValor(), i,2);
                                
            }
        }
    }
       
         private void listarServicos(){
        
        ServicoDAO servicoDAO =  new ServicoDAO();
        listaServicos = servicoDAO.listarServicos("%"
             +txtPesquisaServicos.getText().trim() + "%");
        mostrarServicos(listaServicos);
        
    }
         
          private void mostrarPacientes(List<Paciente> pacientes){
        
        while (tmPacientes.getRowCount() > 0){
            tmPacientes.removeRow(0);
        }
        if(pacientes.size() == 0){
            JOptionPane.showMessageDialog(this, "Nenhum Paciente foi encontrado!");
        }else{
            
            for (int i = 0; i < pacientes.size(); i++){
                tmPacientes.addRow(colunaspaciente);
                tmPacientes.setValueAt(pacientes.get(i).getCodigo(), i,0);
                tmPacientes.setValueAt(pacientes.get(i).getNome(), i,1);
                tmPacientes.setValueAt(pacientes.get(i).getRua(), i,2);
                tmPacientes.setValueAt(pacientes.get(i).getTelefone(), i,3);
                
            }
        }
    }
     
     private void listarPacientes(){
        
        PacienteDAO pacienteDAO =  new PacienteDAO();
        listaPacientes = pacienteDAO.listarPacientes("%"
             +txtPesquisaPaciente.getText().trim() + "%");
        mostrarPacientes(listaPacientes);
        
    }
     
      public void tblPacienteLinhaSelecionada(JTable tbl){
        
            int linhaSelecionada = tbl.getSelectedRow();
          
             if (linhaSelecionada != -1){
            
             txtNomePacienteAlterar.setText(listaPacientes.get(linhaSelecionada).getNome());
             txtCPFPacienteAlterar.setText(listaPacientes.get(linhaSelecionada).getCpf());
                 }
        }
     
       public void tblServicoLinhaSelecionada(JTable tbl){
        
            int linhaSelecionada = tbl.getSelectedRow();
          
             if (linhaSelecionada != -1){
            
             txtNomeServicoAlterar.setText(listaServicos.get(linhaSelecionada).getNome());
             txtValorServicoAlterar.setText(listaServicos.get(linhaSelecionada).getValor());
                 }
        }
       
       private void alterarDataAgendamento(){
           
           
       }
       
       
       private void alterarAgendamento(){
    
        /*Date data = txtDataAlterar.getDate();
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        String novaData = formatador.format(data);  */ 
           
        Agendamento age = new Agendamento();
        
        age.setNome(txtNomePacienteAlterar.getText().trim());
        age.setCpf(txtCPFPacienteAlterar.getText().trim());
        age.setServico(txtNomeServicoAlterar.getText().trim());
        age.setValor(txtValorServicoAlterar.getText().trim());
        age.setHorario(txtHorarioAlterar.getText().trim());
        age.setData(txtRecebeData.getText().trim());
        //age.setData(String.valueOf(txtDataAlterar.getDate()).format(novaData));
       
        age.setCodigo(Integer.valueOf(txtId.getText()));
        
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        agendamentoDAO.alterarAgendamento(age);
        JOptionPane.showMessageDialog(this, "Agendamento alterado com sucesso!");
        
    }
      
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAlterarDataAgendamento;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnNovoCliente;
    private javax.swing.JButton btnNovoServico;
    private javax.swing.JButton btnPesquisarPaciente;
    private javax.swing.JButton btnPesquisarServico;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblPaciente;
    private javax.swing.JTable tblServico;
    private javax.swing.JTextField txtCPFPacienteAlterar;
    private javax.swing.JFormattedTextField txtHorarioAlterar;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNomePacienteAlterar;
    private javax.swing.JTextField txtNomeServicoAlterar;
    private javax.swing.JTextField txtPesquisaPaciente;
    private javax.swing.JTextField txtPesquisaServicos;
    private javax.swing.JTextField txtRecebeData;
    private javax.swing.JTextField txtValorServicoAlterar;
    // End of variables declaration//GEN-END:variables
}
