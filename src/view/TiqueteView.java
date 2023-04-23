package view;

import controller.UsuarioController;
import controller.Metodos;
import controller.TiqueteController;
import java.util.ArrayList;
import modelo.Usuario;
import javax.swing.*;
import modelo.Tiquete;

public class TiqueteView {

    public static void MenuTiquete() {

        Metodos metodos = new Metodos();
        String[] opciones = {"Registrar una venta", "Consultar una venta", "Editar una venta", "Anular una Venta", "Generar una venta", "Volver"};

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
                    break;
                case 3:
                    break;
                case 5:
                    break;
                case 4:
                    //Salir del SubMenu Usuario
                    break;
            }
        }
    }

    public static void generarVenta() {
        String inputIdViaje = JOptionPane.showInputDialog(null, "Ingrese un Id de viaje:");//Acá pido id;
        String inputCantidadPersonasString = JOptionPane.showInputDialog(null, "Ingrese la cantidad de personas que van:");
        int inputCantidadPersonas = Integer.parseInt(inputCantidadPersonasString);
        String inputfecha = JOptionPane.showInputDialog(null, "Ingrese la fecha de hoy:");

        int idgenerado= TiqueteController.GeneradorID.generarID();
        
        
        if (TiqueteController.GenerarVenta(inputIdViaje, inputCantidadPersonas, inputfecha)) {
            JOptionPane.showMessageDialog(null, "Su venta se realizo con exito bajo el ID:"+idgenerado);

        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el venta, porfavor verifique el ID del viaje.");

        }

    }

    public static void consultarVenta() {

        String idConsultar = JOptionPane.showInputDialog(null, "Digite el id de la venta a consultar");//Input del id;

        int idConsulta = Integer.parseInt(idConsultar);

        Tiquete Consultado = TiqueteController.consultar(idConsulta);

        
        
        if (Consultado != null) {

            JOptionPane.showMessageDialog(null, "Usuario encontrado:\n " + Consultado);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        }
    }

}
