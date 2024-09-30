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
 * @author Liz
 */
public class Ventana {

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
    JButton botonrellena = new JButton();
    JButton botonstart = new JButton();
    
    JLabel mostrarnumero = new JLabel();
    JLabel numerosganadores = new JLabel();
    JLabel premio = new JLabel();
    
    JLabel numero = new JLabel();
    JLabel ganador = new JLabel();
    JLabel cantidad = new JLabel();

    public Ventana() {
        ventana.setVisible(true);
        ventana.setTitle("Rifa_Liz_Contreras");
        ventana.setSize(630, 600);
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
        BotonAleatorio();
        BotonRellena();
        MostrarNumero();
        NumerosGanadores();
        Premio();
        Start();
        Numero();
        Ganador();
        PremioCantidad();
        
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

    public void BotonAleatorio() {
        botonaleatorio.setBounds(50, 200, 200, 50);
        botonaleatorio.setText("Aleatorio");
        botonaleatorio.setForeground(Color.WHITE);
        botonaleatorio.setBackground(Color.BLACK);
        botonaleatorio.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        panel.add(botonaleatorio);
    }

    public void BotonRellena() {
        botonrellena.setBounds(350, 200, 200, 50);
        botonrellena.setText("Rellena");
        botonrellena.setForeground(Color.WHITE);
        botonrellena.setBackground(Color.BLACK);
        botonrellena.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        panel.add(botonrellena);
    }
    
    public void MostrarNumero(){
        mostrarnumero.setText("Mostrar Número:");
        mostrarnumero.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        mostrarnumero.setBounds(40, 300, 200, 50);
        mostrarnumero.setHorizontalAlignment(SwingConstants.LEFT);
        mostrarnumero.setForeground(Color.black);
        panel.add(mostrarnumero);
    }
    
    public void NumerosGanadores(){
        numerosganadores.setText("Números Ganadores:");
        numerosganadores.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        numerosganadores.setBounds(40, 350, 200, 50);
        numerosganadores.setHorizontalAlignment(SwingConstants.LEFT);
        numerosganadores.setForeground(Color.black);
        panel.add(numerosganadores);
    }
     
    public void Premio(){
        premio.setText("Cantidad de Premio:");
        premio.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        premio.setBounds(40, 400, 200, 50);
        premio.setHorizontalAlignment(SwingConstants.LEFT);
        premio.setForeground(Color.black);
        panel.add(premio);
    }
     
    public void Start() {
        botonstart.setBounds(450, 450, 100, 50);
        botonstart.setText("Start");
        botonstart.setForeground(Color.WHITE);
        botonstart.setBackground(Color.BLACK);
        botonstart.setFont(new Font("Gill Sans MT", Font.BOLD, 20));
        panel.add(botonstart);
    }
     
    public void Numero(){
        numero.setBounds(220,310, 150, 30);                                   
        numero.setHorizontalAlignment(SwingConstants.CENTER);               
        numero.setOpaque(true);                                            
        numero.setForeground(Color.black);                                   
        numero.setBackground(Color.white);                                    
        numero.setFont(new Font("Gill Sans MT", Font.BOLD, 5));
        panel.add(numero);
    }
    
    public void Ganador(){
        ganador.setBounds(220,360, 150, 30);                                   
        ganador.setHorizontalAlignment(SwingConstants.CENTER);               
        ganador.setOpaque(true);                                            
        ganador.setForeground(Color.black);                                   
        ganador.setBackground(Color.white);                                    
        ganador.setFont(new Font("Gill Sans MT", Font.BOLD, 5));
        panel.add(ganador);
    }
    
    public void PremioCantidad(){
        cantidad.setBounds(220,410, 150, 30);                                   
        cantidad.setHorizontalAlignment(SwingConstants.CENTER);               
        cantidad.setOpaque(true);                                            
        cantidad.setForeground(Color.black);                                   
        cantidad.setBackground(Color.white);                                    
        cantidad.setFont(new Font("Gill Sans MT", Font.BOLD, 5));
        panel.add(cantidad);
    }
    
}
