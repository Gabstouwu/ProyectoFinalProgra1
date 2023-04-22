package controller;

import java.util.ArrayList;
import modelo.Viaje;
import view.ViajeView;
import controller.Metodos;

public class ViajeController {
    public static ArrayList<Viaje> lista_Viaje = new ArrayList();
    
    Metodos m = new Metodos();
    Viaje crearViaje = new Viaje();
    
    public void registrar() {
        
    }
   
    public void consultar() {
        
    }

    public void editar() {
        
    }

    public void eliminar() {
        
    }
    
    
     public boolean existe(String idViaje) {
        boolean valor = false;
        for (Viaje vehiculo : lista_Viaje) {
            if (vehiculo.getIdViaje().equals(idViaje)) {
                valor = true;
            }
        }

        return valor;
    }
        
        public int poscision(String idViaje){
    int pos=0;
    for (Viaje viaje : lista_Viaje) {
            if (viaje.getIdViaje().equals(idViaje)) {
                pos = viaje.getIdViaje().indexOf(idViaje);
            }
        }
    return pos;
    }
}
