package br.com.tiagoDeveloper.janela.testes;

import javax.swing.JFrame;

public class Janela extends JFrame {

	Layered layered = new Layered();

	public Janela() {

		this.setContentPane(this.layered);

		this.setLocationRelativeTo(null);
		this.setSize(400, 200);
		this.setResizable(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
