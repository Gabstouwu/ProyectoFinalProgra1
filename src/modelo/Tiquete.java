package modelo;

public class Tiquete {

    private int CantidadPersonas;
    private int IdViaje;
    private String FechaDeVenta;
    private double PrecioDeLaVenta;

    public Tiquete() {
    }

    public Tiquete(int CantidadPersonas, int IdViaje, String FechaDeVenta, double PrecioDeLaVenta) {
        this.CantidadPersonas = CantidadPersonas;
        this.IdViaje = IdViaje;
        this.FechaDeVenta = FechaDeVenta;
        this.PrecioDeLaVenta = PrecioDeLaVenta;
    }

    public int getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(int CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    public int getIdViaje() {
        return IdViaje;
    }

    public void setIdViaje(int IdViaje) {
        this.IdViaje = IdViaje;
    }

    public String getFechaDeVenta() {
        return FechaDeVenta;
    }

    public void setFechaDeVenta(String FechaDeVenta) {
        this.FechaDeVenta = FechaDeVenta;
    }

    public double getPrecioDeLaVenta() {
        return PrecioDeLaVenta;
    }

    public void setPrecioDeLaVenta(double PrecioDeLaVenta) {
        this.PrecioDeLaVenta = PrecioDeLaVenta;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "CantidadPersonas=" + CantidadPersonas + ", IdViaje=" + IdViaje + ", FechaDeVenta=" + FechaDeVenta + ", PrecioDeLaVenta=" + PrecioDeLaVenta + '}';
    }

}
