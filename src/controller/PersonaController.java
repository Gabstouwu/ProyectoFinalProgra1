package controller;

import java.util.ArrayList;
import modelo.Persona;
import view.PersonaView;

public class PersonaController {

    public static ArrayList<Persona> lista_Persona = new ArrayList();

    Metodos m = new Metodos();

    public static boolean registrar(String id, String nombre, String numero, String correo) {
        Persona NuevaPersona = new Persona(id, nombre, numero, correo);
        lista_Persona.add(NuevaPersona);
        return true;
    }

    public static Persona consultar(String id) {
        for (int i = 0; i < lista_Persona.size(); i++) {
            if (lista_Persona.get(i).getIdPersona().equals(id)) {

                for (Persona p : lista_Persona) {//0

                }

                return lista_Persona.get(i);
            }
        }
        return null;

    }

    public static boolean editar(String idEditar, String nuevoNombre, String nuevoNumero, String nuevoCorreo) {
        Persona temporal = consultar(idEditar);
        if (temporal != null) {
            temporal.setNombrePersona(nuevoNombre);
            temporal.setTelefonoPersona(nuevoNumero);
            temporal.setCorreo(nuevoCorreo);
            return true;
        }
        return false;
    }

    public static boolean eliminar(String idEliminar) {

        for (int i = 0; i < lista_Persona.size(); i++) {

            if (lista_Persona.get(i).getIdPersona().equals(idEliminar)) {

                lista_Persona.remove(i);
                return true;
            }
        }
        return false;
    }

    public boolean existe(String id) {
        boolean valor = false;
        for (Persona personas : lista_Persona) {
            if (personas.getIdPersona().equals(id)) {
                valor = true;
            }
        }

        return valor;
    }

    public int posicion(String id) {
        int pos = -1;
        for (Persona personas : lista_Persona) {
            if (personas.getIdPersona().equals(id)) {
                pos = personas.getIdPersona().indexOf(id);
            }
        }
        return pos;
    }

<<<<<<< Updated upstream
//    public static void cargarDatosPersona() {
//        Persona persona1 = new Persona("123", "Miguel", "12345678", "amanda@gmail.com");
//        Persona persona2 = new Persona("456", "David", "98765432", "amanda@gmail.com");
//        Persona persona3 = new Persona("789", "Esteban", "654789123", "amanda@gmail.com");
//
//        lista_Persona.add(persona1);
//        lista_Persona.add(persona2);
//        lista_Persona.add(persona3);
//
//    }
=======
    public static void cargarDatosPersona() {
        Persona persona1 = new Persona("123", "Miguel", "12345678", "amanda@gmail.com");
        Persona persona2 = new Persona("456", "David", "98765432", "amanda@gmail.com");
        Persona persona3 = new Persona("789", "Esteban", "654789123", "amanda@gmail.com");

        lista_Persona.add(persona1);
        lista_Persona.add(persona2);
        lista_Persona.add(persona3);
    }
>>>>>>> Stashed changes
}
