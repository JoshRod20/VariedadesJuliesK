package Modelo;

public class POJOVentas {
    
    private String IDProductos;
    private int Cantidad;
    private String Fecha;

    public POJOVentas(String IDProductos, int Cantidad, String Fecha) {
        this.IDProductos = IDProductos;
        this.Cantidad = Cantidad;
        this.Fecha = Fecha;
    }

    public String getIDProductos() {
        return IDProductos;
    }

    public void setIDProductos(String IDProductos) {
        this.IDProductos = IDProductos;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
}
