

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
    
    
}

