package controller;

import interfaces.Crudinterfaces;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Vehiculo;

public class VehiculoController implements Crudinterfaces {

    public static ArrayList<Vehiculo> lista_V = new ArrayList<>();

    @Override
    public void registrar() {
        Vehiculo V1 = new Vehiculo("1234", " Hyundai", "slim", "2010", "20");
        lista_V.add(V1);
        Vehiculo V2 = new Vehiculo("5678", "Mitsubishi", "small", "2015", "35");
        lista_V.add(V1);
        Vehiculo V3 = new Vehiculo("9012", "Volkswagen", "xSmall", "2022", "50");
        lista_V.add(V1);

    }

    @Override
    public void consultar() {
//        String inputplaca;
//        try {
//            System.out.println(lista_V.toString());
//            inputplaca = "1234";
//            System.out.print(inputplaca);
//            for (int i = 0; i < lista_V.size(); i++) {
//                System.out.println(lista_V.get(i).getPlaca());
//                if (lista_V.get(i)  {
//                    lista_V == inputplaca
//                }
//                
//                    );
//                
//                    break;
//                }
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Numero de palca incorrecto");
//        }

    }

    @Override
    public void editar() {
         
    }

    @Override
    public void eliminar() {

    }

}
