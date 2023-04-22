package view;

import controller.Metodos;
import controller.VehiculoController;

public class VehiculoView {

    public String numeroPlaca;
    public String marca;
    public String estilo;
    public String modelo;
    public int capacidad;

    Metodos m = new Metodos();

    public void MenuVehiculo() {
        VehiculoController vehiculo = new VehiculoController();
        boolean decision = true;
        int opcion;
        String[] opciones = {"Registrar", "Consultar", "Editar", "Elmininar", "Salir"};
        while (decision == true) {
            opcion = m.menuBotones("Elija una Opcion", "Elija una opcion:", opciones, "Crear");
            switch (opcion) {
                case 0:
                    vehiculo.registrar();
                    break;
                case 1:
                    vehiculo.consultar();
                    break;
                case 2:
                    vehiculo.editar();
                    break;
                case 3:
                    vehiculo.eliminar();
                    break;
                case 4:
                    decision = false;
                    break;

            }

        }

    }

    public String registrar() {

        numeroPlaca = m.getCadena("Ingrese el numero de placa: ");
        marca = m.getCadena("Ingrese la marca del vehiculo: ");
        estilo = m.getCadena("Ingrese el estilo del vehiculo: ");
        modelo = m.getCadena("Ingrese el modelo(año) del vehiculo: ");
        capacidad = m.getEntero("ingrese la capacidad del vehiculo: ");

        return numeroPlaca;
    }

    public void consultar() {

        numeroPlaca = m.getCadena("Ingrese el numero de placa que desea consultar: ");
    }

    public void editar() {
        numeroPlaca = m.getCadena("Ingrese el nuevo numero de placa: ");
        marca = m.getCadena("Ingrese la nueva marca del vehiculo: ");
        estilo = m.getCadena("Ingrese el nuevo estilo del vehiculo: ");
        modelo = m.getCadena("Ingrese el nuevo modelo(año) del vehiculo: ");
        capacidad = m.getEntero("ingrese la capacidad del vehiculo: ");
    }

    public void eliminar() {

        numeroPlaca = m.getCadena("Ingrese el numero de placa que desea eliminar: ");
    }
    
     public String Placa(){
    numeroPlaca = m.getCadena("Ingrese numero de placa que desea editar: ");
    return numeroPlaca;
    }

}
