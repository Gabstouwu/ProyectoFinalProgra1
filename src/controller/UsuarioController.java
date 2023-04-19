package controller;

import interfaces.Crudinterfaces;
import java.util.ArrayList;
import modelo.Usuario;

public class UsuarioController implements Crudinterfaces {

    public static ArrayList<Usuario> ListaUsuario = new ArrayList<>(); 
    
    
    
    @Override
    public void registrar() {
        String NombreUsuario;
        String IdUsuario;
        String ClaveUsuario;
        
        NombreUsuario= "Carlos";
        IdUsuario= "951";
        ClaveUsuario = "14789632";
        
        
        Usuario NevoUsuario = new Usuario(NombreUsuario, IdUsuario, ClaveUsuario);
        
        ListaUsuario.add(NevoUsuario);
        
        
    }

    @Override
    public void consultar() {
    }

    @Override
    public void editar() {
    }

    @Override
    public void eliminar() {
    }

    public void CargarDatos() {

        Usuario usuario1 = new Usuario ("123","Juan","963");
        Usuario usuario2 = new Usuario("456","Maria","852");
        Usuario usuario3 = new Usuario("789","Luis","741");;
        ListaUsuario.add(usuario1);
        ListaUsuario.add(usuario2);
        ListaUsuario.add(usuario3);

    }

}
