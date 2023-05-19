package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Jogador;
import repositorio.RepositorioJogador;
import telas.TelaFormularioAlterarJogador;



public class ControladordentificaAlterarJogador implements ActionListener{

	
	JFrame menuPrincipalRecebido;
	JFrame frameAlterarRecebido;
	
	RepositorioJogador repositorioJogadorRecebido;
	JTextField textcpfRedebido;
	
	public ControladordentificaAlterarJogador(JFrame menuPrincipalRecebido, JFrame frameAlterarRecebido,
			RepositorioJogador repositorioJogadorRecebido, JTextField textcpfRedebido) {
		
		this.menuPrincipalRecebido = menuPrincipalRecebido;
		this.frameAlterarRecebido = frameAlterarRecebido;
		this.repositorioJogadorRecebido = repositorioJogadorRecebido;
		this.textcpfRedebido = textcpfRedebido;
	}
			
TelaFormularioAlterarJogador formularioAlterarJogador = new TelaFormularioAlterarJogador();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		String botao = e.getActionCommand();
		
		if(botao.equals("Alterar")) {
			Jogador jogadorAlterar = new Jogador();
			
			jogadorAlterar = repositorioJogadorRecebido.buscarJogador(textcpfRedebido.getText());
			
			if(jogadorAlterar != null) {
				
				formularioAlterarJogador.formularioAlterarJogador(jogadorAlterar, menuPrincipalRecebido, repositorioJogadorRecebido);
				frameAlterarRecebido.setVisible(false);
				
			}else {
				JOptionPane.showMessageDialog(null, "O jogador não foi encontrado");
			}
			
		}
		if(botao.equals("Voltar")) {
			menuPrincipalRecebido.setVisible(true);
			frameAlterarRecebido.setVisible(false);
			
			}
		}
		
	}

