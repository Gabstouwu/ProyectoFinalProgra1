package modelo;

public class Usuario {
    private String IdUsuario;
    private String CodigoUsuario;
    private String ClaveUsuario;

    public Usuario(String IdUsuario, String CodigoUsuario, String ClaveUsuario) {
        this.IdUsuario = IdUsuario;
        this.CodigoUsuario = CodigoUsuario;
        this.ClaveUsuario = ClaveUsuario;
    }
    
    public String getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(String IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getCodigoUsuario() {
        return CodigoUsuario;
    }

    public void setCodigoUsuario(String CodigoUsuario) {
        this.CodigoUsuario = CodigoUsuario;
    }

    public String getClaveUsuario() {
        return ClaveUsuario;
    }

    public void setClaveUsuario(String ClaveUsuario) {
        this.ClaveUsuario = ClaveUsuario;
    }

    @Override
    public String toString() {
        return "Usuario{" + "IdUsuario=" + IdUsuario + ", CodigoUsuario=" + CodigoUsuario + ", ClaveUsuario=" + ClaveUsuario + '}';
    }
    
    
}
