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
        PersonaView persona = new PersonaView();
        String id = persona.id;
        if (lista_Persona.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {
            try {

                if (existe(id)) {
                    for (int i = 0; i< lista_Persona.size(); i++){
                    m.msg(lista_Persona.get(i).toString());
                    break;
                    }
                    

                }
            } catch (Exception e) {
                m.msg("El número de chasis ingresado es incorrecto.");
            }
        }
    }

    public void editar() {
    }

    public void eliminar() {
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
}
