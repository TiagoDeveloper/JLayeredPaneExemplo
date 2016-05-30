package br.com.tiagoDeveloper.janela.testes;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Layered extends JLayeredPane implements ActionListener {

	JButton button1 = new JButton("Painel 1");
	JButton button2 = new JButton("Painel 2");

	Painel1 painel1 = new Painel1();
	Painel2 painel2 = new Painel2();

	JPanel botoes = new JPanel();

	GridBagConstraints gbc = new GridBagConstraints();

	public Layered() {

		this.setLayout(new GridBagLayout());

		gbc.gridx = 0;
		gbc.gridy = 0;
		this.gbc.fill = GridBagConstraints.BOTH;
		this.gbc.weightx = 1.0;
		this.gbc.weighty = 0.9;
		this.gbc.gridwidth = 2;
		this.add(this.painel1, gbc, 1);

		gbc.gridx = 0;
		gbc.gridy = 0;
		this.gbc.fill = GridBagConstraints.BOTH;
		this.gbc.weightx = 1.0;
		this.gbc.weighty = 0.9;
		this.gbc.gridwidth = 2;
		this.add(this.painel2, gbc, 0);

		gbc.gridx = 0;
		gbc.gridy = 1;
		this.gbc.weightx = 0.0;
		this.gbc.weighty = 0.1;
		//this.gbc.fill = GridBagConstraints.HORIZONTAL;
		//this.gbc.anchor = GridBagConstraints.PAGE_END;
		this.botoes.setBackground(Color.yellow);
		
		this.button1.addActionListener(this);
		this.botoes.add(this.button1);
		this.button2.addActionListener(this);
		this.botoes.add(this.button2);
		this.add(this.botoes, this.gbc);

	}

	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == this.button1) {

			this.painel1.setVisible(true);
			this.painel2.setVisible(false);

		} else {
			this.painel1.setVisible(false);
			this.painel2.setVisible(true);
		}

	}

}
