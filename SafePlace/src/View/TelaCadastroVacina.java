/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controllers.VacinaController;
import Dto.Request.CadastroVacinaRequestDto;
import Models.InquilinoModel;
import Models.VacinaModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Ingrid
 */
public class TelaCadastroVacina extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadastroVacina
     */
    private VacinaController _vacinaController = new VacinaController();
    private InquilinoModel inquilino;
    
    public TelaCadastroVacina() 
    {
        super("SafePlace");
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    public void setInquilino(InquilinoModel inq) {
        try 
        {            
            _vacinaController.setInquilino(inq);
            lblInquilino.setText(inq.toString());
            
            cboxVacinas.setModel(new DefaultComboBoxModel<>(_vacinaController.montarListaVacinas()));
            
        } catch (Exception ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
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

        jSpinner1 = new javax.swing.JSpinner();
        btnCadastrarVacina = new javax.swing.JButton();
        btnApagarCadastroVacina = new javax.swing.JButton();
        btnVoltarCadastroVacina = new javax.swing.JButton();
        btnEditarCadastroVacina = new javax.swing.JButton();
        lblInquilino = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTipoVacina = new javax.swing.JTextPane();
        cboxVacinas = new javax.swing.JComboBox<>();
        spnNumeroDosesVacina = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCadastrarVacina.setText("Cadastrar");
        btnCadastrarVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarVacinaActionPerformed(evt);
            }
        });

        btnApagarCadastroVacina.setText("Apagar");
        btnApagarCadastroVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarCadastroVacinaActionPerformed(evt);
            }
        });

        btnVoltarCadastroVacina.setText("Voltar");
        btnVoltarCadastroVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarCadastroVacinaActionPerformed(evt);
            }
        });

        btnEditarCadastroVacina.setText("Editar");
        btnEditarCadastroVacina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarCadastroVacinaActionPerformed(evt);
            }
        });

        lblInquilino.setText("jLabel1");

        txtTipoVacina.setBorder(javax.swing.BorderFactory.createTitledBorder("Tipo da Vacina: "));
        txtTipoVacina.setMinimumSize(new java.awt.Dimension(72, 39));
        jScrollPane1.setViewportView(txtTipoVacina);

        cboxVacinas.setBorder(javax.swing.BorderFactory.createTitledBorder("Vacinas Cadastradas"));
        cboxVacinas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxVacinasItemStateChanged(evt);
            }
        });
        cboxVacinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxVacinasActionPerformed(evt);
            }
        });

        spnNumeroDosesVacina.setBorder(javax.swing.BorderFactory.createTitledBorder("Doses"));
        spnNumeroDosesVacina.setPreferredSize(new java.awt.Dimension(72, 43));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInquilino, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spnNumeroDosesVacina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnVoltarCadastroVacina, javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnEditarCadastroVacina, javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnCadastrarVacina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                        .addComponent(btnApagarCadastroVacina)))
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(cboxVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnApagarCadastroVacina, btnCadastrarVacina, btnEditarCadastroVacina});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblInquilino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(cboxVacinas, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(spnNumeroDosesVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApagarCadastroVacina)
                    .addComponent(btnCadastrarVacina, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarCadastroVacina))
                .addGap(50, 50, 50)
                .addComponent(btnVoltarCadastroVacina)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnApagarCadastroVacina, btnCadastrarVacina, btnEditarCadastroVacina, btnVoltarCadastroVacina});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditarCadastroVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarCadastroVacinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEditarCadastroVacinaActionPerformed

    private void btnApagarCadastroVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarCadastroVacinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnApagarCadastroVacinaActionPerformed

    private void btnVoltarCadastroVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarCadastroVacinaActionPerformed
        // TODO add your handling code here:
        TelaCadastroInquilino tCadInquilino = new TelaCadastroInquilino();
        tCadInquilino.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarCadastroVacinaActionPerformed

    private void btnCadastrarVacinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarVacinaActionPerformed
        // TODO add your handling code here:
        CadastroVacinaRequestDto request = new CadastroVacinaRequestDto();
        
        request.setTipoVacina((String) lblInquilino.getText());
        request.setQtdDoseVacina((int) spnNumeroDosesVacina.getValue());
        request.setInquilino((InquilinoModel) cboxVacinas.getSelectedItem());
        
        JOptionPane.showMessageDialog(null, _vacinaController.CadastrarVacina(request));
        
    }//GEN-LAST:event_btnCadastrarVacinaActionPerformed

    private void cboxVacinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxVacinasActionPerformed
        VacinaModel vacina = (VacinaModel)cboxVacinas.getSelectedItem();
        
        txtTipoVacina.setText(vacina.getTipo());
        spnNumeroDosesVacina.setValue(vacina.getQtdDose());
    }//GEN-LAST:event_cboxVacinasActionPerformed

    private void cboxVacinasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxVacinasItemStateChanged
        VacinaModel vacina = (VacinaModel)cboxVacinas.getSelectedItem();
        
        txtTipoVacina.setText(vacina.getTipo());
        spnNumeroDosesVacina.setValue(vacina.getQtdDose());
    }//GEN-LAST:event_cboxVacinasItemStateChanged

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
            java.util.logging.Logger.getLogger(TelaCadastroVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadastroVacina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadastroVacina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagarCadastroVacina;
    private javax.swing.JButton btnCadastrarVacina;
    private javax.swing.JButton btnEditarCadastroVacina;
    private javax.swing.JButton btnVoltarCadastroVacina;
    private javax.swing.JComboBox<VacinaModel> cboxVacinas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JLabel lblInquilino;
    private javax.swing.JSpinner spnNumeroDosesVacina;
    private javax.swing.JTextPane txtTipoVacina;
    // End of variables declaration//GEN-END:variables
}
