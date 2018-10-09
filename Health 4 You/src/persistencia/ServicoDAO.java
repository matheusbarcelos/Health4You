

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
    
    
}
