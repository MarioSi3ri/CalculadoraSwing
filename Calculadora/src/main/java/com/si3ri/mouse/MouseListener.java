package main.java.com.si3ri.mouse;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

    // CLASE INTERNA PARA MANEJAR LOS EVENTOS DEL MOUSE AL MANEJAR LOS BOTONES, EXTENDIENDO CON LA CLASE 'MOUSEADAPTER'.
  public class MouseListener extends MouseAdapter {
        public void mouseEntered(MouseEvent e) {
            JButton boton = (JButton) e.getSource();
            boton.setBorder(BorderFactory.createLineBorder(new Color(173, 226, 255), 2)); // Resaltado y color del borde al ser seleccionado y presionado el botón.
        }

        public void mouseExited(MouseEvent e) { // Este método se llama cuando el cursor del mouse sale del área del botón.
            JButton boton = (JButton) e.getSource();
            boton.setBorder(UIManager.getBorder("Button.border"));
        }
  }
