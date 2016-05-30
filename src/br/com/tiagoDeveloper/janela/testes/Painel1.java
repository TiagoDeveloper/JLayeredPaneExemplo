package br.com.tiagoDeveloper.janela.testes;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel1 extends JPanel {

	JLabel label = new JLabel("Painel 1");

	public Painel1() {

		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setBackground(Color.RED);
		this.setVisible(true);
		this.add(this.label);

	}

}
