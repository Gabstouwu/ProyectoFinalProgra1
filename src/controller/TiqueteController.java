package controller;

//import interfaces.Crudinterfaces;
//import static controller.UsuarioController.ListaUsuario;
import java.util.ArrayList;
import modelo.Tiquete;
import modelo.Viaje;
//import modelo.Usuario;
//import modelo.Vehiculo;

public class TiqueteController { // implements Crudinterfaces {

    private static final double IVA = 0.13;

    public static ArrayList<Tiquete> ListaVentas = new ArrayList<>();

    ArrayList<Viaje> listaViaje = ViajeController.listaViaje;
//   

    public static class GeneradorID {

        private static int ultimoID = 0;

        public static int generarID() {
            ultimoID++;
            return ultimoID;
        }
    }

    public static int buscarPrecio(String idViaje) {
        Viaje viajeEncontrado = ViajeController.consultar(idViaje);
        int precioViaje = viajeEncontrado.getPrecioTiquete();
        return precioViaje;
    }

    public static int buscarCantidadPersonas(String idViaje) {
        Viaje viajeEncontrado = ViajeController.consultar(idViaje);
        int cantidadPersona = viajeEncontrado.getCapacidadPasajeros();
        return cantidadPersona;
    }

//////////////////////////
    public static boolean GenerarVenta(String idviaje, int cantidadPersona, String fechaVenta) {

        int resultadoPersonas = buscarCantidadPersonas(idviaje);
        int calculoPersona = resultadoPersonas - cantidadPersona;

        int busquedaPrecio = buscarPrecio(idviaje);
        double preciototal = busquedaPrecio + (busquedaPrecio * IVA);

        int idgenerado = GeneradorID.generarID();

        Tiquete NuevaVenta = new Tiquete(calculoPersona, idgenerado, fechaVenta, preciototal);
        ListaVentas.add(NuevaVenta);
        return true;

    }

    public static Tiquete consultar(int idEncontrarViaje) {

        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getIdViaje()==(idEncontrarViaje)) {

                for (Tiquete u : ListaVentas) {
                    System.out.println(u);
                }

                return ListaVentas.get(i);
            }
        }
        return null;

    }
//
////    @Override
////    public boolean editar() {
////
//////        String inputParaBuscar = "123";
//////
//////        int indexId = -1;
//////
//////        if (indexId != -1) {
//////            String CodigoNuevo;
//////            String IdNueva;
//////            String NuevaFecha;
//////
//////            CodigoNuevo = "Mario";
//////            IdNueva = "951";
//////            NuevaFecha = "14/3/2002";
//////
//////            for (int i = 0; i < ListaVentas.size(); i++) {
//////                if (ListaVentas.get(i).getIdViaje().equals(inputParaBuscar)) {
//////
//////                    ListaVentas.get(indexId).setCantidadPersonas(CodigoNuevo);
//////                    ListaVentas.get(indexId).setIdViaje(IdNueva);
//////                    ListaVentas.get(indexId).setFechaDeVenta(NuevaFecha);
//////                    return true;
//////                }
//////            }
//////
//////            System.out.println("Modificación realizada con exito.");
//////        }
//////        System.out.println("ID no existente");
//////        return false;
////
////    }
//////    @Override
////    public boolean eliminar(String idEliminar) {
////
//////        idEliminar = "123";
//////
//////        for (int i = 0; i < ListaVentas.size(); i++) {
//////
//////            if (ListaVentas.get(i).getIdViaje().equals(idEliminar)) {
//////
//////                ListaVentas.remove(i);
//////                System.out.println("Eliminar realizado con exito.");
//////                return true;
//////            }
//////        }
//////
//////        System.out.println("No se encontro.");
//////
//////        return false;
////    }
//    public void generarInforme() {
//
//    }

    public void CargarDatos() {

        Tiquete tiquete1 = new Tiquete(7, 123, "1/2/2022", 4000);
        Tiquete tiquete2 = new Tiquete(2, 456, "5/6/2005", 2000);
        Tiquete tiquete3 = new Tiquete(6, 789, "9/12/2016", 3000);
        ListaVentas.add(tiquete1);
        ListaVentas.add(tiquete2);
        ListaVentas.add(tiquete3);
    }
}
