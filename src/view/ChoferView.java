package view;

import controller.ChoferController;
import controller.Metodos;

public class ChoferView {
    
    public String id;
    public String fechaVencimiento;
    static Metodos m = new Metodos();
    public static void MenuChofer() {
    ChoferController chofer = new ChoferController();
    
        boolean decision = true;
        int opcion;
        String[] opciones = {"Registrar", "Consultar", "Editar", "Elmininar", "Volver"};
        while (decision == true) {
            opcion = m.menuBotones("Elija una Opcion", "Sub Menú Chofer", opciones, "Registrar");
            switch (opcion) {
                case 0:
                    chofer.registrar();
                    break;
                case 1:
                    chofer.consultar();
                    break;
                case 2:
                    chofer.editar();
                    break;
                case 3:
                    chofer.eliminar();
                    break;
                case 4:
                    decision = false;
                    break;

            }

        }

    }

    public String crearChofer() {

        id = m.getCadena("Ingrese el Id del chofer: ");
        fechaVencimiento = m.getCadena("Ingrese la fecha de vencimiento de la licencia del chofer: ");
        
        
        return id;

    }

    public void consultarChofer() {
        
    }

    public void editarChofer() {
        fechaVencimiento = m.getCadena("Ingrese la nueva fecha de vencimiento de la licencia del chofer: ");
       
    }

    public void eliminarChofer() {
        m.msg("Chofer eliminado con exito");
    }
    
    public String Id(){
    id = m.getCadena("Ingrese el Id del chofer: ");
    return id;
    }
}
