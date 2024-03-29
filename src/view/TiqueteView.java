package view;

import controller.Metodos;
import controller.TiqueteController;
import javax.swing.*;
import modelo.Tiquete;

public class TiqueteView {

    public static void MenuTiquete() {

        Metodos metodos = new Metodos();

        String[] opciones = {"Registrar una venta", "Consultar una venta", "Anular una Venta", "Generar un Informe", "Volver"};

        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = metodos.menuBotones("Seleccione una opción", "Sub Menú Ventas", opciones, "Volver");
            switch (opcion) {
                case 0:
                    TiqueteView.generarVenta();
                    break;
                case 1:
                    TiqueteView.consultarVenta();
                    break;
                case 2:
                    TiqueteView.eliminarVenta();
                    break;
                case 3:
                    TiqueteController.imprimir();
                    break;
                case 4:
                    ///se sale del menu
                    break;

            }
        }
    }

    public static void generarVenta() {
        String inputIdViaje = JOptionPane.showInputDialog(null, "Ingrese un Id de viaje:");//Acá pido id;
        String inputCantidadPersonasString = JOptionPane.showInputDialog(null, "Ingrese la cantidad de personas que van:");
        int inputCantidadPersonas = Integer.parseInt(inputCantidadPersonasString);
        String inputfecha = JOptionPane.showInputDialog(null, "Ingrese la fecha del viaje:");

        int idgenerado= TiqueteController.generarID()+1;
        
        
        if (TiqueteController.GenerarVenta(inputIdViaje, inputCantidadPersonas, inputfecha)) {
            JOptionPane.showMessageDialog(null, "Su venta se realizo con exito bajo el ID: "+idgenerado);

        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el venta, porfavor verifique el ID del viaje.");

        }

    }

    public static void consultarVenta() {

        String idConsultar = JOptionPane.showInputDialog(null, "Digite el id de la venta a consultar");//Input del id;

        int idConsulta = Integer.parseInt(idConsultar);

        Tiquete Consultado = TiqueteController.consultar(idConsulta);

        
        
        if (Consultado != null) {

            JOptionPane.showMessageDialog(null, "Venta encontrada:\n " + Consultado);
        } else {
            JOptionPane.showMessageDialog(null, "Ventao no encontrada.");
        }
    }

      public static void eliminarVenta() {

        String idConsultar = JOptionPane.showInputDialog(null, "Digite el id de la venta a eliminar\nEs una seleccion permanente.");//Input del id;

        boolean eliminado = TiqueteController.eliminar(idConsultar);

        if (eliminado == true) {
            JOptionPane.showMessageDialog(null, "Venta encontrada, se elimino con exito");
        } if (eliminado== false) {
            JOptionPane.showMessageDialog(null, "Venta no encontrada, porfavor comprobar el ID de la venta");
        }

    }

}
