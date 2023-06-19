package Controlador;

import Conexion.Controlador;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CRUDProducto {

    private final Controlador con = new Controlador();
    private final Connection cn = (Connection) con.conectar();

    public DefaultTableModel BuscarProducto(String dato){
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"idProducto", "precioVenta", "descripcion", "categoria", "cantidad"};
        String[] registro = new String[5];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall(
                    "{call BuscarProducto( ?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("idProducto");
                registro[1] = rs.getString("precioVenta");
                registro[2] = rs.getString("descripcion");
                registro[3] = rs.getString("categoria");
                registro[4] = rs.getString("cantidad");

                modelo.addRow(registro);

            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    
    public DefaultTableModel mostrarProductos() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"idProducto", "precioVenta", "descripcion", "categoria", "cantidad"};
        String[] registro = new String[5];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarProductos}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("idProducto");
                registro[1] = rs.getString("precioVenta");
                registro[2] = rs.getString("descripcion");
                registro[3] = rs.getString("categoria");
                registro[4] = rs.getString("cantidad");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
                                       

    public void Guardar(Producto pro1) {
        try {
            CallableStatement cbst = cn.prepareCall("{call InsertarProducto(?,?,?,?,?)}");
            cbst.setString(1, pro1.getidProducto());
            cbst.setString(2, pro1.getprecioVenta());
            cbst.setString(3, pro1.getdescripcion());
            cbst.setString(4, pro1.getcategoria());
            cbst.setString(5, pro1.getcantidad());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public boolean verificarDatos(String dato) {
        ResultSet rs;

        try {
            CallableStatement call = cn.prepareCall("{call InsertarProducto(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
}
