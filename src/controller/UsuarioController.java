package controller;

//import interfaces.Crudinterfaces;
import java.util.ArrayList;
import modelo.Usuario;

public class UsuarioController {//implements Crudinterfaces{

    public static ArrayList<Usuario> ListaUsuario = new ArrayList<>();

    //@Override
    public static void registrar(String IdUsuario, String NombreUsuario, String ClaveUsuario) {
        Usuario NuevoUsuario = new Usuario(NombreUsuario, IdUsuario, ClaveUsuario);
        ListaUsuario.add(NuevoUsuario);
    }

    //@Override
    //Estoy usando el método equals() para comparar la cadena IdUsuario con la cadena inputParaBuscar
    public Usuario consultar(String idUsuario) {
        String inputParaBuscar = "123";

        for (int i = 0; i < ListaUsuario.size(); i++) {
            if (ListaUsuario.get(i).getIdUsuario().equals(inputParaBuscar)) {
                return ListaUsuario.get(i);
//                    System.out.println(ListaUsuario.get(i));
//                    System.out.println("Consulta realizada con exito.");
            }
        }
        return null;

    }

// @Override
    public boolean editar(String idUsuario) {
        String NombreUsuarioNuevo;
        String ClaveNueva;
        NombreUsuarioNuevo = "Mario";
        ClaveNueva = "951";
        String inputParaBuscar = "951";
        Usuario temporal = consultar(inputParaBuscar);
        if (temporal != null) {
            temporal.setCodigoUsuario(NombreUsuarioNuevo);
            temporal.setClaveUsuario(ClaveNueva);
            System.out.println("Modificación realizada con exito.");///quitarluego
            return true;
        }
        return false;
    }

//        try {
//            for (int i = 0; i < ListaUsuario.size(); i++) {
//                if (ListaUsuario.get(i).getIdUsuario().equals(inputParaBuscar)) {
//                    String CodigoNuevo;
//                    String ClaveNueva;
//                    CodigoNuevo = "Mario";
//                    ClaveNueva = "951";
//
//                    for (int i = 0; i < ListaUsuario.size(); i++) {
//                        if (ListaUsuario.get(i).getIdUsuario().equals(inputParaBuscar)) {
//
//                            ListaUsuario.get(indexId).setCodigoUsuario(CodigoNuevo);
//                            ListaUsuario.get(indexId).setClaveUsuario(ClaveNueva);
//                            return true;
//                        }
//                    }
//
//                }
//            }
//
//            System.out.println("Modificación realizada con exito.");
//        }
//        System.out.println("ID no existente");
//        return false;
//
//    }
    //@Override
    public boolean eliminar(String idEliminar) {

        idEliminar = "123";

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
}
