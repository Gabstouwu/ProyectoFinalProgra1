package controller;

import interfaces.Crudinterfaces;
import java.util.ArrayList;
import modelo.Persona;
import view.PersonaView;

public class PersonaController implements Crudinterfaces {

    public static ArrayList<Persona> lista_Persona = new ArrayList();

    Metodos m = new Metodos();

    @Override
    public void registrar() {
        Persona crearPersona = new Persona();
        try {

            PersonaView persona = new PersonaView();
            persona.crearPersona();
            String id = persona.id;
            String nombre = persona.nombre;
            String numero = persona.numero;
            String correo = persona.correo;
            if (lista_Persona.size() <= 0) {
                crearPersona.setIdPersona(id);
                crearPersona.setNombrePersona(nombre);
                crearPersona.setTelefonoPersona(numero);
                crearPersona.setCorreo(correo);
                lista_Persona.add(crearPersona);
                System.out.println(lista_Persona);
            } else {
                for (int i = 0; i <= lista_Persona.size(); i++) {
                    if (lista_Persona.get(i).getIdPersona().equals(id)) {
                        m.msg("Id ya existente, ingrese una persona nueva");

                    } else {

                        crearPersona.setIdPersona(id);
                        crearPersona.setNombrePersona(nombre);
                        crearPersona.setTelefonoPersona(numero);
                        crearPersona.setCorreo(correo);
                        lista_Persona.add(crearPersona);

                        System.out.println(lista_Persona);

                    }
                    break;
                }
            }
        } catch (Exception e) {

        }
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
}
