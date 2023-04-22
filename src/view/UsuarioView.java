package view;

import controller.UsuarioController;
import controller.Metodos;

import javax.swing.*;

public class UsuarioView {
    public static void MenuUsuario() {
        Metodos metodos = new Metodos();
        String[] opciones = {"Registrar Nuevo Usuario", "Modificar Usuario", "Consultar Informacion de Usuario", "Eliminar", "Volver"};

        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = metodos.menuBotones("Seleccione una opción", "Sub Menú Personas", opciones, "Volver");
            switch (opcion) {
                case 0:
                    UsuarioView.registrarMenu();
                    break;
                case 1:
                    //editar("951");
                    break;
                case 2:
                    //consultar("");
                    break;
                case 3:
                    //eliminar("963");
                    break;
                case 4:

                    break;
            }
        }
    }

    public static void registrarMenu (){
        String idUsuario = JOptionPane.showInputDialog(null, "Dame id de usuario");//Acá pido id;
        String nombreUsuario = JOptionPane.showInputDialog(null, "Dame nombre de usuario");//
        String claveUsuario = JOptionPane.showInputDialog(null, "Dame contraseña de usuario");
        UsuarioController.registrar(idUsuario,nombreUsuario,claveUsuario);
    }

}


//public class;
////        public void MenuUsuario() {
////    UsuarioController usuario = new UsuarioController();
////        boolean decision = true;
////        int opcion;
////        String[] opciones = {"Registrar", "Consultar", "Editar", "Elmininar", "Salir"};
////        while (decision == true) {
////           // opcion = m.menuBotones("Elija una Opcion", "Elija una opcion:", opciones, "Crear");
////            switch (opcion) {
////                case 0:
////                    break;
////                case 1:
////                    break;
////                case 2:
////
////                    break;
////                case 3:
////
////                    break;
////                case 4:
////                    decision = false;
////                    break;
////
////            }
////
////        }
////
////    }
////}
