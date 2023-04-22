package main;

import controller.Metodos;
import view.PersonaView;
import view.VehiculoView;
//import controller.PersonaController; Descomentar cuando se complete persona controller

import controller.TiqueteController;
import controller.UsuarioController;

public class MenuPrincipal {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        PersonaView persona = new PersonaView();
        VehiculoView vehiculo = new VehiculoView(); 
        TiqueteController ventas = new TiqueteController();
        UsuarioController usuario = new UsuarioController();
        
        //// cargar datos preexistentes
        usuario.CargarDatos();
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
                        + "5. Salir\n"      
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
                    usuario.MenuUsuario();
                case 5:
                    m.msg("Gracias por usar el sistema, vuelva pronto...");
                    break;
                default:

            }
        } while (opcion != 5);
    }
}
