package controller;

//import interfaces.Crudinterfaces;
import java.util.ArrayList;
import modelo.Usuario;

public class UsuarioController {//implements Crudinterfaces{

    public static ArrayList<Usuario> ListaUsuario = new ArrayList<>();

    //@Override
    public void registrar() {
        String NombreUsuario;
        String IdUsuario;
        String ClaveUsuario;

        NombreUsuario = "Carlos";
        IdUsuario = "951";
        ClaveUsuario = "14789632";

        Usuario NuevoUsuario = new Usuario(NombreUsuario, IdUsuario, ClaveUsuario);

        ListaUsuario.add(NuevoUsuario);

    }

    //@Override
    //Estoy usando el método equals() para comparar la cadena IdUsuario con la cadena inputParaBuscar
    public void consultar() {
        String inputParaBuscar = "951";
        try {
            for (int i = 0; i < ListaUsuario.size(); i++) {
                if (ListaUsuario.get(i).getIdUsuario().equals(inputParaBuscar)) {
                    System.out.println(ListaUsuario.get(i));
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("NO se encuentra el id");
        }
    }

    // @Override
    public boolean editar(String s) {

        String inputParaBuscar = "951";

        int indexId = -1;

        if (indexId != -1) {
            String CodigoNuevo;
            String ClaveNueva;
            CodigoNuevo = "Mario";
            ClaveNueva = "951";

            for (int i = 0; i < ListaUsuario.size(); i++) {
                if (ListaUsuario.get(i).getIdUsuario().equals(inputParaBuscar)) {

                    ListaUsuario.get(indexId).setCodigoUsuario(CodigoNuevo);
                    ListaUsuario.get(indexId).setClaveUsuario(ClaveNueva);
                    return true;
                }
            }

            System.out.println("Modificación realizada con exito.");
        }
        System.out.println("ID no existente");
        return false;

    }

    //@Override
    public boolean eliminar(String idEliminar) {

        idEliminar = "963";

        for (int i = 0; i < ListaUsuario.size(); i++) {

            if (ListaUsuario.get(i).getIdUsuario().equals(idEliminar)) {

                ListaUsuario.remove(i);
                System.out.println("Modificación realizada con exito.");
                return true;
            }
        }

        System.out.println("No se encontro.");

        return false;
    }

    public void CargarDatos() {

        Usuario usuario1 = new Usuario("123", "Juan", "963");
        Usuario usuario2 = new Usuario("456", "Maria", "852");
        Usuario usuario3 = new Usuario("789", "Luis", "741");
        ListaUsuario.add(usuario1);
        ListaUsuario.add(usuario2);
        ListaUsuario.add(usuario3);

    }
//submenu

    public void MenuUsuario() {
        Metodos metodos = new Metodos();
        String[] opciones = {"Registrar Nuevo Usuario", "Modificar Usuario", "Consultar Informacion de Usuario", "Eliminar", "Volver"};

        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = metodos.menuBotones("Seleccione una opción", "Sub Menú Personas", opciones, "Volver");
            switch (opcion) {
                case 0:
                    registrar();
                    break;
                case 1:
                    consultar();
                    break;
                case 2:
                    editar("951");
                    break;
                case 3:
                    eliminar("963");
                    break;
                case 4:
                    consultar();
                    break;
            }
        }
    }
}
