package Vistas;

/**
 *
 * @author rodri
 */
public class Lobby extends javax.swing.JFrame {


    
    public Lobby() {
        
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

        jLabel3 = new javax.swing.JLabel();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jdpane = new javax.swing.JPanel();
        btInventario = new javax.swing.JButton();
        btVentas = new javax.swing.JButton();
        btReportes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btProve = new javax.swing.JButton();
        btProd = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jInternalFrame1.setVisible(true);

        jdpane.setBackground(new java.awt.Color(156, 162, 239));
        jdpane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/AbonoGrande.png"))); // NOI18N
        btInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInventarioActionPerformed(evt);
            }
        });
        jdpane.add(btInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        btVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/cajero.png"))); // NOI18N
        btVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVentasActionPerformed(evt);
            }
        });
        jdpane.add(btVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        btReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/ReportesGrandes_1.png"))); // NOI18N
        jdpane.add(btReportes, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("VENTAS");
        jdpane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("INVENTARIO");
        jdpane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("REPORTES");
        jdpane.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("PRODUCTO");
        jdpane.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("PROVEEDORES");
        jdpane.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        btProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/clienteGrande.png"))); // NOI18N
        btProve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProveActionPerformed(evt);
            }
        });
        jdpane.add(btProve, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        btProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/conjunto-accesoriosbb.png"))); // NOI18N
        btProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdActionPerformed(evt);
            }
        });
        jdpane.add(btProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, -1, -1));

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addComponent(jdpane, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jInternalFrame1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVentasActionPerformed
        Ventas ven =new Ventas();
        ven.setVisible(true);
    }//GEN-LAST:event_btVentasActionPerformed

    private void btInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInventarioActionPerformed
        INVENTARIO in = new INVENTARIO();
        in.setVisible(true);
    }//GEN-LAST:event_btInventarioActionPerformed

    private void btProveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProveActionPerformed
        GestionarProveedores prove = new GestionarProveedores();
        prove.setVisible(true);
//        dispose();
    }//GEN-LAST:event_btProveActionPerformed

    private void btProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdActionPerformed
        GestionarProductos produ = new GestionarProductos();
        produ.setVisible(true);
    }//GEN-LAST:event_btProdActionPerformed

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
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Lobby.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Lobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btInventario;
    private javax.swing.JButton btProd;
    private javax.swing.JButton btProve;
    private javax.swing.JButton btReportes;
    private javax.swing.JButton btVentas;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jdpane;
    // End of variables declaration//GEN-END:variables
}
