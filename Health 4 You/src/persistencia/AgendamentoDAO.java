

package persistencia;

import entidade.Agendamento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class AgendamentoDAO {

    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Agendamento agendamento;
    
    private String cadastraAgendamento = "INSERT INTO AGENDAMENTO "
                + "(NOMEPACIENTE, CPFPACIENTE, SERVICO, VALOR, HORARIO, DATA)" +
                    "VALUES (?, ?, ?, ?, ?, ?)";
    
    private String consultaAgendamento = "SELECT * FROM AGENDAMENTO WHERE "
                                        + "NOMEPACIENTE LIKE ?";
    
    
    public void cadastrarAgendamento(Agendamento agendamento){
        
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraAgendamento);
            pstm.setString(1, agendamento.getNome().trim());
            pstm.setString(2, agendamento.getCpf().trim());
            pstm.setString(3, agendamento.getServico().trim());
            pstm.setString(4, agendamento.getValor().trim());
            pstm.setString(5, agendamento.getHorario().trim());
            pstm.setString(6, agendamento.getData().trim());
            pstm.executeUpdate();
            bd.desconecta();
             
        } catch (Exception e){
            
            e.printStackTrace();
        }   
     }
    
    
    public List<Agendamento> listarAgendamentos(String nome) {
         List<Agendamento> listaAgendamentos = new ArrayList<Agendamento>();
         try {
             
             bd = new BaseDeDados();
             pstm = bd.conecta().prepareStatement(consultaAgendamento);
             pstm.setString(1, nome);
             rs = pstm.executeQuery();
             while (rs.next()){
                 agendamento = new Agendamento();
                 agendamento.setCodigo(rs.getInt("ID_AGENDAMENTO"));
                 agendamento.setNome(rs.getString("NOMEPACIENTE"));
                 agendamento.setServico(rs.getString("SERVICO"));
                 agendamento.setValor(rs.getString("VALOR"));
                 agendamento.setHorario(rs.getString("HORARIO"));
                 agendamento.setData(rs.getString("DATA"));
                 listaAgendamentos.add(agendamento);
        
             }
         }catch(Exception e) {
                     
           e.printStackTrace();
                     
         }
         bd.desconecta();
         return listaAgendamentos;
    }
    
}
    
    
    

