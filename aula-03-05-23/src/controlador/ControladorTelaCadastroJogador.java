package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import repositorio.RepositorioJogador;

import entidades.Jogador;


public  class ControladorTelaCadastroJogador implements ActionListener {

	JTextField nomeRecebido;
	JTextField cpfRecebido;
	
	JFrame menuPrincipalRecebido;
	JFrame telaCadastroJogadorecebido;
	RepositorioJogador repositorioJogadorRecebido;
	
	public ControladorTelaCadastroJogador(JTextField nomeRecebido, JTextField cpfRecebido, JFrame menuPrincipalRecebido,
			JFrame telaCadastroJogadorecebido, RepositorioJogador repositorioJogadorRecebido) {
		super();
		this.nomeRecebido = nomeRecebido;
		this.cpfRecebido = cpfRecebido;
		this.menuPrincipalRecebido = menuPrincipalRecebido;
		this.telaCadastroJogadorecebido = telaCadastroJogadorecebido;
    	this.repositorioJogadorRecebido = repositorioJogadorRecebido; 
	}	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		repositorioJogadorRecebido.salvarJogador(popularJogador1());
		
		menuPrincipalRecebido.setVisible(true);
		telaCadastroJogadorecebido.setVisible(false);
		
	}
	


public Jogador popularJogador1() {
		
		Jogador jogador = new Jogador();
		jogador.setNome(nomeRecebido.getText());
		jogador.setCpf(cpfRecebido.getText());
		
		return jogador;
	}


		
		}