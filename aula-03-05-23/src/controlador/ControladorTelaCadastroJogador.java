package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import repositorio.RepositorioJogador;

import validacao.MensagemErroValidacaoJogador;
import validacao.ValidaEntidade;
import entidades.Jogador;
import repositorio.RepositorioJogador;

import entidades.Jogador;


public  class ControladorTelaCadastroJogador implements ActionListener {

	JTextField nomeRecebido;
	JTextField cpfRecebido;
	JTextField emailRecebido;
	
	
	
	
	public ControladorTelaCadastroJogador(JTextField nomeRecebido, JTextField cpfRecebido, JFrame menuPrincipalRecebido,
			JFrame telaCadastroJogadorecebido, RepositorioJogador repositorioJogadorRecebido , JTextField textEmail) {
		super();
		this.nomeRecebido = nomeRecebido;
		this.cpfRecebido = cpfRecebido;
		this.menuPrincipalRecebido = menuPrincipalRecebido;
		this.telaCadastroJogadorecebido = telaCadastroJogadorecebido;
    	this.repositorioJogadorRecebido = repositorioJogadorRecebido; 
    	this.emailRecebido = textEmail;
	}	
	
	
	JFrame menuPrincipalRecebido;
	JFrame telaCadastroJogadorecebido;
	RepositorioJogador repositorioJogadorRecebido;
	MensagemErroValidacaoJogador mensagemErroValidacaoJogador = new MensagemErroValidacaoJogador();
	

	String mensagemErro;
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(popularJogador1() != null) {
		repositorioJogadorRecebido.salvarJogador(popularJogador1());
		
		menuPrincipalRecebido.setVisible(true);
		telaCadastroJogadorecebido.setVisible(false);
		
	}
	
 }

           public Jogador popularJogador1() {
		
		Jogador jogador = new Jogador();
		jogador.setNome(nomeRecebido.getText());
		jogador.setCpf(cpfRecebido.getText());
		jogador.setEmail(emailRecebido.getText());
		
		

		
		if(mensagemErro == null) {
			JOptionPane.showMessageDialog(null, "Jogador Validado!!");
			return jogador;
			
		}else {
			JOptionPane.showMessageDialog(null, mensagemErro);
			return null;
		}
   }
}