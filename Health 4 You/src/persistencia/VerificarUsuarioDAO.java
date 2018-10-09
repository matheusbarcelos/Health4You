

package persistencia;
import entidade.Usuario;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VerificarUsuarioDAO {
    
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Usuario usuario;
    
    
    private String verificaUsuario =  "SELECT * FROM USUARIO WHERE LOGIN =  ? AND SENHA = ?  ";
              
    
    
    public void verificarUsuario( Usuario usuario){
        
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(verificaUsuario);
            
            pstm.setString(1, usuario.getLogin().trim());
            pstm.setString(2, usuario.getSenha().trim());
            
            pstm.executeUpdate();
           
            rs = pstm.executeQuery();
            
            
            if(rs.next()){
                
                JOptionPane.showMessageDialog(null,"Servico Cadastrado com sucesso !","Cadastro de Cliente",
                JOptionPane.INFORMATION_MESSAGE);
            }
            bd.desconecta();
             
        } catch (Exception e){
            
            e.printStackTrace();
        }   
        
        
    }
    
                
                

}
