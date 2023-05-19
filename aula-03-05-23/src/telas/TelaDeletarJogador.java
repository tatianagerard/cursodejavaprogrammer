package telas;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;

import entidades.Jogador;
import repositorio.RepositorioJogador;
import controlador.ControladorTelaDeletarJogador;



public class TelaDeletarJogador {
	
	public static void deletarJogador(List<Jogador>listaJogadores,JFrame menuPrincipal,RepositorioJogador repositorioJogador) {
		
		
		int quantidadeDeLinhas = listaJogadores.size();
		String [][] tabelaString = new String [quantidadeDeLinhas][2];

		int posicaoColuna = 0;
		int posicaoLinha = 0;
		
for (Jogador jogador: listaJogadores) {
			
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getNome();
			posicaoColuna++;
			
			tabelaString[posicaoLinha][posicaoColuna] = jogador.getCpf();
			
			
			posicaoLinha++;
			posicaoColuna = 0;
	}
  
   String nomesColunas[] = {"NOME", "CPF"};

   JFrame frameDeletarJogador = new JFrame();
   frameDeletarJogador.setSize(500, 600);

   JTable tabelaJogador = new JTable(tabelaString, nomesColunas); 
   
   tabelaJogador.setBounds(30, 40, 300, 300);
   
   JScrollPane scrollPaneListarJogador = new JScrollPane(tabelaJogador);
   
   JPanel panelListarProgramador = new JPanel();
   
   JLabel labelCpf = new JLabel("Digite o cpf para deletar:");
   panelListarProgramador.add(labelCpf);
   
   
   JTextField textCpfDelete = new JTextField(10);
   panelListarProgramador.add(textCpfDelete);
   
   panelListarProgramador.add(scrollPaneListarJogador);
	
   JButton deletarTelaDeletarJogador = new JButton("Deletar");
	panelListarProgramador.add(deletarTelaDeletarJogador);
	
	JButton voltarTelaDeletarJogador = new JButton("Voltar");
	panelListarProgramador.add(voltarTelaDeletarJogador);
   
	
	frameDeletarJogador.add(panelListarProgramador);
	frameDeletarJogador.setVisible(true);
	
	ControladorTelaDeletarJogador controladorTelaDeletarJogador = new ControladorTelaDeletarJogador(menuPrincipal, frameDeletarJogador, repositorioJogador, textCpfDelete);
	
	
	deletarTelaDeletarJogador.addActionListener(controladorTelaDeletarJogador);
	voltarTelaDeletarJogador.addActionListener(controladorTelaDeletarJogador);
}



}
