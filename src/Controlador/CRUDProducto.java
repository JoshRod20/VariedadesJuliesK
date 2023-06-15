package Controlador;

//import java.sql.Connection;
//import Modelo.POJOProducto;
//import java.sql.*;
//import javax.swing.JOptionPane;
//import javax.swing.table.DefaultTableModel;
//
//public class CRUDProducto {
//    
//    private final Conexion con = new Conexion();
//    private final Connection cn = (Connection) con.conectar();
//
//public DefaultTableModel buscarDatos(String dato) {
//        ResultSet rs;   
//        DefaultTableModel modelo;
//        String[] titulos = {"nombre", "descripcion", "marca", "talla" }
//                String[] registro = new String[4];
//                
//                modelo = new DefaultTableModel(null, titulos);
//                
//                try {
//                    CallableStatement cbstc = cn.prepareCall("{call MostrarProducto}");
//                    rs = cbstc.executeQuery();
//                    
//                    while (rs.next()){
//                        registro[0] = rs.getString("nombre");
//                        registro[1] = rs.getString("descripcion");
//                        registro[2] = rs.getString("marca");
//                        registro[3] = rs.getString("talla");
//                        
//                        modelo.addRow(registro);
//                    }
//                    
//                    return modelo;
//                } catch (SQLException e){
//                    JOptionPane.showMessageDialog(null, e);
//                    return null;
//                }
//}
//
//public DefaultTableModel buscarDatos(String dato) {
//ResultSet rs;
//DefaultTableModel modelo;
//
//String[] titulos = {"nombre", "descripcion", "marca", "talla" }
//                String[] registro = new String[4];
//                
//                modelo = new DefaultTableModel(null, titulos);
//                
//                callableStatement call = cn.prepareCall("{call
//ConsultarProducto(?)}");"
//    call.setString(1, dato);
//rs = call.executeQuery();
//
//                    while (rs.next()){
//                        registro[0] = rs.getString("nombre");
//                        registro[1] = rs.getString("descripcion");
//                        registro[2] = rs.getString("marca");
//                        registro[3] = rs.getString("talla");
//                        
//                        modelo.addRow(registro);
//}

