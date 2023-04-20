package view;


import controller.Metodos;
import controller.PersonaController;
public class PersonaView {

    public static String id ;
    public static String numero;
    public static String correo;
    public static String nombre;
    Metodos m = new Metodos();
    
    public void MenuPersonas() {
    PersonaController personas = new PersonaController();
        boolean decision = true;
        int opcion;
        String[] opciones = {"Registrar", "Consultar", "Editar", "Elmininar", "Salir"};
        while (decision == true) {
            opcion = m.menuBotones("Elija una Opcion", "Elija una opcion:", opciones, "Crear");
            switch (opcion) {
                case 0:
                    personas.registrar();
                    break;
                case 1:
                    consultarPersona();
                    break;
                case 2:
                    editarPersona();
                    break;
                case 3:
                    eliminarPersona();
                    break;
                case 4:
                    decision = false;
                    break;

            }

        }

    }

    public String crearPersona() {

        id = m.getCadena("Ingrese el Id de la persona: ");
        nombre = m.getCadena("Ingrese el nombre de la persona: ");
        numero = m.getCadena("Ingrese el numero de la persona: ");
        correo = m.getCadena("Ingrese el correo de la persona: ");
        
        return id;

    }

    public void consultarPersona() {

    }

    public void editarPersona() {

    }

    public void eliminarPersona() {

    }
}
