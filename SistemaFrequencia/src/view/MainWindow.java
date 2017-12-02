/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author asus
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botao_RegistrarFrequencia = new javax.swing.JButton();
        label_SistemaFrequencia = new javax.swing.JLabel();
        botao_JustificarAusencias = new javax.swing.JButton();
        botao_AlterarAusenciasEquipe = new javax.swing.JButton();
        botao_VerFrequencia = new javax.swing.JButton();
        botao_Voltar = new javax.swing.JButton();
        botao_Sair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        botao_RegistrarFrequencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemafrequencia/icons/icons8-Relógio-48.png"))); // NOI18N
        botao_RegistrarFrequencia.setText("Registrar Frequência");
        botao_RegistrarFrequencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_RegistrarFrequenciaActionPerformed(evt);
            }
        });

        label_SistemaFrequencia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        label_SistemaFrequencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_SistemaFrequencia.setText("Sistema de Frequência");

        botao_JustificarAusencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemafrequencia/icons/icons8-Erro-48.png"))); // NOI18N
        botao_JustificarAusencias.setText("Justificar Ausência(s)");
        botao_JustificarAusencias.setEnabled(false);

        botao_AlterarAusenciasEquipe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemafrequencia/icons/icons8-Empresária-48.png"))); // NOI18N
        botao_AlterarAusenciasEquipe.setText("Justificar Ausência(s) da equipe");
        botao_AlterarAusenciasEquipe.setEnabled(false);

        botao_VerFrequencia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemafrequencia/icons/icons8-Calendário-48.png"))); // NOI18N
        botao_VerFrequencia.setText("Ver Frequência");

        botao_Voltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemafrequencia/icons/icons8-Casa-48.png"))); // NOI18N
        botao_Voltar.setText("Voltar");
        botao_Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_VoltarActionPerformed(evt);
            }
        });

        botao_Sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sistemafrequencia/icons/icons8-Porta aberta-48.png"))); // NOI18N
        botao_Sair.setText("Sair");
        botao_Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botao_SairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(label_SistemaFrequencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botao_VerFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_RegistrarFrequencia, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_JustificarAusencias, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_Voltar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botao_Sair, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botao_AlterarAusenciasEquipe))))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao_Sair, botao_Voltar});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botao_AlterarAusenciasEquipe, botao_JustificarAusencias, botao_RegistrarFrequencia, botao_VerFrequencia});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(label_SistemaFrequencia)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botao_RegistrarFrequencia)
                    .addComponent(botao_VerFrequencia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_JustificarAusencias)
                    .addComponent(botao_AlterarAusenciasEquipe))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botao_Sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botao_Voltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao_Sair, botao_Voltar});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botao_AlterarAusenciasEquipe, botao_JustificarAusencias, botao_RegistrarFrequencia, botao_VerFrequencia});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botao_RegistrarFrequenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_RegistrarFrequenciaActionPerformed
        PontoRegistrado janelaPontoRegistrado = new PontoRegistrado();
        janelaPontoRegistrado.setVisible(true);
    }//GEN-LAST:event_botao_RegistrarFrequenciaActionPerformed

    private void botao_SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_SairActionPerformed
        dispose();
    }//GEN-LAST:event_botao_SairActionPerformed

    private void botao_VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botao_VoltarActionPerformed
        Login janelaLogin = new Login();
        janelaLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_botao_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
        
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botao_AlterarAusenciasEquipe;
    private javax.swing.JButton botao_JustificarAusencias;
    private javax.swing.JButton botao_RegistrarFrequencia;
    private javax.swing.JButton botao_Sair;
    private javax.swing.JButton botao_VerFrequencia;
    private javax.swing.JButton botao_Voltar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_SistemaFrequencia;
    // End of variables declaration//GEN-END:variables
}
