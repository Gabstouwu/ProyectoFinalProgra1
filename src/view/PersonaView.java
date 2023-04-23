package view;

import controller.Metodos;
import controller.PersonaController;
import modelo.Persona;

public class PersonaView {

    static Metodos m = new Metodos();

    public void MenuPersonas() {
        PersonaController personas = new PersonaController();

        boolean decision = true;
        int opcion;
        String[] opciones = {"Registrar", "Consultar", "Editar", "Elmininar", "Volver"};
        while (decision == true) {
            opcion = m.menuBotones("Elija una Opcion", "Sub Menú Personas", opciones, "Registrar");
            switch (opcion) {
                case 0:
                    crearPersona();
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

    public static void crearPersona() {

        String id = m.getCadena("Ingrese el Id de la persona: ");
        String nombre = m.getCadena("Ingrese el nombre de la persona: ");
        String numero = m.getCadena("Ingrese el numero de la persona: ");
        String correo = m.getCadena("Ingrese el correo de la persona: ");

        if (PersonaController.registrar(id, nombre, numero, correo)) {
            m.msg("La persona fue registrada correctamente.");

        } else {
            m.msg("Error al registrar la persona.");

        }

    }

    public void consultarPersona() {
        String idConsultar = m.getCadena("Digite el id de la persona a consultar");//Input del id;

        Persona personaConsultada = PersonaController.consultar(idConsultar);

        if (personaConsultada != null) {
            m.msg("Persona encontrada:\n " + personaConsultada);
        } else {
            m.msg("Persona no encontrada.");
        }
    }

    public void editarPersona() {
        String idEditar = m.getCadena("Digite el id de la persona a editar: ");
        String nuevoNombre = m.getCadena("Digite el Nuevo nombre para la persona: ");
        String nuevoNumero = m.getCadena("Digite el nuevo numero: ");
        String nuevoCorreo = m.getCadena("Digite el nuevo correo de la persona: ");

        boolean respuestaEdicion = PersonaController.editar(idEditar, nuevoNombre, nuevoNumero, nuevoCorreo);

        if (respuestaEdicion == true) {
            m.msg("Persona encontrada, se edito la informacion con exito");
        } else {
            m.msg("Persona no encontrada, por favor comprobar Id");
        }
    }

    public void eliminarPersona() {
        String idConsultar = m.getCadena("Digite el id del usuario a eliminar\nEs una seleccion permanente.");//Input del id;

        boolean eliminado = PersonaController.eliminar(idConsultar);

        if (eliminado == true) {
            m.msg("Persona encontrada, se elimino con exito");
        } if (eliminado== false) {
            m.msg("Persona no encontrada, porfavor comprobar el ID");
        }
    }

}
