 
package view;

import controller.ClienteController;
import enums.TipoCliente;
import enums.TipoEmpresa;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Cliente;
import util.GerarCodigoAleatorio;

/**
 *
 * @author edson
 */
public class EmpresaDialog extends javax.swing.JDialog {

    private ClienteController clienteController;
    int idEmpresa = 0;

    /**
     * Creates new form CfopDialog
     */
    public EmpresaDialog(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        clienteController = new ClienteController();
        txtCnpj.requestFocus();

        populaCbTipoCliente();
        populaCbTipoEmpresa();
    }

    public EmpresaDialog(java.awt.Frame parent, boolean modal, Cliente cliente) throws SQLException {
        super(parent, modal);
        initComponents();
        clienteController = new ClienteController();
        txtCnpj.requestFocus();

        populaCbTipoCliente();
        populaCbTipoEmpresa();

        txtCnpj.setText(cliente.getCnpj());
        txtRazaoSocial.setText(cliente.getRazaoSocial());
        txtNomeFantasia.setText(cliente.getNomeFantasia());
        txtEndereco.setText(cliente.getEndereco());

        txtIncricaoEstadual.setText(cliente.getInscricaoEstadual());
        txtIncricaoMunicipal.setText(cliente.getInscricaoMunicipal());
        txtResponsavelLegal.setText(cliente.getResponsavelLegal());
        txtContato.setText(cliente.getContato());

        txtIdEmpresa.setText("" + cliente.getId());
        idEmpresa = cliente.getId();

        cbTipoCliente.setSelectedItem(cliente.getTipoCliente());
        cbTipoEmpresa.setSelectedItem(cliente.getTipoEmpresa());

        ckAtivaEmpresa.setSelected(cliente.isAtivo());

        txtCep.setText(cliente.getCep());
        txtComplemento.setText(cliente.getComplemento());
        txtBairro.setText(cliente.getBairro());
        txtCidade.setText(cliente.getCidade()); 

    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        lblSiglaUnidade = new javax.swing.JLabel();
        txtCnpj = new javax.swing.JTextField();
        lblDescricaoUnidade = new javax.swing.JLabel();
        txtRazaoSocial = new javax.swing.JTextField();
        btnSalvarEmpresa = new javax.swing.JButton();
        ckAtivaEmpresa = new javax.swing.JCheckBox();
        btnLimpaFormulario = new javax.swing.JButton();
        lblIdUnidade = new javax.swing.JLabel();
        txtIdEmpresa = new javax.swing.JTextField();
        cbTipoCliente = new javax.swing.JComboBox<>();
        lblSiglaUnidade1 = new javax.swing.JLabel();
        lblDescricaoUnidade1 = new javax.swing.JLabel();
        txtNomeFantasia = new javax.swing.JTextField();
        lblDescricaoUnidade2 = new javax.swing.JLabel();
        txtIncricaoEstadual = new javax.swing.JTextField();
        lblDescricaoUnidade3 = new javax.swing.JLabel();
        txtIncricaoMunicipal = new javax.swing.JTextField();
        lblDescricaoUnidade4 = new javax.swing.JLabel();
        txtEndereco = new javax.swing.JTextField();
        lblDescricaoUnidade5 = new javax.swing.JLabel();
        txtContato = new javax.swing.JTextField();
        lblDescricaoUnidade6 = new javax.swing.JLabel();
        txtResponsavelLegal = new javax.swing.JTextField();
        lblSiglaUnidade2 = new javax.swing.JLabel();
        cbTipoEmpresa = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        lblDescricaoUnidade7 = new javax.swing.JLabel();
        txtCep = new javax.swing.JTextField();
        lblDescricaoUnidade8 = new javax.swing.JLabel();
        txtComplemento = new javax.swing.JTextField();
        lblDescricaoUnidade9 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblDescricaoUnidade10 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EMPRESA");
        setResizable(false);

        pnPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        pnPrincipal.setPreferredSize(new java.awt.Dimension(809, 300));

        lblSiglaUnidade.setText("TIPO CLIENTE");

        lblDescricaoUnidade.setText("RAZÃO SOCIAL");

        btnSalvarEmpresa.setBackground(new java.awt.Color(0, 255, 0));
        btnSalvarEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-salvar-22.png"))); // NOI18N
        btnSalvarEmpresa.setText("SALVAR");
        btnSalvarEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEmpresaActionPerformed(evt);
            }
        });

        ckAtivaEmpresa.setSelected(true);
        ckAtivaEmpresa.setText("ATIVO");

        btnLimpaFormulario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-vassoura-22.png"))); // NOI18N
        btnLimpaFormulario.setText("LIMPAR");
        btnLimpaFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpaFormularioActionPerformed(evt);
            }
        });

        lblIdUnidade.setText("ID");

        txtIdEmpresa.setText("0");
        txtIdEmpresa.setEnabled(false);

        cbTipoCliente.setToolTipText("");

        lblSiglaUnidade1.setText("CNPJ");

        lblDescricaoUnidade1.setText("NOME FANTASIA");

        lblDescricaoUnidade2.setText("INSCRIÇÃO ESTADUAL");

        lblDescricaoUnidade3.setText("INSCRIÇÃO MUNICIPAL");

        lblDescricaoUnidade4.setText("ENDEREÇO");

        lblDescricaoUnidade5.setText("CONTATO");

        lblDescricaoUnidade6.setText("RESPONSÁVEL LEGAL");

        lblSiglaUnidade2.setText("TIPO EMPRESA");

        lblDescricaoUnidade7.setText("CEP");

        lblDescricaoUnidade8.setText("COMPLEMENTO");

        lblDescricaoUnidade9.setText("BAIRRO");

        lblDescricaoUnidade10.setText("CIDADE");

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescricaoUnidade)
                            .addComponent(lblDescricaoUnidade4)
                            .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 806, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblIdUnidade)
                                    .addComponent(txtIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSiglaUnidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                                        .addComponent(lblSiglaUnidade1)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtCnpj)))
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDescricaoUnidade2)
                                            .addComponent(txtIncricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDescricaoUnidade3)
                                            .addComponent(txtIncricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(lblDescricaoUnidade1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtNomeFantasia)
                            .addComponent(txtRazaoSocial, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ckAtivaEmpresa)
                                .addGroup(pnPrincipalLayout.createSequentialGroup()
                                    .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDescricaoUnidade5)
                                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDescricaoUnidade6)
                                        .addComponent(txtResponsavelLegal, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblSiglaUnidade2)
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addComponent(btnSalvarEmpresa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnLimpaFormulario))
                            .addComponent(jSeparator1)
                            .addComponent(cbTipoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoUnidade7)
                                    .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoUnidade8)
                                    .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnPrincipalLayout.createSequentialGroup()
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoUnidade9)
                                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDescricaoUnidade10)
                                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIdUnidade)
                    .addComponent(lblSiglaUnidade)
                    .addComponent(lblSiglaUnidade1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescricaoUnidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRazaoSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescricaoUnidade1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNomeFantasia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(lblDescricaoUnidade3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIncricaoMunicipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(lblDescricaoUnidade2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIncricaoEstadual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDescricaoUnidade4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(txtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescricaoUnidade7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(lblDescricaoUnidade8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(lblDescricaoUnidade9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(lblDescricaoUnidade10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(lblDescricaoUnidade6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtResponsavelLegal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(lblDescricaoUnidade5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSiglaUnidade2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ckAtivaEmpresa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvarEmpresa)
                    .addComponent(btnLimpaFormulario))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnPrincipalLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cbTipoCliente, cbTipoEmpresa, txtBairro, txtCep, txtCidade, txtCnpj, txtComplemento, txtContato, txtEndereco, txtIdEmpresa, txtIncricaoEstadual, txtIncricaoMunicipal, txtNomeFantasia, txtRazaoSocial, txtResponsavelLegal});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 818, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEmpresaActionPerformed
        if (idEmpresa != 0) {
            Object[] options = {"Confirmar", "Cancelar"};
            if (JOptionPane.showOptionDialog(null, "Deseja realmente alterar #" + idEmpresa,
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
    }//GEN-LAST:event_btnSalvarEmpresaActionPerformed

    private void btnLimpaFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpaFormularioActionPerformed
        limparCampos();
    }//GEN-LAST:event_btnLimpaFormularioActionPerformed

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
            java.util.logging.Logger.getLogger(EmpresaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpresaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpresaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpresaDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmpresaDialog dialog = null;
                try {
                    dialog = new EmpresaDialog(new javax.swing.JFrame(), true);
                } catch (SQLException ex) {
                    Logger.getLogger(EmpresaDialog.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JButton btnLimpaFormulario;
    private javax.swing.JButton btnSalvarEmpresa;
    private javax.swing.JComboBox<TipoCliente> cbTipoCliente;
    private javax.swing.JComboBox<TipoEmpresa> cbTipoEmpresa;
    private javax.swing.JCheckBox ckAtivaEmpresa;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblDescricaoUnidade;
    private javax.swing.JLabel lblDescricaoUnidade1;
    private javax.swing.JLabel lblDescricaoUnidade10;
    private javax.swing.JLabel lblDescricaoUnidade2;
    private javax.swing.JLabel lblDescricaoUnidade3;
    private javax.swing.JLabel lblDescricaoUnidade4;
    private javax.swing.JLabel lblDescricaoUnidade5;
    private javax.swing.JLabel lblDescricaoUnidade6;
    private javax.swing.JLabel lblDescricaoUnidade7;
    private javax.swing.JLabel lblDescricaoUnidade8;
    private javax.swing.JLabel lblDescricaoUnidade9;
    private javax.swing.JLabel lblIdUnidade;
    private javax.swing.JLabel lblSiglaUnidade;
    private javax.swing.JLabel lblSiglaUnidade1;
    private javax.swing.JLabel lblSiglaUnidade2;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCnpj;
    private javax.swing.JTextField txtComplemento;
    private javax.swing.JTextField txtContato;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtIdEmpresa;
    private javax.swing.JTextField txtIncricaoEstadual;
    private javax.swing.JTextField txtIncricaoMunicipal;
    private javax.swing.JTextField txtNomeFantasia;
    private javax.swing.JTextField txtRazaoSocial;
    private javax.swing.JTextField txtResponsavelLegal;
    // End of variables declaration//GEN-END:variables

    public void limparCampos() {
        idEmpresa = 0;
        txtIdEmpresa.setText("0");
        txtCnpj.setText("");
        txtCnpj.requestFocus();
        txtRazaoSocial.setText("");
        txtContato.setText("");
        txtEndereco.setText("");
        txtIncricaoEstadual.setText("");
        txtIncricaoMunicipal.setText("");
        txtNomeFantasia.setText("");
        txtResponsavelLegal.setText("");

        ckAtivaEmpresa.setSelected(true);
        btnSalvarEmpresa.setText("SALVAR");
    }

    private void populaCbTipoCliente() {
        DefaultComboBoxModel<TipoCliente> model = new DefaultComboBoxModel<>(TipoCliente.values());
        cbTipoCliente.setModel(model);
    }

    private void populaCbTipoEmpresa() {
        DefaultComboBoxModel<TipoEmpresa> model = new DefaultComboBoxModel<>(TipoEmpresa.values());
        cbTipoEmpresa.setModel(model);
    }

    private void salvar() {
        String nomeFantasia = txtNomeFantasia.getText().toUpperCase();
        String razaoSocial = txtRazaoSocial.getText().toUpperCase();
        String responsavelLegal = txtResponsavelLegal.getText().toUpperCase();
        String endereco = txtEndereco.getText().toUpperCase();
        String cep = txtCep.getText().toUpperCase();
        String complemento = txtComplemento.getText().toUpperCase();
        String bairro = txtBairro.getText().toUpperCase();
        String cidade = txtCidade.getText().toUpperCase();

        if (nomeFantasia.trim().isEmpty() || razaoSocial.trim().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Nome Fantasia e/ou Razao Social não pode ser vazios!");
        } else {
            if (clienteController.adicionarCliente(new Cliente(idEmpresa,
                    (TipoCliente) cbTipoCliente.getSelectedItem(),
                    txtCnpj.getText(),
                    razaoSocial,
                    nomeFantasia,
                    txtIncricaoEstadual.getText(),
                    txtIncricaoMunicipal.getText(),
                    endereco, cep, complemento, bairro, cidade,
                    txtContato.getText(), responsavelLegal,
                    (TipoEmpresa) cbTipoEmpresa.getSelectedItem(),
                    ckAtivaEmpresa.isSelected()))) {
                JOptionPane.showMessageDialog(rootPane, "Salvo com sucesso!");
                this.dispose();
            }

        }
    }
}
