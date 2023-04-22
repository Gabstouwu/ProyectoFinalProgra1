package controller;

//import interfaces.Crudinterfaces;
import java.util.ArrayList;
import modelo.Vehiculo;
import view.VehiculoView;
import controller.Metodos;

public class VehiculoController { //implements Crudinterfaces {

    public static ArrayList<Vehiculo> lista_V = new ArrayList();

    Metodos m = new Metodos();
    Vehiculo crearVehiculo = new Vehiculo();

    //@Override
    public void registrar() {
        Vehiculo crearVehiculo = new Vehiculo();
        try {

            VehiculoView vehiculo = new VehiculoView();
            vehiculo.registrar();
            String placa = vehiculo.numeroPlaca;
            String marca = vehiculo.marca;
            String estilo = vehiculo.estilo;
            String modelo = vehiculo.modelo;
            int capacidad = vehiculo.capacidad;

            if (lista_V.isEmpty()) {
                crearVehiculo.setPlaca(placa);
                crearVehiculo.setMarca(marca);
                crearVehiculo.setEstilo(estilo);
                crearVehiculo.setModelo(modelo);
                crearVehiculo.setCapacidadVehiculo(capacidad);
                lista_V.add(crearVehiculo);
                System.out.println(lista_V);
            } else {
                if (existe(placa)) {
                    m.msg("Id ya existente, ingrese una persona nueva");
                }else{
                    crearVehiculo.setPlaca(placa);
                crearVehiculo.setMarca(marca);
                crearVehiculo.setEstilo(estilo);
                crearVehiculo.setModelo(modelo);
                crearVehiculo.setCapacidadVehiculo(capacidad);
                lista_V.add(crearVehiculo);
                System.out.println(lista_V);
                }
            }
        }catch (Exception e) {
    }
}

//@Override
public void editar() {
//        VehiculoView vehiculo_Edit = new VehiculoView(); 
//        vehiculo_Edit.editar();
//        String placa = vehiculo_Edit;
//        String indexPlaca = -1;
//        try {
//            chasis = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de chasis del vehiculo"));
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Ingreso un chasis no válido");
//        }
//
//        for (int i = 0; i < lista_autos.size(); i++) {
//            if (lista_autos.get(i).getChasis() == chasis) {
//                indexChasis = i;
//                break;
//            }
//        }
//        if (indexChasis != -1) {
//            String condi = lista_autos.get(indexChasis).getCondicion();
//            String Marca;
//            String Estilo;
//            int Modelo;
//            String Color;
//            int Precio;
//            Marca = JOptionPane.showInputDialog("Ingrese la marca del vehiculo");
//            Estilo = JOptionPane.showInputDialog("Ingrese el estilo del vehiculo");
//            Modelo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año del vehiculo"));
//            Color = JOptionPane.showInputDialog("Ingrese el Color del Vehiculo: ");
//            Precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Precio del Vehiculo: "));
//            Condicion seleccion = (Condicion) JOptionPane.showInputDialog(null, "¿Vendido?", "Confirmación", JOptionPane.QUESTION_MESSAGE, null, Condicion.values(), condi);
//            lista_autos.get(indexChasis).setMarca(Marca);
//            lista_autos.get(indexChasis).setCondicion(seleccion.toString());
//            lista_autos.get(indexChasis).setColor(Color);
//            lista_autos.get(indexChasis).setEstilo(Estilo);
//            lista_autos.get(indexChasis).setModelo(Modelo);
//            lista_autos.get(indexChasis).setPrecio(Precio);
//            JOptionPane.showMessageDialog(null, "Modificación realizada con exito.");
//        } else {
//            JOptionPane.showMessageDialog(null, "Chasis no existe");
//        }
//

    }

    //@Override
    public void eliminar() {
        VehiculoView vehiculo_E = new VehiculoView(); 
        vehiculo_E.eliminar();
           String placa = vehiculo_E.numeroPlaca;
            Vehiculo vehiculo = new Vehiculo();
            for (int i = 0; i < lista_V.size(); i++) {
                vehiculo = (Vehiculo) lista_V.get(i);

                if (lista_V.get(i).getPlaca() == placa) {

                    lista_V.remove(i);
                    m.msg(lista_V.toString());
                    break;
                }
            }
    }

    // @Override
    public void consultar() {
        VehiculoView vehiculo_C = new VehiculoView(); 
        vehiculo_C.consultar();
        if (lista_V.isEmpty()) {
            m.msg("No hay registro de vehiculos");
        } else {
            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setPlaca("");
            for (Vehiculo v : lista_V) {
                if (v.getPlaca().equals(lista_V)) {
                    vehiculo = v;
                    break;
                }
            }
            if (vehiculo.getPlaca().isEmpty()) {
                m.msg("Vehiculo no existe");
            } else {
                m.msg(vehiculo.toString());
            }
        }
    }

    
        public boolean existe(String id) {
        boolean valor = false;
        for (Vehiculo vehiculo : lista_V) {
            if (vehiculo.getPlaca().equals(id)) {
                valor = true;
            }
        }

        return valor;
    }
}
