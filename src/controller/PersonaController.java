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

        if (lista_Persona.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {
            PersonaView persona = new PersonaView();
            persona.consultarPersona();
            String id = persona.id;
            if (existe(id)) {
                for (int i = 0; i < lista_Persona.size(); i++) {
                    if (lista_Persona.get(i).getIdPersona().equals(id)) {
                        m.msg(lista_Persona.get(i).toString());
                        break;
                    }
                }

            } else {
                m.msg("Persona no existe");
            }
        }
    }

    public void editar() {
        
    }

    public void eliminar() {
         if (lista_Persona.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {
            PersonaView persona = new PersonaView();
            persona.eliminarPersona();
            String id = persona.id;
            if (poscision(id) < lista_Persona.size()) {
               
                    lista_Persona.remove(poscision(id));
                    m.msg("Persona Eliminada"+ lista_Persona.toString());
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
    
    public int poscision(String id){
    int pos=0;
    for (Persona personas : lista_Persona) {
            if (personas.getIdPersona().equals(id)) {
                pos = personas.getIdPersona().indexOf(id);
            }
        }
    return pos;
    }
}
