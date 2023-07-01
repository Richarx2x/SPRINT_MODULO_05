package cl.grupo05.model.dto;
public class AdminDTO extends UserDTO {
  private String run;
  private String apellido;
  private String correo;
  private String area;

  public AdminDTO(){
  }
  public AdminDTO(int id, String nombre, String username,
		  String password, String run,String apellido,String correo,String area){
    super(id,nombre,username,password);
    this.run =run;
    this.apellido = apellido;
    this.correo = correo;
    this.area = area;
  }
    public String getRun() {
        return run;
    }

    public void setRut(String run) {
        this.run = run;
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
        this.correo =  correo;
    }
   public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area =  area;
    }

}
