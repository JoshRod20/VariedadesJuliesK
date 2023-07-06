package Vistas;

import static Vistas.GestionarProducto.jdpanej;

/**
 *
 * @author rodri
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        
        this.setExtendedState(Lobby.MAXIMIZED_VERT);
        this.setTitle("Sistema de Gestion de productos Variedades JuliesK");
        this.setLayout(null);
        
        int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        jdpane.setBounds(0, 0, ancho, (alto));
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpane = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        btProd = new javax.swing.JButton();
        btProve = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        GestionarP = new javax.swing.JMenuItem();
        GestionarPro = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        helpMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpane.setBackground(new java.awt.Color(156, 162, 239));
        jdpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jToolBar1.setRollover(true);

        btProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/conjunto-accesoriosbb.png"))); // NOI18N
        btProd.setText("Nuevo Producto");
        btProd.setFocusable(false);
        btProd.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProd.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btProdMouseClicked(evt);
            }
        });
        btProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdActionPerformed(evt);
            }
        });
        jToolBar1.add(btProd);

        btProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/clienteGrande.png"))); // NOI18N
        btProve.setText("Nuevo Proveedor");
        btProve.setFocusable(false);
        btProve.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btProve.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProveActionPerformed(evt);
            }
        });
        jToolBar1.add(btProve);

        jdpane.add(jToolBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 90));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Reportes");
        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Gestiones");
        editMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMenuMouseClicked(evt);
            }
        });

        GestionarP.setText("Gestion de Prodcutos");
        GestionarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GestionarPMouseClicked(evt);
            }
        });
        GestionarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarPActionPerformed(evt);
            }
        });
        editMenu.add(GestionarP);

        GestionarPro.setText("Gestion de Proveedores");
        GestionarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionarProActionPerformed(evt);
            }
        });
        editMenu.add(GestionarPro);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Inventario");
        menuBar.add(helpMenu);

        helpMenu1.setMnemonic('h');
        helpMenu1.setText("Actualizar");

        jMenuItem3.setText("Actualizar Productos");
        helpMenu1.add(jMenuItem3);

        jMenuItem4.setText("Actualizar Proveedores");
        helpMenu1.add(jMenuItem4);

        menuBar.add(helpMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpane, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProveActionPerformed
        GestionarProveedor prov = new GestionarProveedor();
        prov.setVisible(true);
  
    }//GEN-LAST:event_btProveActionPerformed

    private void btProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdActionPerformed
            Producto pro = new Producto();
        int x = (jdpane.getWidth() / 2) - pro.getWidth() / 2;
        int y = ((jdpane.getHeight() / 2) - pro.getHeight() / 2) - 10;
        pro.setLocation(x, y);
        jdpane.add(pro);
        pro.show();
    }//GEN-LAST:event_btProdActionPerformed

    private void btProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btProdMouseClicked

    }//GEN-LAST:event_btProdMouseClicked

    private void GestionarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarPActionPerformed
         GestionarProducto gp = new GestionarProducto();
        int x = (jdpanej.getWidth() / 2) - gp.getWidth() / 2;
        int y = ((jdpanej.getHeight() / 2) - gp.getHeight() / 2) - 10;
        gp.setLocation(x, y);
        jdpanej.add(gp);
        gp.show();
    }//GEN-LAST:event_GestionarPActionPerformed

    private void GestionarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GestionarPMouseClicked
       
    }//GEN-LAST:event_GestionarPMouseClicked

    private void editMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_editMenuMouseClicked

    private void GestionarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionarProActionPerformed
//        GestionarProveedor gpr = new GestionarProveedor();
//        int x = (jPan.getWidth() / 2) - gpr.getWidth() / 2;
//        int y = ((jPan.getHeight() / 2) - gpr.getHeight() / 2) - 10;
//        gpr.setLocation(x, y);
//        jPan.add(gpr);
//        gpr.show();
    }//GEN-LAST:event_GestionarProActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenuItem GestionarP;
    private javax.swing.JMenuItem GestionarPro;
    private javax.swing.JButton btProd;
    private javax.swing.JButton btProve;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu helpMenu1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JDesktopPane jdpane;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
