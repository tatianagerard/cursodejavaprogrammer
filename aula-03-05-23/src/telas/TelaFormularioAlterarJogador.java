package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorFormularioAlterarJogador;
import entidades.Jogador;
import repositorio.RepositorioJogador;


       public class TelaFormularioAlterarJogador {
       public void formularioAlterarJogador(Jogador jogadorEncontrado, JFrame frameMenuPrincipal, RepositorioJogador repositorioJogadorRecebido) {
		
		String nome = "Altere o Nome";
		String cpf = "Não pode ser Alterado";
		String email = "Altere o email";
		
		JFrame frameFormularioAlterarJogador = new JFrame();
		frameFormularioAlterarJogador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameFormularioAlterarJogador.setSize(400, 250);
		
		JPanel panelFormularioAlterar = new JPanel();
		GridLayout grid = new GridLayout (0,1);
		panelFormularioAlterar.setLayout(grid);
		
		JLabel labelNome = new JLabel(nome);
		panelFormularioAlterar.add(labelNome);
		
		JTextField textNome = new  JTextField(10);
		textNome.setText(jogadorEncontrado.getNome());
		panelFormularioAlterar.add(textNome);
		
		JLabel labelCpf = new JLabel(cpf);
		panelFormularioAlterar.add(labelCpf);
		
		JTextField textCpf = new  JTextField(10);
		textCpf.setText(jogadorEncontrado.getCpf());
		panelFormularioAlterar.add(textCpf);
		
		JLabel labelEmail = new JLabel(email);
		panelFormularioAlterar.add(labelEmail);
		
		JTextField textEmail = new  JTextField(10);
		textEmail.setText(jogadorEncontrado.getEmail());
		
		
		
		
		JButton buttonTelaCadastroJogador = new JButton("Alterar Jogador");
		panelFormularioAlterar.add(buttonTelaCadastroJogador);
		frameFormularioAlterarJogador.add(panelFormularioAlterar);
		frameFormularioAlterarJogador.setVisible(true);
		
		ControladorFormularioAlterarJogador controladorFormularioAlterarJogador = new ControladorFormularioAlterarJogador(frameMenuPrincipal, frameFormularioAlterarJogador, textNome, textCpf, repositorioJogadorRecebido, jogadorEncontrado);
		buttonTelaCadastroJogador.addActionListener(controladorFormularioAlterarJogador);
		
		
		
	}
	
}


