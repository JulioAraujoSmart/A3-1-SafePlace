/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controllers.UsuarioController;
import Dto.Request.CadastroUsuarioRequestDto;
import Models.UsuarioModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingrid
 */
public class TelaCadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form TelaFuncionario
     */
    
    private static UsuarioController _usuarioController;
    
    public TelaCadastroUsuario() 
    {
        super("SafePlace");
        initComponents();
        setLocationRelativeTo(null);
        
        _usuarioController = new UsuarioController();
    }
    
       public void atualizarLista() {
        try 
        {            
            cboxUsuariosCadastrados.setModel(new DefaultComboBoxModel<>(_usuarioController.montarListaUsuario()));
            passwordFieldCadastroSenhaUsuario.setText("");
            txtCadastroNomeUsuario.setText("");
            
            
            _usuarioController.setUsuario(null);
            this.habilitarDesabilitarBotoes(false);
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
       public boolean camposPreenchidos() {
        if(passwordFieldCadastroSenhaUsuario.getText().equals("") &&
           txtCadastroNomeUsuario.getText().equals(""))
           
        {
            return false;
        }
        return true;
    }
       
        public void habilitarDesabilitarBotoes(boolean enabled) {
        if(enabled) {
            btnCadastroFuncionario.setEnabled(true);
            btnApagarFuncionario.setEnabled(true);
            btnEditarFuncionario.setEnabled(true);
            //lblAcessoBotoes.setText("");
        } else {
            btnCadastroFuncionario.setEnabled(false);
            btnApagarFuncionario.setEnabled(false);
            btnEditarFuncionario.setEnabled(false);            //lblAcessoBotoes.setText("Selecione um Inquilino!");
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtCadastroNomeUsuario = new javax.swing.JTextField();
        passwordFieldCadastroSenhaUsuario = new javax.swing.JPasswordField();
        cboxTipoUsuario = new javax.swing.JComboBox<>();
        cboxUsuariosCadastrados = new javax.swing.JComboBox<>();
        btnCadastroFuncionario = new javax.swing.JButton();
        btnApagarFuncionario = new javax.swing.JButton();
        btnVoltarCadastroFuncionario = new javax.swing.JButton();
        btnEditarFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtCadastroNomeUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do funcionário: "));

        passwordFieldCadastroSenhaUsuario.setText("jPasswordField1");
        passwordFieldCadastroSenhaUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Senha:"));

        cboxTipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "USER" }));
        cboxTipoUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo de usuário:"));
        cboxTipoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxTipoUsuarioActionPerformed(evt);
            }
        });

        cboxUsuariosCadastrados.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuários Cadastrados:"));
        cboxUsuariosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxUsuariosCadastradosActionPerformed(evt);
            }
        });

        btnCadastroFuncionario.setText("Cadastrar");
        btnCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroFuncionarioActionPerformed(evt);
            }
        });

        btnApagarFuncionario.setText("Apagar");
        btnApagarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarFuncionarioActionPerformed(evt);
            }
        });

        btnVoltarCadastroFuncionario.setText("Voltar");
        btnVoltarCadastroFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastroFuncionarioActionPerformed(evt);
            }
        });

        btnEditarFuncionario.setText("Editar");
        btnEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(passwordFieldCadastroSenhaUsuario)
                    .addComponent(cboxTipoUsuario, 0, 221, Short.MAX_VALUE)
                    .addComponent(cboxUsuariosCadastrados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(txtCadastroNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnVoltarCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApagarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(txtCadastroNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(passwordFieldCadastroSenhaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cboxTipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastroFuncionario)
                    .addComponent(btnEditarFuncionario))
                .addGap(30, 30, 30)
                .addComponent(cboxUsuariosCadastrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnApagarFuncionario)
                .addGap(30, 30, 30)
                .addComponent(btnVoltarCadastroFuncionario)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cboxTipoUsuario, cboxUsuariosCadastrados, passwordFieldCadastroSenhaUsuario, txtCadastroNomeUsuario});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroFuncionarioActionPerformed
        // TODO add your handling code here:
        CadastroUsuarioRequestDto request = new CadastroUsuarioRequestDto();
        
        request.setLogin(txtCadastroNomeUsuario.getText());
        request.setSenha(passwordFieldCadastroSenhaUsuario.getPassword().toString());
        request.setTipo(cboxTipoUsuario.getSelectedItem().toString());
        
        
        JOptionPane.showMessageDialog(null, _usuarioController.cadastrarUsuario(request));
    }//GEN-LAST:event_btnCadastroFuncionarioActionPerformed

    private void btnVoltarCadastroFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastroFuncionarioActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnVoltarCadastroFuncionarioActionPerformed

    private void btnApagarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarFuncionarioActionPerformed
        UsuarioModel user = (UsuarioModel)cboxUsuariosCadastrados.getSelectedItem();
        _usuarioController.setUsuario(user);
        
        JOptionPane.showMessageDialog(null, _usuarioController.deletarUsuario());
        if(!_usuarioController.erroReq)
            atualizarLista();
    }//GEN-LAST:event_btnApagarFuncionarioActionPerformed

    private void btnEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarFuncionarioActionPerformed
        UsuarioModel user = (UsuarioModel)cboxUsuariosCadastrados.getSelectedItem();
        
        if(this.camposPreenchidos()) {
            user.setLogin(txtCadastroNomeUsuario.getText());
            user.setSenha(passwordFieldCadastroSenhaUsuario.getPassword().toString());
            user.setTipo(cboxTipoUsuario.getSelectedItem().toString());

            _usuarioController.setUsuario(user);

            JOptionPane.showMessageDialog(null, _usuarioController.atualizarUsuario());

            if(!_usuarioController.erroReq)
                atualizarLista();
        }else {
            JOptionPane.showMessageDialog(null, "Favor, preencher os campos adequadamente!");
        }
    }//GEN-LAST:event_btnEditarFuncionarioActionPerformed

    private void cboxUsuariosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxUsuariosCadastradosActionPerformed
        UsuarioModel user = (UsuarioModel)cboxUsuariosCadastrados.getSelectedItem();
        
        user.setLogin(txtCadastroNomeUsuario.getText());
        user.setSenha(passwordFieldCadastroSenhaUsuario.getPassword().toString());
        user.setTipo(cboxTipoUsuario.getSelectedItem().toString());
        
        _usuarioController.setUsuario(user);
        this.habilitarDesabilitarBotoes(true);
    }//GEN-LAST:event_cboxUsuariosCadastradosActionPerformed

    private void cboxTipoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxTipoUsuarioActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cboxTipoUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarFuncionario;
    private javax.swing.JButton btnCadastroFuncionario;
    private javax.swing.JButton btnEditarFuncionario;
    private javax.swing.JButton btnVoltarCadastroFuncionario;
    private javax.swing.JComboBox<String> cboxTipoUsuario;
    private javax.swing.JComboBox<UsuarioModel> cboxUsuariosCadastrados;
    private javax.swing.JPasswordField passwordFieldCadastroSenhaUsuario;
    private javax.swing.JTextField txtCadastroNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
