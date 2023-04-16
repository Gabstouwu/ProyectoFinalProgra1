package modelo;

public class Chofer {
    private String idPersona;
    private String vencimientoLicencia;

    public Chofer(String idPersona, String vencimientoLicencia) {
        this.idPersona = idPersona;
        this.vencimientoLicencia = vencimientoLicencia;
    }

    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getVencimientoLicencia() {
        return vencimientoLicencia;
    }

    public void setVencimientoLicencia(String vencimientoLicencia) {
        this.vencimientoLicencia = vencimientoLicencia;
    }

    @Override
    public String toString() {
        return "Chofer{" + "idPersona=" + idPersona + ", vencimientoLicencia=" + vencimientoLicencia + '}';
    }
    
    
    
    
    
    
}
