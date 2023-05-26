package telas;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorTelaCadastroJogador;
import repositorio.RepositorioJogador;



public class TelaCadastroJogador<ControladorTelaMenuJogador> {

	
	public static void criarTelaCadastroJogador(JFrame menuPrincipal, RepositorioJogador repositorioJogador) {
		
		String nome = "Digite o nome";
		String cpf = "Digite o cpf";
		String email ="Digite o email";
		
		
		JFrame frameTelaCadastroJogador = new JFrame();
		frameTelaCadastroJogador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameTelaCadastroJogador.setSize(400, 250);
		
		JPanel panelTelaCadastroJogador = new JPanel();
		GridLayout grid = new GridLayout (0,1);
		panelTelaCadastroJogador.setLayout(grid);
		
		JLabel labelNome = new JLabel(nome);
		panelTelaCadastroJogador.add(labelNome);
		
		JTextField textNome = new  JTextField(10);
		panelTelaCadastroJogador.add(textNome);
		
		JLabel labelCpf = new JLabel(cpf);
		panelTelaCadastroJogador.add(labelCpf);
		
		JLabel labelEmail = new JLabel(email);
		panelTelaCadastroJogador.add(labelEmail);
		
		JTextField textEmail = new  JTextField(10);
		panelTelaCadastroJogador.add(textEmail);
		
		
		JTextField textCpf = new  JTextField(10);
		panelTelaCadastroJogador.add(textCpf);
		
		JButton buttonTelaCadastroJogador = new JButton("Enviar");
		panelTelaCadastroJogador.add(buttonTelaCadastroJogador);
		
		
		frameTelaCadastroJogador.add(panelTelaCadastroJogador);
		frameTelaCadastroJogador.setVisible(true);
		
		
		
		ControladorTelaCadastroJogador controladorTelaCadastroJogador = new ControladorTelaCadastroJogador(textNome, textCpf, menuPrincipal, frameTelaCadastroJogador, repositorioJogador,textEmail);
		buttonTelaCadastroJogador.addActionListener(controladorTelaCadastroJogador);
	}
	
	

	
		
}


	

