package view;


import controller.Metodos;
import controller.PersonaController;
public class PersonaView {

    public String id ;
    public String numero;
    public String correo;
    public String nombre;
    static Metodos m = new Metodos();
    
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
                    personas.consultar();
                    break;
                case 2:
                    personas.editar();
                    break;
                case 3:
                    personas.eliminar();
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
        id = m.getCadena("Ingrese el Id de la persona a consultar: ");
    }

    public void editarPersona() {
        id = m.getCadena("Ingrese el Id de la persona a editar: ");
    }

    public void eliminarPersona() {
        id = m.getCadena("Ingrese el Id de la persona a eliminar: ");
    }
}
