package Controlador;

//package Controlador.Conexion.Controlador;
//
//import Modelo.POJOEmpleado;
//import java.sql.*;
//import javax.swing,JOptionPane;
//import javax.swing.table.DefaultTableModel;
//
//public class CRUDEmpleado {
//    
//    private final Conexion con =new Conexion();
//    private final Connection cn = (Connection) con.conectar();
//    
//    public DefaultTableModel mostrarDatos(){
//        ResultSet rs;
//        DefaultTableModel modelo;
//        String[] titulos = {"nombre", "apellido", "telefono",
//"cargo"};
//        String[] registro = new String[4];
//        modelo = DefaultTableModel(null, titulos);
//        
//        try {
//            CallableStatement cbstc = cn.prepareCall("{call MostrarClientes}");
//            rs = cbstc.executeQuery();
//            
//            while (rs.next()){
//                registro[0] = rs.getString("nombre");
//                registro[1] = rs.getString("apellido");
//                registro[2] = rs.getString("telefono");
//                registro[3] = rs.getString("cargo");
//                
//                modelo.addRow(registro);
//            }
//            
//            return modelo;
//        }catch (SQLException e){
//            JOptionPane.showMessageDialog(null, e);
//            return null;
//        }
//    }
//}
