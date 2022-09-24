package br.edu.ifam.aranoua;

import javax.swing.JOptionPane;

public class SaidaNomeJOptionPane {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog(null,"Digite Vossa graça: ");
		String sobreNome =JOptionPane.showInputDialog(null, "e A Desgraça do seu sobre nome: ");
		String nomeCompleto = nome + " "+ sobreNome;
		
		JOptionPane.showMessageDialog(null, nomeCompleto,"INFOMAÇÃO",JOptionPane.INFORMATION_MESSAGE);
	}
}
