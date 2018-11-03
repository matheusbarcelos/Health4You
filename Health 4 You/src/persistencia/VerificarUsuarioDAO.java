

    package persistencia;
    import entidade.Usuario;
    import fronteira.frmTelaPrincipal;
  import java.util.List;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.util.ArrayList;
//    import javax.swing.JOptionPane;

public class VerificarUsuarioDAO {
    
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Usuario usuario;

    
    private String verificaUsuario =  "SELECT * FROM USUARIO WHERE LOGIN =  ? AND SENHA = ?  ";
    
    public boolean verificarUsuario(String LOGIN, String SENHA) {
        boolean autenticado = false;
        try{
        bd = new BaseDeDados();
        pstm = bd.conecta().prepareStatement(verificaUsuario);
        pstm.setString(1, usuario.getLogin().trim());
        pstm.setString(2, usuario.getSenha().trim());
        rs = pstm.executeQuery();
        while (rs.next()){
                 usuario = new Usuario();
                 usuario.setLogin(rs.getString("LOGIN"));
                 usuario.setSenha(rs.getString("SENHA"));
                 autenticado = true;
             }
    } catch (Exception e){
        e.printStackTrace(); 
    }  
        bd.desconecta();
        return autenticado;
    }
}
    