package modelo;
public class Persona {
   
    private String idPersona;
    private String nombrePersona;
    private String telefonoPersona;
    private String correoPersona;
    public Persona(){
}
    public Persona(String idPersona, String nombrePersona, String telefonoPersona, String correo) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.telefonoPersona = telefonoPersona;
        this.correoPersona = correo;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public String getTelefonoPersona() {
        return telefonoPersona;
    }

    public void setTelefonoPersona(String telefonoPersona) {
        this.telefonoPersona = telefonoPersona;
    }

    public String getCorreo() {
        return correoPersona;
    }

    public void setCorreo(String correoPersona) {
        this.correoPersona = correoPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombrePersona=" + nombrePersona + ", telefonoPersona=" + telefonoPersona + ", correo=" + correoPersona + '}';
    }
    
}
