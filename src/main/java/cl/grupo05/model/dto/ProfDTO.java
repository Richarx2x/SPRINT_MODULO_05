package cl.grupo05.model.dto;
public class ProfDTO extends UserDTO {
    private String run;
    private String apellido;
   private String correo;
   private String telefono;
  private String cargo;
  

    public ProfDTO() {
       
    }

    public ProfDTO(String run, String apellido,String correo, String telefono, String cargo) {
        super(id,nombre, username, password);
        this.run = run;
        this.apellido = apellido;
      this.correo= correo;
      this.telefono = telefono;
      this.cargo= cargo;
    }

    public String getRun() {
        return run;
    }
    public void setRun(String  run) {
        this.run =  run;
    }

  public String getApellido() {
        return apellido;
    }
    public void setApellido(String  apellido) {
        this.apellido =  apellido;
    }

  public String getCorreo() {
        return correo;
    }
    public void setCorreo(String  correo) {
        this.correo =  correo;
    }

   public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono =  telefono;
    }

  public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo =  cargo;
    }

