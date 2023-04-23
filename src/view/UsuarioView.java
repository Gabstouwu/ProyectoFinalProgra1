package view;

import controller.UsuarioController;
import controller.Metodos;
import modelo.Usuario;
import javax.swing.*;

public class UsuarioView {

    public static void MenuUsuario() {
        Metodos metodos = new Metodos();
        String[] opciones = {"Registrar Nuevo Usuario", "Consultar Informacion de Usuario", "Editar Usuario", "Eliminar", "Volver"};

        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = metodos.menuBotones("Seleccione una opción", "Sub Menú Usuario", opciones, "Volver");
            switch (opcion) {
                case 0:
                    UsuarioView.registrarMenu();
                    break;
                case 1:
                    UsuarioView.consultarUsuario();
                    break;
                case 2:
                    UsuarioView.editarUsuario();
                    break;
                case 3:
                    UsuarioView.eliminarUsuario();
                    break;
                case 4:
                    //Salir del SubMenu Usuario
                    break;
            }
        }
    }

    public static void registrarMenu() {
        String idUsuario = JOptionPane.showInputDialog(null, "Ingrese Id del viaje al que desea ir");//se pide el id;
        String nombreUsuario = JOptionPane.showInputDialog(null, "Ingrese la cantidad de tiquetes a comprar:");//
        String claveUsuario = JOptionPane.showInputDialog(null, "Ingrese la fecha en que se compro los tiquetes:");

        if (UsuarioController.registrar(idUsuario, nombreUsuario, claveUsuario)) {
            JOptionPane.showMessageDialog(null, "Su usuario fue registrado correctamente.");

        } else {
            JOptionPane.showMessageDialog(null, "Error al registrar el usuario.");

        }

    }

    public static void consultarUsuario() {

        String idConsultar = JOptionPane.showInputDialog(null, "Digite el id del usuario a consultar");//Input del id;

        Usuario usuarioConsultado = UsuarioController.consultar(idConsultar);

        if (usuarioConsultado != null) {
            JOptionPane.showMessageDialog(null, "Usuario encontrado:\n " + usuarioConsultado);
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        }
    }

    public static void eliminarUsuario() {

        String idConsultar = JOptionPane.showInputDialog(null, "Digite el id del usuario a eliminar\nEs una seleccion permanente.");//Input del id;

        boolean eliminado = UsuarioController.eliminar(idConsultar);

        if (eliminado == true) {
            JOptionPane.showMessageDialog(null, "Usuario encontrado, se elimino con exito");
        } if (eliminado== false) {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado, porfavor comprobar el ID");
        }

    }

    public static void editarUsuario() {
        String idEditar = JOptionPane.showInputDialog(null, "Digite el id del usuario a editar:");//Input del id;
        String usuarioNuevoInput = JOptionPane.showInputDialog(null, "Digite el Nuevo nombre para el Usuario:");//Input del id;
        String usuarioNuevaClaveInput = JOptionPane.showInputDialog(null, "Digite la nueva contraseña:");//Input del id;

        boolean respuestaEdicion = UsuarioController.editar(idEditar, usuarioNuevoInput, usuarioNuevaClaveInput);

        if (respuestaEdicion == true) {
            JOptionPane.showMessageDialog(null, "Usuario encontrado, se edito la informacion con exito");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado, porfavor comprobar el ID");
        }
    }
}
