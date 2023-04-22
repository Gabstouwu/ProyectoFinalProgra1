package modelo;

public class Viaje {
    private String idViaje;
    private String placa;
    private String idChofer;
    private String fechaViaje;
    private String destino;
    private int capacidadPasajeros;
    private int precioTiquete;

    public Viaje() {
    }

    public Viaje(String idViaje, String placa, String idChofer, String fechaViaje, String destino, int capacidadPasajeros, int precioTiquete) {
        this.idViaje = idViaje;
        this.placa = placa;
        this.idChofer = idChofer;
        this.fechaViaje = fechaViaje;
        this.destino = destino;
        this.capacidadPasajeros = capacidadPasajeros;
        this.precioTiquete = precioTiquete;
    }

    public int getPrecioTiquete() {
        return precioTiquete;
    }

    public void setPrecioTiquete(int precioTiquete) {
        this.precioTiquete = precioTiquete;
    }

    public String getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(String idViaje) {
        this.idViaje = idViaje;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(String idChofer) {
        this.idChofer = idChofer;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Viaje{");
        sb.append("idViaje=").append(idViaje);
        sb.append(", placa=").append(placa);
        sb.append(", idChofer=").append(idChofer);
        sb.append(", fechaViaje=").append(fechaViaje);
        sb.append(", destino=").append(destino);
        sb.append(", capacidadPasajeros=").append(capacidadPasajeros);
        sb.append(", precioTiquete=").append(precioTiquete);
        sb.append('}');
        return sb.toString();
    }
    
    
}
