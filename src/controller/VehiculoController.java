package controller;

import static controller.PersonaController.lista_Persona;
import interfaces.Crudinterfaces;
import java.util.ArrayList;
import modelo.Vehiculo;
import view.VehiculoView;

public class VehiculoController implements Crudinterfaces {

    public static ArrayList<Vehiculo> lista_V = new ArrayList();
    VehiculoView vehiculo = new VehiculoView();
    Metodos m = new Metodos();
    Vehiculo crearVehiculo = new Vehiculo();

    @Override
    public void registrar() {
try {
           String id = VehiculoView.numeroPlaca ;
           vehiculo.crearVehiculo();
           
           String placa = VehiculoView.numeroPlaca ;
           String marca =  VehiculoView.marca;
           String estilo = VehiculoView.estilo ;
           String modelo =  VehiculoView.modelo;
           String capacidad = VehiculoView.capacidad ;
           
            for (int i = 0; i < lista_V.size(); i++) {
                if (lista_V.get(i).getPlaca()!= id) {
                    m.msg(id);
                    crearVehiculo.setPlaca(placa);
                    crearVehiculo.setMarca(marca);
                    crearVehiculo.setEstilo(estilo);
                    crearVehiculo.setModelo(modelo);
                    crearVehiculo.setCapacidadPasajeros(capacidad);
                    lista_V.add(crearVehiculo);
                    
                    System.out.println(lista_V);
                    break;
                    
                }

            }
        } catch (Exception e) {
            m.msg("Id ya existente, ingrese una persona nueva");
        }

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
