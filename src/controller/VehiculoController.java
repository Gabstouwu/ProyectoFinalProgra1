package controller;

import interfaces.Crudinterfaces;
import java.util.ArrayList;
import modelo.Vehiculo;

public class VehiculoController implements Crudinterfaces {

    public Metodos m = new Metodos();

    public static ArrayList<Vehiculo> lista_V = new ArrayList<>();

    @Override
    public void registrar() {

    }

    @Override
    public void editar() {
    }

    @Override
    public void eliminar() {
    }

    @Override
    public void consultar() {
        if (lista_V.isEmpty()) {
            m.msg("No hay registro de vehiculos");
        } else {

            String placa = m.getCadena("Ingrese el numero de placa");
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setPlaca("");
            for (Vehiculo v : lista_V) {
                if (v.getPlaca().equals(placa)) {
                    vehiculo = v;
                    break;
                }
            }
            if (vehiculo.getPlaca().isEmpty()) {
                m.msg("Vehiculo no existe");
            } else {
                m.msg(vehiculo.toString());
            }
        }
    }

    public void CargarDatos() {

        Vehiculo V1 = new Vehiculo("1234", " Hyundai", "slim", "2010", "20");
        Vehiculo V2 = new Vehiculo("5678", "Mitsubishi", "small", "2015", "35");
        Vehiculo V3 = new Vehiculo("9012", "Volkswagen", "xSmall", "2022", "50");
        lista_V.add(V1);
        lista_V.add(V2);
        lista_V.add(V3);

    }
}
