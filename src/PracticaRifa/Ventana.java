package PracticaRifa;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @Liz FP
 */
public class Ventana {

    JFrame ventana = new JFrame();
    JPanel panel = new JPanel();
    JButton botonAleatorio = new JButton();
    JButton botonGuardar = new JButton();
    JButton botonStart = new JButton();
    JLabel titulo = new JLabel();
    Juego juego = new Juego();

    public Ventana() {
        ventana.setVisible(true);
        ventana.setTitle("RIFA DE NAVIDAD");
        ventana.setSize(1200, 800);                                        
        ventana.setResizable(true); 
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventana.setLocation(350, 200);
        
        Panel();
        
    }

    
     public void Panel() { //es void porque no quiero que devuelva nada. Sólo que haga algo. Método para construir un panel
        //voy a imitar el panel

        ventana.add(panel);                                                      
        panel.setLayout(null);                                                  
        panel.setBackground(Color.LIGHT_GRAY);                                      

    }
    
    public void BotonStart() {

    }
    
     public void BotonAleatorio() {
         juego.cartonAleatorio();
         
         
    }
}
