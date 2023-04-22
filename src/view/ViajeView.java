package view;

import controller.Metodos;
import controller.ViajeController;


public class ViajeView {
    
    public String idViaje;
    public String numeroPlaca;
    public String idChofer;
    public String fechaViaje;
    public String destino;
    public String capacidadPasajeros;
    public String precioTikete;
    
    Metodos m = new Metodos();

    public void MenuVehiculo() {
        ViajeController viaje = new ViajeController();
        boolean decision = true;
        int opcion;
        String[] opciones = {"Registrar", "Consultar", "Editar", "Elmininar", "Salir"};
        while (decision == true) {
            opcion = m.menuBotones("Elija una Opcion", "Elija una opcion:", opciones, "Crear");
            switch (opcion) {
                case 0:
                    viaje.registrar();
                    break;
                case 1:
                    viaje.consultar();
                    break;
                case 2:
                    viaje.editar();
                    break;
                case 3:
                    viaje.eliminar();
                    break;
                case 4:
                    decision = false;
                    break;

            }

        }

    }
    public void registrar() {
        String[] opciones = {"San Jose", "Jaco", "Palmar Norte", "Ciudad Neily"};
        m.menuBotones("Seleccione una opción", "Destino", opciones, null);
    
    }
    public void consultar() {
    
        numeroPlaca = m.getCadena("Ingrese el id del viaje que desea consultar: ");
    }
    
    public void editar() {
        numeroPlaca = m.getCadena("Ingrese el id del viaje que desea editar: ");
    }
    
    public void eliminar() {
        
        numeroPlaca = m.getCadena("Ingrese el id del viaje que desea eliminar: ");
    }
    
}
