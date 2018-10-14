

package persistencia;

import entidade.Agendamento;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class AgendamentoDAO {

    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Agendamento agendamento;
    
    private String cadastraAgendamento = "INSERT INTO AGENDAMENTO "
                + "(NOMEPACIENTE, CPFPACIENTE, SERVICO, VALOR)" +
                    "VALUES (?, ?, ?, ?)";
    
    public void cadastrarAgendamento(Agendamento agendamento){
        
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraAgendamento);
            pstm.setString(1, agendamento.getNome().trim());
            pstm.setString(2, agendamento.getCpf().trim());
            pstm.setString(3, agendamento.getServico().trim());
            pstm.setString(4, agendamento.getValor().trim());
            pstm.executeUpdate();
            bd.desconecta();
             
        } catch (Exception e){
            
            e.printStackTrace();
        }   
     }
    
    
    
}
