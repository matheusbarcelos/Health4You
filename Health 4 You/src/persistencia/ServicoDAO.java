

package persistencia;
import entidade.Servico;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ServicoDAO {

    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Servico servico;
    
    private String cadastraServico = "INSERT INTO SERVICO "
                + "(NOME, VALOR)" +
                    "VALUES (?, ?)";
    
    private String consultaServico = "SELECT * FROM SERVICO WHERE "
                                        + "NOME LIKE ?";
    
    private String excluiServico = "DELETE FROM SERVICO WHERE ID_SERVICO = ?";
    
    
    
    
    public void cadastrarServico(Servico servico){
        
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraServico);
            pstm.setString(1, servico.getNome().trim());
            pstm.setString(2, servico.getValor().trim());
            
            
            pstm.executeUpdate();
            bd.desconecta();
             
        } catch (Exception e){
            
            e.printStackTrace();
        }   
     }
    
    public List<Servico> listarServicos(String nome) {
         List<Servico> listaServicos = new ArrayList<Servico>();
         try {
             
             bd = new BaseDeDados();
             pstm = bd.conecta().prepareStatement(consultaServico);
             pstm.setString(1, nome);
             rs = pstm.executeQuery();
             while (rs.next()){
                 servico = new Servico();
                 servico.setCodigo(rs.getInt("ID_SERVICO"));
                 servico.setNome(rs.getString("NOME"));
                 servico.setValor(rs.getString("VALOR"));
                 listaServicos.add(servico);
        
             }
         }catch(Exception e) {
                     
           e.printStackTrace();
                     
         }
         
         bd.desconecta();
         return listaServicos;
     }
    
      public void excluirServico(Servico servico){
         try{
             bd = new BaseDeDados();
             pstm = bd.conecta().prepareStatement(excluiServico);
             pstm.setInt(1,servico.getCodigo());
             pstm.executeUpdate();
             bd.desconecta();
            
         }catch(Exception e){
             e.printStackTrace();
         }
    
       
      }
      
       
    
}
