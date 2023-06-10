package Modelo;

public class POJOEmpleado extends POJOPersona {
    
    String cargo;

    public POJOEmpleado(String cargo, String nombre, String apellido, String telefono) {
        super(nombre, apellido, telefono);
        this.cargo = cargo;
        
    }
    
   
   
   public String getcargo(){
       return cargo;
   }
   
   public void setcargo(String cargo){
       this.cargo = cargo;
   }
}
