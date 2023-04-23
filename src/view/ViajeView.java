package view;

import controller.Metodos;
import controller.ViajeController;
import javax.swing.JOptionPane;
import modelo.Viaje;


public class ViajeView {

    public static void menuViaje() {
        Metodos m = new Metodos();
        ViajeController viaje = new ViajeController();
        boolean decision = true;
        int opcion;
        String[] opciones = {"Registrar", "Consultar", "Editar", "Elmininar", "Salir"};
        while (decision == true) {
            opcion = m.menuBotones("Elija una Opcion", "Elija una opcion:", opciones, "Crear");
            switch (opcion) {
                case 0:
                    ViajeView.registrarMenu();
                    break;
                case 1:
                    ViajeView.consultarViaje();
                    break;
                case 2:
                   ViajeView.editarViaje();
                    break;
                case 3:
                    ViajeView.eliminarViaje();
                    break;
                case 4:
                    decision = false;
                    break;

            }

        }

    }
    public static void registrarMenu() {
        String Viaje = JOptionPane.showInputDialog(null, "Ingrese un Id del viaje:");//Acá pido id;
        String IdChofer = JOptionPane.showInputDialog(null, "Ingrese un Id del chofer:");//
        String fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha del viaje");
        String destino = JOptionPane.showInputDialog(null, "Ingrese el destino:" );
        String placa = JOptionPane.showInputDialog(null, "Ingrese numero de placa");//
        int capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese capacidad de pasajeros"));
        int tiquete = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio del tiquete"));
//        ViajeController.registrar(Viaje, placa, IdChofer, fecha, destino, capacidad, tiquete);

        if (ViajeController.registrar(Viaje, placa, IdChofer, fecha, destino, capacidad, tiquete)) {
            JOptionPane.showMessageDialog(null, "Su viaje fue registrado correctamente.");

        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el viaje.");
        }
    }
    
    public static void consultarViaje() {

        String idConsultar = JOptionPane.showInputDialog(null, "Digite el id del viaje a consultar");//Input del id;

            Viaje viajeConsultado = ViajeController.consultar(idConsultar);

        if (viajeConsultado != null) {
            JOptionPane.showMessageDialog(null, "Viaje encontrado:\n " + viajeConsultado);
        } else {
            JOptionPane.showMessageDialog(null, "Viaje no encontrado.");
        }
    }
    
        public static void editarViaje() {
        String ViajeEditar = JOptionPane.showInputDialog(null, "Ingrese Id del viaje:");
        String IdChoferEditar = JOptionPane.showInputDialog(null, "Ingrese nuevo Id del chofer:");
        String fechaEditar = JOptionPane.showInputDialog(null, "Ingrese la nueva fecha del viaje");
        String destinoEditar = JOptionPane.showInputDialog(null, "Ingrese el neevo destino:" );
        String placaEditar = JOptionPane.showInputDialog(null, "Ingrese nuevo numero de placa");
        int capacidadEditar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad correcta de pasajeros"));
        int tiqueteEditar = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el precio correcto del tiquete"));
        
        boolean respuestaEdicion = ViajeController.editar(ViajeEditar, placaEditar, IdChoferEditar, fechaEditar, destinoEditar, capacidadEditar, tiqueteEditar);

        if (respuestaEdicion == true) {
            JOptionPane.showMessageDialog(null, "Viaje encontrado, se edito la informacion con exito");
        } else {
                JOptionPane.showMessageDialog(null, "Viaje no encontrado, porfavor comprobar el ID del Viaje");
        }
    }
    
    
    public static void eliminarViaje() {

        String idConsultar = JOptionPane.showInputDialog(null, "Digite el id del viaje a eliminar\nEs una seleccion permanente.");//Input del id;

        boolean eliminado = ViajeController.eliminar(idConsultar);

        if (eliminado == true) {
            JOptionPane.showMessageDialog(null, "Viaje encontrado, se elimino con exito");
        } else {
            JOptionPane.showMessageDialog(null, "Viaje no encontrado, porfavor comprobar el ID del Viaje");
        }

    } 
    
}
