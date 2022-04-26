package juegocolores;

import javax.swing.JOptionPane;

public class JuegoColores {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido a este intrepido juego","Inicio",JOptionPane.ERROR_MESSAGE);
        Interfaz interfaz = new Interfaz();
        interfaz.Registro();
        interfaz.setVisible(true);
        interfaz.Juego();
    }
}
