/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import connection.ConexaoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Luisw7
 */
public class Autenticacao extends javax.swing.JFrame {
    String tipo;
    ConexaoBD conexao = new ConexaoBD();
    
    public Autenticacao() {
        initComponents();
        conexao.conexao();
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCPF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSenha = new javax.swing.JPasswordField();
        jVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemafrequencia/icons/icons8-Trancar Filled-50.png"))); // NOI18N
        jLabel1.setText("Autenticação");

        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCPF.setToolTipText("");
        jCPF.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jCPF.setDoubleBuffered(true);
        jCPF.setMaximumSize(new java.awt.Dimension(200, 200));
        jCPF.setName(""); // NOI18N
        jCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCPFActionPerformed(evt);
            }
        });

        jLabel2.setText("CPF");

        jLabel3.setText("Senha");

        jSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSenhaActionPerformed(evt);
            }
        });

        jVoltar.setText("Voltar");
        jVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(15, 15, 15)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jVoltar)
                                .addGap(11, 11, 11))
                            .addComponent(jCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSenha))))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCPF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jVoltar))
                .addGap(66, 66, 66))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    conexao.executaSQL("select * from autenticacao where CPF='"+jCPF.getText()+"'");
        try {
            conexao.executaSQL("select * from autenticacao where cpf='"+jCPF.getText()+"'");
            conexao.rs.first();
                if(conexao.rs.getString("senha").equals(jSenha.getText())){
                        if(conexao.rs.getString("id").equals(tipo)){
                        String diaAtual = new java.text.SimpleDateFormat("dd").format(new java.util.Date());
                        if(diaAtual.equals("23") || diaAtual.equals("24") || diaAtual.equals("25")){
                            if(tipo == "1"){
                                MainWindowJA janelaPrincipal = new MainWindowJA();        
                                janelaPrincipal.setVisible(true);
                                dispose();
                            }
                            if(tipo == "2"){
                                MainWindowJ janelaPrincipal = new MainWindowJ();        
                                janelaPrincipal.setVisible(true);
                                dispose();
                            }
                        }else{
                            MainWindow janelaPrincipal = new MainWindow();        
                            janelaPrincipal.setVisible(true);
                            dispose();
                        }
                        }
                    else{
                        JOptionPane.showMessageDialog(null,"O usuário e senha informado não corresponde ao tipo de funcionário!");
                    }
                    }else{
                        JOptionPane.showMessageDialog(null,"Usuário e/ou senha incorretos.\nAcesso negado!");
                    
                }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Usuário e/ou senha incorretos.\nAcesso negado!");
            //Logger.getLogger(Autenticacao.class.getName()).log(Level.SEVERE, null, ex);
        }

//  if((jCPF.getText().equals("admin") && jSenha.getText().equals("12345"))){
//        String diaAtual = new java.text.SimpleDateFormat("dd").format(new java.util.Date());
//        if(diaAtual.equals("03") || diaAtual.equals("24") || diaAtual.equals("25")){
//            if(tipo == 1){
//                MainWindowJA janelaPrincipal = new MainWindowJA();        
//                janelaPrincipal.setVisible(true);
//                dispose();
//            }else{
//                MainWindowJ janelaPrincipal = new MainWindowJ();        
//                janelaPrincipal.setVisible(true);
//                dispose();
//            }
//        }else{
//            MainWindow janelaPrincipal = new MainWindow();        
//            janelaPrincipal.setVisible(true);
//            dispose();
//        }
//  }else{
//      JOptionPane.showMessageDialog(null,"Usuário e/ou senha incorretos.\nAcesso negado!");
//  }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCPFActionPerformed

    }//GEN-LAST:event_jCPFActionPerformed

    private void jSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jSenhaActionPerformed

    private void jVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVoltarActionPerformed
        TipoFuncionario login = new TipoFuncionario();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_jVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Autenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Autenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Autenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Autenticacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Autenticacao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jCPF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField jSenha;
    private javax.swing.JButton jVoltar;
    // End of variables declaration//GEN-END:variables
}
