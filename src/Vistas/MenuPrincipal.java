
package Vistas;

public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setExtendedState(MenuPrincipal.MAXIMIZED_BOTH);
        this.setTitle("Variedades JuliesK");
        this.setLayout(null);
        
               int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;
        int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
        deskPane.setBounds(0, 0, ancho, (alto));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deskPane = new javax.swing.JDesktopPane();
        jToolBar1 = new javax.swing.JToolBar();
        Producto = new javax.swing.JButton();
        Proveedor = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        editMenu = new javax.swing.JMenu();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(713, 475));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        deskPane.setPreferredSize(new java.awt.Dimension(713, 475));

        jToolBar1.setRollover(true);
        jToolBar1.setPreferredSize(new java.awt.Dimension(448, 96));

        Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/conjunto-accesoriosbb.png"))); // NOI18N
        Producto.setText("Nuevo Producto");
        Producto.setFocusable(false);
        Producto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Producto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });
        jToolBar1.add(Producto);

        Proveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/clienteGrande.png"))); // NOI18N
        Proveedor.setText("Nuevo Proveedor");
        Proveedor.setFocusable(false);
        Proveedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Proveedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedorActionPerformed(evt);
            }
        });
        jToolBar1.add(Proveedor);

        deskPane.add(jToolBar1);
        jToolBar1.setBounds(0, 0, 1620, 100);

        getContentPane().add(deskPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 591));

        fileMenu.setMnemonic('f');
        fileMenu.setText("Reportes");
        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Inventario");
        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Gestiones");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Gestion Productos");
        contentMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Gestion Proveedores");
        aboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
          Producto pro = new Producto();
        int x = (deskPane.getWidth() / 2) - pro.getWidth() / 2;
        int y = ((deskPane.getHeight() / 2) - pro.getHeight() / 2) - 10;
        pro.setLocation(x, y);
        deskPane.add(pro);
        pro.show();
    }//GEN-LAST:event_ProductoActionPerformed

    private void ProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedorActionPerformed
        Proveedor prov = new Proveedor();
        int x = (deskPane.getWidth() / 2) - prov.getWidth() / 2;
        int y = ((deskPane.getHeight() / 2) - prov.getHeight() / 2) - 10;
        prov.setLocation(x, y);
        deskPane.add(prov);
        prov.show();
    }//GEN-LAST:event_ProveedorActionPerformed

    private void contentMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItemActionPerformed
        GestionarProducto gprodu = new GestionarProducto();
         int x = (deskPane.getWidth() / 2) - gprodu.getWidth() / 2;
        int y = ((deskPane.getHeight() / 2) - gprodu.getHeight() / 2) - 10;
        gprodu.setLocation(x, y);
        deskPane.add(gprodu);
        gprodu.show();
    }//GEN-LAST:event_contentMenuItemActionPerformed

    private void aboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItemActionPerformed
        GestionarProveedor gp = new GestionarProveedor();
        int x = (deskPane.getWidth() / 2) - gp.getWidth() / 2;
        int y = ((deskPane.getHeight() / 2) - gp.getHeight() / 2) - 10;
        gp.setLocation(x, y);
        deskPane.add(gp);
        gp.show();
    }//GEN-LAST:event_aboutMenuItemActionPerformed

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
    private javax.swing.JButton Producto;
    private javax.swing.JButton Proveedor;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentMenuItem;
    public static javax.swing.JDesktopPane deskPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
