/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.NCMController;
import controller.ProdutoController;
import controller.UnidadeController;
import java.awt.event.KeyEvent;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.NCM;
import model.Produto;
import model.Unidade;
import util.GerarCodigoAleatorio;
import util.Moeda;
import util.StringUtils;

/**
 *
 * @author hp
 */
public class ProdutoDialog extends javax.swing.JDialog {

    private ProdutoController produtoController;
    private int idProduto = 0;

    /**
     * Creates new form ProdutoDialog
     */
    public ProdutoDialog(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        produtoController = new ProdutoController();
        btnDeletar.setVisible(!true);
        popularComboBoxUnidades();
        popularComboBoxNcms();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        cbUnidade = new javax.swing.JComboBox<>();
        txtDescricaoProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbNcm = new javax.swing.JComboBox<>();
        txtValorProduto = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacaoProduto = new javax.swing.JTextArea();
        btnDeletar = new javax.swing.JButton();
        btnSalvar = new javax.swing.JButton();
        ckAtivo = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtDescricaoProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDescricaoProdutoKeyReleased(evt);
            }
        });

        jLabel1.setText("DESCRIÇÃO DO PRODUTO");

        jLabel2.setText("UNIDADE");

        jLabel3.setText("VALOR R$");

        txtValorProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtValorProdutoFocusLost(evt);
            }
        });

        jLabel4.setText(" NCM");

        jLabel5.setText("OBSERVAÇÕES SOBRE O PRODUTO");

        txtObservacaoProduto.setColumns(20);
        txtObservacaoProduto.setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        txtObservacaoProduto.setLineWrap(true);
        txtObservacaoProduto.setRows(5);
        jScrollPane1.setViewportView(txtObservacaoProduto);

        btnDeletar.setBackground(new java.awt.Color(255, 0, 0));
        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-lixeira-22.png"))); // NOI18N
        btnDeletar.setText("DELETAR");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnSalvar.setBackground(new java.awt.Color(0, 255, 0));
        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-salvar-22.png"))); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        ckAtivo.setSelected(true);
        ckAtivo.setText("ATIVO");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-vassoura-22.png"))); // NOI18N
        jButton1.setText("LIMPAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDescricaoProduto)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbUnidade, 0, 128, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbNcm, 0, 164, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeletar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ckAtivo))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(5, 5, 5)
                .addComponent(txtDescricaoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(1, 1, 1)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbNcm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtValorProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeletar)
                    .addComponent(btnSalvar)
                    .addComponent(ckAtivo)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if (idProduto != 0) {
            Object[] options = {"Confirmar", "Cancelar"};
            if (JOptionPane.showOptionDialog(null, "Deseja realmente alterar #" + idProduto,
                    "Aviso", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,
                    null, options, options[1]) == 0) {
                // Gerar um código aleatório
                String codigoDeConfirmacaoAleatorio = GerarCodigoAleatorio.gerarCodigoAleatorio();
                // Exibir um JOptionPane para obter o código
                String codigoDeConfirmacao = JOptionPane.showInputDialog(null,
                        "Insira o código de 4 dígitos: " + codigoDeConfirmacaoAleatorio,
                        "Confirmação", JOptionPane.WARNING_MESSAGE);
                // Comparar os códigos
                if (codigoDeConfirmacao != null && codigoDeConfirmacao.length() == 4
                        && codigoDeConfirmacao.equals(codigoDeConfirmacaoAleatorio)) {
                    salvar();
                } else {
                    JOptionPane.showMessageDialog(null, "Código incorreto ou invalido.");
                }

            }
        } else {
            salvar();
        }


    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeletarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpasCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtValorProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtValorProdutoFocusLost

        try {
            String valor = Moeda.deMoedaParaNumero(txtValorProduto.getText());
            if (produtoController.isNumeroValido(valor)) {
                txtValorProduto.setText(Moeda.formatadorDeMoeda((valor)));
            } else {
                txtValorProduto.setText("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDialog.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_txtValorProdutoFocusLost

    private void txtDescricaoProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescricaoProdutoKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ESCAPE) {
            this.dispose();
        }
    }//GEN-LAST:event_txtDescricaoProdutoKeyReleased

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
            java.util.logging.Logger.getLogger(ProdutoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ProdutoDialog dialog = null;
                try {
                    dialog = new ProdutoDialog(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDialog.class.getName()).log(Level.SEVERE, null, ex);
                }
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox<NCM> cbNcm;
    private javax.swing.JComboBox<Unidade> cbUnidade;
    private javax.swing.JCheckBox ckAtivo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JTextField txtDescricaoProduto;
    private javax.swing.JTextArea txtObservacaoProduto;
    private javax.swing.JTextField txtValorProduto;
    // End of variables declaration//GEN-END:variables

    public void popularComboBoxUnidades() throws SQLException {
        UnidadeController unidadeController = new UnidadeController();
        // Suponha que "unidades" seja uma lista das unidades obtidas do banco de dados.
        DefaultComboBoxModel<Unidade> model = new DefaultComboBoxModel<>();
        for (Unidade unidade : unidadeController.listarUnidadesAtivas()) {
            model.addElement(unidade);
        }

        cbUnidade.setModel(model);
    }

    public void popularComboBoxNcms() throws SQLException {
        NCMController ncmController = new NCMController();
        // Suponha que "unidades" seja uma lista das unidades obtidas do banco de dados.
        DefaultComboBoxModel<NCM> model = new DefaultComboBoxModel<>();
        for (NCM ncm : ncmController.listarNCMsAtivos()) {
            model.addElement(ncm);
        }

        cbNcm.setModel(model);
    }

    public void limpasCampos() {
        txtDescricaoProduto.setText("");
        txtDescricaoProduto.requestFocus();
        txtObservacaoProduto.setText("");
        txtValorProduto.setText("");
    }

    public void recebeProduto(Produto produto) {
        idProduto = produto.getId();
        txtDescricaoProduto.setText(produto.getDescricao());
        txtDescricaoProduto.requestFocus();
        txtObservacaoProduto.setText(produto.getObservacao());
        txtValorProduto.setText(Moeda.formatadorDeMoeda("" + produto.getValor()));
        ckAtivo.setSelected(produto.isAtivo());
    }

    private void salvar() {
        String descricao = StringUtils.restringirTamanhoString(txtDescricaoProduto.getText().toUpperCase(), 150),
                observacao = StringUtils.restringirTamanhoString(txtObservacaoProduto.getText().toUpperCase(), 500),
                valor = txtValorProduto.getText().replace("R$", "").trim().replace(".", "").
                        replace(",", ".").trim();

        if (produtoController.descricaoVazia(descricao)) {
            JOptionPane.showMessageDialog(ProdutoDialog.this,
                    "Verifique campos vazios.", "Aviso",
                    JOptionPane.WARNING_MESSAGE);

        } else {

            if (produtoController.isNumeroValido(valor)) {
                BigDecimal bigDecimal = new BigDecimal(valor);
                if (produtoController.salvarProduto(
                        idProduto,
                        descricao,
                        (Unidade) cbUnidade.getSelectedItem(),
                        bigDecimal,
                        (NCM) cbNcm.getSelectedItem(),
                        observacao,
                        ckAtivo.isSelected())) {
                    JOptionPane.showMessageDialog(ProdutoDialog.this,
                            "Produto salvo.", "Informação",
                            JOptionPane.INFORMATION_MESSAGE);
                    limpasCampos();
                    if (idProduto != 0) {
                        this.dispose();
                    }
                } else {
                    JOptionPane.showMessageDialog(ProdutoDialog.this,
                            "Erro ao salvar produto.", "Aviso",
                            JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(ProdutoDialog.this,
                        "Verifique campo valor.", "Aviso",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }

}
