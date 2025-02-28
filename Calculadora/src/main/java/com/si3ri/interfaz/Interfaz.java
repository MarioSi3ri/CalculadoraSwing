package main.java.com.si3ri.interfaz;

import main.java.com.si3ri.mouse.MouseListener;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

public class Interfaz extends JPanel implements ActionListener {
    private final JTextField pantallaText;
    private final JButton botonSuma, botonResta, botonMulti, botonDivision;
    private final JButton botonUno, botonDos, botonTres, botonCuatro, botonCinco, botonSeis, botonSiete, botonOcho, botonNueve, botonCero, btnLimpiar, btnIgualdad;
    private String cadNumerica = "";
    private String operante = "null";
    private double num1, resultado;
    private boolean visible = false;

    public Interfaz() {

        setLayout(new BorderLayout()); // Contenedor principal para organizar y diseñar con los componentes en cinco áreas de orientación: N,S,E,O,C.
        JPanel panelSuperior = new JPanel();
        panelSuperior.setLayout(new BorderLayout());

        // CAJA DE TEXTO.
        pantallaText = new JTextField();
        pantallaText.setEditable(false);
        pantallaText.setPreferredSize(new Dimension(300, 50));
        pantallaText.setHorizontalAlignment(JTextField.LEFT); // Úbica el cursor del lado derecho.
        pantallaText.setBorder(new EmptyBorder(10, 0, 10, 0)); // Agrega a la izquierda y derecha un borde vacío alrededor de la caja de texto.
        Border topBorde = BorderFactory.createLineBorder(Color.BLACK); // Crea un borde para la caja de texto.
        pantallaText.setBorder(BorderFactory.createCompoundBorder(pantallaText.getBorder(), topBorde)); // Establece el borde en la parte superior de la caja de texto.
        panelSuperior.add(pantallaText, BorderLayout.CENTER);
        pantallaText.setFont(new Font("Arial", Font.PLAIN, 17));
        add(panelSuperior, BorderLayout.NORTH); // Úbica la caja de texto en la parte superior de los botones.

        // CREACIÓN Y ORGANIZACIÓN DE LOS BOTONES.
        JPanel panelBotones = new JPanel();
        panelBotones.setLayout(new GridLayout(4, 4, 5, 5)); // Establece el tamaño y distribución de los botones: organiza los componentes en una cuadrícula de filas y columnas.

        botonUno = new JButton("1");
        botonUno.addActionListener(this);
        botonUno.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonUno);
        botonUno.setFont(new Font("Arial", Font.PLAIN, 17));

        botonDos = new JButton("2");
        botonDos.addActionListener(this);
        botonDos.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonDos);
        botonDos.setFont(new Font("Arial", Font.PLAIN, 17));

        botonTres = new JButton("3");
        botonTres.addActionListener(this);
        botonTres.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonTres);
        botonTres.setFont(new Font("Arial", Font.PLAIN, 17));

        botonSuma = new JButton("+");
        botonSuma.addActionListener(this);
        botonSuma.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonSuma);
        botonSuma.setFont(new Font("Arial", Font.PLAIN, 19));

        botonCuatro = new JButton("4");
        botonCuatro.addActionListener(this);
        botonCuatro.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonCuatro);
        botonCuatro.setFont(new Font("Arial", Font.PLAIN, 17));

        botonCinco = new JButton("5");
        botonCinco.addActionListener(this);
        botonCinco.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonCinco);
        botonCinco.setFont(new Font("Arial", Font.PLAIN, 17));

        botonSeis = new JButton("6");
        botonSeis.addActionListener(this);
        botonSeis.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonSeis);
        botonSeis.setFont(new Font("Arial", Font.PLAIN, 17));

        botonResta = new JButton("-");
        botonResta.addActionListener(this);
        botonResta.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonResta);
        botonResta.setFont(new Font("Arial", Font.PLAIN, 19));

        botonSiete = new JButton("7");
        botonSiete.addActionListener(this);
        botonSiete.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonSiete);
        botonSiete.setFont(new Font("Arial", Font.PLAIN, 17));

        botonOcho = new JButton("8");
        botonOcho.addActionListener(this);
        botonOcho.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonOcho);
        botonOcho.setFont(new Font("Arial", Font.PLAIN, 17));

        botonNueve = new JButton("9");
        botonNueve.addActionListener(this);
        botonNueve.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonNueve);
        botonNueve.setFont(new Font("Arial", Font.PLAIN, 17));

        botonMulti = new JButton("*");
        botonMulti.addActionListener(this);
        botonMulti.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonMulti);
        botonMulti.setFont(new Font("Arial", Font.PLAIN, 19));

        btnLimpiar = new JButton("C");
        btnLimpiar.addActionListener(this);
        btnLimpiar.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(btnLimpiar);
        btnLimpiar.setFont(new Font("Arial", Font.PLAIN, 18));

        botonCero = new JButton("0");
        botonCero.addActionListener(this);
        botonCero.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonCero);
        botonCero.setFont(new Font("Arial", Font.PLAIN, 17));

        btnIgualdad = new JButton("=");
        btnIgualdad.addActionListener(this);
        btnIgualdad.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(btnIgualdad);
        btnIgualdad.setFont(new Font("Arial", Font.PLAIN, 19));

        botonDivision = new JButton("/");
        botonDivision.addActionListener(this);
        botonDivision.setPreferredSize(new Dimension(80, 80));
        panelBotones.add(botonDivision);
        botonDivision.setFont(new Font("Arial", Font.PLAIN, 18));

        add(panelBotones, BorderLayout.CENTER); // Los botones se establecen en el centro.

        Border limpiarBorde = new EmptyBorder(6, 0, 10, 0); // Agrega un borde vacío arriba, derecha e izquierda y, alrededor del panel de botones.
        panelBotones.setBorder(limpiarBorde);

        Border mainLimpiarBorde = new EmptyBorder(15, 15, 15, 15); // Agrega un borde vacío en la parte superior de los botones en el contenedor principal.
        /*JPanel contentPane = (JPanel) getContentPane();
        contentPane.*/setBorder(mainLimpiarBorde);

        setVisible(true);

        // AÑADIR LISTENERS DE RATÓN A LOS BOTONES PARA CAMBIAR EL BORDE.
        botonUno.addMouseListener(new MouseListener());
        botonDos.addMouseListener(new MouseListener());
        botonTres.addMouseListener(new MouseListener());
        botonCuatro.addMouseListener(new MouseListener());
        botonCinco.addMouseListener(new MouseListener());
        botonSeis.addMouseListener(new MouseListener());
        botonSiete.addMouseListener(new MouseListener());
        botonOcho.addMouseListener(new MouseListener());
        botonNueve.addMouseListener(new MouseListener());
        botonCero.addMouseListener(new MouseListener());
        btnLimpiar.addMouseListener(new MouseListener());
        botonSuma.addMouseListener(new MouseListener());
        botonResta.addMouseListener(new MouseListener());
        botonMulti.addMouseListener(new MouseListener());
        botonDivision.addMouseListener(new MouseListener());
        btnIgualdad.addMouseListener(new MouseListener());

    }

    // MANEJO DE EVENTOS CON LOS BOTONES.
    public void actionPerformed(ActionEvent e) { // Parte de la interfaz 'ActionListener' y se utiliza para manejar eventos de acción.
        if (e.getSource() == botonUno || e.getSource() == botonDos || e.getSource() == botonTres ||
                e.getSource() == botonCuatro || e.getSource() == botonCinco || e.getSource() == botonSeis ||
                e.getSource() == botonSiete || e.getSource() == botonOcho || e.getSource() == botonNueve ||
                e.getSource() == botonCero) { // Evento generado por uno de los botones numéricos.
            cadNumerica += ((JButton) e.getSource()).getText(); // Devuelve el objeto y obtiene el evento con el contenido del botón.
            pantallaText.setText(cadNumerica); // Se imprime en la caja de texto el valor numérico.
            visible = true; // Es visible el signo de los operadores.
            System.out.println("Se presionó el botón: " + ((JButton) e.getSource()).getText()); // Mensaje en consola que muestra el evento.
        } else if (e.getSource() == btnLimpiar) {
            if (cadNumerica.isEmpty()) {
                visible = false; // Se oculta el signo del operador.
            }
            cadNumerica = "";
            pantallaText.setText("");
            System.out.println("Se presionó el botón: C");
        } else if (e.getSource() == botonSuma || e.getSource() == botonResta ||
                e.getSource() == botonMulti || e.getSource() == botonDivision) {
            if (cadNumerica.isEmpty()) { // Establece si la operación numérica esta vacía.
                visible = false; // Oculta el operador al presionar el botón.
            }
            if (visible) { // Evento que muestra y oculta el signo de los operadores cuando se ingresa un número.
                num1 = Double.parseDouble(cadNumerica);
                pantallaText.setText(((JButton) e.getSource()).getText());
                cadNumerica = "";
                operante = ((JButton) e.getSource()).getText();
                visible = false;
                System.out.println("Se presionó el botón: " + ((JButton) e.getSource()).getText());
            }
            // OPERACIONES MATEMÁTICAS DE ACUERDO AL OPERADOR INGRESADO.
        } else if (e.getSource() == btnIgualdad) { // Sí se presiona el botón de igualdad (=) se ejecuta la sentencia de cálculo del operante.
            int num2 = Integer.parseInt(cadNumerica); // El número ingresado se convierte a entero .
            if (visible) {
                switch (operante) { // Evento que ejecuta las operaciones de acuerdo a los operadores seleccionados.
                    case "null" -> pantallaText.setText(cadNumerica);
                    case "+" -> resultado = num1 + num2;
                    case "-" -> resultado = num1 - num2;
                    case "*" -> resultado = num1 * num2;
                    case "/" -> {
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            pantallaText.setText("Error Syntaxes: División por cero"); // Mensaje de error al realizar una operación no válida.
                            return;
                        }
                    }
                }
                // MUESTRA DE RESULTADO EN LA CAJA DE TEXTO.
                pantallaText.setText(String.valueOf((int)resultado)); // Establece en la caja de texto el resultado como entero de acuerdo a la operación matemática.
                cadNumerica = String.valueOf((int)resultado); // Actualiza el valor de la cadena de la operación.
                visible = true;
                operante = "null"; // No hay operación pendiente.
                System.out.println("Se presionó el botón: =");
            }
        }
    }
}
