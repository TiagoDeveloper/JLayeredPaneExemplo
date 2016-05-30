package br.com.tiagoDeveloper.jtextpane.testes;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class JFrameExemplo extends JFrame implements ActionListener{
	
	private GridBagConstraints gbc= new GridBagConstraints();
	private JLabel labelTextArea = new JLabel("HTML");
	private JTextPaneExemplo textPane = new JTextPaneExemplo();
	private JButton	enviar = new JButton("Enviar");
	private JLabel labelTextPanel = new JLabel("Resultado:");
	
	
	private JTextArea textArea = new JTextArea();
	
	public JFrameExemplo(){
		
		this.setLayout(new GridBagLayout());
		
		this.gbc.gridx = 0;
		this.gbc.gridy = 0;	
		this.gbc.weightx = 0.1;
		this.gbc.weighty = 0.1;
		this.gbc.fill = GridBagConstraints.BOTH;
		this.add(this.labelTextArea,this.gbc);
		
		this.gbc.gridx = 0;
		this.gbc.gridy = 1;		
		this.gbc.weightx = 0.4;
		this.gbc.weighty = 0.4;
		this.gbc.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(this.textArea), this.gbc);
		
		this.gbc.gridx = 0;
		this.gbc.gridy = 2;		
		this.gbc.weightx = 0.1;
		this.gbc.weighty = 0.1;
		this.enviar.addActionListener(this);
		this.add(this.enviar, this.gbc);
		
		this.gbc.gridx = 0;
		this.gbc.gridy = 3;	
		this.gbc.weightx = 0.1;
		this.gbc.weighty = 0.1;
		this.gbc.fill = GridBagConstraints.BOTH;
		this.add(this.labelTextPanel,this.gbc);
		
		this.gbc.gridx = 0;
		this.gbc.gridy = 4;
		this.gbc.weightx = 0.3;
		this.gbc.weighty = 0.3;
		this.gbc.fill = GridBagConstraints.BOTH;
		this.add(new JScrollPane(this.textPane), this.gbc);
		
		
		this.pack();
		this.setSize(500,300);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		
		this.textPane.setText(this.textArea.getText());
		
	}

}
