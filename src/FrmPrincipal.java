/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 277700
 */
public class FrmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
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
        LblFoto = new javax.swing.JLabel();
        LblTitulo1 = new javax.swing.JLabel();
        LblTitulo2 = new javax.swing.JLabel();
        Menu = new javax.swing.JMenuBar();
        MenuArquivo = new javax.swing.JMenu();
        MenuItemCadClientes = new javax.swing.JMenuItem();
        MenuItemAgeServico = new javax.swing.JMenuItem();
        MenuItemPagamento = new javax.swing.JMenuItem();
        MenuItemServAdc = new javax.swing.JMenuItem();
        MenuAjuda = new javax.swing.JMenu();
        MenuItemSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SOFTGIA");

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));

        LblFoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Logo SG(1).png"))); // NOI18N

        LblTitulo1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTitulo1.setForeground(new java.awt.Color(255, 255, 255));
        LblTitulo1.setText("Sistema de Gerenciamento");

        LblTitulo2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        LblTitulo2.setForeground(new java.awt.Color(255, 255, 255));
        LblTitulo2.setText("Inteligente de Agenda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(315, 315, 315)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(LblFoto)
                    .addComponent(LblTitulo1)
                    .addComponent(LblTitulo2))
                .addContainerGap(328, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(LblFoto)
                .addGap(39, 39, 39)
                .addComponent(LblTitulo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblTitulo2)
                .addContainerGap(127, Short.MAX_VALUE))
        );

        MenuArquivo.setText("Arquivo");

        MenuItemCadClientes.setText("Cadastrar Cliente");
        MenuItemCadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemCadClientesActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuItemCadClientes);

        MenuItemAgeServico.setText("Agendar Serviço");
        MenuItemAgeServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAgeServicoActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuItemAgeServico);

        MenuItemPagamento.setText("Pagamentos");
        MenuItemPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemPagamentoActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuItemPagamento);

        MenuItemServAdc.setText("Serviços Adicionais");
        MenuItemServAdc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemServAdcActionPerformed(evt);
            }
        });
        MenuArquivo.add(MenuItemServAdc);

        Menu.add(MenuArquivo);

        MenuAjuda.setText("Ajuda");

        MenuItemSobre.setText("Sobre");
        MenuItemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemSobreActionPerformed(evt);
            }
        });
        MenuAjuda.add(MenuItemSobre);

        Menu.add(MenuAjuda);

        setJMenuBar(Menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemCadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemCadClientesActionPerformed
        // TODO add your handling code here:
        new FrmCadClientes().setVisible(true);
    }//GEN-LAST:event_MenuItemCadClientesActionPerformed

    private void MenuItemAgeServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAgeServicoActionPerformed
        // TODO add your handling code here:
        new FrmCadAgenda().setVisible(true);
    }//GEN-LAST:event_MenuItemAgeServicoActionPerformed

    private void MenuItemPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemPagamentoActionPerformed
        // TODO add your handling code here:
        new FrmCadPagamentos().setVisible(true);
    }//GEN-LAST:event_MenuItemPagamentoActionPerformed

    private void MenuItemServAdcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemServAdcActionPerformed
        // TODO add your handling code here:
        new FrmCadExtra().setVisible(true);
    }//GEN-LAST:event_MenuItemServAdcActionPerformed

    private void MenuItemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemSobreActionPerformed
        // TODO add your handling code here:
        new FrmSobre().setVisible(true);
    }//GEN-LAST:event_MenuItemSobreActionPerformed

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LblFoto;
    private javax.swing.JLabel LblTitulo1;
    private javax.swing.JLabel LblTitulo2;
    private javax.swing.JMenuBar Menu;
    private javax.swing.JMenu MenuAjuda;
    private javax.swing.JMenu MenuArquivo;
    private javax.swing.JMenuItem MenuItemAgeServico;
    private javax.swing.JMenuItem MenuItemCadClientes;
    private javax.swing.JMenuItem MenuItemPagamento;
    private javax.swing.JMenuItem MenuItemServAdc;
    private javax.swing.JMenuItem MenuItemSobre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}