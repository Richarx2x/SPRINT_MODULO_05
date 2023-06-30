package cl.grupo05.model.dto;
public class ClteDTO extends UserDTO {
  private String rut;
  private String apellido;
   private String correo;
   private String telefono;
    private String afp;
   // private int sistemaSalud; Evaluar si incorporarlo para este sprint
    private String direccion;
    private String comuna;
   // private int edad;

  public ClteDTO (){
  }
  public ClteDTO(int id, String nombre, String username, String password, String rut, String apellido,String correo,String telefono, String afp,String direccion, String comuna){
    super(id,nombre,username.password);
      this.rut = rut;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.afp = afp;
        this.direccion = direccion;
        this.comuna = comuna;
  }

   public String getRut() {
        return rut;
    }
    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String Telefono) {
        this.telefono = telefono;
    }
    public String getAfp() {
        return afp;
    }

    public void setAfp(String afp) {
        this.afp = afp;
    }
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

}
