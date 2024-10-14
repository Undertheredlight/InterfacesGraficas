package Liz_Examen;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 *
 * @author Liz
 */
public class Ventanaemergente {
    
    JDialog ventanaEmergente = new JDialog();                                  
    JPanel panelventanaemergente = new JPanel();
    
    JLabel enunciado = new JLabel();
    JLabel p1 = new JLabel(); JLabel p2 = new JLabel(); JLabel p3 = new JLabel(); JLabel p4 = new JLabel(); JLabel p5 = new JLabel();
    JLabel p6 = new JLabel(); JLabel p7 = new JLabel(); JLabel p8 = new JLabel(); JLabel p9 = new JLabel(); JLabel p10 = new JLabel();
    
    //Creamos todas las opciones de botones del exámen
    JRadioButton btn1 = new JRadioButton("Ser");
    JRadioButton btn2 = new JRadioButton("No ser");
    JRadioButton btn3 = new JRadioButton("Pienso");
    JRadioButton btn4 = new JRadioButton("Existo");
    JRadioButton btn5 = new JRadioButton("Huevo");
    JRadioButton btn6 = new JRadioButton("Gallina");
    JRadioButton btn7 = new JRadioButton("Si");
    JRadioButton btn8 = new JRadioButton("No");
    JRadioButton btn9 = new JRadioButton("Un constructo social");
    JRadioButton btn10 = new JRadioButton("Lo real");
    JRadioButton btn11 = new JRadioButton("Nunca");
    JRadioButton btn12 = new JRadioButton("Podría");
    JRadioButton btn13 = new JRadioButton("Si");
    JRadioButton btn14 = new JRadioButton("No");
    JRadioButton btn15 = new JRadioButton("Si, creo en ello");
    JRadioButton btn16 = new JRadioButton("No existe la inmortalidad");
    JRadioButton btn17 = new JRadioButton("Obvio");
    JRadioButton btn18 = new JRadioButton("No, están unidas");
    JRadioButton btn19 = new JRadioButton("Estar tranquilo y en paz");
    JRadioButton btn20 = new JRadioButton("El estado de bienestar absoluto");
    
    //Creamos todos los ButtonGroup para agrupar las 2 opciones de respuesta por pregunta
    ButtonGroup grupo1 = new ButtonGroup();
    ButtonGroup grupo2 = new ButtonGroup();
    ButtonGroup grupo3 = new ButtonGroup();        
    ButtonGroup grupo4 = new ButtonGroup();
    ButtonGroup grupo5 = new ButtonGroup();
    ButtonGroup grupo6 = new ButtonGroup();
    ButtonGroup grupo7 = new ButtonGroup();
    ButtonGroup grupo8 = new ButtonGroup();
    ButtonGroup grupo9 = new ButtonGroup();
    ButtonGroup grupo10 = new ButtonGroup();
    
    //Creamos un CheckBox para confirmar la entrega y un botón terminar que finaliza el exámen
    JCheckBox checkBoxEntregar = new JCheckBox("Quiero entregar el examen");
    JButton btnTerminar = new JButton("Terminar Examen");
    


    public Ventanaemergente(){
        ventanaEmergente.setVisible(true);        
        ventanaEmergente.setTitle("Preguntas del exámen:");
        ventanaEmergente.setBounds(300, 40, 900, 700);
        ventanaEmergente.setResizable(false);
        ventanaEmergente.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);
        panelventanaemergente.setSize(ventanaEmergente.getWidth(), ventanaEmergente.getHeight());
        panelventanaemergente.setBackground(Color.white);  
        panelventanaemergente.setLayout(null);

        ventanaEmergente.add(panelventanaemergente);
        panelventanaemergente.updateUI();
        
        PanelEmergente();
        Enunciado();
        Preguntas();
        Opciones();
        CheckBoxYBoton();
    }
    
    public void PanelEmergente(){
        ventanaEmergente.add(panelventanaemergente);
        panelventanaemergente.setLayout(null);
        panelventanaemergente.setBackground(Color.GRAY);
    }
    
    public void Enunciado(){
        enunciado.setText("A continuación, responde una de las dos opciones. Luego, confirma el envío del exámen.");
        enunciado.setBounds(10, 5, 700, 30);
        enunciado.setFont(new Font("Gill Sans MT", Font.BOLD, 15));
        panelventanaemergente.add(enunciado);
    }
    
    //10 preguntas
    public void Preguntas(){
        p1.setText("1. ¿Ser o no ser?");
        p1.setBounds(15, 25, 700, 30);
        p1.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panelventanaemergente.add(p1);
        
       p2.setText("2. ¿Primero pienso y luego existo?");
        p2.setBounds(15, 95, 700, 30);
        p2.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panelventanaemergente.add(p2);
        
        p3.setText("3. ¿Primero fué el huevo o la gallina?");
        p3.setBounds(15, 160, 700, 30);
        p3.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panelventanaemergente.add(p3);
      
        p4.setText("4. ¿Existe el libre albedrío?");
        p4.setBounds(15, 220, 700, 30);
        p4.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panelventanaemergente.add(p4);
          
        p5.setText("5. ¿Qué es la verdad?");
        p5.setBounds(15, 280, 700, 30);
        p5.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panelventanaemergente.add(p5);
        
        p6.setText("6. ¿Puede la moral ser objetiva?");
        p6.setBounds(15, 340, 700, 30);
        p6.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panelventanaemergente.add(p6);
         
        p7.setText("7. ¿Existe un propósito en la vida humana?");
        p7.setBounds(15, 400, 700, 30);
        p7.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panelventanaemergente.add(p7);
        
        p8.setText("8. ¿Es posible la inmortalidad?");
        p8.setBounds(15, 460, 700, 30);
        p8.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panelventanaemergente.add(p8);
        
        p9.setText("9. ¿Es la mente diferente del cuerpo?");
        p9.setBounds(15, 520, 700, 30);
        p9.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panelventanaemergente.add(p9);
        
        p10.setText("10. ¿Qué es la felicidad?");
        p10.setBounds(15, 580, 700, 30);
        p10.setFont(new Font("Gill Sans MT", Font.BOLD, 10));
        panelventanaemergente.add(p10);
    }
    
    //10 opciones de respuestas, divididas por grupos 
    public void Opciones(){
        btn1.setBounds(15, 50, 150, 30);
        btn1.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn1.setBackground(Color.GRAY);
        panelventanaemergente.add(btn1);
        grupo1.add(btn1);
        
        btn2.setBounds(15, 70, 150, 30);
        btn2.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn2.setBackground(Color.GRAY);
        panelventanaemergente.add(btn2);
        grupo1.add(btn2);
        
        btn3.setBounds(15, 115, 150, 30);
        btn3.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn3.setBackground(Color.GRAY);
        panelventanaemergente.add(btn3);
        grupo2.add(btn3);
        
        btn4.setBounds(15, 135, 150, 30);
        btn4.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn4.setBackground(Color.GRAY);
        panelventanaemergente.add(btn4);
        grupo2.add(btn4);
        
        btn5.setBounds(15, 180, 150, 30);
        btn5.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn5.setBackground(Color.GRAY);
        panelventanaemergente.add(btn5);
        grupo3.add(btn5);
        
        btn6.setBounds(15, 200, 150, 30);
        btn6.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn6.setBackground(Color.GRAY);
        panelventanaemergente.add(btn6);
        grupo3.add(btn6);
        
        btn7.setBounds(15, 240, 150, 30);
        btn7.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn7.setBackground(Color.GRAY);
        panelventanaemergente.add(btn7);
        grupo4.add(btn7);
        
        btn8.setBounds(15, 260, 150, 30);
        btn8.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn8.setBackground(Color.GRAY);
        panelventanaemergente.add(btn8);
        grupo4.add(btn8);
        
        btn9.setBounds(15, 300, 150, 30);
        btn9.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn9.setBackground(Color.GRAY);
        panelventanaemergente.add(btn9);
        grupo5.add(btn7);
        
        btn10.setBounds(15, 320, 150, 30);
        btn10.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn10.setBackground(Color.GRAY);
        panelventanaemergente.add(btn10);
        grupo5.add(btn10);
        
        btn11.setBounds(15, 360, 150, 30);
        btn11.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn11.setBackground(Color.GRAY);
        panelventanaemergente.add(btn11);
        grupo6.add(btn11);
        
        btn12.setBounds(15, 380, 150, 30);
        btn12.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn12.setBackground(Color.GRAY);
        panelventanaemergente.add(btn12);
        grupo6.add(btn12);
        
        btn13.setBounds(15, 420, 150, 30);
        btn13.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn13.setBackground(Color.GRAY);
        panelventanaemergente.add(btn13);
        grupo7.add(btn13);
        
        btn14.setBounds(15, 440, 150, 30);
        btn14.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn14.setBackground(Color.GRAY);
        panelventanaemergente.add(btn14);
        grupo7.add(btn14);
        
        btn15.setBounds(15, 480, 150, 30);
        btn15.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn15.setBackground(Color.GRAY);
        panelventanaemergente.add(btn15);
        grupo8.add(btn15);
        
        btn16.setBounds(15, 500, 150, 30);
        btn16.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn16.setBackground(Color.GRAY);
        panelventanaemergente.add(btn16);
        grupo8.add(btn16);
                
        btn17.setBounds(15, 540, 150, 30);
        btn17.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn17.setBackground(Color.GRAY);
        panelventanaemergente.add(btn17);
        grupo9.add(btn17);
        
        btn18.setBounds(15, 560, 150, 30);
        btn18.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn18.setBackground(Color.GRAY);
        panelventanaemergente.add(btn18);
        grupo9.add(btn18);
        
        btn19.setBounds(15, 600, 150, 30);
        btn19.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn19.setBackground(Color.GRAY);
        panelventanaemergente.add(btn19);
        grupo10.add(btn19);
        
        btn20.setBounds(15, 620, 150, 30);
        btn20.setFont(new Font("Gill Sans MT", Font.BOLD, 8));
        btn20.setBackground(Color.GRAY);
        panelventanaemergente.add(btn20);
        grupo10.add(btn20);
    }

    //Confirmamos entrega del exámen y activamos el botón terminar
    public void CheckBoxYBoton() {
        checkBoxEntregar.setBounds(700, 600, 200, 30);
        checkBoxEntregar.setFont(new Font("Gill Sans MT", Font.PLAIN, 12));
        checkBoxEntregar.setBackground(Color.GRAY);
        panelventanaemergente.add(checkBoxEntregar);
        
        btnTerminar.setBounds(700, 560, 150, 30);
        btnTerminar.setEnabled(false);
        panelventanaemergente.add(btnTerminar);

        //Acción al darle al checkBox
        checkBoxEntregar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnTerminar.setEnabled(checkBoxEntregar.isSelected());
            }
        });

        //Acción al darle al botón terminar
        btnTerminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int respuesta = JOptionPane.showConfirmDialog(ventanaEmergente, "¿Estás seguro de que quieres entregar el examen?", "Confirmación", JOptionPane.YES_NO_OPTION);
                if (respuesta == JOptionPane.YES_OPTION) {
                    // Aquí llamas a la función para calcular la nota y la muestra
                    int notaFinal = calcularNota(); //este es el método creado donde se hace el cálculo de la nota
                    Ventana.mostrarResultado(notaFinal);
                    ventanaEmergente.dispose(); //Para cerrar la ventana emergente
                }
            }
        });
    }

    private int calcularNota() {
       //usaremos este contador para sumar las respuestas correctas y dar la nota final
        int nota = 0;
        if (btn1.isSelected()) nota++;
        if (btn3.isSelected()) nota++;
        if (btn5.isSelected()) nota++;
        if (btn7.isSelected()) nota++;
        if (btn9.isSelected()) nota++;
        if (btn11.isSelected()) nota++;
        if (btn13.isSelected()) nota++;
        if (btn15.isSelected()) nota++;
        if (btn17.isSelected()) nota++;
        if (btn19.isSelected()) nota++;
        return nota;
    }

}

