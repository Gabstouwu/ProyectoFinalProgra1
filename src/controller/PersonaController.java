package controller;

import interfaces.Crudinterfaces;
import java.util.ArrayList;
import modelo.Persona;
import view.PersonaView;

public class PersonaController implements Crudinterfaces {

    public static ArrayList<Persona> lista_Persona = new ArrayList();
    PersonaView persona = new PersonaView();
    Metodos m = new Metodos();
    Persona crearPersona = new Persona();

    @Override
    public void registrar() {
        
        
        

        try {
           String id = PersonaView.id ;
           persona.crearPersona();
           
           String nombre = PersonaView.nombre ;
           String numero =  PersonaView.numero;
           String correo = PersonaView.correo ;
            for (int i = 0; i < lista_Persona.size(); i++) {
                if (lista_Persona.get(i).getIdPersona() != id) {
                    m.msg(id);
                    crearPersona.setIdPersona(id);
                    crearPersona.setNombrePersona(nombre);
                    crearPersona.setTelefonoPersona(numero);
                    crearPersona.setCorreo(correo);
                    lista_Persona.add(crearPersona);
                    
                    System.out.println(lista_Persona);
                    break;
                    
                }

            }
        } catch (Exception e) {
            m.msg("Id ya existente, ingrese una persona nueva");
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
