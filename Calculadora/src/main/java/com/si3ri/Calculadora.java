package main.java.com.si3ri;

import main.java.com.si3ri.interfaz.Interfaz;

import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    public static void main(String[] args) {
        new Calculadora();
    }

    public Calculadora() {
        setTitle("Calculadora");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        Interfaz interfaz = new Interfaz(); // Instancia de la clase 'Interfaz' para ejecutar el contenido de la clase.
        add(interfaz, BorderLayout.CENTER);

        setLocationRelativeTo(null); // Localización de la ventana gráfica, en este caso centrada en pantalla de usuario.

        setVisible(true); // Hacer visible la ventana en la interfaz gráfica con JFrame.
    }
}
