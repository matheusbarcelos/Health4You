

    package persistencia;
    import entidade.Usuario;
    import fronteira.frmTelaPrincipal;
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
    public boolean consultar(String login, String senha) {
        boolean autenticado = false;
    
}