package Modelo;

public class POJOCategoria {

    private int IDCategoria;
    private String Descripcion;
    private String Nombre;

    public POJOCategoria() {
    }

    public POJOCategoria(String Nombre) {
        this.Nombre = Nombre;
    }

    public POJOCategoria(int IDCategoria, String Nombre) {
        this.IDCategoria = IDCategoria;
        this.Nombre = Nombre;
    }

    public POJOCategoria(int IDCategoria, String Descripcion, String Nombre) {
        this.IDCategoria = IDCategoria;
        this.Descripcion = Descripcion;
        this.Nombre = Nombre;
    }

    public int getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(int IDCategoria) {
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

    @Override
    public String toString(){
        return IDCategoria + " - "+ Nombre;
    }
}
