package view;

import controller.ChoferController;
import controller.Metodos;
import modelo.Chofer;

public class ChoferView {

    static Metodos m = new Metodos();

    public void MenuChofer() {

        boolean decision = true;
        int opcion;
        String[] opciones = {"Registrar", "Consultar", "Editar", "Elmininar", "Volver"};
        while (decision == true) {
            opcion = m.menuBotones("Elija una Opcion", "Sub Menú Chofer", opciones, "Registrar");
            switch (opcion) {
                case 0:
                    crearChofer();
                    break;
                case 1:
                    consultarChofer();
                    break;
                case 2:
                    editarChofer();
                    break;
                case 3:
                    eliminarChofer();
                    break;
                case 4:
                    decision = false;
                    break;

            }

        }

    }

    public static void crearChofer() {

        String idChofer = m.getCadena("Ingrese el Id del chofer: ");
        String fechaVencimiento = m.getCadena("Ingrese la fecha de vencimiento de la licencia del chofer: ");
        if (ChoferController.registrar(idChofer, fechaVencimiento)) {
            m.msg("El chofer fue registrado correctamente.");

        } else {
            m.msg("Error al registrar el chofer.");

        }

    }

    public void consultarChofer() {
        String idConsultar = m.getCadena("Digite el id del chofer a consultar");//Input del id;

        Chofer choferConsultado = ChoferController.consultar(idConsultar);

        if (choferConsultado != null) {
            m.msg("Chofer encontrado:\n " + choferConsultado);
        } else {
            m.msg("Chofer no encontrado.");
        }
    }

    public void editarChofer() {
          String idEditar = m.getCadena("Digite el id del chofer a editar:");//Input del id;
        String nuevaFecha = m.getCadena("Digite la nueva fecha de vencimiento:");//Input del id;
        

        boolean respuestaEdicion = ChoferController.editar(idEditar, nuevaFecha);

        if (respuestaEdicion == true) {
            m.msg("Chofer encontrado, se edito la informacion con exito");
        } else {
            m.msg("Chofer no encontrado, porfavor comprobar el ID");
        }

    }

    public void eliminarChofer() {
         String idConsultar = m.getCadena("Digite el id del chofer a eliminar\nEs una seleccion permanente.");//Input del id;

        boolean eliminado = ChoferController.eliminar(idConsultar);

        if (eliminado == true) {
            m.msg("Chofer encontrado, se elimino con exito");
        } if (eliminado== false) {
            m.msg("Chofer no encontrado, porfavor comprobar el ID");
        }
    }

    public String Id() {
        String id = m.getCadena("Ingrese el Id del chofer: ");
        return id;
    }
}
