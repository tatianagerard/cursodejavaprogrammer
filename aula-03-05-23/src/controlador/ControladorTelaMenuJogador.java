package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTextField;
import telas.TelaCadastroJogador;
import entidades.Jogador;
import telas.TelaListarJogador;
import telas.TelaMenuJogador;
import telas.TelaCadastroJogador;




public class ControladorTelaMenuJogador implements ActionListener {

	
	JFrame frameTelaMenuPrincipal;
	JTextField respostaRecebidaTelaPrincipal;
	
	
	
	
	public ControladorTelaMenuJogador(JFrame frameTelaMenuPrincipal, JTextField respostaRecebidaTelaPrincipal) {
		super();
		this.frameTelaMenuPrincipal = frameTelaMenuPrincipal;
		this.respostaRecebidaTelaPrincipal = respostaRecebidaTelaPrincipal;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String resposta = respostaRecebidaTelaPrincipal.getText();
		
		switch (resposta) {
		case "1":
			TelaCadastroJogador criarTelaCdastroJogador;
			frameTelaMenuPrincipal.setVisible(false);
		break;
		
		
		case"2":
			System.out.println("Abrir tela ");
			break;
			
		}
		
	}

}

	
		
		