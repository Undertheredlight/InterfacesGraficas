package Liz_Examen;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Liz
 */
public class Ventana {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    JLabel titulo = new JLabel();
    JLabel nombre = new JLabel();
    JLabel apellido = new JLabel();
    
    JTextField respnombre = new JTextField();
    JTextField respapellido = new JTextField();
    
    JButton btninicio = new JButton();

    JLabel mostrar = new JLabel();
    
    JLabel nota = new JLabel();
    
    public Ventana() {
        frame.setVisible(true);
        frame.setTitle("Exámen Interfaces gráficas");

        frame.setBounds(200, 200, 500, 500);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        panel.setSize(frame.getWidth(), frame.getHeight());
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(null);
        panel.setLocation(600, 500);

        frame.add(panel);
        panel.updateUI();

        Panel();
        BotonInicio();
        MostrarResultado();
        Textos();
        
    }

    public void Panel() {
        frame.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.GRAY);

    }
    
    
    public void Textos() {
        titulo.setText("Bienvenido al Exámen de la vida");
        titulo.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        titulo.setBounds(110, 5, 250, 80);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.black);
        panel.add(titulo);
        
        nombre.setText("Introduce tu nombre: ");
        nombre.setFont(new Font("Gill Sans MT", Font.BOLD, 12));
        nombre.setBounds(50, 70, 160, 50);
        panel.add(nombre);
        
        apellido.setText("Introduce tu apellido: ");
        apellido.setFont(new Font("Gill Sans MT", Font.BOLD, 12));
        apellido.setBounds(50, 140, 160, 50);
        panel.add(apellido);
        
        
        respnombre.setBounds(200, 80, 180, 30);
        respnombre.setHorizontalAlignment(SwingConstants.CENTER);
        respnombre.setFont(new Font("Gill Sans MT", Font.PLAIN, 10));
        respnombre.setForeground(Color.black);
        respnombre.setBackground(Color.white);
        panel.add(respnombre);
        
        respapellido.setBounds(200, 150, 180, 30);
        respapellido.setHorizontalAlignment(SwingConstants.CENTER);
        respapellido.setFont(new Font("Gill Sans MT", Font.PLAIN, 10));
        respapellido.setForeground(Color.black);
        respapellido.setBackground(Color.white);
        panel.add(respapellido);
        
    }

    public void BotonInicio() {
        btninicio.setBounds(90, 220, 300, 80);
        btninicio.setText("PULSA PARA INICIAR EL EXÁMEN");
        btninicio.setForeground(Color.BLACK);
        btninicio.setBackground(Color.WHITE);
        btninicio.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        panel.add(btninicio);

        ActionListener inicio = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Ventanaemergente ventana = new Ventanaemergente();
                
            }
        };
        btninicio.addActionListener(inicio);
        panel.add(btninicio);
    }
    
    
        public void MostrarResultado() {
        mostrar.setText("Nota del exámen: ");
        mostrar.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        mostrar.setBounds(100, 350, 200, 60);
        mostrar.setHorizontalAlignment(SwingConstants.LEFT);
        mostrar.setForeground(Color.black);
        //mostrar.setVisible(false);
        panel.add(mostrar);
        
        
        nota.setBounds(260, 360, 80, 30);
        nota.setHorizontalAlignment(SwingConstants.CENTER);
        nota.setOpaque(true);
        nota.setForeground(Color.black);
        nota.setBackground(Color.white);
        nota.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        //nota.setVisible(false);
        panel.add(nota);
    }

}
