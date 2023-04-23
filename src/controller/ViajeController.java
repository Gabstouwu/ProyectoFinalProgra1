package controller;

import java.util.ArrayList;
import modelo.Viaje;
import view.ViajeView;
import controller.Metodos;

public class ViajeController {
    public static ArrayList<Viaje> listaViaje = new ArrayList();
    
    Metodos m = new Metodos();
    
    public static boolean registrar(String idViaje, String nPlaca, String idChofer, String fechaViaje, String destino, int capacidadPasajeros, int precioTikete) {
       Viaje nuevoViaje = new Viaje(idViaje,nPlaca, idChofer, fechaViaje, destino, capacidadPasajeros, precioTikete);
       listaViaje.add(nuevoViaje);
      return true; 
    }
   
    public static Viaje consultar(String idConsultar) {

        for (int i = 0; i < listaViaje.size(); i++) {
            if (listaViaje.get(i).getIdViaje().equals(idConsultar)) {
                return listaViaje.get(i);
            }
        }
        return null;

    }

    public static boolean editar(String idViaje, String nPlaca, String idChofer, String nuevaFecha, String nDestino, int capacidadPasajeros, int precioTikete) {
        Viaje temporal = consultar(idViaje);
        if (temporal != null) {
            temporal.setIdChofer(idChofer);
            temporal.setPlaca(nPlaca);
            temporal.setFechaViaje(nuevaFecha);
            temporal.setDestino(nDestino);
            temporal.setCapacidadPasajeros(capacidadPasajeros);
            temporal.setPrecioTiquete(precioTikete);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String idEliminar) {

        for (int i = 0; i < listaViaje.size(); i++) {

            if (listaViaje.get(i).getIdViaje().equals(idEliminar)) {

                listaViaje.remove(i);
                return true;
            }
        }
        return false;
    }

        public static void CargarDatosViaje() {

        Viaje usuario1 = new Viaje("123", "Juan", "963","12","ha",10,1000);
        Viaje usuario2 = new Viaje("564", "Juan", "963","12","ha",548,54);
        Viaje usuario3 = new Viaje("890", "Juan", "963","12","ha",548,54);
        listaViaje.add(usuario1);
        listaViaje.add(usuario2);
        listaViaje.add(usuario3);

    }
        
}
