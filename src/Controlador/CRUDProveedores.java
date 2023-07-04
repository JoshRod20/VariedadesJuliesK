package Controlador;

import Conexion.Controlador;
import Modelo.POJOProveedores;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class CRUDProveedores {

     private final Controlador con = new Controlador();
    private final Connection cn = (Connection) con.conectar();
    
        public DefaultTableModel BuscarProveedor(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;

        String[] titulos = {"nombre", "apellido", "nombreEmpresa", "telefono"};
        String[] registro = new String[4];

        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement call = cn.prepareCall(
                    "{call BuscarProducto( ?)}");
            call.setString(1, dato);
            rs = call.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("nombre");
                registro[1] = rs.getString("apellido");
                registro[2] = rs.getString("nombreEmpresa");
                registro[3] = rs.getString("telefono");
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
         public DefaultTableModel MostrarProveedores() {
        ResultSet rs;
        DefaultTableModel modelo;
        String[] titulos = {"idProveedor", "nombre", "apellido", "nombreEmpresa", "telefono"};
        String[] registro = new String[5];
        modelo = new DefaultTableModel(null, titulos);

        try {
            CallableStatement cbstc = cn.prepareCall("{call MostrarProveedores}");
            rs = cbstc.executeQuery();

            while (rs.next()) {
                registro[0] = rs.getString("idProveedor");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("apellido");
                registro[3] = rs.getString("nombreEmpresa");
                registro[4] = rs.getString("telefono");

                modelo.addRow(registro);
            }
            return modelo;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
       
        
}

    public void insertarProveedores(POJOProveedores PJ){
    try {
        CallableStatement cs = cn.prepareCall("{call InsertarProveedor(?,?,?,?)}");
        cs.setString(1, PJ.getNombre());
        cs.setString(2, PJ.getApellido());
        cs.setString(3, PJ.getNombreEmpresa());
        cs.setString(4, PJ.getTelefono());

        cs.executeUpdate();
        
    } catch (Exception e) {
        
    }
    
    
    
}
    
    
//     public void Guardar(POJOProveedores prov1) {
//        try {
//            CallableStatement cbst = cn.prepareCall("{call InsertarProveedor(?,?,?,?)}");
//            cbst.setString(1, prov1.getNombre());
//            cbst.setString(2, prov1.getApellido());
//            cbst.setString(3, prov1.getNombreEmpresa());
//            cbst.setString(4, prov1.getTelefono());
//
//            cbst.executeUpdate();
//
//        } catch (SQLException e) {
////            JOptionPane.showMessageDialog(null, e);
////        }
//        
//}
        
        public boolean verificarDatos(String dato) {
        ResultSet rs;

        try {
            CallableStatement call = cn.prepareCall("{call InsertarProveedor    (?)}");
            call.setString(1, dato);
            rs = call.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
        
        public void eliminar(String Proveedores) {
        try {
            CallableStatement cbst = cn.prepareCall("{call EliminarProveedorPorID(?)}");
            cbst.setString(1, Proveedores);
            cbst.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
     public void actualizar(POJOProveedores p1) {
        try {
            CallableStatement cbst = cn.prepareCall("{call ActualizarProveesor(?,?,?,?)}");
            cbst.setString(1, p1.getNombre());
            cbst.setString(2, p1.getApellido());
            cbst.setString(3, p1.getNombreEmpresa());
            cbst.setString(4, p1.getTelefono());
            cbst.executeUpdate();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
    }
}
    

