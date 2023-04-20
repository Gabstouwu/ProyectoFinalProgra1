package main;
import controller.Metodos;
import view.PersonaView;
import controller.PersonaController;
public class MenuPrincipal {

    public static void main(String[] args) {
        Metodos m = new Metodos();
        PersonaView persona = new PersonaView();
        PersonaController personaC = new PersonaController();
        int opcion;
         do {
            try {
               opcion = m.getEntero(
                        "MENU PRNCIPAL\n"
                        + "1. Personas\n"
                        + "2. Registro de personas\n"
                        + "3. Ventas\n"
                        + "4. Salir\n"
                        + "Elija una opción:");
            } catch (Exception e) {
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    persona.MenuPersonas();
                    //personaC.registrar();
                    break;
                case 2:
                    
                    break;
                case 3:
                  
                    break;

                case 4:
                    m.msg("Gracias por usar el sistema, vuelva pronto...");
                    break;
                default:

            }
        } while (opcion != 4);
    }
    }
    

