package modelo;

public class Tiquete {
    
    private String CantidadPersonas;

    public Tiquete(String CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    public String getCantidadPersonas() {
        return CantidadPersonas;
    }

    public void setCantidadPersonas(String CantidadPersonas) {
        this.CantidadPersonas = CantidadPersonas;
    }

    @Override
    public String toString() {
        return "Tiquete{" + "CantidadPersonas=" + CantidadPersonas + '}';
    }
    
}
