

package persistencia;
import entidade.Usuario;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class UsuarioDAO {

    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Usuario usuario;
    
    private String cadastraUsuario = "INSERT INTO USUARIO "
                + "(NOME, LOGIN, SENHA, PERMISSAO, STATUS)" +
                    "VALUES (?, ?, ?, ?, ?)";
    
    
    
    public void cadastrarUsuario(Usuario usuario ){
        
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraUsuario);
            pstm.setString(1, usuario.getNome().trim());
            pstm.setString(2, usuario.getLogin().trim());
            pstm.setString(3, usuario.getSenha().trim());
            pstm.setString(4, usuario.getPermissao().trim());
            pstm.setString(5, usuario.getStatus().trim());
            
            pstm.executeUpdate();
            bd.desconecta();
             
        } catch (Exception e){
            
            e.printStackTrace();
        }   
     }

    
}
