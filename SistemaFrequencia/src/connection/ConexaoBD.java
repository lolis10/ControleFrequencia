/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luisw7
 */
public class ConexaoBD {
    public Statement stn;
    public ResultSet rs;
    private final String driver = "org.postgresql.Driver";
    private final String caminho = "jdbc:postgresql://localhost:5432/ControleFrequencia";
    private final String usuario = "postgres";
    private final String senha = "12345";
    public Connection con;
    
    public void conexao(){
        System.setProperty("jdbc.Drivers", driver);
        try {
            con=DriverManager.getConnection(caminho, usuario, senha);
            //JOptionPane.showMessageDialog(null,"Conexão estabelecida!");
        } catch (SQLException ex) {
            //Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro de conexão! "+ex);
        }
    }
    public void desconecta(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null,"Conexão encerrada!");
        } catch (SQLException ex) {
            //Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao encerrar conexão! "+ex.getMessage());
        }
    }
    public void executaSQL(String sql){
        try {
            stn = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY);
            rs = stn.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro! "+ex);
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
