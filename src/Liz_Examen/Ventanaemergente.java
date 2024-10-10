package Liz_Examen;

import java.awt.Color;
import java.awt.Dialog;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Liz
 */
public class Ventanaemergente {
    
    JDialog ventanaEmergente = new JDialog();
    JPanel panelventanaemergente = new JPanel();
    
    JLabel mensaje = new JLabel();
    
    
    public Ventanaemergente(){
        ventanaEmergente.setVisible(true);        
        ventanaEmergente.setTitle("Preguntas del exámen:");
        ventanaEmergente.setBounds(200, 270, 500, 500);  
        ventanaEmergente.setResizable(false);
        ventanaEmergente.setModalityType(Dialog.ModalityType.DOCUMENT_MODAL);
         
        panelventanaemergente.setSize(ventanaEmergente.getWidth(), ventanaEmergente.getHeight());
        panelventanaemergente.setBackground(Color.white);  
        panelventanaemergente.setLayout(null);
        
        /*mensaje.setBounds(100, 100, 200, 50);
        mensaje.setText("Sasndfuisadfuaisf");
        mensaje.setForeground(Color.WHITE);
        mensaje.setBackground(Color.BLACK);
        mensaje.setOpaque(true);
        panelventanaemergente.add(mensaje);*/
        
        ventanaEmergente.add(panelventanaemergente);
        panelventanaemergente.updateUI();
        
        PanelEmergente();
        
    }
    
    public void PanelEmergente(){
        ventanaEmergente.add(panelventanaemergente);
        panelventanaemergente.setLayout(null);
        panelventanaemergente.setBackground(Color.GRAY);
    }
    
}
