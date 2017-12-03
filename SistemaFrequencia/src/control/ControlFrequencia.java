package control;

import connection.ConexaoBD;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.ModelFuncionario;

public class ControlFrequencia {
    ConexaoBD conex = new ConexaoBD();
    ModelFuncionario func = new ModelFuncionario();
    
    public void Entrada(ModelFuncionario func){
        conex.conexao();
        String mes = new java.text.SimpleDateFormat("MM").format(new java.util.Date());;
        String tipo = "e";
        String a = "\'";
        String cpf = func.getCpf();
        
        if (mes.equals("01")) mes = "janeiro";
        if (mes.equals("02")) mes = "fevereiro";
        if (mes.equals("03")) mes = "marco";
        if (mes.equals("04")) mes = "abril";
        if (mes.equals("05")) mes = "maio";
        if (mes.equals("06")) mes = "junho";
        if (mes.equals("07")) mes = "julho";
        if (mes.equals("08")) mes = "agosto";
        if (mes.equals("09")) mes = "setembro";
        if (mes.equals("10")) mes = "outubro";
        if (mes.equals("11")) mes = "novembro";
        if (mes.equals("12")) mes = "dezembro";
        
        String registro;
        registro = "UPDATE";
        registro +=' ';
        registro +=a;
        registro +=mes;
        registro +=a;
        registro +=' ';
        registro +="SET";
        registro +=' ';
        registro +=a;
        registro += new java.text.SimpleDateFormat("dd").format(new java.util.Date());
        registro +=' ';
        registro +=tipo;
        registro +=a;
        registro +=' ';
        registro +='=';
        registro +=' ';
        registro +='1';
        registro +=' ';
        registro +="WHERE";
        registro +=' ';
        registro +=a;
        registro +=mes;
        registro +=a;
        registro +='.';
        registro +=a;
        registro +="cpf";
        registro +=a;
        registro +=' ';
        registro +='=';
        registro +=cpf;
        
        try {
            PreparedStatement pst = conex.con.prepareStatement(registro);
            pst.execute();
            JOptionPane.showMessageDialog(null,registro);
        } catch (SQLException ex) {
            Logger.getLogger(ControlFrequencia.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Falha ao registrar ponto!");
        }
        conex.desconecta();
    }
    
    public void Saida(ModelFuncionario func){
        conex.conexao();
        String mes = new java.text.SimpleDateFormat("MM").format(new java.util.Date());;
        String tipo = "s";
        String a = "\'";
        String cpf = func.getCpf();
        
        if (mes.equals("01")) mes = "janeiro";
        if (mes.equals("02")) mes = "fevereiro";
        if (mes.equals("03")) mes = "marco";
        if (mes.equals("04")) mes = "abril";
        if (mes.equals("05")) mes = "maio";
        if (mes.equals("06")) mes = "junho";
        if (mes.equals("07")) mes = "julho";
        if (mes.equals("08")) mes = "agosto";
        if (mes.equals("09")) mes = "setembro";
        if (mes.equals("10")) mes = "outubro";
        if (mes.equals("11")) mes = "novembro";
        if (mes.equals("12")) mes = "dezembro";
        
        String registro = " UPDATE";
        registro +=' ';
        registro +=a;
        registro +=mes;
        registro +=a;
        registro +=' ';
        registro +="SET";
        registro +=' ';
        registro +=a;
        registro += new java.text.SimpleDateFormat("dd").format(new java.util.Date());
        registro +=' ';
        registro +=tipo;
        registro +=a;
        registro +=' ';
        registro +='=';
        registro +=' ';
        registro +='1';
        registro +=' ';
        registro +="WHERE";
        registro +=' ';
        registro +=a;
        registro +=mes;
        registro +=a;
        registro +='.';
        registro +=a;
        registro +="cpf";
        registro +=a;
        registro +=' ';
        registro +='=';
        registro +=cpf;
        
        try {
            PreparedStatement pst = conex.con.prepareStatement(registro);
            JOptionPane.showMessageDialog(null,registro);
        } catch (SQLException ex) {
            Logger.getLogger(ControlFrequencia.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Falha ao registrar ponto!");
        }        conex.desconecta();
    }
}
