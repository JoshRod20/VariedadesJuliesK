package Modelo;

public class POJOCategoria {
    private String IDCategoria;
    private String Descripcion;
    private String Nombre;

    public POJOCategoria(String IDCategoria, String Descripcion, String Nombre) {
        this.IDCategoria = IDCategoria;
        this.Descripcion = Descripcion;
        this.Nombre = Nombre;
    }

    public String getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(String IDCategoria) {
        this.IDCategoria = IDCategoria;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
}
