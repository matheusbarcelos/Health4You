

package persistencia;

import entidade.Agendamento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;


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
    
     private String excluiAgendamento = "DELETE FROM AGENDAMENTO WHERE ID_AGENDAMENTO = ?";
    
     private String alteraAgendamento = "UPDATE AGENDAMENTO SET NOMEPACIENTE =?,CPFPACIENTE=?,SERVICO=?,VALOR=?,HORARIO=?,DATA=?"
            + "WHERE ID_AGENDAMENTO=?";
    
    public void cadastrarAgendamento(Agendamento agendamento){
           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraAgendamento);
            pstm.setString(1, agendamento.getNome().trim());
            pstm.setString(2, agendamento.getCpf().trim());
            pstm.setString(3, agendamento.getServico().trim());
            pstm.setString(4, agendamento.getValor().trim());
            pstm.setString(5, agendamento.getHorario().trim());
            pstm.setString(6,simpleDateFormat.format(agendamento.getData()));
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
             //Date data = agendamento.getData();
             //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
             //java.util.Date dataString = data;
             //String dataFormatada = String.valueOf(simpleDateFormat.format(dataString));
             while (rs.next()){
                 agendamento = new Agendamento();
                 agendamento.setCodigo(rs.getInt("ID_AGENDAMENTO"));
                 agendamento.setNome(rs.getString("NOMEPACIENTE"));
                 agendamento.setServico(rs.getString("SERVICO"));
                 agendamento.setValor(rs.getString("VALOR"));
                 agendamento.setHorario(rs.getString("HORARIO"));
                 agendamento.setData(rs.getDate("DATA"));
                 listaAgendamentos.add(agendamento);
                 
             }
         }catch(Exception e) {
                     
           e.printStackTrace();
                     
         }
         bd.desconecta();
         return listaAgendamentos;
    }
    
      public void excluirAgendamento(Agendamento agendamento){
         try{
             bd = new BaseDeDados();
             pstm = bd.conecta().prepareStatement(excluiAgendamento);
             pstm.setInt(1,agendamento.getCodigo());
             pstm.executeUpdate();
             bd.desconecta();
            
         }catch(Exception e){
             e.printStackTrace();
         }
    
      }
      
       public void alterarAgendamento(Agendamento agendamento){
  
           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
         try{
             bd = new BaseDeDados();
             pstm = bd.conecta().prepareStatement(alteraAgendamento);
             pstm.setString(1, agendamento.getNome().trim());
             pstm.setString(2, agendamento.getCpf().trim());
             pstm.setString(3, agendamento.getServico().trim());
             pstm.setString(4, agendamento.getValor().trim());
             pstm.setString(5, agendamento.getHorario().trim());
             pstm.setString(6,simpleDateFormat.format(agendamento.getData()));
             pstm.setInt(7, agendamento.getCodigo());
             pstm.executeUpdate();
             bd.desconecta();
             
         }catch(Exception e){
             
             e.printStackTrace();
         }
     }
    
}
    
    
    

