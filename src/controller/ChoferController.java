package controller;

import java.util.ArrayList;
import modelo.Chofer;
import view.ChoferView;
import controller.Metodos;

public class ChoferController {

    public static ArrayList<Chofer> lista_Chofer = new ArrayList();
    Metodos m = new Metodos();

    public void registrar() {
        Chofer crearChofer = new Chofer();
        try {

            ChoferView chofer = new ChoferView();
            chofer.crearChofer();
            String id = chofer.id;
            String fechaVencimiento = chofer.fechaVencimiento;

            if (lista_Chofer.isEmpty()) {
                crearChofer.setIdPersona(id);
                crearChofer.setVencimientoLicencia(fechaVencimiento);
                lista_Chofer.add(crearChofer);
                m.msg("Chofer creado satisfactoriamente");
            } else {
                if (existe(id)) {
                    m.msg("Id ya existente, ingrese una chofer nuevo");

                } else {
                    crearChofer.setIdPersona(id);
                    crearChofer.setVencimientoLicencia(fechaVencimiento);;
                    lista_Chofer.add(crearChofer);
                    m.msg("Chofer creado satisfactoriamente");

                }

            }
        } catch (Exception e) {

        }
    }

    public void consultar() {
        if (lista_Chofer.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {
            ChoferView choferView = new ChoferView();
            choferView.Id();
            String id = choferView.id;
            if (existe(id) && posicion(id) < lista_Chofer.size()) {

                m.msg(lista_Chofer.get(posicion(id)).toString());

            } else {
                m.msg("Chofer no existe");
            }
        }
    }

    public void editar() {
        if (lista_Chofer.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {

            ChoferView choferView = new ChoferView();
            choferView.Id();
            String id = choferView.id;

            if (existe(id) && posicion(id) < lista_Chofer.size()) {
                choferView.editarChofer();
                lista_Chofer.get(posicion(id)).setVencimientoLicencia(choferView.fechaVencimiento);
                m.msg("Modificación realizada con exito.");

            } else {
                m.msg("No existe el numero de id");
            }

        }
    }

    public void eliminar() {
        if (lista_Chofer.isEmpty()) {
            m.msg("Aun no hay informacion en la lista");
        } else {
            ChoferView choferView = new ChoferView();
            choferView.Id();
            String id = choferView.id;
            if (existe(id) && posicion(id) < lista_Chofer.size()) {

                lista_Chofer.remove(posicion(id));
                m.msg("Chofer Eliminado\n" + lista_Chofer.toString());
            } else {
                m.msg("Persona no existe");
            }
        }
    }

    public boolean existe(String id) {
        boolean valor = false;
        for (Chofer chofer : lista_Chofer) {
            if (chofer.getIdPersona().equals(id)) {
                valor = true;
            }
        }

        return valor;
    }

    public int posicion(String id) {
        int pos = 0;
        for (Chofer chofer : lista_Chofer) {
            if (chofer.getIdPersona().equals(id)) {
                pos = chofer.getIdPersona().indexOf(id);
            }
        }
        return pos;
    }

//    public static void cargarDatosChofer() {
//        Chofer Chofer1 = new Chofer("123", "25/11/2020");
//        Chofer Chofer2 = new Chofer("456", "25/11/2020");
//        Chofer Chofer3 = new Chofer("456", "25/11/2020");
//        lista_Chofer.add(Chofer1);
//        lista_Chofer.add(Chofer2);
//        lista_Chofer.add(Chofer3);
//
//    }
}
