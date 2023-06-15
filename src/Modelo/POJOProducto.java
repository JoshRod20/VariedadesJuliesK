package Modelo;

public class POJOProducto {
    
    private String IDProducto;
    private int PrecioVenta;
    private int PrecioCompra;
    private String Marcas;
    private String Tallas;

    public POJOProducto(String IDProducto, int PrecioVenta, int PrecioCompra, String Marcas, String Tallas) {
        this.IDProducto = IDProducto;
        this.PrecioVenta = PrecioVenta;
        this.PrecioCompra = PrecioCompra;
        this.Marcas = Marcas;
        this.Tallas = Tallas;
    }

    public String getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(String IDProducto) {
        this.IDProducto = IDProducto;
    }

    public int getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(int PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public int getPrecioCompra() {
        return PrecioCompra;
    }

    public void setPrecioCompra(int PrecioCompra) {
        this.PrecioCompra = PrecioCompra;
    }

    public String getMarcas() {
        return Marcas;
    }

    public void setMarcas(String Marcas) {
        this.Marcas = Marcas;
    }

    public String getTallas() {
        return Tallas;
    }

    public void setTallas(String Tallas) {
        this.Tallas = Tallas;
    }
    
}
