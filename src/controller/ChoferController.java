package controller;

import java.util.ArrayList;
import modelo.Chofer;
import view.ChoferView;


public class ChoferController {

    public static ArrayList<Chofer> lista_Chofer = new ArrayList();
   

    public static boolean registrar(String idChofer, String fechaVencimiento) {
        Chofer NuevoChofer = new Chofer(idChofer, fechaVencimiento);
        lista_Chofer.add(NuevoChofer);
        
        return true;
    }

    public static Chofer consultar(String idConsultar) {
        for (int i = 0; i < lista_Chofer.size(); i++) {
            if (lista_Chofer.get(i).getIdPersona().equals(idConsultar)) {

                for (Chofer c : lista_Chofer) {//0

                }

                return lista_Chofer.get(i);
            }
        }
        return null;
    }

    public static boolean editar(String idEditar, String Fecha) {
        Chofer temporal = consultar(idEditar);
        if (temporal != null) {
            temporal.setVencimientoLicencia(Fecha);
            
            return true;
        }
        return false;
    }

    public static boolean eliminar(String idEliminar) {
      for (int i = 0; i < lista_Chofer.size(); i++) {

            if (lista_Chofer.get(i).getIdPersona().equals(idEliminar)) {

                lista_Chofer.remove(i);
                return true;
            }
        }
        return false;
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

    public static void cargarDatosChofer() {
       Chofer Chofer1 = new Chofer("123", "25/11/2020");
        Chofer Chofer2 = new Chofer("456", "25/11/2020");
        Chofer Chofer3 = new Chofer("456", "25/11/2020");
       lista_Chofer.add(Chofer1);
        lista_Chofer.add(Chofer2);
        lista_Chofer.add(Chofer3);

    }
}
