package br.edu.ifam.aranoua;

import javax.swing.JOptionPane;

public class SaidaNomeJOptionPane {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null,"Digite Vossa gra�a: ");
		String sobreNome =JOptionPane.showInputDialog(null, "e A Desgra�a do seu sobre nome: ");
		String nomeCompleto = nome + " "+ sobreNome;
		
		JOptionPane.showMessageDialog(null, nomeCompleto,"INFOMA��O",JOptionPane.INFORMATION_MESSAGE);
	}
}
