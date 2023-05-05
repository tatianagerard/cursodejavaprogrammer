package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import telas.TelaCadastroJogador;



public class ControladorTelaMenuJogador implements ActionListener {

	private JFrame frameTelaMenuPrincipal;
	private JTextField respostaTelaMenuPrincipal;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JFrame frameTelaMenuPrincipal;
		JTextField repostaTelaMenuPrincipal;
		
		
		
		
		
	}

	public ControladorTelaMenuJogador(JFrame frameTelaMenuPrincipal, JTextField respostaTelaMenuPrincipal) {
		this.frameTelaMenuPrincipal = frameTelaMenuPrincipal;
		this.respostaTelaMenuPrincipal = respostaTelaMenuPrincipal;	
		
		// TODO Auto-generated constructor stub
		
		
	TelaCadastroJogador telaCadastro = new TelaCadastroJogador();
		
		String resposta = respostaTelaMenuPrincipal.getText();
		
		switch (resposta) {
		case "1":
			
			telaCadastro.criarTelaCadastroJogador();
			
			System.out.println("Abrir tela de cadastro");
			break;
			
		case"2":
			System.out.println("Abrir tabela");
			break;
		}
		
	}

}
