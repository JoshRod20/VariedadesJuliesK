package Modelo;

public class POJOProveedores extends POJOPersona {

    
    String nombreEmpresa;

    public POJOProveedores(String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
    }
    
    
    
    public POJOProveedores(String nombreEmpresa, String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
        this.nombreEmpresa = nombreEmpresa;
        
    }
    
    
            

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}
