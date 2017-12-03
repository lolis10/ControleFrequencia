/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
        
import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelFuncionario;

/**
 *
 * @author asus
 */
public class FuncionarioDAO {
    
    public void create(ModelFuncionario funcionario){
        
        Connection connection = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = connection.prepareStatement("INSERT INTO funcionario(nome, cpf   ) VALUES(?,?)");
            //stmt.setString(1, funcionario.getNome());
            stmt.setString(2, funcionario.getCpf());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
                       
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: "+ex);
        }
        finally{
            ConnectionFactory.closeConnection(connection, stmt);
        }
    }
}
