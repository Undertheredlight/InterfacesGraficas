//DESARROLLAMOS GRAFICAMENTE LA VENTANA
package jswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @Liz FP
 */
public class Ventana {

    JFrame frame = new JFrame();                                                //objeto tipo JFrame. importamos la ventana
    JPanel panel = new JPanel();                                                //Objeto tipo JPanel 
    JLabel etiqueta = new JLabel();                                             //Objeto tipo JLabel/Etiqueta
    JTextField cajaTexto = new JTextField();                                    //Objeto tipo JTextfield/Cuadro de texto
    JButton boton = new JButton();                                              //Objeto tipo JButton

    //Creamos la ventana
    public Ventana() {                                                          //contructor vacío para la ventana JFrame
        frame.setVisible(true);                                                 //Para que la ventana sea visible. Es obligatorio y no siempre se coloca al principio

        frame.setTitle("Java Swing");                                           //Darle titulo a la ventana

        frame.setSize(300, 200);                                                 //elige el tamaño de la panlla en px
        frame.setResizable(true);                                               //Para permitir (o no) que se cambie el tamaño de la ventana
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);                        //Para poner la pantalla completa

        //frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);           //No hace nada al darle a la x
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                   //Cierra el programa al darle a la x(por defecto)
        //frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);                 //Minimiza al darle a la x
        //frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);              //Elimina una ventana al darle a la x una ventana

        frame.setLocation(600, 300);                                            //Cambiar la posición inicial de la pantalla del ordenador

        frame.getContentPane().setBackground(Color.red);                        //Habilitar a la ventana para que sea un panel (NO ACONSEJABLE)

        //Donde construyo la ventana creo los métodos
        Panel();                                                                //Llama al método panel
        Etiqueta();                                                             //Llama al método etiqueta
        CajaTexto();                                                            //Llama al método Cajatexto
        Boton();                                                                //Llama al método boton

    }

    public void Panel() { //es void porque no quiero que devuelva nada. Sólo que haga algo. Método para construir un panel
        //voy a imitar el panel

        frame.add(panel);                                                       //Para añadir un elemento a otro.En este caso, hay que indicarle al frame que utilice el panel. 

        //panel.setMaximumSize(new Dimension(500, 500));                        //Tamaño máx del panel 
        //panel.setMinimumSize(new Dimension(200, 100));                        //Tamaño mínimo del panel
        //POSICIONAMIENTO DE OTROS ELEMENTOS EN EL PANEL
        //panel.setLayout(new FlowLayout());                                    //Todo el aliniamiento a la izquierda
        //panel.setLayout(new BorderLayout());                                  //Genera 5 zonas: Norte, Sur, Este, Oeste, Centro
        //panel.setLayout(new GridLayout());                                    //Una cuadricula predefinida
        //panel.setLayout(new GridBagLayout());                                 //Una cuadricula flexible 
        //panel.setLayout(new BoxLayout(panel, 0));                             //Por coordenadas
        panel.setLayout(null);                                                  //Desactiva el layaout por defecto
        panel.setBackground(Color.BLACK);                                       //Para cambiar el color del panel

    }

    public void Etiqueta() { //Metodo para construir una etiqueta

        etiqueta.setText("Pistacho");

        etiqueta.setBounds(50, 60, 100, 50);                                    //Para añadir coordenadas (los 2 primeros) y dimensiones (2 ultimos)

        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);                 //alinear el texto

        etiqueta.setOpaque(true);                                               //Para que la etiqueta no sea transparente
        etiqueta.setForeground(Color.black);                                    //color texto de la etiqueta
        etiqueta.setBackground(Color.white);                                    //color de fondo de la etiqueta

        etiqueta.setFont(new Font("Ink Free", Font.BOLD, 30));

        panel.add(etiqueta);

    }

    public void CajaTexto() { //Metodo para añadir una caja de texto
        cajaTexto.setBounds(160, 60, 280, 50);

        cajaTexto.setHorizontalAlignment(SwingConstants.CENTER);
        cajaTexto.setFont(new Font("Monotype Corsiva", 0, 10));

        cajaTexto.setForeground(Color.black);
        cajaTexto.setBackground(Color.white);

        panel.add(cajaTexto);
    }

    public void Boton() { //Método para crear un boton
        //boton.setHorizontalAlignment(SwingConstants.LEFT);

        boton.setForeground(Color.black);
        boton.setBackground(Color.white);
        boton.setFont(new Font("Gill Sans MT", Font.BOLD, 25));

        panel.add(boton);
    }

}
