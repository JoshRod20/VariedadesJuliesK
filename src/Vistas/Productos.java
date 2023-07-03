package Vistas;

import Controlador.CRUDProducto;
import Modelo.POJOCategoria;
import Modelo.POJOProducto;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Productos extends javax.swing.JFrame {

    /**
     * Creates new form AgregarProductos
     */
    public Productos() {
        initComponents();
        llenarCategoria();
        
    }

    public void llenarCategoria() {
        CRUDProducto cate = new CRUDProducto();
        ArrayList<POJOCategoria> listaCategoria = cate.mostrarDatosCombo();
        comboCategoria.removeAllItems();
        for (int i = 0; i < listaCategoria.size(); i++) {
            comboCategoria.addItem(new POJOCategoria(
                    listaCategoria.get(i).getIDCategoria(),
                    listaCategoria.get(i).getNombre()));
        }
    }

    public void guardarProducto() {
        CRUDProducto cp = new CRUDProducto();
        // Obtener el ID de la categoría seleccionada del JComboBox
        POJOCategoria categoriaSeleccionada = (POJOCategoria) comboCategoria.getSelectedItem();
        int ID_Categoria = categoriaSeleccionada.getIDCategoria();
        
        POJOProducto p1 = new POJOProducto(NombreProducto.getText(),
                Integer.parseInt(pVenta.getText()),
                Integer.parseInt(PCompra.getText()),
                Descripcion.getText(),
                Marca.getText(),
                Talla.getText(),
                Integer.parseInt(Cantidad.getText()),
                ID_Categoria);
        cp.insertarProductos(p1);

    }

    public boolean verificarDatos(String dato) {
        ResultSet rs;
        return verificarDatos(dato);
    }

    public void limpiar() {
        NombreProducto.setText("");
        Descripcion.setText("");
        PCompra.setText("");
        Marca.setText("");
        Talla.setText("");
        pVenta.setText("");

    }

    public void editarPro() {

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NProducto = new javax.swing.JLabel();
        NombreProducto = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        Descripcion = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        Marca = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        Talla = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        PCompra = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        pVenta = new javax.swing.JTextField();
        jSeparator10 = new javax.swing.JSeparator();
        comboCategoria = new javax.swing.JComboBox<>();
        btACategoria = new javax.swing.JButton();
        GuardarProductos = new javax.swing.JButton();
        btActualizar = new javax.swing.JButton();
        Cantidad = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        btECategoria = new javax.swing.JButton();
        btvolver = new javax.swing.JButton();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(156, 162, 239));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Registrar");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nuevo Producto");

        NProducto.setBackground(new java.awt.Color(0, 0, 0));
        NProducto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        NProducto.setForeground(new java.awt.Color(7, 81, 74));
        NProducto.setText("Nombre Producto");

        NombreProducto.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        NombreProducto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        NombreProducto.setBorder(null);
        NombreProducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NombreProductoKeyTyped(evt);
            }
        });

        jSeparator6.setBackground(new java.awt.Color(0, 255, 51));
        jSeparator6.setForeground(new java.awt.Color(7, 81, 74));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(7, 81, 74));
        jLabel9.setText("Descripción");

        Descripcion.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Descripcion.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Descripcion.setBorder(null);
        Descripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                DescripcionKeyTyped(evt);
            }
        });

        jSeparator2.setForeground(new java.awt.Color(7, 81, 74));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(7, 81, 74));
        jLabel6.setText("Marca");

        Marca.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Marca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Marca.setBorder(null);
        Marca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                MarcaKeyTyped(evt);
            }
        });

        jSeparator7.setBackground(new java.awt.Color(0, 255, 51));
        jSeparator7.setForeground(new java.awt.Color(7, 81, 74));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(7, 81, 74));
        jLabel7.setText("Talla");

        Talla.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        Talla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Talla.setBorder(null);
        Talla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TallaKeyTyped(evt);
            }
        });

        jSeparator8.setBackground(new java.awt.Color(0, 255, 51));
        jSeparator8.setForeground(new java.awt.Color(7, 81, 74));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(7, 81, 74));
        jLabel8.setText("Precio Compra");

        PCompra.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        PCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        PCompra.setBorder(null);
        PCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PCompraActionPerformed(evt);
            }
        });
        PCompra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PCompraKeyTyped(evt);
            }
        });

        jSeparator9.setBackground(new java.awt.Color(0, 255, 51));
        jSeparator9.setForeground(new java.awt.Color(7, 81, 74));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(7, 81, 74));
        jLabel10.setText("Precio Venta");

        pVenta.setFont(new java.awt.Font("Dubai", 0, 18)); // NOI18N
        pVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pVenta.setBorder(null);
        pVenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pVentaKeyTyped(evt);
            }
        });

        jSeparator10.setBackground(new java.awt.Color(0, 255, 51));
        jSeparator10.setForeground(new java.awt.Color(7, 81, 74));

        comboCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCategoriaActionPerformed(evt);
            }
        });

        btACategoria.setText("+");
        btACategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btACategoriaActionPerformed(evt);
            }
        });

        GuardarProductos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/guardar.png"))); // NOI18N
        GuardarProductos.setText("Guardar");
        GuardarProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarProductosActionPerformed(evt);
            }
        });

        btActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vistas/Imagenes/actualizar.png"))); // NOI18N
        btActualizar.setText("Actualizar");
        btActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btActualizarActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(7, 81, 74));
        jLabel11.setText("Cantidad");

        btECategoria.setText("-");
        btECategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btECategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NProducto)
                            .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(GuardarProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9)
                                .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8)
                                .addComponent(PCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btACategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btECategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pVenta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Talla, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(btActualizar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(18, 18, 18)
                                .addComponent(Cantidad)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NProducto)
                        .addGap(1, 1, 1)
                        .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(Marca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(1, 1, 1)
                        .addComponent(Descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(1, 1, 1)
                        .addComponent(Talla, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(1, 1, 1)
                        .addComponent(PCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(1, 1, 1)
                        .addComponent(pVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cantidad)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btACategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(btECategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(GuardarProductos)
                    .addComponent(btActualizar))
                .addGap(37, 37, 37))
        );

        btvolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/previous.png"))); // NOI18N
        btvolver.setText("Volver");
        btvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btvolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel2))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btvolver)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(btvolver)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NombreProductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NombreProductoKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && car != 'á' //Minúsculas
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á' //Mayúsculas
                && car != 'É'
                && car != 'Í'
                && car != 'Ó'
                && car != 'Ú'
                && car != 'Ü'
                && car != 'ü'
                && car != 'Ñ'
                && car != 'ñ'
                && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_NombreProductoKeyTyped

    private void DescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_DescripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_DescripcionKeyTyped

    private void MarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_MarcaKeyTyped
        char car = evt.getKeyChar();
        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
                && car != 'á' //Minúsculas
                && car != 'é'
                && car != 'í'
                && car != 'ó'
                && car != 'ú'
                && car != 'Á' //Mayúsculas
                && car != 'É'
                && car != 'Í'
                && car != 'Ó'
                && car != 'Ú'
                && car != 'Ü'
                && car != 'ü'
                && car != 'Ñ'
                && car != 'ñ'
                && (car != (char) KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_MarcaKeyTyped

    private void TallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TallaKeyTyped
//        char car = evt.getKeyChar();
//        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
//            && car != 'á' //Minúsculas
//            && car != 'é'
//            && car != 'í'
//            && car != 'ó'
//            && car != 'ú'
//            && car != 'Á' //Mayúsculas
//            && car != 'É'
//            && car != 'Í'
//            && car != 'Ó'
//            && car != 'Ú'
//            && car != 'Ü'
//            && car != 'ü'
//            && car != 'Ñ'
//            && car != 'ñ'
//            && (car != (char) KeyEvent.VK_SPACE)) {
//            evt.consume();
//        }
    }//GEN-LAST:event_TallaKeyTyped

    private void PCompraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PCompraKeyTyped
//        char car = evt.getKeyChar();
//        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
//            && car != 'á' //Minúsculas
//            && car != 'é'
//            && car != 'í'
//            && car != 'ó'
//            && car != 'ú'
//            && car != 'Á' //Mayúsculas
//            && car != 'É'
//            && car != 'Í'
//            && car != 'Ó'
//            && car != 'Ú'
//            && car != 'Ü'
//            && car != 'ü'
//            && car != 'Ñ'
//            && car != 'ñ'
//            && (car != (char) KeyEvent.VK_SPACE)) {
//            evt.consume();
//        }
    }//GEN-LAST:event_PCompraKeyTyped

    private void pVentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pVentaKeyTyped
//        char car = evt.getKeyChar();
//        if ((car < 'a' || car > 'z') && (car < 'A' || car > 'Z')
//            && car != 'á' //Minúsculas
//            && car != 'é'
//            && car != 'í'
//            && car != 'ó'
//            && car != 'ú'
//            && car != 'Á' //Mayúsculas
//            && car != 'É'
//            && car != 'Í'
//            && car != 'Ó'
//            && car != 'Ú'
//            && car != 'Ü'
//            && car != 'ü'
//            && car != 'Ñ'
//            && car != 'ñ'
//            && (car != (char) KeyEvent.VK_SPACE)) {
//            evt.consume();
//        }
    }//GEN-LAST:event_pVentaKeyTyped

    private void comboCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCategoriaActionPerformed

    private void btvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btvolverActionPerformed
        GestionarProductos gpro = new GestionarProductos();
        gpro.setVisible(true);
    }//GEN-LAST:event_btvolverActionPerformed

    private void GuardarProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarProductosActionPerformed
        CRUDProducto cp = new CRUDProducto();
        try {
            if ((NombreProducto.getText().equals(""))
                    || (Descripcion.getText().equals(""))
                    || (PCompra.getText().equals(""))
                    || (Marca.getText().equals(""))
                    || (Talla.getText().equals(""))
                    || (pVenta.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacios");
            } else {
//                if (cp.verificarDatos(NombreProducto.getText())) {
//                    JOptionPane.showMessageDialog(null, "Ya existe producto con ese nombre");
//                } else {
                    guardarProducto();
                    limpiar();
                    JOptionPane.showMessageDialog(null, "Datos guardados correctamente");
//                }
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }
    }//GEN-LAST:event_GuardarProductosActionPerformed

    private void PCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PCompraActionPerformed

    private void btActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btActualizarActionPerformed
        try {
            if ((NombreProducto.getText().equals("   -      -     "))
                    || (Descripcion.getText().equals(""))
                    || (Marca.getText().equals(""))
                    || (Talla.getText().equals("    -    "))
                    || (PCompra.getText().equals(""))
                    || (pVenta.getText().equals(""))) {
                JOptionPane.showMessageDialog(null, "Tiene datos vacíos");
            } else {
                editarPro();
                JOptionPane.showMessageDialog(null, "Datos Actualizados Correctamente");
                dispose();

                GestionarProductos.botonmostrar.doClick();

            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }//GEN-LAST:event_btActualizarActionPerformed

    private void btACategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btACategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btACategoriaActionPerformed

    private void btECategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btECategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btECategoriaActionPerformed

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
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Cantidad;
    public static javax.swing.JTextField Descripcion;
    public static javax.swing.JButton GuardarProductos;
    public static javax.swing.JTextField Marca;
    private javax.swing.JLabel NProducto;
    public static javax.swing.JTextField NombreProducto;
    public static javax.swing.JTextField PCompra;
    public static javax.swing.JTextField Talla;
    private javax.swing.JButton btACategoria;
    private javax.swing.JButton btActualizar;
    private javax.swing.JButton btECategoria;
    private javax.swing.JButton btvolver;
    private static javax.swing.JComboBox<POJOCategoria> comboCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    public static javax.swing.JTextField pVenta;
    // End of variables declaration//GEN-END:variables

}
