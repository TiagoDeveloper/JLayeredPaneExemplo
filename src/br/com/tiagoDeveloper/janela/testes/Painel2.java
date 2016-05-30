package br.com.tiagoDeveloper.janela.testes;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Painel2 extends JPanel {

	JLabel label = new JLabel("Painel 2");

	public Painel2() {

		this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		this.setBackground(Color.BLACK);
		this.setVisible(false);
		this.add(this.label);

	}

}
