

package persistencia;
import java.sql.*;


public class BaseDeDados {

    private static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DATABASE_URL =
            "jdbc:mysql://localhost:3306/health4you";
    private String user = "root";
    private String password = "";
    private Connection conn;
    
    public Connection conecta(){
        
        try{
            
            Class.forName(JDBC_DRIVER);//Indicando o MYSQL
            //REALIZAR A CONEXÂO COM O BANCO
            //BUSCANDO O CAMINHO E NOME DA BASE DE DADOS
            
            conn = DriverManager.getConnection
                                            (DATABASE_URL, this.user, this.password);       
        } catch (ClassNotFoundException e){            
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (SQLException e){
            
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return conn;
    }
    
    public void desconecta(){
        try{
            conn.close();
        } catch (SQLException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}

    
    
    
    


