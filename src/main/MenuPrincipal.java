package main;
import controller.ChoferController;
import controller.Metodos;
import controller.PersonaController;
import controller.TiqueteController;
import controller.UsuarioController;
import controller.ViajeController;
import static view.ChoferView.MenuChofer;
import static view.PersonaView.MenuPersonas;
import static view.TiqueteView.MenuTiquete;
import static view.UsuarioView.MenuUsuario;
import static view.VehiculoView.MenuVehiculo;
import static view.ViajeView.menuViaje;

public class MenuPrincipal {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        
        //// cargar datos preexistentes
        PersonaController.cargarDatosPersona();
        ChoferController.cargarDatosChofer();
        UsuarioController.CargarDatosUsuario();
        ViajeController.CargarDatosViaje();
        TiqueteController.CargarDatosTiquete();
                
        ////Menu
        int opcion;
        do {
            try {
                opcion = m.getEntero(
                        "MENU PRNCIPAL\n"
                        + "1. Administrador\n"
                        + "2. Ventas\n"
                        + "3. Salir\n"
                        + "Elija una opción:");
            } catch (Exception e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    menuAdministrador();
                    break;
                case 2:
                    menuVentas();
                    break;
                case 3:
                    m.msg("Gracias por usar el sistema, vuelva pronto...");
                    break;
                default:

            }
        } while (opcion != 3);
    }

    public static void menuAdministrador() {
        Metodos m = new Metodos();
        boolean decision = true;
        int opcion;
        String[] opciones = {"Personas", "Usuarios", "Choferes", "Vehiculos", "volver"};
        while (decision == true) {
            opcion = m.menuBotones("Elija una opcion:", "Sub menu Administrador", opciones, "Crear");
            switch (opcion) {
                case 0:
                    MenuPersonas();
                    break;
                case 1:
                    MenuUsuario();
                    break;
                case 2:
                    MenuChofer();
                    break;
                case 3:
                    MenuVehiculo();
                    break;
                case 4:
                    decision = false;
                    break;

            }

        }

    }

    public static void menuVentas() {
        Metodos m = new Metodos();
        boolean decision = true;
        int opcion;
        String[] opciones = {"Viaje", "Tiquete", "volver"};
        while (decision == true) {
            opcion = m.menuBotones("Elija una opcion:", "Sub menu Ventas", opciones, "Crear");
            switch (opcion) {
                case 0:
                    menuViaje();
                    break;
                case 1:
                    MenuTiquete();
                    break;
                case 2:
                    decision = false;
                    break;

            }

        }

    }
}