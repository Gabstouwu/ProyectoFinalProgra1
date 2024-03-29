package modelo;

public class Vehiculo {
   private String placa; 
   private String marca;
   private String estilo;
   private String modelo;
   private int capacidadVehiculo;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String estilo, String modelo, int capacidadVehiculo) {
        this.placa = placa;
        this.marca = marca;
        this.estilo = estilo;
        this.modelo = modelo;
        this.capacidadVehiculo = capacidadVehiculo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidadVehiculo() {
        return capacidadVehiculo;
    }

    public void setCapacidadVehiculo(int capacidadVehiculo) {
        this.capacidadVehiculo = capacidadVehiculo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehiculo{");
        sb.append("placa=").append(placa);
        sb.append(", marca=").append(marca);
        sb.append(", estilo=").append(estilo);
        sb.append(", modelo=").append(modelo);
        sb.append(", capacidadVehiculo=").append(capacidadVehiculo);
        sb.append('}');
        return sb.toString();
    }

    
}
