//elementos gráficos
package Liz_Rifa;

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

    Juego juego = new Juego();

    JFrame ventana = new JFrame();
    JPanel panel = new JPanel();

    JLabel titulo = new JLabel();

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

    JButton botonaleatorio = new JButton();
    JButton botonmanual = new JButton();
    JButton botonstart = new JButton();
    JButton botonreiniciar = new JButton();

    JLabel mostrarnumero = new JLabel();
    JLabel numerosganadores = new JLabel();
    JLabel premio = new JLabel();
    JLabel bote = new JLabel();

    JLabel numero = new JLabel();
    JLabel ganador = new JLabel();
    JLabel cantidad = new JLabel();
    JLabel jugador = new JLabel();
    JLabel aciertos = new JLabel();
    JLabel mostrarAciertos = new JLabel();
    JLabel numeroJugadores = new JLabel();
    JLabel boteTotal = new JLabel();
    JLabel PremioTotal = new JLabel();

    public Ventana() {
        ventana.setVisible(true);
        ventana.setTitle("Rifa_Liz_Contreras");
        ventana.setSize(950, 700);
        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocation(300, 100);

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
        BotonAleatorio();
        BotonStart();
        BotonReiniciar();
        MostrarNumero();
        NumerosGanadores();
        Bote();
        Premio();
        Jugadores();

    }

    public void Panel() {
        ventana.add(panel);
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
    }

    public void Etiqueta() {
        titulo.setText("EUROMILLONES");
        titulo.setFont(new Font("Gill Sans MT", Font.BOLD, 25));
        titulo.setBounds(180, 35, 250, 50);
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        titulo.setForeground(Color.black);
        panel.add(titulo);
    }

    public void Numuno() {
        numuno.setForeground(Color.BLACK);
        numuno.setHorizontalAlignment(SwingConstants.CENTER);
        numuno.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        numuno.setBounds(40, 100, 50, 50);
        panel.add(numuno);
    }

    public void Numdos() {
        numdos.setForeground(Color.BLACK);
        numdos.setHorizontalAlignment(SwingConstants.CENTER);
        numdos.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        numdos.setBounds(150, 100, 50, 50);
        panel.add(numdos);
    }

    public void Numtres() {
        numtres.setForeground(Color.BLACK);
        numtres.setHorizontalAlignment(SwingConstants.CENTER);
        numtres.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        numtres.setBounds(250, 100, 50, 50);
        panel.add(numtres);
    }

    public void Numcuatro() {
        numcuatro.setForeground(Color.BLACK);
        numcuatro.setHorizontalAlignment(SwingConstants.CENTER);
        numcuatro.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        numcuatro.setBounds(350, 100, 50, 50);
        panel.add(numcuatro);
    }

    public void Numcinco() {
        numcinco.setForeground(Color.BLACK);
        numcinco.setHorizontalAlignment(SwingConstants.CENTER);
        numcinco.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        numcinco.setBounds(450, 100, 50, 50);
        panel.add(numcinco);
    }

    public void Cajauno() {
        cajauno.setBounds(100, 100, 50, 50);
        cajauno.setHorizontalAlignment(SwingConstants.CENTER);
        cajauno.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
        cajauno.setForeground(Color.black);
        cajauno.setBackground(Color.white);
        panel.add(cajauno);
    }

    public void Cajados() {
        cajados.setBounds(200, 100, 50, 50);
        cajados.setHorizontalAlignment(SwingConstants.CENTER);
        cajados.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
        cajados.setForeground(Color.black);
        cajados.setBackground(Color.white);
        panel.add(cajados);
    }

    public void Cajatres() {
        cajatres.setBounds(300, 100, 50, 50);
        cajatres.setHorizontalAlignment(SwingConstants.CENTER);
        cajatres.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
        cajatres.setForeground(Color.black);
        cajatres.setBackground(Color.white);
        panel.add(cajatres);
    }

    public void Cajacuatro() {
        cajacuatro.setBounds(400, 100, 50, 50);
        cajacuatro.setHorizontalAlignment(SwingConstants.CENTER);
        cajacuatro.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
        cajacuatro.setForeground(Color.black);
        cajacuatro.setBackground(Color.white);
        panel.add(cajacuatro);
    }

    public void Cajacinco() {
        cajacinco.setBounds(500, 100, 50, 50);
        cajacinco.setHorizontalAlignment(SwingConstants.CENTER);
        cajacinco.setFont(new Font("Gill Sans MT", Font.PLAIN, 15));
        cajacinco.setForeground(Color.black);
        cajacinco.setBackground(Color.white);
        panel.add(cajacinco);
    }

    public void BotonReiniciar() {
        botonreiniciar.setBounds(50, 200, 200, 50);
        botonreiniciar.setText("Reiniciar");
        botonreiniciar.setForeground(Color.WHITE);
        botonreiniciar.setBackground(Color.BLACK);
        botonreiniciar.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        panel.add(botonreiniciar);

        botonreiniciar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] numeros = juego.cartonAleatorio();
                cajauno.setText("");
                cajados.setText("");
                cajatres.setText("");
                cajacuatro.setText("");
                cajacinco.setText("");
                numero.setText("");
                ganador.setText("");
                cantidad.setText("");
                boteTotal.setText("");
                PremioTotal.setText("");

            }
        });
    }

    public void BotonStart() {
        botonstart.setBounds(350, 200, 200, 50);
        botonstart.setText("Start");
        botonstart.setForeground(Color.WHITE);
        botonstart.setBackground(Color.BLACK);
        botonstart.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        panel.add(botonstart);

        botonstart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String numerosConcatenados = cajauno.getText() + ", " + cajados.getText() + ", " + cajatres.getText() + ", " + cajacuatro.getText() + ", " + cajacinco.getText();
                numero.setText(numerosConcatenados);

                int[] cartonJugador = {
                    Integer.parseInt(cajauno.getText()),
                    Integer.parseInt(cajados.getText()),
                    Integer.parseInt(cajatres.getText()),
                    Integer.parseInt(cajacuatro.getText()),
                    Integer.parseInt(cajacinco.getText())
                };
                juego.agregarCartonJugador(cartonJugador);

                int numJugadoresAdicionales = (int) (Math.random() * 11) + 5;
                for (int i = 0; i < numJugadoresAdicionales; i++) {
                    juego.agregarCartonJugador(juego.cartonAleatorio());
                }

                int totalJugadores = juego.getNumJugadores();
                numeroJugadores.setText(String.valueOf(totalJugadores));
                boteTotal.setText(String.valueOf(juego.getBoteTotal()));

                int[] numeroGanador = juego.cartonAleatorio();
                String ganadorConcatenado = "";
                for (int i = 0; i < numeroGanador.length; i++) {
                    ganadorConcatenado += numeroGanador[i];
                    if (i < numeroGanador.length - 1) {
                        ganadorConcatenado += ", ";
                    }
                }
                ganador.setText(ganadorConcatenado);

            }
        });
    }

    public void BotonAleatorio() {
        botonaleatorio.setBounds(650, 150, 200, 50);
        botonaleatorio.setText("Carton Aleatorio");
        botonaleatorio.setForeground(Color.WHITE);
        botonaleatorio.setBackground(Color.BLACK);
        botonaleatorio.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        panel.add(botonaleatorio);

        botonaleatorio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int[] numeros = juego.cartonAleatorio();

                cajauno.setText(String.valueOf(numeros[0]));
                cajados.setText(String.valueOf(numeros[1]));
                cajatres.setText(String.valueOf(numeros[2]));
                cajacuatro.setText(String.valueOf(numeros[3]));
                cajacinco.setText(String.valueOf(numeros[4]));
            }
        });
    }

    public void MostrarNumero() {
        mostrarnumero.setText("Tu Cartón:");
        mostrarnumero.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        mostrarnumero.setBounds(40, 300, 200, 50);
        mostrarnumero.setHorizontalAlignment(SwingConstants.LEFT);
        mostrarnumero.setForeground(Color.black);
        panel.add(mostrarnumero);

        numero.setBounds(220, 310, 150, 30);
        numero.setHorizontalAlignment(SwingConstants.CENTER);
        numero.setOpaque(true);
        numero.setForeground(Color.black);
        numero.setBackground(Color.white);
        numero.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panel.add(numero);
    }

    public void NumerosGanadores() {
        numerosganadores.setText("Cartón Ganador:");
        numerosganadores.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        numerosganadores.setBounds(40, 350, 200, 50);
        numerosganadores.setHorizontalAlignment(SwingConstants.LEFT);
        numerosganadores.setForeground(Color.black);
        panel.add(numerosganadores);

        ganador.setBounds(220, 360, 150, 30);
        ganador.setHorizontalAlignment(SwingConstants.CENTER);
        ganador.setOpaque(true);
        ganador.setForeground(Color.black);
        ganador.setBackground(Color.white);
        ganador.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panel.add(ganador);
    }

    public void Jugadores() {
        jugador.setText("Nº Jugadores:");
        jugador.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        jugador.setBounds(40, 400, 200, 50);
        jugador.setHorizontalAlignment(SwingConstants.LEFT);
        jugador.setForeground(Color.black);
        panel.add(jugador);

        numeroJugadores.setBounds(220, 410, 150, 30);
        numeroJugadores.setHorizontalAlignment(SwingConstants.CENTER);
        numeroJugadores.setOpaque(true);
        numeroJugadores.setForeground(Color.black);
        numeroJugadores.setBackground(Color.white);
        numeroJugadores.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panel.add(numeroJugadores);  // Añadir al panel
    }

    public void Bote() {
        bote.setText("Bote:");
        bote.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        bote.setBounds(40, 450, 200, 50);
        bote.setHorizontalAlignment(SwingConstants.LEFT);
        bote.setForeground(Color.black);
        panel.add(bote);

        boteTotal.setBounds(220, 460, 150, 30);
        boteTotal.setHorizontalAlignment(SwingConstants.CENTER);
        boteTotal.setOpaque(true);
        boteTotal.setForeground(Color.black);
        boteTotal.setBackground(Color.white);
        boteTotal.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panel.add(boteTotal);
    }

    public void Premio() {
        premio.setText("Premio:");
        premio.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        premio.setBounds(40, 500, 200, 50);
        premio.setHorizontalAlignment(SwingConstants.LEFT);
        premio.setForeground(Color.black);
        panel.add(premio);

        PremioTotal.setBounds(220, 510, 150, 30);
        PremioTotal.setHorizontalAlignment(SwingConstants.CENTER);
        PremioTotal.setOpaque(true);
        PremioTotal.setForeground(Color.black);
        PremioTotal.setBackground(Color.white);
        PremioTotal.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panel.add(PremioTotal);
    }

}
