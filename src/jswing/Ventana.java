//DESARROLLAMOS GRAFICAMENTE LA VENTANA
package jswing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
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
    JLabel fondo =  new JLabel();                                                                   

    //Creamos la ventana
    public Ventana() {                                                          //constructor vacío para la ventana JFrame
        frame.setVisible(true);                                                 //Para que la ventana sea visible. Es obligatorio y no siempre se coloca al principio

        frame.setTitle("Java Swing");                                           //Darle titulo a la ventana

        frame.setSize(1200, 200);                                                 //elige el tamaño de la panlla en px
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
        EtiquetaImagen();                                                       //Llama al método etiquetaImagen
        FondoPantalla();
        
        panel.updateUI();
    }

    public void FondoPantalla(){
        fondo.setBounds(0, 0, 500, 500);
        
        ImageIcon imagen = new ImageIcon("imagenes/Gatito.jpg");
        fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(fondo.getWidth(), fondo.getHeight(), Image.SCALE_DEFAULT)));
        
        //fondo.setBackground(Color.red);
        
        panel.add(fondo);
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
        panel.setBackground(Color.GRAY);                                       //Para cambiar el color del panel

    }

    public void Etiqueta() { //Metodo para construir una etiqueta

        etiqueta.setText("Nombre:");

        etiqueta.setBounds(50, 60, 100, 50);                                    //Para añadir coordenadas (los 2 primeros) y dimensiones (2 ultimos)

        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);                 //alinear el texto

        etiqueta.setOpaque(true);                                               //Para que la etiqueta no sea transparente
        etiqueta.setForeground(Color.black);                                    //color texto de la etiqueta
        etiqueta.setBackground(Color.white);                                    //color de fondo de la etiqueta

        etiqueta.setFont(new Font("Ink Free", Font.BOLD, 15));

        panel.add(etiqueta);

    }

    public void CajaTexto() { //Metodo para añadir una caja de texto
        cajaTexto.setBounds(160, 60, 280, 50);

        cajaTexto.setHorizontalAlignment(SwingConstants.CENTER);
        cajaTexto.setFont(new Font("Monotype Corsiva", 0, 25));
        //cajaTexto.setText("Escribe"); //añadir texto a la caja, por feceto se puede borrar

        cajaTexto.setForeground(Color.black);
        cajaTexto.setBackground(Color.white);

        panel.add(cajaTexto);
    }
    
    public void Boton() { //Método para crear un boton
        //boton.setHorizontalAlignment(SwingConstants.LEFT);
        JButton boton = new JButton();                          //Objeto tipo JButton
        boton.setBounds(50, 150, 100, 100 );
        
        
        
        ImageIcon imagenBoton = new ImageIcon("imagenes/gatito.jpg");
        boton.setIcon(imagenBoton);
        
        boton.setIcon(new ImageIcon(imagenBoton.getImage().getScaledInstance(boton.getWidth(), boton.getHeight(), Image.SCALE_DEFAULT)));
        
        //boton.setText("PULSAME");
        boton.setForeground(Color.black);
        boton.setBackground(Color.CYAN);
        boton.setFont(new Font("Gill Sans MT", Font.BOLD, 25));
        
        JLabel respuesta = new JLabel();
        panel.add(respuesta);

        ActionListener pulsar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                respuesta.setBounds(50, 180, 390, 50);                          //Genero una etiqueta
                
                respuesta.setOpaque(true);
                respuesta.setHorizontalAlignment(SwingConstants.CENTER);
                respuesta.setBackground(Color.GRAY);
                respuesta.setText("Estas suspenso "+cajaTexto.getText()+"!!");
                respuesta.setFont(new Font("Times New Roman",Font.BOLD,18));
                
                panel.add(respuesta);
                //throw new UnsupportedOperationException("Not supported yet.");   arroja una excepcion por defecto
            }
        };
        
        //Como se activa un action Listener()
        
        boton.addActionListener(pulsar); //cuando le doy click al botón
        cajaTexto.addActionListener(pulsar); //cuando le doy al intro
        
        panel.add(boton);
    }

    public void EtiquetaImagen(){
        
        //por defecto, la imagenes tienen el tamaño predeterminado. Si se quiere modificar la imagen hay que cambiarlo manualmente
        
       //JLabel etiquetaImagen = new JLabel(new ImageIcon("imagenes/cdmfp.jpg"));    //añadir la imagen en el constructor
       
       ImageIcon imagen = new ImageIcon("imagenes/cdmfp.jpg");  //imagen independiente
       JLabel etiquetaImagen = new JLabel();                    //etiqueta independiente
       
       //etiquetaImagen.setIcon(imagen);                        //añadirla imagen tal cual a la etiqueta

        //indico la posicion de la imagen
       etiquetaImagen.setBounds(50, 50, 500, 300);
       
       
       //PARA CAMBIAR TAMAÑO IMAGEN DIRECTO
       etiquetaImagen.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiquetaImagen.getWidth(), etiquetaImagen.getHeight(), Image.SCALE_DEFAULT)));
       
       panel.add(etiquetaImagen); //añado la etiqueta al panel
      
       
       
       
    }
}
