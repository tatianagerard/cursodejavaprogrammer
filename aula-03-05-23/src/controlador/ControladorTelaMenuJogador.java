package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.Jogador;
import repositorio.RepositorioJogador;
import telas.TelaCadastroJogador;
import telas.TelaDeletarJogador;
import telas.TelaIndentificaAlterarJogador;
import telas.TelaListarJogador;





public class ControladorTelaMenuJogador implements ActionListener {

	
	JFrame frameTelaMenuPrincipal;
	JTextField respostaRecebidaTelaPrincipal;
	
	
	
	
	public ControladorTelaMenuJogador(JFrame frameTelaMenuPrincipal, JTextField respostaRecebidaTelaPrincipal) {
		super();
		this.frameTelaMenuPrincipal = frameTelaMenuPrincipal;
		this.respostaRecebidaTelaPrincipal = respostaRecebidaTelaPrincipal;
	}

	TelaCadastroJogador<?> telaCadastroJogador = new TelaCadastroJogador<Object>();
	TelaListarJogador telaListarJogador = new TelaListarJogador();
	TelaDeletarJogador deletarJogador = new TelaDeletarJogador();
	TelaIndentificaAlterarJogador telaIndentificaAlterarJogador = new TelaIndentificaAlterarJogador();
	
	RepositorioJogador repositorioJogador = new RepositorioJogador();
	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String resposta = respostaRecebidaTelaPrincipal.getText();
		
		switch (resposta) {
		case "1":
			
			TelaCadastroJogador.criarTelaCadastroJogador(frameTelaMenuPrincipal,repositorioJogador);
			frameTelaMenuPrincipal.setVisible(false);
		break;
		
		
		case"2":
			telaListarJogador.listarJogador(repositorioJogador.retornaListaJogadores(), frameTelaMenuPrincipal);
			frameTelaMenuPrincipal.setVisible(false);
			break;
			
		case "3": 
			
			TelaDeletarJogador.deletarJogador(repositorioJogador.retornaListaJogadores(), frameTelaMenuPrincipal, repositorioJogador );
			frameTelaMenuPrincipal.setVisible(false);
			
			break;
		case "4": 
			
			
			TelaIndentificaAlterarJogador.criarTelaIndentificaAlterarJogador(repositorioJogador.retornaListaJogadores(), frameTelaMenuPrincipal, repositorioJogador);
			frameTelaMenuPrincipal.setVisible(false);
			break;
	
		}
		
	}	
		public void listarTeste(List<Jogador> listaJogadores){
			
			for(Jogador jogador: listaJogadores ){
				System.out.println(jogador.getNome());
				System.out.println(jogador.getCpf());
	}

		}
	}
	
		
		