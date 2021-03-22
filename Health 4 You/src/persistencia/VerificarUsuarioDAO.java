

    package persistencia;
    import entidade.Agendamento;
    import entidade.Paciente;
    import entidade.Usuario;
    import fronteira.frmTelaPrincipal;
    import java.util.List;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.util.ArrayList;
    import java.util.Date;
//    import javax.swing.JOptionPane;

    public class VerificarUsuarioDAO {
    
    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Usuario usuario;
    private Agendamento agendamento;
    private Paciente paciente ;
    
    private String verificaUsuario =  "SELECT * FROM USUARIO WHERE LOGIN =  ? AND SENHA = ?  ";
    
    private String verificaAgendamento = "SELECT * FROM AGENDAMENTO WHERE HORARIO = ? AND DATA = ? ";
    
    private String verificaPaciente = "SELECT * FROM PACIENTE WHERE CPF = ? ";
    
    public boolean verificaPaciente(String CPF) {
        boolean autenticado = false;
        try{
        bd = new BaseDeDados();
        pstm = bd.conecta().prepareStatement(verificaPaciente);
        pstm.setString(1, CPF);
        rs = pstm.executeQuery();
        while (rs.next()){
                 paciente = new Paciente();
                 paciente.setCpf(rs.getString("CPF"));
                 autenticado = true;
             }
    } catch (Exception e){
        e.printStackTrace(); 
    }  
        bd.desconecta();
        return autenticado;
    }
    
    
   public boolean verificaAgendamento(String HORARIO, String DATE) {
        boolean autenticado = false;
        try{
        bd = new BaseDeDados();
        pstm = bd.conecta().prepareStatement(verificaAgendamento);
        pstm.setString(1, HORARIO);
        pstm.setString(2, DATE);
        rs = pstm.executeQuery();
        while (rs.next()){
                 agendamento = new Agendamento();
                 agendamento.setHorario(rs.getString("HORARIO"));
                 agendamento.setData(rs.getDate("DATA"));
                 autenticado = true;
             }
    } catch (Exception e){
        e.printStackTrace(); 
    }  
        bd.desconecta();
        return autenticado;
    }
    
    
    
    public boolean verificarUsuario(String LOGIN, String SENHA) {
        boolean autenticado = false;
        try{
        bd = new BaseDeDados();
        pstm = bd.conecta().prepareStatement(verificaUsuario);
        pstm.setString(1, LOGIN);
        pstm.setString(2, SENHA);
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
    