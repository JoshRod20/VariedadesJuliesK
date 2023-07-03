package Modelo;


public class POJOProducto {
    int IDProducto;
    String NombreProducto;
    int PrecioVenta;
    int PrecioCompra;
    String Descripcion;
    String Marcas;
    String Tallas;
    int CantidadDisponible;
    int IdCategoria;

    public POJOProducto(String NombreProducto, int PrecioVenta, int PrecioCompra, String Descripcion, String Marcas, String Tallas, int CantidadDisponible, int IdCategoria) {
        this.NombreProducto = NombreProducto;
        this.PrecioVenta = PrecioVenta;
        this.PrecioCompra = PrecioCompra;
        this.Descripcion = Descripcion;
        this.Marcas = Marcas;
        this.Tallas = Tallas;
        this.CantidadDisponible = CantidadDisponible;
        this.IdCategoria = IdCategoria;
    }

    public POJOProducto(int IDProducto, String NombreProducto, int PrecioVenta, int PrecioCompra, String Descripcion, String Marcas, String Tallas, int CantidadDisponible, int IdCategoria) {
        this.IDProducto = IDProducto;
        this.NombreProducto = NombreProducto;
        this.PrecioVenta = PrecioVenta;
        this.PrecioCompra = PrecioCompra;
        this.Descripcion = Descripcion;
        this.Marcas = Marcas;
        this.Tallas = Tallas;
        this.CantidadDisponible = CantidadDisponible;
        this.IdCategoria = IdCategoria;
    }

    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String NombreProducto) {
        this.NombreProducto = NombreProducto;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
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

    public int getCantidadDisponible() {
        return CantidadDisponible;
    }

    public void setCantidadDisponible(int CantidadDisponible) {
        this.CantidadDisponible = CantidadDisponible;
    }

    public int getIdCategoria() {
        return IdCategoria;
    }

    public void setIdCategoria(int IdCategoria) {
        this.IdCategoria = IdCategoria;
    }

    
}