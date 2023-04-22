package modelo;

public class Tiquete {

    private String CantidadPersonas;
    private String IdViaje;
    private String FechaDeVenta;

    public Tiquete(String CantidadPersonas, String IdViaje, String FechaDeVenta) {

        this.CantidadPersonas = CantidadPersonas;
        this.IdViaje = IdViaje;
        this.FechaDeVenta = FechaDeVenta;
    }

    public String getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(String CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    public String getIdViaje() {
        return IdViaje;
    }

    public void setIdViaje(String IdViaje) {
        this.IdViaje = IdViaje;
    }

    public String getFechaDeVenta() {
        return FechaDeVenta;
    }

    public void setFechaDeVenta(String FechaDeVenta) {
        this.FechaDeVenta = FechaDeVenta;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "CantidadPersonas=" + CantidadPersonas + ", IdViaje=" + IdViaje + ", FechaDeVenta=" + FechaDeVenta + '}';
    }

}
