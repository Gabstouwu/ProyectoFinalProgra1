package controller;

import java.util.ArrayList;
import modelo.Persona;
import view.PersonaView;

public class PersonaController {

    public static ArrayList<Persona> lista_Persona = new ArrayList();

    Metodos m = new Metodos();

    public void registrar() {
        Persona crearPersona = new Persona();
        try {

            PersonaView persona = new PersonaView();
            persona.crearPersona();
            String id = persona.id;
            String nombre = persona.nombre;
            String numero = persona.numero;
            String correo = persona.correo;
            if (lista_Persona.isEmpty()) {
                crearPersona.setIdPersona(id);
                crearPersona.setNombrePersona(nombre);
                crearPersona.setTelefonoPersona(numero);
                crearPersona.setCorreo(correo);
                lista_Persona.add(crearPersona);
                System.out.println(lista_Persona);
            } else {
                if (existe(id)) {
                    m.msg("Id ya existente, ingrese una persona nueva");

                } else {
                    crearPersona.setIdPersona(id);
                    crearPersona.setNombrePersona(nombre);
                    crearPersona.setTelefonoPersona(numero);
                    crearPersona.setCorreo(correo);
                    lista_Persona.add(crearPersona);
                    System.out.println(lista_Persona);

                }

            }
        } catch (Exception e) {

        }
    }

    public void consultar() {

        if (lista_Persona.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {
            PersonaView persona = new PersonaView();
            persona.Id();
            String id = persona.id;
            if (existe(id) && posicion(id) < lista_Persona.size()) {

                m.msg(lista_Persona.get(posicion(id)).toString());

            } else {
                m.msg("Persona no existe");
            }
        }

    }

    public void editar() {
        if (lista_Persona.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {

            PersonaView persona = new PersonaView();
            persona.Id();
            String id = persona.id;

            if (existe(id) && posicion(id) < lista_Persona.size()) {
                persona.editarPersona();
                lista_Persona.get(posicion(id)).setNombrePersona(persona.nombre);
                lista_Persona.get(posicion(id)).setTelefonoPersona(persona.numero);
                lista_Persona.get(posicion(id)).setCorreo(persona.correo);
                m.msg("Modificación realizada con exito.");

            } else {
                m.msg("No existe el numero de id");
            }

        }
    }

    public void eliminar() {
        if (lista_Persona.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {
            PersonaView persona = new PersonaView();
            persona.Id();
            String id = persona.id;
            if (existe(id) && posicion(id) < lista_Persona.size()) {

                lista_Persona.remove(posicion(id));
                m.msg("Persona Eliminada" + lista_Persona.toString());
            } else {
                m.msg("Persona no existe");
            }
        }

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
        int pos = 0;
        for (Persona personas : lista_Persona) {
            if (personas.getIdPersona().equals(id)) {
                pos = personas.getIdPersona().indexOf(id);
            }
        }
        return pos;
    }
}
