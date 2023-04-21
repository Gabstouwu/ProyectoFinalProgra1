package view;

import controller.Metodos;
import controller.VehiculoController;

public class VehiculoView {

    public static String numeroPlaca;
    public static String marca;
    public static String estilo;
    public static String modelo;
    public static String capacidad;
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
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    decision = false;
                    break;

            }

        }

    }
    public String crearVehiculo() {

        numeroPlaca = m.getCadena("Ingrese el numero de placa: ");
        marca = m.getCadena("Ingrese la marca del vehiculo: ");
        estilo = m.getCadena("Ingrese el estilo del vehiculo: ");
        modelo = m.getCadena("Ingrese el modelo(año) del vehiculo: ");
        capacidad = m.getCadena("Ingrese la capacidad del vehiculo: ");
        
        return numeroPlaca;
    }
}
