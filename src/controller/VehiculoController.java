package controller;

import java.util.ArrayList;
import modelo.Vehiculo;
import view.VehiculoView;
import controller.Metodos;

public class VehiculoController { 

    public static ArrayList<Vehiculo> lista_V = new ArrayList();

    Metodos m = new Metodos();
    Vehiculo crearVehiculo = new Vehiculo();

    public void registrar() {
        Vehiculo crearVehiculo = new Vehiculo();
        try {

            VehiculoView vehiculo = new VehiculoView();
            vehiculo.registrar();
            String placa = vehiculo.numeroPlaca;
            String marca = vehiculo.marca;
            String estilo = vehiculo.estilo;
            String modelo = vehiculo.modelo;
            int capacidad = vehiculo.capacidad;

            if (lista_V.isEmpty()) {
                crearVehiculo.setPlaca(placa);
                crearVehiculo.setMarca(marca);
                crearVehiculo.setEstilo(estilo);
                crearVehiculo.setModelo(modelo);
                crearVehiculo.setCapacidadVehiculo(capacidad);
                lista_V.add(crearVehiculo);
                System.out.println(lista_V);
            } else {
                if (existe(placa)) {
                    m.msg("Id ya existente, ingrese un Vehiculo nuevo");
                } else {
                    crearVehiculo.setPlaca(placa);
                    crearVehiculo.setMarca(marca);
                    crearVehiculo.setEstilo(estilo);
                    crearVehiculo.setModelo(modelo);
                    crearVehiculo.setCapacidadVehiculo(capacidad);
                    lista_V.add(crearVehiculo);
                    System.out.println(lista_V);
                }
            }
        } catch (Exception e) {
        }
    }

    public void editar() {
        if (lista_V.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {
            VehiculoView vehiculo = new VehiculoView();
            vehiculo.Placa();
            String placa = vehiculo.numeroPlaca;

            if (existe(placa) && posicion(placa) < lista_V.size()) {
                vehiculo.editar();
                lista_V.get(posicion(placa)).setPlaca(vehiculo.numeroPlaca);
                lista_V.get(posicion(placa)).setMarca(vehiculo.marca);
                lista_V.get(posicion(placa)).setEstilo(vehiculo.estilo);
                lista_V.get(posicion(placa)).setModelo(vehiculo.modelo);
                lista_V.get(posicion(placa)).setCapacidadVehiculo(vehiculo.capacidad);
                m.msg("Modificación realizada con exito.");

            } else {
                m.msg("No existe ese numero de placa");
            }
        }

    }

    public void eliminar() {
        if (lista_V.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {
            VehiculoView vehiculo = new VehiculoView();
            vehiculo.Placa();
            String placa = vehiculo.numeroPlaca;
            if (existe(placa) && posicion(placa) < lista_V.size()) {

                lista_V.remove(posicion(placa));
                m.msg("Vehiculo Eliminado de la lista." + lista_V.toString());
            } else {
                m.msg("Numero de placa no existe");
            }
        }
    }

    public void consultar() {
        if (lista_V.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {
            VehiculoView vehiculo = new VehiculoView();
            vehiculo.consultar();
            String placa = vehiculo.numeroPlaca;
            if (existe(placa)) {
                for (int i = 0; i < lista_V.size(); i++) {
                    if (lista_V.get(i).getPlaca().equals(placa)) {
                        m.msg(lista_V.get(i).toString());
                        break;
                    }
                }
            } else {
                m.msg("Numero de palca no existe");
            }
        }
    }

    public boolean existe(String id) {
        boolean valor = false;
        for (Vehiculo vehiculo : lista_V) {
            if (vehiculo.getPlaca().equals(id)) {
                valor = true;
            }
        }

        return valor;
    }

    public int posicion(String placa) {
        int pos = 0;
        for (Vehiculo vehiculo : lista_V) {
            if (vehiculo.getPlaca().equals(placa)) {
                pos = vehiculo.getPlaca().indexOf(placa);
            }
        }
        return pos;
    }
}
