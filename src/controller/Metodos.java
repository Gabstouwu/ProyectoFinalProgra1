package controller;

import javax.swing.JOptionPane;

public class Metodos {

    public void msg(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }

    public int SIoNo(String msg, String titulo) {
        int respuesta;
        return JOptionPane.showConfirmDialog(null, msg, titulo, JOptionPane.YES_NO_OPTION);
    }

    public int menuBotones(String msg, String titulo, String opciones[], String valorDefecto) {
        int opcion = JOptionPane.showOptionDialog(null, msg, titulo, 0,
                JOptionPane.QUESTION_MESSAGE, null, opciones, valorDefecto);
        return opcion;
    }

    public String getCadena(String msg) {
        String cadena = JOptionPane.showInputDialog(msg);
        return cadena;
    }

    public int getEntero(String msg) {
        int entero = Integer.parseInt(JOptionPane.showInputDialog(msg));
        return entero;
    }
}
