package Controlador;

import Conexion.Controlador;
import Modelo.POJOCategoria;
import Modelo.POJOProducto;
import Vistas.Productos;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDProducto {

    private final Controlador con = new Controlador();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel BuscarProducto(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"idProducto", "nombreProducto", "descripcion", "precioVenta", "categoria", "cantidad"};
        String[] registro = new String[8];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall(
                    "{call BuscarProducto( ?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
//                registro[0] = rs.getString("idProducto");
//                registro[1] = rs.getString("nombreProducto");
//                registro[2] = rs.getString("precioCompra");
//                registro[3] = rs.getString("precioVenta");
//                registro[4] = rs.getString("descripcion");
//                registro[5] = rs.getString("marca");
//                registro[6] = rs.getString("talla");
//                registro[7] = rs.getString("cantidad");
//                registro[8] = rs.getInt("idCategoria");

                modelo.addRow(registro);

            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }

    public DefaultTableModel MostrarProductos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"idProducto", "Nombre Producto", "precioVenta", "descripcion", "categoria", "cantidad"};
        String[] registro = new String[5];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarProductos}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("idProducto");
                registro[1] = rs.getString("NombreProducto");
                registro[2] = rs.getString("precioVenta");
                registro[3] = rs.getString("descripcion");
                registro[4] = rs.getString("categoria");
                registro[5] = rs.getString("cantidad");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

    }
public void insertarProductos(POJOProducto PJ){
    try {
        CallableStatement cs = cn.prepareCall("{call InsertarProductos(?,?,?,?,?,?,?,?)}");
        cs.setString(1, PJ.getNombreProducto());
        cs.setString(4, PJ.getDescripcion());
        cs.setInt(2, PJ.getPrecioCompra());
        cs.setInt(3, PJ.getPrecioVenta());
        cs.setString(5, PJ.getMarcas());
        cs.setString(6, PJ.getTallas());
        cs.setInt(7, PJ.getCantidadDisponible());
        cs.setInt(8, PJ.getIdCategoria());
        
        cs.executeUpdate();
        
    } catch (Exception e) {
    }
    
            
}
    public void Guardar(POJOProducto pro1) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarProductos(?,?,?,?,?,?,?)}");
            cbst.setString(1, pro1.getNombreProducto());
            cbst.setString(2, pro1.getDescripcion());
            cbst.setDouble(3, pro1.getPrecioCompra());
            cbst.setDouble(4, pro1.getPrecioVenta());
            cbst.setString(5, pro1.getMarcas());
            cbst.setString(6, pro1.getTallas());
            cbst.setInt(7, pro1.getIdCategoria());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public boolean verificarDatos(String dato) {
        ResultSet rs;

        try {
            CallableStatement call = cn.prepareCall("{call InsertarProductos(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public void eliminar(String Producto) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarProductoPorID(?)}");
            cbst.setString(1, Producto);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void actualizar(POJOProducto p1) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarProductos(?,?,?,?,?)}");
            cbst.setString(1, p1.getNombreProducto());
            cbst.setString(2, p1.getDescripcion());
            cbst.setDouble(3, p1.getPrecioCompra());
            cbst.setDouble(4, p1.getPrecioVenta());
            cbst.setString(5, p1.getMarcas());
            cbst.setString(6, p1.getTallas());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public ArrayList mostrarDatosCombo() {

        ArrayList<POJOCategoria> Categorias = new ArrayList();

        POJOCategoria categoria = new POJOCategoria();
        categoria.setIDCategoria(0); // ID de categoría por defecto 
        categoria.setNombre("Categoria"); // Texto por defecto a mostrar
        Categorias.add(categoria);

        try {
            CallableStatement cbstc = cn.prepareCall("{call LlenarCategoria}");
            ResultSet rs = cbstc.executeQuery();
            while (rs.next()) {
                POJOCategoria cate = new POJOCategoria();
                cate.setIDCategoria(Integer.parseInt(rs.getString("idCategoria")));
                cate.setNombre(rs.getString("nombre"));
                Categorias.add(cate);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return Categorias;
    }

}
