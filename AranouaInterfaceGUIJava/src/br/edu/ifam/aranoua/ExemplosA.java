package br.edu.ifam.aranoua;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ExemplosA extends JFrame implements ActionListener{
    //declaracao das variais de instancia (componentes)
        private JLabel label1;
        private JLabel label2;
        private JTextField caixa1;
        private JTextField caixa2;
        private JButton btnCalcular;
        //label de resposta
        private JLabel resposta;

        public ExemplosA() {
            super("Exemplos de componentes");    //acessa o construtor da superclasse
            setLayout(new FlowLayout());    //configura o layout da tela
           
            //configurar os componentes
            label1 = new JLabel("Entre com o nome");
            label2 = new JLabel("Entre com a idade");
            resposta = new JLabel();
            caixa1 = new JTextField(20);
            caixa1.setToolTipText("Entre com o nome");
            caixa2 = new JTextField(20);
            caixa2.setToolTipText("Entre com a idade");
            btnCalcular = new JButton("Calcular");
            btnCalcular.setToolTipText("clique aqui");
            //definindo o ouvinte
            btnCalcular.addActionListener(this);
            //adicionar os componentes ao JFrame
            add(label1);
            add(caixa1);
            add(label2);
            add(caixa2);
            add(btnCalcular);
            add(resposta);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String nome = caixa1.getText();
            String idade = caixa2.getText();
           
            String nomeCompleto ="A "+ nome +" tem "+idade+" Anos";
            resposta.setText(nomeCompleto);
        }
}