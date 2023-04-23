package controller;

//import interfaces.Crudinterfaces;
//import static controller.UsuarioController.ListaUsuario;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Tiquete;
import modelo.Vehiculo;
import modelo.Viaje;
//import modelo.Usuario;
//import modelo.Vehiculo;

public class TiqueteController { // implements Crudinterfaces {

    private static final double IVA = 0.13;

    public static ArrayList<Tiquete> ListaVentas = new ArrayList<>();

    ArrayList<Viaje> listaViaje = ViajeController.listaViaje;
    ArrayList<Vehiculo> listaVehiculo = VehiculoController.lista_V;

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
        Viaje viajeEncontrado = ViajeController.consultar(idviaje);
        int resultadoPersonas = buscarCantidadPersonas(idviaje);
        int calculoPersona = resultadoPersonas - cantidadPersona;
        viajeEncontrado.setCapacidadPasajeros(calculoPersona);
        int busquedaPrecio = buscarPrecio(idviaje);
        double precioIVA = busquedaPrecio + (busquedaPrecio * IVA);
        double preciototal = precioIVA * cantidadPersona;

        int idgenerado = GeneradorID.generarID();

        Tiquete NuevaVenta = new Tiquete(cantidadPersona, idgenerado, fechaVenta, preciototal);
        ListaVentas.add(NuevaVenta);
        return true;

    }

    public static Tiquete consultar(int idEncontrarViaje) {

        for (int i = 0; i < ListaVentas.size(); i++) {
            if (ListaVentas.get(i).getIdViaje() == (idEncontrarViaje)) {

                for (Tiquete u : ListaVentas) {
                    System.out.println(u);
                }

                return ListaVentas.get(i);
            }
        }
        return null;

    }

    public class GenerarInforme extends JFrame {

        GenerarInforme ventana = new GenerarInforme(TiqueteController.ListaVentas);

        private JTable tabla;
        private DefaultTableModel modeloTabla;

        public GenerarInforme(ArrayList<Tiquete> listaVentas) {

            // Establecer las columnas de la tabla
            String[] columnas = {"ID", "Fecha", "Precio", "Cantidad de personas"};

            // Crear el modelo de tabla
            modeloTabla = new DefaultTableModel(columnas, 0);

            // Agregar las filas a la tabla
            for (Tiquete venta : listaVentas) {
                Object[] fila = {venta.getIdViaje(), venta.getFechaDeVenta(), venta.getPrecioDeLaVenta(), venta.getCantidadPersonas()};
                modeloTabla.addRow(fila);
            }

            // Crear la tabla con el modelo de tabla
            tabla = new JTable(modeloTabla);

            // Agregar la tabla a un JScrollPane para poder hacer scroll
            JScrollPane scrollPane = new JScrollPane(tabla);

            // Agregar el JScrollPane a la ventana
            this.add(scrollPane);

            // Establecer las propiedades de la ventana
            this.setSize(600, 400);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }
    }

    public static boolean eliminar(String idEliminar) {
        int idEli = Integer.parseInt(idEliminar);
        for (int i = 0; i < ListaVentas.size(); i++) {

            if (ListaVentas.get(i).getIdViaje() == idEli) {

                ListaVentas.remove(i);
                return true;
            }
        }
        return false;
    }

    public static void CargarDatosTiquete() {

        Tiquete tiquete1 = new Tiquete(7, 123, "1/2/2022", 4000);
        Tiquete tiquete2 = new Tiquete(2, 456, "5/6/2005", 2000);
        Tiquete tiquete3 = new Tiquete(6, 789, "9/12/2016", 3000);
        ListaVentas.add(tiquete1);
        ListaVentas.add(tiquete2);
        ListaVentas.add(tiquete3);
    }
}

