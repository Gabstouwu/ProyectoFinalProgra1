package controller;

import interfaces.Crudinterfaces;
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
                // 1, 2
                // 2

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
    }

    public void editar() {
    }

    public void eliminar() {
    }

    public boolean existe(String id) {
    boolean pepe = false;   
        for (Persona personas : lista_Persona) {
            if (personas.getIdPersona().equals(id)) {
                pepe = true;
            }
        }

        return pepe;
    }
}
