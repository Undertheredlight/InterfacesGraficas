package PracticaRifa;

import java.awt.Color;
import java.awt.Font;
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

    JFrame ventana = new JFrame();
    JPanel panel = new JPanel();
    JLabel titulo = new JLabel();

    /**
     * JButton botonAleatorio = new JButton("Comprar cartón"); JButton
     * botonGuardar = new JButton("Guardar cartón"); JButton botonStart = new
     * JButton("Iniciar rifa");
     */
    JLabel numuno = new JLabel("N1");
    JLabel numdos = new JLabel("N2");
    JLabel numtres = new JLabel("N3");
    JLabel numcuatro = new JLabel("N4");
    JLabel numcinco = new JLabel("N5");
    JTextField cajauno = new JTextField();
    JTextField cajados = new JTextField();
    JTextField cajatres = new JTextField();
    JTextField cajacuatro = new JTextField();
    JTextField cajacinco = new JTextField();

    public Ventana() {
        ventana.setVisible(true);
        ventana.setTitle("RIFA");
        ventana.setSize(800, 600);
        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocation(350, 200);

        Panel();
        Etiqueta();
        Numuno();
        Numdos();
        Numtres();
        Numcuatro();
        Numcinco();
        Cajauno();
        Cajados();
        Cajatres();
        Cajacuatro();
        Cajacinco();
    }

    public void Panel() { //es void porque no quiero que devuelva nada. Sólo que haga algo. Método para construir un panel
        //voy a imitar el panel
        ventana.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
    }

    public void Etiqueta() {
        titulo.setText("RIFA MILLONARIA");
        titulo.setFont(new Font("Ink Free", Font.BOLD, 25));
        titulo.setBounds(280, 35, 250, 50);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.red);
        panel.add(titulo);
    }

    public void Numuno() {
        numuno.setForeground(Color.BLACK);
        numuno.setHorizontalAlignment(SwingConstants.CENTER);
        numuno.setFont(new Font("Ink Free", Font.BOLD, 15));
        numuno.setBounds(50, 100, 50, 50);
        panel.add(numuno);
    }

    public void Numdos() {
        numdos.setForeground(Color.BLACK);
        numdos.setHorizontalAlignment(SwingConstants.CENTER);
        numdos.setFont(new Font("Ink Free", Font.BOLD, 15));
        numdos.setBounds(150, 100, 50, 50);
        panel.add(numdos);
    }

    public void Numtres() {
        numtres.setForeground(Color.BLACK);
        numtres.setHorizontalAlignment(SwingConstants.CENTER);
        numtres.setFont(new Font("Ink Free", Font.BOLD, 15));
        numtres.setBounds(250, 100, 50, 50);
        panel.add(numtres);
    }

    public void Numcuatro() {
        numcuatro.setForeground(Color.BLACK);
        numcuatro.setHorizontalAlignment(SwingConstants.CENTER);
        numcuatro.setFont(new Font("Ink Free", Font.BOLD, 15));
        numcuatro.setBounds(350, 100, 50, 50);
        panel.add(numcuatro);
    }

    public void Numcinco() {
        numcinco.setForeground(Color.BLACK);
        numcinco.setHorizontalAlignment(SwingConstants.CENTER);
        numcinco.setFont(new Font("Ink Free", Font.BOLD, 15));
        numcinco.setBounds(450, 100, 50, 50);
        panel.add(numcinco);
    }

    public void Cajauno() {
        cajauno.setBounds(95, 100, 50, 50);
        cajauno.setHorizontalAlignment(SwingConstants.CENTER);
        cajauno.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
        cajauno.setForeground(Color.black);
        cajauno.setBackground(Color.white);
        panel.add(cajauno);
    }

    public void Cajados() {
       cajauno.setBounds(110, 100, 50, 50);
        cajados.setHorizontalAlignment(SwingConstants.CENTER);
        cajados.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
        cajados.setForeground(Color.black);
        cajados.setBackground(Color.white);
        panel.add(cajados);
    }

    public void Cajatres() {
       cajauno.setBounds(95, 100, 50, 50);
        cajatres.setHorizontalAlignment(SwingConstants.CENTER);
        cajatres.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
        cajatres.setForeground(Color.black);
        cajatres.setBackground(Color.white);
        panel.add(cajatres);
    }

    public void Cajacuatro() {
        cajauno.setBounds(95, 100, 50, 50);
        cajacuatro.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
        cajacuatro.setForeground(Color.black);
        cajacuatro.setBackground(Color.white);
        panel.add(cajacuatro);
    }

    public void Cajacinco() {
       cajauno.setBounds(95, 100, 50, 50);
        cajacinco.setHorizontalAlignment(SwingConstants.CENTER);
        cajacinco.setFont(new Font("Monotype Corsiva", Font.PLAIN, 15));
        cajacinco.setForeground(Color.black);
        cajacinco.setBackground(Color.white);
        panel.add(cajacinco);
    }
}
