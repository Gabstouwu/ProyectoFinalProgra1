package main;

import controller.ChoferController;
import controller.Metodos;
import controller.PersonaController;
import view.PersonaView;
import view.UsuarioView;
import view.VehiculoView;
//import controller.PersonaController; Descomentar cuando se complete persona controller

import controller.TiqueteController;
import controller.UsuarioController;
import view.ChoferView;

public class MenuPrincipal {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        PersonaView persona = new PersonaView();
        VehiculoView vehiculo = new VehiculoView(); 
        TiqueteController ventas = new TiqueteController();
        ChoferView choferView = new ChoferView();
        //// cargar datos preexistentes
        PersonaController.cargarDatosPersona();
        ChoferController.cargarDatosChofer();
        UsuarioController.CargarDatosUsuario();
        ////Menu
        int opcion;
        do {
            try {
                opcion = m.getEntero(
                        "MENU PRNCIPAL\n"
                        + "1. Personas\n"
                        + "2. Vehiculo\n"
                        + "3. Ventas\n"
                        + "4. Usuario\n"
                        + "5. Chofer \n"
                        + "6. Salir\n"      
                        + "Elija una opción:");
            } catch (Exception e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    persona.MenuPersonas();
                    break;
                case 2:
                    vehiculo.MenuVehiculo();
                    break;
                case 3:
                    ventas.MenuTiquete();
                    break;
                case 4:
                    UsuarioView.MenuUsuario();
                    break;
                case 5:
                    choferView.MenuChofer();
                    break;
                case 6:
                    m.msg("Gracias por usar el sistema, vuelva pronto...");
                    break;
                default:

            }
        } while (opcion != 6);
    }
}
