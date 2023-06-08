package Controlador.Conexion.Controlador;

public class CRUDProducto {
    
}

public DefaultTableModel buscarDatos(String dato) {
        ResultSet rs;
        DefaultTableModel modelo;


        String[] titulos = {"nombre", "apellido", "telefono", "cargo";

        String[] registro = new String[4];


        modelo = new DefaultTableModel(null, titulos);
        try {
            CallableStatement call = cn.prepareCall("{call
DetalleProductosVentas(?)}");
            call.setString(1, dato);
            rs = call.executeQuery();


            while (rs.next()) {
                registro[0] = rs.getString("nombre");
                registro[1] = rs.getString("apellido");
                registro[2] = rs.getString("telefono");
                registro[3] = rs.getString("cargo");


                modelo.addRow(registro);
            }

            return modelo;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }

   }
