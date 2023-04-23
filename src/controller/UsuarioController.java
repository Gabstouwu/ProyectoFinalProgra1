package controller;

import java.util.ArrayList;
import modelo.Usuario;

public class UsuarioController {

    public static ArrayList<Usuario> ListaUsuario = new ArrayList<>();

    public static boolean registrar(String idUsuario, String NombreUsuario, String ClaveUsuario) {
        Usuario NuevoUsuario = new Usuario(idUsuario, NombreUsuario, ClaveUsuario);
        ListaUsuario.add(NuevoUsuario);
        return true;
    }

    //Estoy usando el método equals() para comparar la cadena IdUsuario con la cadena inputParaBuscar
    public static Usuario consultar(String idConsultar) {

        for (int i = 0; i < ListaUsuario.size(); i++) {
            if (ListaUsuario.get(i).getIdUsuario().equals(idConsultar)) {
               
                
                for (Usuario u : ListaUsuario) {//0
                    System.out.println(u);
                }

                return ListaUsuario.get(i);
            }
        }
        return null;

    }

    public static boolean editar(String idEditar, String nuevoNombre, String nuevaClave) {
        Usuario temporal = consultar(idEditar);
        if (temporal != null) {
            temporal.setCodigoUsuario(nuevoNombre);
            temporal.setClaveUsuario(nuevaClave);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String idEliminar) {

        for (int i = 0; i < ListaUsuario.size(); i++) {

            if (ListaUsuario.get(i).getIdUsuario().equals(idEliminar)) {

                ListaUsuario.remove(i);
                return true;
            }
        }
        return false;
    }

//    public static void CargarDatosUsuario() {
//
//        Usuario usuario1 = new Usuario("123", "Juan", "963");
//        Usuario usuario2 = new Usuario("456", "Maria", "852");
//        Usuario usuario3 = new Usuario("789", "Luis", "741");
//        ListaUsuario.add(usuario1);
//        ListaUsuario.add(usuario2);
//        ListaUsuario.add(usuario3);
//
//    }
}
