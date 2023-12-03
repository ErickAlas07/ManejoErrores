import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
    public static void main(String[] args) {

        while (true) {
            //Creación de el campo de texto y el botón
            JTextField field = new JTextField(10);
            JButton button = new JButton("Salir");

            //Agrega un evento al botón
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            });

            //Creación de el panel
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            panel.add(new JLabel("Por favor, introduce un número:"));
            panel.add(field);
            panel.add(Box.createRigidArea(new Dimension(0, 5))); //Espacio entre los elementos
            panel.add(button);

            //Introduce el panel en un cuadro de diálogo
            int result = JOptionPane.showConfirmDialog(null, panel, "Introduce un número", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);

            //Si el usuario presiona el botón "OK"
            if (result == JOptionPane.OK_OPTION) {
                try {
                    double numero = Double.parseDouble(field.getText());
                    double cuadrado = Math.pow(numero, 2);
                    JOptionPane.showMessageDialog(null, "El cuadrado de " + numero + " es " + cuadrado);
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Error: Debes introducir un número válido.");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
                }
            } else {
                break;
            }
        }
    }
}