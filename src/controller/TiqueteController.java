package controller;

//import interfaces.Crudinterfaces;
//import static controller.UsuarioController.ListaUsuario;
import java.util.ArrayList;
import modelo.Tiquete;
//import modelo.Usuario;
//import modelo.Vehiculo;

public class TiqueteController { // implements Crudinterfaces {

    private static final double IVA = 0.13;

    public static ArrayList<Tiquete> ListaVentas = new ArrayList<>();

//    @Override
    public static class GeneradorID {

        private static int ultimoID = 0;

        public static int generarID() {
            ultimoID++;
            return ultimoID;
        }
    }

    public void GenerarVenta(String s, int cantidadPersonas) {

        String IdDeVenta = Integer.toString(GeneradorID.ultimoID);
        String CantidadPersona = "5";/// Se tiene que cambiar por un Int, cuando la lista de Vehiculos se cambie
        String FechaVenta = "12/8/2000";

        Tiquete NuevaVenta = new Tiquete(CantidadPersona, IdDeVenta, FechaVenta);

        ListaVentas.add(NuevaVenta);

    }

//    @Override
    public void consultar() {
    }

//    @Override
    public boolean editar(String s) {

        String inputParaBuscar = "123";

        int indexId = -1;

        if (indexId != -1) {
            String CodigoNuevo;
            String IdNueva;
            String NuevaFecha;

            CodigoNuevo = "Mario";
            IdNueva = "951";
            NuevaFecha = "14/3/2002";

            for (int i = 0; i < ListaVentas.size(); i++) {
                if (ListaVentas.get(i).getIdViaje().equals(inputParaBuscar)) {

                    ListaVentas.get(indexId).setCantidadPersonas(CodigoNuevo);
                    ListaVentas.get(indexId).setIdViaje(IdNueva);
                    ListaVentas.get(indexId).setFechaDeVenta(NuevaFecha);
                    return true;
                }
            }

            System.out.println("Modificación realizada con exito.");
        }
        System.out.println("ID no existente");
        return false;

    }
//    @Override

    public boolean eliminar(String idEliminar) {

        idEliminar = "123";

        for (int i = 0; i < ListaVentas.size(); i++) {

            if (ListaVentas.get(i).getIdViaje().equals(idEliminar)) {

                ListaVentas.remove(i);
                System.out.println("Eliminar realizado con exito.");
                return true;
            }
        }

        System.out.println("No se encontro.");

        return false;
    }

    public void generarInforme() {

    }

    public void CargarDatos() {

        Tiquete tiquete1 = new Tiquete("7", "123", "1/2/2022");
        Tiquete tiquete2 = new Tiquete("2", "456", "5/6/2005");
        Tiquete tiquete3 = new Tiquete("6", "789", "9/12/2016");
        ListaVentas.add(tiquete1);
        ListaVentas.add(tiquete2);
        ListaVentas.add(tiquete3);
    }

    //submenu
    public void MenuTiquete() {
        Metodos metodos = new Metodos();
        String[] opciones = {"Generar Venta", "Modificar Venta", "Consultar Venta", "Eliminar Venta", "Informe De Capacidad de Viaje", "Volver"};

        int opcion = -1;
        while (opcion != opciones.length - 1) {
            opcion = metodos.menuBotones("Seleccione una opción", "Sub Menú Personas", opciones, "Volver");
            switch (opcion) {
                case 0:
                    GenerarVenta("s", 1);
                    break;
                case 1:
                    editar("123");
                    break;
                case 2:
                    consultar();
                    break;
                case 3:
                    eliminar("123");
                    break;
                case 4:
                    generarInforme();
                    break;
            }
        }
    }
}
