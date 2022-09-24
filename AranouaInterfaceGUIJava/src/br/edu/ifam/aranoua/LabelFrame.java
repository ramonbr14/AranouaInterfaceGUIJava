package br.edu.ifam.aranoua;

import java.awt.FlowLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class LabelFrame extends JFrame{
    private final JLabel rotulo1;    //JLabel apenas com texto
    private final JLabel rotulo2;    //JLabel com texto e �cone
    private final JLabel rotulo3;    //JLabel com texto e �cone
   
    //construtor LabelFrame adiciona JLabels a JFrame
    public LabelFrame() {
        super("Testando JLabel");
        setLayout(new FlowLayout());    //configura o layout do frame
       
        //Construtor JLabel com um argumento de string
        rotulo1 = new JLabel("Label com texto");
        rotulo1.setToolTipText("Este � o r�tulo 1");
        add(rotulo1);    //adiciona o rotulo1 ao JFrame
       
        //contrutor JLabel com string, icone e argumento de alinhamento
        Icon bug = new ImageIcon(getClass().getResource("bug.png"));
        Icon bug2 = new ImageIcon(getClass().getResource("bug2.png"));
        rotulo2 = new JLabel("Label com texto e �cone",bug,SwingConstants.LEFT);
        rotulo2.setToolTipText("Este � o r�tulo 2");
        add(rotulo2);    //adiciona o rotulo2 ao JFrame
       
        //contrutor JLabel sem argumento
        rotulo3 = new JLabel();
        rotulo3.setText("Label com �cone e texto na parte inferior");
        rotulo3.setIcon(bug2);
        rotulo3.setHorizontalTextPosition(SwingConstants.CENTER);
        rotulo3.setVerticalTextPosition(SwingConstants.BOTTOM);
        rotulo3.setToolTipText("Este � p r�tulo 3");
        add(rotulo3);    //adiciona o rotulo3 ao JFrame
    }

}