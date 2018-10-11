

package persistencia;

import entidade.Paciente;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class PacienteDAO {

    private BaseDeDados bd;
    private PreparedStatement pstm;
    private ResultSet rs;
    private Paciente paciente;
    
    private String cadastraPaciente = "INSERT INTO PACIENTE "
                + "(NOME, CPF, DATANASCIMENTO, RUA, NUMERO , BAIRRO, ESTADO, CIDADE, TELEFONE, CELULAR ,EMAIL)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    private String consultaPaciente = "SELECT * FROM PACIENTE WHERE "
                                        + "NOME LIKE ?";
    
    private String excluiPaciente = "DELETE FROM PACIENTE WHERE CODIGO = ?";
    
     public void cadastrarPaciente(Paciente paciente){
        
        try{
            bd = new BaseDeDados();
            pstm = bd.conecta().prepareStatement(cadastraPaciente);
            pstm.setString(1, paciente.getNome().trim());
            pstm.setString(2, paciente.getCpf().trim());
            pstm.setString(3, paciente.getDatanascimento().trim());
            pstm.setString(4, paciente.getRua().trim());
            pstm.setString(5, paciente.getNumero().trim());
            pstm.setString(6, paciente.getBairro().trim());
            pstm.setString(7, paciente.getEstado().trim());
            pstm.setString(8, paciente.getCidade().trim());
            pstm.setString(9, paciente.getTelefone().trim());
            pstm.setString(10, paciente.getCelular().trim());
            pstm.setString(11, paciente.getEmail().trim());
            pstm.executeUpdate();
            bd.desconecta();
             
        } catch (Exception e){
            
            e.printStackTrace();
        }   
     }
     
      public List<Paciente> listarPacientes(String nome) {
         List<Paciente> listaPacientes = new ArrayList<Paciente>();
         try {
             
             bd = new BaseDeDados();
             pstm = bd.conecta().prepareStatement(consultaPaciente);
             pstm.setString(1, nome);
             rs = pstm.executeQuery();
             while (rs.next()){
                 paciente = new Paciente();
                 paciente.setCodigo(rs.getInt("CODIGO"));
                 paciente.setNome(rs.getString("NOME"));
                 paciente.setCpf(rs.getString("CPF"));
                 paciente.setDatanascimento(rs.getString("DATANASCIMENTO"));
                 paciente.setRua(rs.getString("RUA"));
                 paciente.setNumero(rs.getString("NUMERO"));
                 paciente.setBairro(rs.getString("BAIRRO"));
                 paciente.setEstado(rs.getString("ESTADO"));
                 paciente.setCidade(rs.getString("CIDADE"));
                 paciente.setTelefone(rs.getString("TELEFONE"));
                 paciente.setCelular(rs.getString("CELULAR"));
                 paciente.setEmail(rs.getString("EMAIL"));
                 listaPacientes.add(paciente);
        
             }
         }catch(Exception e) {
                     
           e.printStackTrace();
                     
         }
         
         bd.desconecta();
         return listaPacientes;
     }
      
       public void excluirPaciente(Paciente paciente){
         try{
             bd = new BaseDeDados();
             pstm = bd.conecta().prepareStatement(excluiPaciente);
             pstm.setInt(1,paciente.getCodigo());
             pstm.executeUpdate();
             bd.desconecta();
            
         }catch(Exception e){
             e.printStackTrace();
         }
    
       }
}

